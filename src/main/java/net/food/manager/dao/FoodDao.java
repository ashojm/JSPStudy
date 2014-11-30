package net.food.manager.dao;

import java.util.List;
import java.util.Map;

import net.food.manager.vo.Food;

public interface FoodDao {
	public List<Food> getList(Map<String,String> paramMap) throws Exception;
}
