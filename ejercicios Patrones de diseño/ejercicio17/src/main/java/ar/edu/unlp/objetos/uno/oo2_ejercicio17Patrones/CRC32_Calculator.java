package ar.edu.unlp.objetos.uno.oo2_ejercicio17Patrones;
import java.util.zip.CRC32;

public class CRC32_Calculator implements CRC_Calculator{
	@Override
	public Integer crcFor(String data) {
		CRC32 crc=new CRC32();
		crc.update(data.getBytes());
		long result=crc.getValue();
		return (int)result;
	}
}
