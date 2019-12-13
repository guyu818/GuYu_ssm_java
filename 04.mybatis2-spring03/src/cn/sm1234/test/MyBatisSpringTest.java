package cn.sm1234.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import cn.sm1234.dao.CustomerMapper;
import cn.sm1234.domain.Customer;



public class MyBatisSpringTest {
	@Test
	public void test()
	{
		System.out.println("哈哈哈");
		//加载spring配置
		//ApplicationContext ac=new FileSystemXmlApplicationContext("D:myeclipseworkspace/02.mybatis2-spring01/config/applicationContext.xml");
		ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext .xml");
		System.out.println("哈哈哈");
		//2.获取对象,CustomerMapper为接口
		CustomerMapper customermapper=(CustomerMapper)ac.getBean("customerMapper");
		
		//3.调用方法
		Customer customer=new Customer();
		customer.setName("小美");
		customer.setGender("女");
		customer.setTelephone("020-666666");
		customer.setAddress("广州体育中心");
		
		customermapper.saveCustomer(customer);
		
		
	}
}
