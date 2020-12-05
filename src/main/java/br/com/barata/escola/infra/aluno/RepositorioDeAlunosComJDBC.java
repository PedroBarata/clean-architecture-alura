package br.com.barata.escola.infra.aluno;

import br.com.barata.escola.dominio.aluno.Aluno;
import br.com.barata.escola.dominio.aluno.CPF;
import br.com.barata.escola.dominio.aluno.RepositorioDeAlunos;
import br.com.barata.escola.dominio.aluno.Telefone;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class RepositorioDeAlunosComJDBC implements RepositorioDeAlunos {

    private final Connection connection;

    public RepositorioDeAlunosComJDBC(Connection connection) {
        this.connection = connection;
    }


    @Override
    public void matricular(Aluno aluno) {
        try {
            String sql = "INSERT INTO ALUNO VALUES(?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, aluno.getNome());
            preparedStatement.setString(2, aluno.getEmail());
            preparedStatement.setString(3, aluno.getCpf());
            preparedStatement.execute();

            sql = "INSERT INTO TELEFONE VALUES(?, ?)";
            preparedStatement = connection.prepareStatement(sql);
            for(Telefone telefone: aluno.getTelefones()) {
                preparedStatement.setString(1, telefone.getDdd());
                preparedStatement.setString(2, telefone.getNumero());
                preparedStatement.execute();
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Aluno buscarPorCPF(CPF cpf) {
        return null;
    }

    @Override
    public List<Aluno> listarTodosAlunosMatriculados() {
        return null;
    }
}
