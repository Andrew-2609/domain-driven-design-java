package com.ndrewcoding.escola;

import com.ndrewcoding.escola.aplicacao.aluno.matricular.MatricularAluno;
import com.ndrewcoding.escola.aplicacao.aluno.matricular.MatricularAlunoDTO;
import com.ndrewcoding.escola.infra.aluno.RepositorioDeAlunosEmMemoria;

public class MatricularAlunoPorLinhaDeComando {
    public static void main(String[] args) {

        String cpf = "123.456.789-00";
        String nome = "Andrew Monteiro";
        String email = "andrew@email.com";

        MatricularAluno matricularAluno = new MatricularAluno(new RepositorioDeAlunosEmMemoria());
        matricularAluno.executar(new MatricularAlunoDTO(cpf, nome, email));

    }
}
