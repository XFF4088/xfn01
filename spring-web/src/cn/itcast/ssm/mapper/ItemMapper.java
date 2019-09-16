package cn.itcast.ssm.mapper;


import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import cn.itcast.ssm.pojo.Item;

public interface ItemMapper {
   
    
    List<Item> selectAll();


}