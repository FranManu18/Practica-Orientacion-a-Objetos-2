package ar.edu.unlp.objetos.uno.oo2_ejercicio24Patrones;

import java.util.List;

public class LazyUser implements PersistableUser{
	private String username;
	private String email;
	private List<Post>posts;
	private PostRepository postRepository;
	
	public LazyUser(String username, String email, PostRepository postRepository) {
		super();
		this.username = username;
		this.email = email;
		this.postRepository = postRepository;
		this.posts=null;
	}
	
	@Override
	public String getUsername() {
		return username;
	}

	@Override
	public String getEmail() {
		return email;
	}

	@Override
	public List<Post> getPosts() {
		if(posts==null) {
			posts=postRepository.findPostsByUsername(username);
		}
		return posts;
	}
	
	
	
}
