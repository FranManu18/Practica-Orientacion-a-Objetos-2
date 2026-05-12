package ar.edu.unlp.objetos.uno.oo2_ejercicio24Patrones;

import java.util.List;

public class FakePostRepository extends PostRepository{
	private boolean fueLlamado=false;
	private List<Post>postsADevolver;
	
	public FakePostRepository(List<Post> postsADevolver) {
		super();
		this.postsADevolver = postsADevolver;
	}
	
	@Override
	public List<Post>findPostsByUsername(String username){
		fueLlamado=true;
		return postsADevolver;
	}
	
	public boolean fueLlamado() {
		return fueLlamado;
	}
}
