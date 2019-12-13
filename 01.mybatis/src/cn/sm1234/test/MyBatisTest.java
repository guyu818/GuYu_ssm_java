package cn.sm1234.test;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import cn.sm1234.dao.CustomerMapper;
import cn.sm1234.domain.Customer;

public class MyBatisTest {
	@Test
	public void test() throws IOException{
		//1.创建SqlSessionFactoryBuilder
		SqlSessionFactoryBuilder builder=new SqlSessionFactoryBuilder();
		System.out.println("第一步");
		//加载sqlmapconfig.xml文件
		InputStream is=Resources.getResourceAsStream("sqlMapConfig.xml");
		
		//2.创建一个SQLsessionfactory
		SqlSessionFactory factory=builder.build(is);
		System.out.println("第2步");
		//3.打开一个sqlsession
		SqlSession sqlSession =factory.openSession();
		System.out.println("第3步");
		//4.获取mapper接口的对象
		CustomerMapper customerMapper =sqlSession.getMapper(CustomerMapper.class) ;
		System.out.println("第4步");
		//5.操作
		
		Customer customer=new Customer();
		customer.setName("小张");
		customer.setGender("男");
		customer.setTelephone("020-3333333");
		customer.setAddress("广州天河城广场");
		System.out.println(customer.getAddress());
		
		System.out.println("第5步");
		customerMapper.saveCustomer(customer);
		
		//6.提交事务，否则添加不了
		sqlSession.commit();
		System.out.println("第6步");
		//7.提交之后关闭资源
		sqlSession.close();
		
		System.out.println("第7步");
	}

}
