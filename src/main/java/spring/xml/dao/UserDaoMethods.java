package spring.xml.dao;

import spring.xml.dto.SignupDto;

public interface UserDaoMethods {
	
	public void insert(SignupDto user);
	public void delete();

}
