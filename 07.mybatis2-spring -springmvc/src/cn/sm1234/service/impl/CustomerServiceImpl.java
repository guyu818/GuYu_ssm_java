package cn.sm1234.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.sm1234.dao.CustomerMapper;
import cn.sm1234.domain.Customer;
import cn.sm1234.service.CustomerService;

@Service("customerService")
//加上这个遇到错误就会回滚
@Transactional
public class CustomerServiceImpl implements CustomerService {
	
	@Resource
	private CustomerMapper customerMapper;
	
	public void saveCustomer(Customer customer) {
		// TODO Auto-generated method stub
		customerMapper.saveCustomer(customer);
		
		
	}

}
