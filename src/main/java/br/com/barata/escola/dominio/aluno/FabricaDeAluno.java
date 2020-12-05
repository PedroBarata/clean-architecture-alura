package br.com.barata.escola.dominio.aluno;

public class FabricaDeAluno {

    private Aluno aluno;

    public FabricaDeAluno comNomeCPFEEmail(String nome, String cpf, String email) {
        this.aluno = new Aluno(nome, new CPF(cpf), new Email(email));
        return this;
    }

    public FabricaDeAluno comTelefone(String ddd, String numero) {
        this.aluno.adicionaTelefones(ddd, numero);
        return this;
    }

    public Aluno constroi() {
        return this.aluno;
    }
}
