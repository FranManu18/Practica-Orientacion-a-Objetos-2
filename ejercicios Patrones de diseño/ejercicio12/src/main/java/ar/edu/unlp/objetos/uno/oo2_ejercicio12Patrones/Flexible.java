package ar.edu.unlp.objetos.uno.oo2_ejercicio12Patrones;

public class Flexible implements PoliticaDeCancelacion{
	@Override
	public double montoAReembolsar(int dias,double montoAPagar) {
		if(dias<1) {
			return 0;
		}
		return montoAPagar;
	}
}
