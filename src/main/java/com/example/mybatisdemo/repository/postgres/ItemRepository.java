package com.example.mybatisdemo.repository.postgres;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.mybatisdemo.domain.Item;

@Mapper
public interface ItemRepository {
	List<Item> selectAll();
}