package ar.edu.unlp.objetos.uno.oo2_ejercicio17Patrones;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestDispositivo {
	private Dispositivo dispositivo;
	
	@BeforeEach
	void setUp() {
		dispositivo=new Dispositivo(new Display(),new Ringer(),new CRC16_Calculator(),new WifiConn("Logo Wifi"));
	}
	
	@Test
	public void testConectarCon() {
		assertEquals(WifiConn.class,dispositivo.getConnection().getClass());
		dispositivo.conectarCon(new Connection4G("Logo 4G"));
		assertEquals(Connection4G.class,dispositivo.getConnection().getClass());
		dispositivo.conectarCon(new WifiConn("Logo Wifi"));
	}
	
	@Test
	public void testConfigurarCRC() {
		assertEquals(CRC16_Calculator.class,dispositivo.getCrcCalculator().getClass());
		dispositivo.configurarCRC(new CRC32_Calculator());
		assertEquals(CRC32_Calculator.class,dispositivo.getCrcCalculator().getClass());
	}
	
	@Test
	public void testSend() {
		//CRC16 Con Wifi y 4G
		System.out.println(dispositivo.send("MensajeWifi16"));
		dispositivo.conectarCon(new Connection4G("Logo 4G"));
		System.out.println(dispositivo.send("Mensaje4G16"));
		
		//CRC32 Con Wifi y 4G
		dispositivo.configurarCRC(new CRC32_Calculator());
		dispositivo.conectarCon(new WifiConn("Logo Wifi"));
		
		System.out.println(dispositivo.send("MensajeWifi32"));
		dispositivo.conectarCon(new Connection4G("Logo 4G"));
		System.out.println(dispositivo.send("Mensaje4G32"));
	}
}
