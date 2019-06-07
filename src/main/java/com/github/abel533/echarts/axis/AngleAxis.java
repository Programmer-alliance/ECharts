package com.github.abel533.echarts.axis;

public class AngleAxis extends Axis<AngleAxis> {
	private static final long serialVersionUID = -2539129929838059935L;
	
	private int polarIndex = 0;
	private int startAngle = 90;

	public AngleAxis ploarIndex(int polarIndex) {
		this.polarIndex = polarIndex;
		return this;
	}

	public int ploarIndex() {
		return this.polarIndex;
	}

	public AngleAxis startAngle(int startAngle) {
		this.startAngle = startAngle;
		return this;
	}

	public int startAngle() {
		return this.startAngle;
	}
}
