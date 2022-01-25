package spring.xml.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.xml.dao.UserDao;
import spring.xml.dto.SignupDto;

public class Test {

	public static void main(String[] args) {
		System.out.println("Context Starting");
		ApplicationContext context = new ClassPathXmlApplicationContext("Configuration.xml");
		UserDao user = (UserDao)context.getBean("userDao");
		System.out.println("Context loaded");
		
		SignupDto dto = new SignupDto();
		dto.setName("ashu");
		dto.setEmail("adfsd@");
		dto.setMobile("89");
		dto.setPassword("dfsdf");
		
		user.insert(dto);
		System.out.println("Insert Successful");
	}
	
}
