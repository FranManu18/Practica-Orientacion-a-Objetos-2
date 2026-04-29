package ar.edu.unlp.objetos.uno.oo2_ejercicio17Patrones;

public class WifiConn implements Connection{
	private String pict;

	public WifiConn(String pict) {
		super();
		this.pict = pict;
	}
	
	@Override
	public  String sendData(String data,Integer crc) {
		return "Envia data: "+data + " con valor numerico: " +crc;
	}
	
	public String pict() {
		return this.pict;
	}
	
	@Override
	public String symbol() {
		return this.pict;
	}
}
