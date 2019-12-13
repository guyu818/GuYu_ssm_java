package cn.sm1234.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import cn.sm1234.domain.Customer;
import cn.sm1234.service.CustomerService;






public class MyBatisSpringTest {
	@Test
	public void test()
	{
		System.out.println("哈哈哈");
		//加载spring配置
		//ApplicationContext ac=new FileSystemXmlApplicationContext("D:myeclipseworkspace/02.mybatis2-spring01/config/applicationContext.xml");
		ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext .xml");
		System.out.println("哈哈哈");
		//返回一个CustomerService对象,传入的是@Service（）里面的名字
		CustomerService customerService=(CustomerService)ac.getBean("customerService");
		System.out.println("哈哈哈");
		Customer customer=new Customer();
		customer.setName("小美66");
		customer.setGender("女");
		customer.setTelephone("020-666666");
		customer.setAddress("广州体育中心");
		
		customerService.saveCustomer(customer);
	}
}
