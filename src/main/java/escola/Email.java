package escola;

public class Email {

    private String endereco;

    public Email(String endereco) {
        if(endereco == null || !endereco.matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$")) {
            //Podemos criar exceptions também
            throw new IllegalArgumentException("Email inválido!");
        }
        this.endereco = endereco;
    }

    public String getEndereco() {
        return endereco;
    }
}
