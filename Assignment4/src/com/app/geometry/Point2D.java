package com.app.geometry;



public class Point2D {

	
		double x;
		double y;
		public Point2D(double x, double y) {
			this.x = x;
			this.y = y;
		}
		public String getDetails() {
			return "("+x+","+y+")";
		}
		public boolean isEqual(Point2D p2) {
			return this.x == p2.x && this.y == p2.y;
		}
		public double calculateDistance(Point2D p2) {
			return Math.sqrt(Math.pow(p2.x-this.x, 2)+ Math.pow(p2.x-this.x,2));
			 
		}
		
		

	

}
