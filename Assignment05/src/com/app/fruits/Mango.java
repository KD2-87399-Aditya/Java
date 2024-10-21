package com.app.fruits;

public class Mango extends Fruit {
	public Mango(String name, double weight, String color, boolean isFresh) {
        super(name, color, weight, isFresh);
    }
	@Override
	public String taste() {
		// TODO Auto-generated method stub
		return "sweet";
	}

}
