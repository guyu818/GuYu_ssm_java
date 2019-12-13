package cn.sm1234.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.sm1234.domain.Customer;
import cn.sm1234.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	//注入业务对象
	@Resource
	private CustomerService customerService;
	/*@RequestMapping("/test")
	public String test(){
		return "test";
	}*/
	
	//跳转到input.jsp
	@RequestMapping("/input")
	public String input(){
		return "input";
	}
	
	//保存客户
	@RequestMapping("/save")
	public String save(Customer customer){
		System.out.println(customer);
		customerService.saveCustomer(customer);
		return "succ";
	}

}
