package com.ndrewcoding.escola;

import com.ndrewcoding.escola.academico.aplicacao.aluno.matricular.MatricularAluno;
import com.ndrewcoding.escola.academico.aplicacao.aluno.matricular.MatricularAlunoDTO;
import com.ndrewcoding.escola.academico.dominio.aluno.LogDeAlunoMatriculado;
import com.ndrewcoding.escola.academico.infra.aluno.RepositorioDeAlunosEmMemoria;
import com.ndrewcoding.escola.gamificacao.aplicacao.GeraSeloAlunoNovato;
import com.ndrewcoding.escola.gamificacao.infra.selo.RepositorioDeSelosEmMemoria;
import com.ndrewcoding.escola.shared.dominio.evento.PublicadorDeEventos;

public class MatricularAlunoPorLinhaDeComando {
    public static void main(String[] args) {

        String cpf = "123.456.789-00";
        String nome = "Andrew Monteiro";
        String email = "andrew@email.com";

        PublicadorDeEventos publicadorDeEventos = new PublicadorDeEventos();
        publicadorDeEventos.adicionar(new LogDeAlunoMatriculado());
        publicadorDeEventos.adicionar(new GeraSeloAlunoNovato(new RepositorioDeSelosEmMemoria()));

        MatricularAluno matricularAluno = new MatricularAluno(new RepositorioDeAlunosEmMemoria(), publicadorDeEventos);
        matricularAluno.executar(new MatricularAlunoDTO(cpf, nome, email));

    }
}
