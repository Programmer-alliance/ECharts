package com.github.abel533.echarts.axis;

public class RadiusAxis extends Axis<RadiusAxis> {
	private static final long serialVersionUID = 5569926066087413901L;
	
	private int polarIndex = 0;

	public RadiusAxis polarIndex(int polarIndex) {
		this.polarIndex = polarIndex;
		return this;
	}

	public int polarIndex() {
		return this.polarIndex;
	}
}
