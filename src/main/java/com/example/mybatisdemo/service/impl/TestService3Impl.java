package com.example.mybatisdemo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mybatisdemo.domain.Item;
import com.example.mybatisdemo.repository.postgres.ItemRepository;
import com.example.mybatisdemo.service.TestService3;

@Service
public class TestService3Impl implements TestService3 {
	@Autowired
//	@Qualifier("secondaryjdbc")
	private ItemRepository itemRepository;

	@Override
	public List<Item> getItem() {
		return itemRepository.selectAll();
	}
}
