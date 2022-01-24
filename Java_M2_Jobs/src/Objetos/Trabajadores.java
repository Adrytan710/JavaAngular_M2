package Objetos;

public class Trabajadores {
	protected Empleados empleados;
	protected double salarioMes, salarioAny, salarioMesNeto, salarioAnyNeto, bonus;
	protected boolean ajut = false;

	public Trabajadores(Empleados empleados, double salario) {
		this.empleados = empleados;
		this.salarioMes = comprobarSalario(salario, empleados);
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
				this.salarioMes *= 1.10;
				this.salarioAny = this.salarioMes * 12;
				this.salarioMesNeto = this.salarioMes * 0.68;
				this.salarioAnyNeto = this.salarioAny * 0.68;
				break;
			case Boss:
				this.salarioMes *= 1.50;
				this.salarioAny = this.salarioMes * 12;
				this.salarioMesNeto = this.salarioMes * 0.74;
				this.salarioAnyNeto = this.salarioAny * 0.74;
				break;
			case Senior:
				this.salarioMes *= 0.95;
				this.salarioAny = this.salarioMes * 12;
				this.salarioMesNeto = this.salarioMes * 0.76;
				this.salarioAnyNeto = this.salarioAny * 0.76;
				break;
			case Mid:
				this.salarioMes *= 0.90;
				this.salarioAny = this.salarioMes * 12;
				this.salarioMesNeto = this.salarioMes * 0.85;
				this.salarioAnyNeto = this.salarioAny * 0.85;
				break;
			case Junior:
				this.salarioMes *= 0.85;
				this.salarioAny = this.salarioMes * 12;
				this.salarioMesNeto = this.salarioMes * 0.98;
				this.salarioAnyNeto = this.salarioAny * 0.98;
				break;
			case Volunteer:
				this.ajut = true;
				this.salarioMes *= 300;
				this.salarioAny = 300 * 12;
				this.salarioMesNeto = this.salarioMes;
				this.salarioAnyNeto = this.salarioAny;
				break;
		}
	}
	
	public void bonusAnual() 
	{
		switch(this.empleados) 
		{
			case Manager:
				this.bonus = this.salarioAnyNeto * 1.10;
				break;
			case Boss:
				this.bonus = this.salarioAnyNeto * 1.10;
				break;
			case Senior:
				this.bonus = this.salarioAnyNeto * 1.10;
				break;
			case Mid:
				this.bonus = this.salarioAnyNeto * 1.10;
				break;
			case Junior:
				this.bonus = this.salarioAnyNeto * 1.10;
				break;
			default:
				this.bonus = 0;
				break;
		}
	}

	@Override
	public String toString() {
		return "Trabajadores [empleados=" + empleados + ", salarioMes=" + salarioMes + ", salarioAny=" + salarioAny
				+ ", salarioMesNeto=" + salarioMesNeto + ", salarioAnyNeto=" + salarioAnyNeto + ", bonus=" + bonus
				+ ", ajut=" + ajut + "]";
	}

	

}
