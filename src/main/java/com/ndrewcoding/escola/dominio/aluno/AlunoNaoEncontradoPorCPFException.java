package com.ndrewcoding.escola.dominio.aluno;

public class AlunoNaoEncontradoPorCPFException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public AlunoNaoEncontradoPorCPFException(CPF cpf) {
        super("Aluno não encontrado com o CPF: " + cpf.getNumero());
    }

}
