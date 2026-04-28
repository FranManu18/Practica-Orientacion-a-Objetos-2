package ar.edu.unlp.objetos.uno.oo2_ejercicio12Patrones;

public class Moderada implements PoliticaDeCancelacion{
	@Override
	public double montoAReembolsar(int dias,double montoAPagar) {
		if(dias>=7) {
			return montoAPagar;
		}else if(dias>=2) {
			return montoAPagar-montoAPagar*0.5;
		}
		return 0;
	}
}
