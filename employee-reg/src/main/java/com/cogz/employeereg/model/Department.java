package com.cogz.employeereg.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "department")
@Data
@Getter
@Setter
public class Department {
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private int dept_id;
	@Column(name = "dept_name")
	private String dept_name;
}
