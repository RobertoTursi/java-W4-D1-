package com.Pizzeria;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString

public class Bevanda extends Prodotto{
	
	private Integer calorie;

	public Bevanda(Double prezzo, Integer calorie) {
		super(prezzo);
		this.calorie = calorie;
		
	}
	
	
}
