package ar.edu.unlp.objetos.uno.oo2_ejercicio13Patrones;

public abstract class ProcessStep {
	private boolean result;
	private Relog relog;
	
	
	
	public ProcessStep(Relog relog) {
		super();
		this.relog = relog;
	}

	
	public Relog getRelog() {
		return relog;
	}


	private void setSuccess() {
		result=true;
	}
	
	private void setFailure() {
		result=false;
	}
	
	public boolean isDone() {
		return result;
	}
	
	protected abstract boolean basicExecute(MixingTank tank);
	
	public void execute(MixingTank tank) {
		if(this.basicExecute(tank)) {
			this.setSuccess();
		}else {
			this.setFailure();
		}
	}
}
