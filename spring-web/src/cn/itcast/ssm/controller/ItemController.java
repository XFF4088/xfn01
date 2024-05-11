package cn.itcast.ssm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.itcast.ssm.pojo.Item;
import cn.itcast.ssm.service.ItemService;


@Controller
public class ItemController {

	@Autowired
	ItemService itemService;

	/**
	 * 显示商品列表
	 * 
	 * @return
	 */
	@RequestMapping("/itemList")
	public ModelAndView queryItemList() {
		// 获取商品数据
		List<Item> list = this.itemService.queryItemList();

		ModelAndView modelAndView = new ModelAndView();
		// 把商品数据放到模型中
		modelAndView.addObject("itemList", list);
		// 设置逻辑视图
		modelAndView.setViewName("WEB-INF/jsp/itemList.jsp");

		return modelAndView;

		//master first
	}

}

