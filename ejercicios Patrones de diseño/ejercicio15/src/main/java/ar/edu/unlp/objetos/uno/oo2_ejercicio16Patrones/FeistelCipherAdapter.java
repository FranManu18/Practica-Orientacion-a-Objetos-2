package ar.edu.unlp.objetos.uno.oo2_ejercicio16Patrones;

public class FeistelCipherAdapter implements EncodeStrategy{
	private FeistelCipher feistel;

	public FeistelCipherAdapter(String key) {
		super();
		this.feistel=new FeistelCipher(key);
	}
	
	@Override
	public String cifrar(String mensaje) {
		return feistel.encode(mensaje);
	}
	
	@Override
	public String descifrar(String mensajeCifrado) {
		return feistel.encode(mensajeCifrado);
	}
}
