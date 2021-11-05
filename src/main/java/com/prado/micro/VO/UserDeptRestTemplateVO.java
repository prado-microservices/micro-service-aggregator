package com.prado.micro.VO;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.prado.micro.model.Department;
import com.prado.micro.model.User;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserDeptRestTemplateVO {
	@JsonInclude(Include.NON_NULL)
	private User user;
	
	@JsonInclude(Include.NON_NULL)
	private Department department;
}
