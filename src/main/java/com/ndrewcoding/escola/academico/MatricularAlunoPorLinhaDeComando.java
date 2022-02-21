package com.ndrewcoding.escola.academico;

import com.ndrewcoding.escola.academico.aplicacao.aluno.matricular.MatricularAlunoDTO;
import com.ndrewcoding.escola.academico.aplicacao.aluno.matricular.MatricularAluno;
import com.ndrewcoding.escola.academico.dominio.PublicadorDeEventos;
import com.ndrewcoding.escola.academico.dominio.aluno.LogDeAlunoMatriculado;
import com.ndrewcoding.escola.academico.infra.aluno.RepositorioDeAlunosEmMemoria;

public class MatricularAlunoPorLinhaDeComando {
    public static void main(String[] args) {

        String cpf = "123.456.789-00";
        String nome = "Andrew Monteiro";
        String email = "andrew@email.com";

        PublicadorDeEventos publicadorDeEventos = new PublicadorDeEventos();
        publicadorDeEventos.adicionar(new LogDeAlunoMatriculado());

        MatricularAluno matricularAluno = new MatricularAluno(new RepositorioDeAlunosEmMemoria(), publicadorDeEventos);
        matricularAluno.executar(new MatricularAlunoDTO(cpf, nome, email));

    }
}
