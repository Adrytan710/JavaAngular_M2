package Objetos;
public class Salario {
	public static void calcularSalario(Trabajadores t) {
		switch(t.empleados) {
		case Manager:
			t.salario*=1.10;
			break;
		case Boss:
			t.salario*=1.50;
			break;
		case Senior:
			t.salario*=0.95;
			break;
		case Mid:
			t.salario*=0.90;
			break;
		case Junior:
			t.salario*=0.85;
		case Volunteer:
			t.salario*=0;
			break;
	}
	}
}
