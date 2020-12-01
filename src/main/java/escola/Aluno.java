package escola;

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

}
