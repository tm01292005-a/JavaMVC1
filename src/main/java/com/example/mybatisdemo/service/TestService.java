package com.example.mybatisdemo.service;

import java.util.List;

import com.example.mybatisdemo.domain.Table1;

public interface TestService {

	/**
	 * TABLE1の全てのデータを取得する
	 *
	 * @return TABLE1データ
	 */
	public List<Table1> getTable1();
	public int addTable1();
	public int updateTable1();
	public int deleteTable1();
}
