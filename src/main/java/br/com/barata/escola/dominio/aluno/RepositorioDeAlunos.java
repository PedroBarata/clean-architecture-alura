package br.com.barata.escola.dominio.aluno;

import java.util.List;

public interface RepositorioDeAlunos {

    void matricular();

    Aluno buscarPorCPF(CPF cpf);

    List<Aluno> listarTodosAlunosMatriculados();

    //...
}
