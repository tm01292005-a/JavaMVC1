package com.example.mybatisdemo.domain;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class Table1 {
	private String column1;
	private BigDecimal column2;
	private Date column3;
	private String id;

	public String getColumn1() {
		return column1;
	}

	public void setColumn1(String column1) {
		this.column1 = column1;
	}

	public BigDecimal getColumn2() {
		return column2;
	}

	public void setColumn2(BigDecimal column2) {
		this.column2 = column2;
	}

	public Date getColumn3() {
		return column3;
	}

	public void setColumn3(Date column3) {
		this.column3 = column3;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}