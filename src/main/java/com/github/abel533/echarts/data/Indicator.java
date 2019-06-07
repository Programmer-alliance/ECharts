package com.github.abel533.echarts.data;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Indicator implements Serializable {
	private static final long serialVersionUID = 1L;
	private String name;
	private Object max;

	public Indicator(String name, Object max) {
		this.name = name;
		this.max = max;
	}

	public void setMax(Double max) {
		this.max = max;
	}
}
