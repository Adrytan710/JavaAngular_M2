package Objetos;

public class Trabajadores {
	protected Empleados empleados;
	protected double salario;
	
	public Trabajadores(Empleados empleados, double salario) {
		this.empleados = empleados;
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Trabajadores [empleados=" + empleados + ", salario=" + salario + "]";
	}
	
}
