package controllers;

import play.mvc.Controller;
import models.Aluno;
import models.Usuario;

public class Login extends Controller{
	
	public static void login() {
		render();
	}
	
	public static void logout() {
		login();
	}

	public static void autenticar(String matricula, String senha) {
		
		Usuario usuario = Usuario.find("matricula = ? and senha = ?", matricula, senha).first();
		
		if(usuario != null) {
				Application.index();
			}
			
			else {
				logout();
			}
	}
}
