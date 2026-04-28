package ar.edu.unlp.objetos.uno.oo2_ejercicio13Patrones;

public class Purge extends ProcessStep{
	
	
	public Purge(Relog relog) {
		super(relog);
	}

	@Override
	public boolean basicExecute(MixingTank tank) {
		if(tank.upTo()==0) {
			return false;
		}else {
			tank.heatPower(0);
			tank.mixerPower(0);
			tank.purge();
			this.getRelog().esperar(4);
			if(tank.upTo()!=0) {
				return false;
			}
			return true;
		}
	}
}
