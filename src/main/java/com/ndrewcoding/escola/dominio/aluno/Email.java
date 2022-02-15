package com.ndrewcoding.escola.dominio.aluno;

// VALUE OBJECT
public class Email {

    private final String endereco;

    public Email(String endereco) {
        String emailRegex = "^[a-zA-Z0-9._]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        if (endereco == null || !endereco.matches(emailRegex)) {
            throw new IllegalArgumentException("E-mail inválido!");
        }

        this.endereco = endereco;
    }

    public String getEndereco() {
        return endereco;
    }

    @Override
    public String toString() {
        return this.endereco;
    }

}
