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

package com.github.abel533.echarts.style.itemstyle;

/**
 * @author liuzh
 */
public class Normal extends Style<Normal> {

	private Integer width;

	private String areaColor;

	public Integer width() {
		return this.width;
	}

	public String areaColor() {
		return this.areaColor;
	}

	public Normal width(int width) {
		this.width = width;
		return this;
	}

	public Normal areaColor(String areaColor) {
		this.areaColor = areaColor;
		return this;
	}

	public Integer getWidth() {
		return width;
	}

	public String getAreaColor() {
		return areaColor;
	}

	public void setWidth(Integer width) {
		this.width = width;
	}

	public void setAreaColor(String areaColor) {
		this.areaColor = areaColor;
	}
}
