package Main;

import Objetos.*;

public class MainApp {
	public static void main(String[] args) {
		Trabajadores t1 = new Trabajadores(Empleados.Boss,1000);
		Trabajadores t2 = new Trabajadores(Empleados.Manager,1100);
		Trabajadores t3 = new Trabajadores(Empleados.Senior,1200);
		Trabajadores t4 = new Trabajadores(Empleados.Mid,1200);
		Trabajadores t5 = new Trabajadores(Empleados.Junior,1200);
		Trabajadores t6 = new Trabajadores(Empleados.Volunteer,1300);
		
		t1.calcularSalario();
		t2.calcularSalario();
		t3.calcularSalario();
		t4.calcularSalario();
		t5.calcularSalario();
		t6.calcularSalario();
		
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
		System.out.println(t4);
		System.out.println(t5);
		System.out.println(t6);
	}
}
