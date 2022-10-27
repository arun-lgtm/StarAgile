package arun.ashokit.Car;

import arun.ashokit.Engine.IEngine;

public class Car {
	
	private IEngine engine=null;

	
	//Setter Injection
	public void set(IEngine engine) {
		this.engine = engine;
	}
	
	//Constructor Injection
	Car(IEngine engine){
		this.engine=engine;
	}
	 
	
}
