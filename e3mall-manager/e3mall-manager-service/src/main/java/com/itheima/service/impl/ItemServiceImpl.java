package com.itheima.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itheima.dao.TbItemMapper;
import com.itheima.pojo.TbItem;
import com.itheima.service.ItemService;
@Service
public class ItemServiceImpl implements ItemService {
	@Autowired
	private TbItemMapper tbItemMapper;

	@Override
	public TbItem findItemById(Long itemId) {
		return tbItemMapper.selectByPrimaryKey(itemId);
	}
	
}
