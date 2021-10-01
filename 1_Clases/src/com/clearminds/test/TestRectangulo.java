package com.clearminds.test;
import com.clearminds.conceptos.Rectangulo;

public class TestRectangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangulo p1 = new Rectangulo(10, 2);
		int perimetro1 = p1.calcularPerimetro();
		System.out.println("Perimetro 1: " + perimetro1);
		
		Rectangulo p2 = new Rectangulo(12, 8);
		int perimetro2 = p2.calcularPerimetro();
		System.out.println("Perimetro 2: " + perimetro2);
		
		System.out.println("********************");
		
		Rectangulo a1 = new Rectangulo(10, 2);
		int area1 = a1.calcularArea();
		System.out.println("Area 1: " + area1);
		
		Rectangulo a2 = new Rectangulo(12, 8);
		int area2 = a2.calcularArea();
		System.out.println("Area 2: " + area2);
	}

}
