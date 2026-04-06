package ar.edu.unlp.objetos.uno.oo2_ejercicio3Patrones;

public class MediaPlayer {
	private Media media;

	public MediaPlayer(Media media) {
		super();
		this.media = media;
	}
	
	public void play() {
		media.play();
	}
}	
