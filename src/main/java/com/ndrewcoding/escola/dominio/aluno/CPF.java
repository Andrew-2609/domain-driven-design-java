package com.ndrewcoding.escola.dominio.aluno;

// VALUE OBJECT
public class CPF {

    private final String numero;

    public CPF(String numero) {
        String cpfRegex = "^\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}$";
        if (numero == null || !numero.matches(cpfRegex)) {
            throw new IllegalArgumentException("CPF inválido!");
        }

        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return this.numero;
    }
    
}
