package ar.edu.unlp.objetos.uno.oo2_ejercicio13Patrones;

public class FakeMixingTank extends MixingTank{
	private double temperatura = 20.0;
    private double volumen = 100.0;
    private int potenciaCalor = 0;
    private int potenciaMixer = 0;
    private boolean heatPowerFunciona = true;

    // simula el paso del tiempo aplicando los efectos
    public void simularSegundos(int segundos) {
        double gradosPorSegundo = gradosSegunPotencia(potenciaCalor);
        temperatura += gradosPorSegundo * segundos;
        try {
			Thread.sleep(segundos*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        // si se purgó (potencia 0 y mixer 0), el volumen baja
        if (potenciaCalor == 0 && potenciaMixer == 0) {
            volumen = 0;
        }
    }

    private double gradosSegunPotencia(int potencia) {
        if (potencia == 100) return 5;
        if (potencia == 75)  return 4;
        if (potencia == 50)  return 2;
        if (potencia == 25)  return 1;
        return 0;
    }
    
    public void setHeatPowerFunciona(boolean valor) {
        this.heatPowerFunciona = valor;
    }

    @Override
    public boolean heatPower(int percentage) {
    	if (heatPowerFunciona) {
            this.potenciaCalor = percentage;
        }
        return true;
    }

    @Override
    public boolean mixerPower(int percentage) {
        this.potenciaMixer = percentage;
        return true;
    }

    @Override
    public boolean purge() {
        return true;
    }

    @Override
    public double upTo() { return volumen; }

    @Override
    public double temperature() { return temperatura; }

    public void setVolumen(double volumen) { this.volumen = volumen; }
    public void setTemperatura(double temperatura) { this.temperatura = temperatura; }
}
