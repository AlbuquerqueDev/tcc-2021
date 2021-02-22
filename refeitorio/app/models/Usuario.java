package models;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import play.db.jpa.Model;

@Entity
public class Usuario extends Model {
	
	public String matricula;
	public String senha;
	
	public Usuario() {}
	
	public Usuario(String matricula, String senha) {
		this.matricula = matricula;
		this.senha = senha;
	}
	

}
