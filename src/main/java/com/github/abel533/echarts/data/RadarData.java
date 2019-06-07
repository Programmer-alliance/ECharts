package com.github.abel533.echarts.data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.github.abel533.echarts.style.ItemStyle;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RadarData implements Serializable {
	private static final long serialVersionUID = -2573889018261931162L;


	private List<Object> value;
	private ItemStyle itemStyle;
	private Object value1;
	private String name;

	/**
	 * 构造函数,参数:name,value
	 *
	 * @param name
	 * @param value
	 */
	public RadarData(String name, Object value) {
		this.value1 = value;
		this.name = name;
	}

	/**
	 * 获取value值
	 */
	public Object getvalue() {
		return this.value1;
	}

	/**
	 * 设置value值
	 *
	 * @param value
	 */
	public RadarData getvalue(Object value) {
		this.value1 = value;
		return this;
	}

	public RadarData() {
		this.value = new ArrayList<Object>();
	}

	public RadarData(String name) {
		this();
		this.name = name;
	}

	public List<Object> value() {
		return this.value;
	}

	public RadarData value(Object... value) {
		if (null == value || value.length == 0) {
			return this;
		}
		this.value.addAll(Arrays.asList(value));
		return this;
	}

	public ItemStyle itemStyle() {
		if (this.itemStyle == null) {
			this.itemStyle = new ItemStyle();
		}
		return this.itemStyle;
	}

	public RadarData itemStyle(ItemStyle itemStyle) {
		this.itemStyle = itemStyle;
		return this;
	}
}
