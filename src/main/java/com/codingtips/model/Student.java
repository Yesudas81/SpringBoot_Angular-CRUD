package com.codingtips.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="STUDENT_TAB")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="STUD_ID_COL")
	private Integer studId;
	
	@Column(name="STUD_NAME_COL")
	private String studName;
	
	@Column(name="STUD_COURSE_COL")
	private String studCourse;
	
	@Column(name="STUD_FEE_COL")
	private Double studFee;
	
	@Column(name="STUD_FEE_DISC_COL")
	private Double studFeeDisc;
	
	@Column(name="STUD_FEE_GST_COL")
	private Double studFeeGst;

}
