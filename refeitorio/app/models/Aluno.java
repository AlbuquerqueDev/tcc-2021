package models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import play.db.jpa.Model;

@Entity
public class Aluno extends Usuario {
	public String tipoAluno;
	public String tipoRefeicao;
	
public Aluno() {}

}
