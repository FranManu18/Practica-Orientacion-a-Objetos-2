package ar.edu.unlp.objetos.uno.oo2_ejercicio3Patrones;

public class VideoStreamAdapter implements Media{
	private VideoStream video;

	public VideoStreamAdapter(VideoStream video) {
		super();
		this.video = video;
	}
	
	@Override
	public void play() {
		video.reproduce();
	}
}
