package com.github.abel533.echarts.series;

import com.github.abel533.echarts.code.SeriesType;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Radar extends Series<Radar> {

	private Integer radarIndex;

	public Radar radarIndex(int index) {
		this.radarIndex = index;
		return this;
	}

	public int radarIndex() {
		return this.radarIndex;
	}

	public Radar() {
		this.type(SeriesType.radar);
	}
}
