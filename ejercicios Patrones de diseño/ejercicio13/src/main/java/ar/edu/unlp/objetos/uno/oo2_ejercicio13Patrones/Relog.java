package ar.edu.unlp.objetos.uno.oo2_ejercicio13Patrones;

public class Relog {
	private FakeMixingTank tank;

    

    public Relog(FakeMixingTank tank) {
		super();
		this.tank = tank;
	}


	public void esperar(int segundos) {
        tank.simularSegundos(segundos);
    }
}
