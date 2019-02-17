package org.zerock.sample;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.ToString;

@Component
@ToString
@Getter
@AllArgsConstructor
//@Data
public class SampleHotel {
	private Chef chef;
	private Restaurant restaurant;
//	public SampleHotel(Chef chef) {
//		this.chef = chef;
//	}
	
//	public Chef getChef(Chef chef) {
//		return this.chef = chef;
//	}
//	SampleHotel hotel = new SampleHotel(new Chef()); 
}

