package escola;

/**
 * A entidade no Clean Architecture é:
 * Classes que possuem campos que a façam ser únicas
 * no caso, temos o CPF.
 */
public class Aluno {

    private String nome;
    private String cpf;

    /*Quando um campo tem validações próprias, como o email,
    criamos uma classe para isso*/
    private Email email;

}
