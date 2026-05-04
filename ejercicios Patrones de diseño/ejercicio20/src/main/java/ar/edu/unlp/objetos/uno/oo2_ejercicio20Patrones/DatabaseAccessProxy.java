package ar.edu.unlp.objetos.uno.oo2_ejercicio20Patrones;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class DatabaseAccessProxy implements DatabaseAccess{
	private DatabaseRealAccess database;
	private boolean autenticado;
	private String password;
	public DatabaseAccessProxy(DatabaseRealAccess database, String password) {
		super();
		this.database = database;
		this.autenticado=false;
		this.password = password;
	}
	
	@Override
    public Collection<String> getSearchResults(String queryString) {
        if(!autenticado) {
        	throw new RuntimeException("Usuario no autenticado");
        }
        return database.getSearchResults(queryString);
    }

    @Override
    public int insertNewRow(List<String> rowData) {
    	 if(!autenticado) {
         	throw new RuntimeException("Usuario no autenticado");
         }
         return database.insertNewRow(rowData);
    }
    
    public void autenticarse(String passwordIngresada) {
    	if(!autenticado) {
    		if(passwordIngresada==password) {
        		this.autenticado=true;
        	}else {
        		throw new RuntimeException("Contraseña incorrecta");
        	}
    	}else {
    		throw new RuntimeException("Sesion ya iniciada");
    	}
    }
    
    public void salir() {
    	if(autenticado) {
    		autenticado=false;
    	}else {
    		throw new RuntimeException("Sesion sin iniciar");
    	}
    }
	
	
}
