package com.Pizzeria;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString

public class Oggetto extends Prodotto{public Oggetto(Double prezzo) {
		super(prezzo);
	}

	
}
