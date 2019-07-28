package com.nt.domain;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Setter 
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Student implements Serializable {
	
private int sid;
private String sName;
private String branch;
}
