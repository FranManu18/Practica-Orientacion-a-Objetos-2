package ar.edu.unlp.objetos.uno.oo2_ejercicio24Patrones;

import java.io.FileReader;
import java.util.List;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class UserRepository {
	private PostRepository postRepository=new PostRepository();

	@SuppressWarnings("unchecked")
	public PersistableUser findUserByUsername(String aUsername) {
		JSONParser parser = new JSONParser();
		try {
			List<JSONObject> usersData = (List<JSONObject>) parser.parse(new FileReader("users.json"));
			return usersData.stream()
				.filter(userData -> userData.get("username").equals(aUsername)).findFirst()
				.map(userData -> new LazyUser((String) userData.get("username"), (String) userData.get("email"),postRepository))
				.orElse(null);
		} catch (Exception e) {
			return null;
		}
	}

}
