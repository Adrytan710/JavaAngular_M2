package Main;

import Objetos.*;

public class MainApp {
	public static void main(String[] args) {
		Trabajadores t1 = new Trabajadores(Empleados.Boss,1000);
		Trabajadores t2 = new Trabajadores(Empleados.Manager,1100);
		Trabajadores t3 = new Trabajadores(Empleados.Employee,1200);
		Trabajadores t4 = new Trabajadores(Empleados.Volunteer,1300);
		
		Salario.calcularSalario(t1);
		Salario.calcularSalario(t2);
		Salario.calcularSalario(t3);
		Salario.calcularSalario(t4);
		
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
		System.out.println(t4);
	}
}
