package com.github.abel533.echarts.data;

import com.github.abel533.echarts.style.ItemStyle;

public class BarData extends BasicData<BarData> {
	private static final long serialVersionUID = 1L;

	public BarData(String name, Object value, ItemStyle itemStyle) {
		super(name, value);
		this.setItemStyle(itemStyle);
	}
}
