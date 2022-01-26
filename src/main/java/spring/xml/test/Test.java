package spring.xml.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.xml.dao.UserDao;
import spring.xml.dto.SignupDto;

public class Test {

	public static void main(String[] args) {
		System.out.println("Context Starting");
		ApplicationContext context = new ClassPathXmlApplicationContext("Configuration.xml");
		UserDao user = (UserDao) context.getBean("userDao");
		System.out.println("Context loaded");

		SignupDto dto = new SignupDto();
		dto.setName("aman");
		dto.setEmail("adfsdssd@");
		dto.setMobile("89sd");
		dto.setPassword("dfsdssdf");

		// user.insert(dto);
//		user.delete();
		List<SignupDto> list = user.findAllUsers();
		user.displayList(list);
		// List<SignupDto> user1 = user.findbyEmail("adfsd@");
		// user.displayList(user1);

		System.out.println("Insert Successful");
	}

}
