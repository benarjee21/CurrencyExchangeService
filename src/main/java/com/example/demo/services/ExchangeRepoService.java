package com.example.demo.services;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.beans.ExchangeValue;

public interface ExchangeRepoService extends JpaRepository<ExchangeValue,Long> {
	
	public ExchangeValue findByFromAndTo(String from,String to);

}
