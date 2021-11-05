package com.prado.micro.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Department {
	private long departmentId;
	private String departmentName;
	private String departmentCode;
	private String departmentAddress;
	private int departmentEmployees;
	private long userId;
}
