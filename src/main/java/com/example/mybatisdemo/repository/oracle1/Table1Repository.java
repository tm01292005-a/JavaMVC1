package com.example.mybatisdemo.repository.oracle1;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.mybatisdemo.domain.Table1;
import com.example.mybatisdemo.domain.Table1Example;


@Mapper
public interface Table1Repository {

	int countByExample(Table1Example example);

	int deleteByExample(Table1Example example);

	int insert(Table1 record);

	int insertSelective(Table1 record);

	List<Table1> selectByExampleWithBLOBs(Table1Example example);

	List<Table1> selectByExample(Table1Example example);

	int updateByExampleSelective(@Param("record") Table1 record, @Param("example") Table1Example example);

	int updateByExampleWithBLOBs(@Param("record") Table1 record, @Param("example") Table1Example example);

	int updateByExample(@Param("record") Table1 record, @Param("example") Table1Example example);
}