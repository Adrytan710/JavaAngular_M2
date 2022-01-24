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
		double sal = salario;
		switch(empleado) 
		{
			case Boss:
				if(sal < 8000)
				{
					sal = 8000;
				}
				break;
			case Manager:
				if(sal < 3000)
				{
					sal = 3000;
				}
				else if(sal > 5000)
				{
					sal = 5000;
				}
				break;
			case Senior:
				if(sal < 2700)
				{
					sal = 2700;
				}
				else if(sal > 4000)
				{
					sal = 4000;
				}
				break;
			case Mid:
				if(sal < 1800)
				{
					sal = 1800;
				}
				else if(sal > 2500)
				{
					sal = 2500;
				}
				break;
			case Junior:
				if(sal < 900)
				{
					sal = 900;
				}
				else if(sal > 1600)
				{
					sal = 1600;
				}
				break;
			case Volunteer:
				if(sal != 0)
				{
					sal = 0;
				}
				break;
		}

		return sal;
	}

	@Override
	public String toString() {
		return "Trabajadores [empleados=" + empleados + ", salario=" + salario + "]";
	}

}
