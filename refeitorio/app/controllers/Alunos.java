package controllers;

import java.util.List;

import models.Aluno;
import models.Usuario;
import play.mvc.Controller;

public class Alunos extends Controller {
	
	
	public static void agendamentoRefeicao() {
		render();
	}
	
	public static void salvarAlunos(Aluno aluno) {
		aluno.save();
		listar();
		
	}
	
	public static void listar() {
		List<Aluno> alunos = Aluno.findAll();
		render(alunos);
	}
	
	public static void editar(Long id) { 
		Aluno editarAluno = Aluno.findById(id);
		renderTemplate("Alunos/agendamentoRefeicao.html", editarAluno);
	}
	
	public static void deletar(Long id) {
		Aluno deletarAluno = Aluno.findById(id);
		deletarAluno.delete();
		listar();
	}
}
