package com.app.fruits;

public abstract class Fruit {
	String color;
	double weight;
	String name;
	boolean isFresh;
	
	public Fruit(String name, String color, double weight, boolean isFresh) {
        this.name = name;
        this.color = color;
        this.weight = weight;
        this.isFresh = isFresh;
    }
	public void setColor(String color) {
		this.color = color;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setIsFresh(Boolean isFresh) {
		this.isFresh = isFresh;
	}
	public String getColor() {
		return color;
	}
	public double getWeight() {
		return weight;
	}
	public String getName() {
		return name;
	}
	public Boolean getIsFresh() {
		return isFresh;
	}
	
	 public abstract String taste();

	    
	    @Override
	 public String toString() {
	       return "Fruit [name=" + name + ", color=" + color + ", weight=" + weight + ", isFresh=" + isFresh + "]";
	    }
	}
	


