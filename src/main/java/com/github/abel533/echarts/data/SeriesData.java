/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2014-2015 abel533@gmail.com
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package com.github.abel533.echarts.data;

import java.io.Serializable;

import com.github.abel533.echarts.style.ItemStyle;
import com.github.abel533.echarts.style.TextStyle;

import lombok.Getter;
import lombok.Setter;

/**
 * Description: Series.Data
 *
 * @author liuzh
 */
@Getter
@Setter
public class SeriesData implements Serializable {

	private static final long serialVersionUID = -3295595963653443202L;

	private String name;
	private Object value;
	private ItemStyle itemStyle;
	private TextStyle textStyle;

	public SeriesData(Object value) {
		this.value = value;
	}

	public SeriesData(String name, Object value) {
		this.name = name;
		this.value = value;
	}

	public SeriesData(String name, Object value, ItemStyle itemStyle) {
		this.name = name;
		this.value = value;
		this.itemStyle = itemStyle;
	}
	
	public SeriesData(String name, Object value, TextStyle textStyle) {
		this.name = name;
		this.value = value;
		this.textStyle = textStyle;
	}

	public Object value() {
		return this.value;
	}

	public SeriesData value(Object value) {
		this.value = value;
		return this;
	}

	public ItemStyle itemStyle() {
		if (this.itemStyle == null) {
			this.itemStyle = new ItemStyle();
		}
		return this.itemStyle;
	}

	public SeriesData itemStyle(ItemStyle itemStyle) {
		this.itemStyle = itemStyle;
		return this;
	}
	
	public TextStyle textStyle() {
		if (this.textStyle == null) {
			this.textStyle = new TextStyle();
		}
		return this.textStyle;
	}

	public SeriesData textStyle(TextStyle textStyle) {
		this.textStyle = textStyle;
		return this;
	}

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}

	public ItemStyle getItemStyle() {
		return itemStyle;
	}

	public void setItemStyle(ItemStyle itemStyle) {
		this.itemStyle = itemStyle;
	}
	
}
