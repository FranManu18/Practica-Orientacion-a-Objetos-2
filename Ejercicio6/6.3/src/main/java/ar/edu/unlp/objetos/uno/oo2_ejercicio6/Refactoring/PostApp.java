package ar.edu.unlp.objetos.uno.oo2_ejercicio6.Refactoring;

import java.util.List;
import java.util.stream.Collectors;

public class PostApp {
	private List<Post>posts;

	public PostApp(List<Post> posts) {
		super();
		this.posts = posts;
	}
	
	public List<Post>ultimosPosts(Usuario user,int cantidad){
		List<Post>postsOtrosUsuarios=posts.stream()
				.filter(p->!p.getUsuario().equals(user))
				.limit(cantidad).collect(Collectors.toList());
		postsOtrosUsuarios=ordenarList(postsOtrosUsuarios);
		return postsOtrosUsuarios;
	}
	
	public List<Post>ordenarList(List<Post>lista){
		return lista.stream()
				.sorted((p1,p2)->p2.getFecha().compareTo(p1.getFecha()))
				.collect(Collectors.toList());
	}
}
