package ar.edu.unlp.objetos.uno.oo2_ejercicio16Patrones;

public class RC4Adapter implements EncodeStrategy{
	private RC4 rc4=new RC4();
	private String key;

	
	
	public RC4Adapter(String key) {
		super();
		this.key = key;
	}

	@Override
	public String cifrar(String mensaje) {
		return rc4.encriptar(mensaje, key);
	}
	
	@Override
	public String descifrar(String mensajeCifrado) {
		return rc4.desencriptar(mensajeCifrado, key);
	}
}
