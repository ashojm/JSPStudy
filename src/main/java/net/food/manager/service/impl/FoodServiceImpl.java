package net.food.manager.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.food.manager.dao.FoodDao;
import net.food.manager.service.FoodService;
import net.food.manager.vo.Food;

@Service
public class FoodServiceImpl implements FoodService {
	@Autowired
	private FoodDao foodDaoImp;
	
	@Override
	public List<Food> getList(Map<String, String> paramMap) throws Exception {
		return foodDaoImp.getList(paramMap);
	}

}
