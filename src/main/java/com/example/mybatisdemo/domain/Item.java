package com.example.mybatisdemo.domain;

import org.springframework.stereotype.Component;

@Component
public class Item {
	private Long id;
	private Long intval;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getIntval() {
		return intval;
	}

	public void setIntval(Long intval) {
		this.intval = intval;
	}
}
