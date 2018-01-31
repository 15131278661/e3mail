package com.itheima.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itheima.pojo.TbItem;
import com.itheima.service.ItemService;

@RestController
public class controller {
	@Autowired
	private ItemService itemService;

	@RequestMapping("item/{itemId}")
	public TbItem findItemById(@PathVariable Long itemId,Model model) {
		TbItem tbItem = itemService.findItemById(itemId);
		System.out.println(tbItem.toString());
		return tbItem;
	}
}
