package spring.xml.dao;

import java.util.List;

import spring.xml.dto.SignupDto;

public interface UserDaoMethods {
	
	public void insert(SignupDto user);
	public void delete();
	public List<SignupDto> findAllUsers();
	public void displayList(List<SignupDto> list);
	public List<SignupDto> findbyEmail(String email);
}
