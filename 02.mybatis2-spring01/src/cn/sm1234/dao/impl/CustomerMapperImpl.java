package cn.sm1234.dao.impl;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import cn.sm1234.dao.CustomerMapper;
import cn.sm1234.domain.Customer;

public class CustomerMapperImpl extends SqlSessionDaoSupport   implements CustomerMapper {


	public void saveCustomer(Customer customer) {
		SqlSession sqlSession=this.getSqlSession();
		sqlSession.insert("saveCustomer",customer);
		//这里就不需要一个事务的提交了
	}

}
