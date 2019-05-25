package com.testyantra.myspringbootapp.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
/**
*
*/
@XmlRootElement(name="employee")
@XmlAccessorType(XmlAccessType.NONE)

/*
 * @Getter
 * 
 * @Setter
 * 
 * @NoArgsConstructor
 * 
 * @RequiredArgsConstructor
 * 
 * @ToString
 */
 

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
	
	@XmlAttribute(name="employeeID") @NonNull
	private Integer id;
	@XmlElement @NonNull
	private String firstName;
	@XmlElement @NonNull
	private String lastName;
	@XmlElement @NonNull
	private String email;
	
}
