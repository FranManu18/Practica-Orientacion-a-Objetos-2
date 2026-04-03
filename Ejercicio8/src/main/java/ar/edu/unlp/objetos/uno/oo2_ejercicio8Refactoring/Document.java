package ar.edu.unlp.objetos.uno.oo2_ejercicio8Refactoring;

import java.util.List;

public class Document {
	List<String>words;
	
	  public long characterCount() {
		 long count = this.words
		 .stream()
		 .mapToLong(w -> w.length())
		 .sum();
		 return count;
	  }
	  
	  public long calculateAvg() {
		return this.characterCount()/this.words.size();
	  }
}
