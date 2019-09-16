package cn.itcast.ssm.service;

import java.util.List;

import org.springframework.stereotype.Component;

import cn.itcast.ssm.pojo.Item;

@Component
public interface ItemService {
	List<Item> queryItemList();
}
