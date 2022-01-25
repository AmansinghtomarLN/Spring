package spring.xml.ctl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import spring.xml.dao.UserDao;
import spring.xml.dto.SignupDto;


@Controller
public class Signup {
	
	@ResponseBody
	@RequestMapping("/display")
	public String display() {
		
		return "Hello Aman !! Response Body annotation is working fine ";
	}
	
	@RequestMapping("/signup")
	public String signup() {
		
		return "signup";	
	}
	
	@RequestMapping("/register")
	public String signupData(SignupDto dto, Model model) {
		System.out.println("name is"+dto.getName());
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Configuration.xml");
		UserDao user = (UserDao)context.getBean("userDao");
		user.insert(dto);
		return "successful";	
	}
	

}
