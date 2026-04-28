package ar.edu.unlp.objetos.uno.oo2_ejercicio13Patrones;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class TestProcessStep {
	@Test
	public void testLightMixExitoso() {
	    FakeMixingTank tank = new FakeMixingTank();
	    LightMix step = new LightMix(new Relog(tank));
	    step.execute(tank);
	    assertTrue(step.isDone());
	}

	@Test
	public void testLightMixExitosoConTemperaturaInicial10() {
	    FakeMixingTank tank = new FakeMixingTank();
	    tank.setTemperatura(10);
	    LightMix step = new LightMix(new Relog(tank));
	    step.execute(tank);
	    assertTrue(step.isDone());
	}

	@Test
	public void testLightMixFallidoSiCalentadorNoFunciona() {
	    FakeMixingTank tank = new FakeMixingTank(); 
	    tank.setHeatPowerFunciona(false);
	    LightMix step = new LightMix(new Relog(tank));
	    step.execute(tank);
	    assertFalse(step.isDone());
	}
	
	@Test
	public void testPurge() {
		FakeMixingTank tank=new FakeMixingTank();
		
		Purge step=new Purge(new Relog(tank));
		step.execute(tank);
		assertTrue(step.isDone());
		
		tank.setVolumen(0);
		step.execute(tank);
		assertFalse(step.isDone());

	}
}
