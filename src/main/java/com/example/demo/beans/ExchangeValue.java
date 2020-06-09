package com.example.demo.beans;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ExchangeValue {
	
	@Id
	private Long id;
	@Column(name="curency_from")
	private String from;
	@Column(name="curency_to")
	private String to;
	private BigDecimal convertioNMultiple;
	private int port;
	
	protected ExchangeValue() {
		
	}
	
	public ExchangeValue(Long id, String from, String to, BigDecimal convertioNMultiple) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.convertioNMultiple = convertioNMultiple;
	}
	
	public Long getId() {
		return id;
	}

	public String getFrom() {
		return from;
	}

	public String getTo() {
		return to;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public BigDecimal getConvertioNMultiple() {
		return convertioNMultiple;
	}

	

}
