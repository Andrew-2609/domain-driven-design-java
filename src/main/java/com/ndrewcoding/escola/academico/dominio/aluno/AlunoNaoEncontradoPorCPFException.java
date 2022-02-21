package com.ndrewcoding.escola.academico.dominio.aluno;

import com.ndrewcoding.escola.shared.dominio.CPF;

public class AlunoNaoEncontradoPorCPFException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public AlunoNaoEncontradoPorCPFException(CPF cpf) {
        super("Aluno não encontrado com o CPF: " + cpf.getNumero());
    }

}
