package com.salutaMondo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Component("SalutaMondo")
//@Scope("singleton")
public class SalutaMondo {
	
	public String saluta() {
		return "Ciao Mondo";
	}
}
