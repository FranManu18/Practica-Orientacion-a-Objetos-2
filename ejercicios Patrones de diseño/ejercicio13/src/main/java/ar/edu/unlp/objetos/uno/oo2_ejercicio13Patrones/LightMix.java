package ar.edu.unlp.objetos.uno.oo2_ejercicio13Patrones;

public class LightMix extends ProcessStep{
	
	
	public LightMix(Relog relog) {
		super(relog);
	}

	@Override
	public boolean basicExecute(MixingTank tank) {
		double temp = tank.temperature();
		tank.heatPower(100);
		this.getRelog().esperar(2);
		if(tank.temperature()-temp == 10 ){
			 tank.mixerPower(5);
			 return true;
		}
		else {
			return false;
		}

	}
}
