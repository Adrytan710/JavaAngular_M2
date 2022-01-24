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
		case Employee:
			t.salario*=0.85;
			break;
		case Volunteer:
			t.salario*=0;
			break;
	}
	}
}
