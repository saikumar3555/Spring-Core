package com.ibm.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@Entity
@NoArgsConstructor
@Table(name="Book")
public class Book {
	@Id
	private Integer bookId;
	private String bookName;
	private double bookPrice;
	private String bookAuthor;
}
