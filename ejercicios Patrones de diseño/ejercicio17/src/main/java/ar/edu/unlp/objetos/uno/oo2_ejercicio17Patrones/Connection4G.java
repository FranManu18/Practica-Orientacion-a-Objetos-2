package ar.edu.unlp.objetos.uno.oo2_ejercicio17Patrones;

public class Connection4G implements Connection{
	private String symb;

	public Connection4G(String symb) {
		super();
		this.symb = symb;
	}
	
	public  String transmit(String data,Integer crc) {
		return "Envia data: "+data + " con valor numerico: " +crc;
	}
	
	@Override
	public  String sendData(String data,Integer crc) {
		return this.transmit(data, crc);
	}
	
	
	@Override
	public String symbol() {
		return this.symb;
	}
}
