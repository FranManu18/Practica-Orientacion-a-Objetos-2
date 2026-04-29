package ar.edu.unlp.objetos.uno.oo2_ejercicio17Patrones;

public class Dispositivo {
	private Display display;
	private Ringer ringer;
	private CRC_Calculator crcCalculator;
	private Connection connection;
	
	public Dispositivo(Display display, Ringer ringer, CRC_Calculator crcCalculator, Connection connection) {
		super();
		this.display = display;
		this.ringer = ringer;
		this.crcCalculator = crcCalculator;
		this.connection = connection;
	}
	
	public void conectarCon(Connection conn) {
		this.connection=conn;
		System.out.println(display.showBanner(this.connection.symbol()));
		this.ringer.ring();
	}
	
	public void configurarCRC(CRC_Calculator crc) {
		this.crcCalculator=crc;
	}
	
	public String send(String data) {
		return this.connection.sendData(data, this.crcCalculator.crcFor(data));
	}

	public CRC_Calculator getCrcCalculator() {
		return crcCalculator;
	}

	public Connection getConnection() {
		return connection;
	}
	
	
}
