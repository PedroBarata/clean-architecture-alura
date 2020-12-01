package escola;

public class Telefone {
    private String ddd;
    private String numero;

    public Telefone(String ddd, String numero) {
        if (ddd == null || numero == null || !ddd.matches("\\d{2}/") || !numero.matches("\\d{8,9}/")) {
            throw new IllegalArgumentException("DDD ou Numero inválidos!");
        }
        this.ddd = ddd;
        this.numero = numero;
    }

}
