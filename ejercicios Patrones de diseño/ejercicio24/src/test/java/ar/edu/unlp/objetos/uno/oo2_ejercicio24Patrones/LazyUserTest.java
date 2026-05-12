package ar.edu.unlp.objetos.uno.oo2_ejercicio24Patrones;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

public class LazyUserTest {
	private FakePostRepository fakePostRepo;
	private LazyUser lazyUser;
	
	@BeforeEach
	void setUp() {
		 List<Post> posts = List.of(
		            new Post("primer post"),
		            new Post("segundo post")
		  );
		  fakePostRepo = new FakePostRepository(posts);
		  lazyUser = new LazyUser("ana", "ana@mail.com", fakePostRepo);
	}
	
	@Test
	public void testPostsNoSeCarganAlCrear() {
		assertFalse(fakePostRepo.fueLlamado());
	}
	
	@Test
	public void testPostSeCarganAlPedirlos() {
		lazyUser.getPosts();
		assertTrue(fakePostRepo.fueLlamado());
	}
	
	@Test
	public void testGetPostDevuelvePostsCorrectos() {
		List<Post>posts=lazyUser.getPosts();
		assertEquals(2,posts.size());
		assertEquals("primer post",posts.get(0).getText());
	}
	
	@Test
	public void testDatosBasicosDisponiblesSinCargarPosts() {
		assertEquals("ana", lazyUser.getUsername());
        assertEquals("ana@mail.com", lazyUser.getEmail());
        assertFalse(fakePostRepo.fueLlamado());
	}
	
	
}
