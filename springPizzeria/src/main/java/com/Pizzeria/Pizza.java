package com.Pizzeria;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString

public class Pizza extends Prodotto{
	

	private Integer calorie;
	private List<String> toppings = new ArrayList<String>();
	private String base = "margherita";
	
	public Pizza(Double prezzo, Integer calorie) {
		super(prezzo);
		//this.name = createName();
		this.calorie = calorie;
	}
	
	public Pizza(Double prezzo, Integer calorie, List<String> toppings) {
		super(prezzo);
		//this.name = createName();
		this.calorie = calorie;
		this.toppings = toppings;
	}

	
	
	public void addTopping(String topping){
		this.toppings.add(topping);
	}
	
	public String getName() {
		String name = this.base;
		for(int i = 0; i < this.toppings.size(); i++) {
			name = name.concat(", " + this.toppings.get(i));
		}
		if(this.toppings.size() == 2 && this.toppings.contains("ananas") && this.toppings.contains("prosciutto")) {
			name = "Hawaiian Pizza";
			
		}
		return name;
	}
	
	
}
