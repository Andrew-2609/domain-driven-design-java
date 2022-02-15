package com.ndrewcoding.escola.dominio.aluno;

// VALUE OBJECT
public class Telefone {

    private final String ddd;
    private final String numero;

    public Telefone(String ddd, String numero) {
        String dddRegex = "^[1-9]{2}$";
        String numeroRegex = "^(?:[2-8]|9[1-9])[0-9]{3}-[0-9]{4}$";

        if (ddd == null || !ddd.matches(dddRegex)) {
            throw new IllegalArgumentException("DDD inválido!");
        }

        if (numero == null || !numero.matches(numeroRegex)) {
            throw new IllegalArgumentException("Número de telefone inválido!");
        }

        this.ddd = ddd;
        this.numero = numero;
    }

    public String getDdd() {
        return ddd;
    }

    public String getNumero() {
        return numero;
    }

    public String getTelefone() {
        return "(".concat(ddd).concat(")").concat(" ").concat(numero);
    }

    @Override
    public String toString() {
        return getTelefone();
    }

}
