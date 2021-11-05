package com.prado.micro.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.prado.micro.VO.UserContactRestTemplateVO;
import com.prado.micro.VO.UserDeptRestTemplateVO;
import com.prado.micro.model.Contact;
import com.prado.micro.model.Department;
import com.prado.micro.model.User;
//import com.prado.micro.repository.UserDeptAggregatorRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class AggregatorService {
	
	@Autowired
	private RestTemplate restTemplate;
	
//	@Autowired
//	private UserDeptAggregatorRepository userDeptAggregatorRepository;
	
	public UserDeptRestTemplateVO userDeptAggreg(Long userId, String flag) {
		log.info("AggregatorService: userDeptAggreg: " + userId);
		UserDeptRestTemplateVO vo = new UserDeptRestTemplateVO();
		//User user = userDeptAggregatorRepository.findDepartmentByUserId(userId);
		User user = null;
		Department department = null;
		if(flag.equals("user")) {
			log.info("AggregatorService: user: " + userId);
			user = restTemplate.getForObject("http://USER-API/users/fetch/" + userId, User.class);
			log.info("User: " + user);
		}
		if(flag.equals("dept")) {
			log.info("AggregatorService: dept: " + userId);
			user = restTemplate.getForObject("http://USER-API/users/fetch/" + userId, User.class);
			department = restTemplate.getForObject("http://DEPARTMENT-API/departments/fetch/" + user.getDepartmentId(), Department.class);
			log.info("Department: " + department);
			vo.setDepartment(department);
			
			return vo;
		}
		if(flag.equals("user-dept")) {
			log.info("AggregatorService: user-dept: " + userId);
			user = restTemplate.getForObject("http://USER-API/users/fetch/" + userId, User.class);
			department = restTemplate.getForObject("http://DEPARTMENT-API/departments/fetch/" + user.getDepartmentId(), Department.class);
			log.info("User: " + user + " Department: " + department);
		}
		vo.setUser(user);
		vo.setDepartment(department);
		
		return vo;
	}
	
	public UserContactRestTemplateVO userContactAggregator(Long userId, String flag) {
		UserContactRestTemplateVO vo = new UserContactRestTemplateVO();
		User user = null;
		Contact contact = null;
		if(flag.equals("user-contact")) {
			user = restTemplate.getForObject("http://USER-API/users/fetch/" + userId, User.class);
			contact = restTemplate.getForObject("http://CONTACT-API/contacts/fetch/" + user.getContactId(), Contact.class);
			log.info("Input: " + userId + " User: " + user + " Contact: " + contact);
		}
		if(flag.equals("user")) {
			user = restTemplate.getForObject("http://USER-API/users/fetch/" + userId, User.class);
			log.info("Input: " + userId + " User: " + user);
		}
		if(flag.equals("contact")) {
			contact = restTemplate.getForObject("http://CONTACT-API/contacts/fetch/" + user.getContactId(), Contact.class);
			log.info("Input: " + userId + " Contact: " + contact);
			vo.setContact(contact);
			return vo;
		}
		vo.setUser(user);
		vo.setContact(contact);
		return vo;
	}
}
