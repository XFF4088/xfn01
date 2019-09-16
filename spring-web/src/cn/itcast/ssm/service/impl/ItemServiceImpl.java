package cn.itcast.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import cn.itcast.ssm.mapper.ItemMapper;
import cn.itcast.ssm.pojo.Item;
import cn.itcast.ssm.service.ItemService;

@Service
public class ItemServiceImpl implements ItemService{
	
	  @Autowired ItemMapper itemapper;
	  
	  public List<Item> queryItemList() { 
		  List<Item> list = itemapper.selectAll();
	  // TODO Auto-generated method stub 
	  return list; }
	 

	
	
	
}
