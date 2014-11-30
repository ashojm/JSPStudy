package net.food.manager.dao.impl;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import net.food.manager.dao.FoodDao;
import net.food.manager.vo.Food;

@Repository
public class FoodDaoImpl implements FoodDao {
    @Autowired
    private SqlSession sqlSession;

	@Override
	public List<Food> getList(Map<String, String> paramMap) throws Exception {
        return sqlSession.selectList("test.getList", paramMap);
	}

}
