package net.food.manager.service;

import java.util.List;
import java.util.Map;

import net.food.manager.vo.Food;

import org.springframework.stereotype.Service;


public interface FoodService {
	public List<Food> getList(Map<String,String> paramMap) throws Exception;
}
