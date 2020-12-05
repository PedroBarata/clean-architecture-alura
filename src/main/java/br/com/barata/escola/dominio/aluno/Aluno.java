package br.com.barata.escola.dominio.aluno;

import java.util.ArrayList;
import java.util.List;

/**
 * A entidade no Clean Architecture é:
 * Classes que possuem campos que a façam ser únicas
 * no caso, temos o CPF.
 */
public class Aluno {

    private String nome;

    /*Quando um campo tem validações próprias, como o email,
    criamos uma classe para isso*/
    private Email email;
    private CPF cpf;
    private List<Telefone> telefones = new ArrayList<>();

    public void adicionaTelefones(String ddd, String telefone) {
        this.telefones.add(new Telefone(ddd, telefone));
    }

    public Aluno(String nome, CPF cpf, Email email) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email.getEndereco();
    }

    public String getCpf() {
        return cpf.getNumero();
    }

    public List<Telefone> getTelefones() {
        return telefones;
    }
}
