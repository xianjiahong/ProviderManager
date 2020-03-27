package service.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import commons.MybatisUtils;
import dao.ProviderMapper;
import pojo.Provider;
import service.ProviderService;

public class ProviderServiceImpl implements ProviderService {
	private ProviderMapper mapper;
	@Override
	public List<Provider> getProviderList() {
		// TODO Auto-generated method stub
		SqlSession sqlSession = MybatisUtils.createSqlSession();
		mapper = sqlSession.getMapper(ProviderMapper.class);
		List<Provider> list = mapper.getProviderList();
		MybatisUtils.closeSqlSession(sqlSession);
		return list;
		
	}

}
