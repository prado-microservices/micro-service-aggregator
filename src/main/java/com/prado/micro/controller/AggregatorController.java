package com.prado.micro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.prado.micro.VO.UserContactRestTemplateVO;
import com.prado.micro.VO.UserDeptRestTemplateVO;
import com.prado.micro.service.AggregatorService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/aggregator")
public class AggregatorController {
	@Autowired
	AggregatorService aggregatorService;
	
	@GetMapping("/user/{id}")
	public UserDeptRestTemplateVO userAggreg(@PathVariable("id") Long userId, @RequestParam("flag") String flag) {
		log.info("AggregatorController: userAggreg: " + userId);
		return aggregatorService.userDeptAggreg(userId, flag);
	}
	
	@GetMapping("/department/{id}")
	public UserDeptRestTemplateVO departmentAggreg(@PathVariable("id") Long userId, @RequestParam("flag") String flag) {
		log.info("AggregatorController: departmentAggreg: " + userId);
		return aggregatorService.userDeptAggreg(userId, flag);
	}
	
	@GetMapping("/user-dept/{id}")
	public UserDeptRestTemplateVO userDeptAggreg(@PathVariable("id") Long userId, @RequestParam("flag") String flag) {
		log.info("AggregatorController: userDeptAggreg: " + userId);
		return aggregatorService.userDeptAggreg(userId, flag);
	}
	
	@GetMapping("user-contact/{id}")
	public UserContactRestTemplateVO userContactAggregator(@PathVariable("id") Long userId, @RequestParam("flag") String flag){
		log.info("AggregatorController: userDeptAggreg: " + userId);
		return aggregatorService.userContactAggregator(userId, flag);
	}
}
