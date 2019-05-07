package com.example.mybatisdemo.service.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mybatisdemo.domain.Table1;
import com.example.mybatisdemo.domain.Table1Example;
import com.example.mybatisdemo.repository.oracle1.Table1Repository;
import com.example.mybatisdemo.service.TestService;

@Service
public class TestServiceImpl implements TestService {
	@Autowired
	private Table1Repository table1Repository;

	@Override
	public List<Table1> getTable1() {
		List<Table1> list = new ArrayList<>();

		Table1Example example = new Table1Example();
//		example.createCriteria().andColumn1EqualTo("1");
		list = table1Repository.selectByExampleWithBLOBs(example);
		return list;
	}

	@Override
	public int addTable1() {
		Table1 table1 = new Table1();
		table1.setId("8989");
		table1.setColumn1("8989");
		table1.setColumn2(new BigDecimal(999));
		table1.setColumn3(new Date());
		return table1Repository.insert(table1);
	}

	@Override
	public int updateTable1() {
		Table1 table1 = new Table1();
		table1.setColumn1("TEST");
		table1.setId("9999");
		Table1Example example = new Table1Example();
		example.createCriteria().andColumn1EqualTo("999");
		return table1Repository.updateByExample(table1, example);
	}

	@Override
	public int deleteTable1() {
		Table1Example example = new Table1Example();
		example.createCriteria().andColumn1EqualTo("999");
		return table1Repository.deleteByExample(example);
	}
}
