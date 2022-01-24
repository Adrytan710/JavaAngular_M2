package Objetos;

public class Trabajadores {
	protected Empleados empleados;
	protected double salario;

	public Trabajadores(Empleados empleados, double salario) {
		this.empleados = empleados;
		this.salario = comprobarSalario(salario, empleados);
	}

	private double comprobarSalario(double salario, Empleados empleado)
	{
		switch(empleado) 
		{
			case Boss:
				if(salario < 8000)
				{
					salario = 8000;
				}
				break;
			case Manager:
				if(salario < 3000)
				{
					salario = 3000;
				}
				else if(salario > 5000)
				{
					salario = 5000;
				}
				break;
			case Senior:
				if(salario < 2700)
				{
					salario = 2700;
				}
				else if(salario > 4000)
				{
					salario = 4000;
				}
				break;
			case Mid:
				if(salario < 1800)
				{
					salario = 1800;
				}
				else if(salario > 2500)
				{
					salario = 2500;
				}
				break;
			case Junior:
				if(salario < 900)
				{
					salario = 900;
				}
				else if(salario > 1600)
				{
					salario = 1600;
				}
				break;
			case Volunteer:
				if(salario != 0)
				{
					salario = 0;
				}
				break;
		}

		return salario;
	}
	
	public void calcularSalario() 
	{
		switch(this.empleados) 
		{
			case Manager:
				this.salario*=1.10;
				break;
			case Boss:
				this.salario*=1.50;
				break;
			case Senior:
				this.salario*=0.95;
				break;
			case Mid:
				this.salario*=0.90;
				break;
			case Junior:
				this.salario*=0.85;
				break;
			case Volunteer:
				this.salario*=0;
				break;
		}
	}

	@Override
	public String toString() {
		return "Trabajadores [empleados=" + empleados + ", salario=" + salario + "]";
	}

}
