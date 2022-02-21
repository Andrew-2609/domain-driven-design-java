package com.ndrewcoding.escola.gamificacao.aplicacao;

import com.ndrewcoding.escola.academico.dominio.aluno.AlunoMatriculado;
import com.ndrewcoding.escola.shared.dominio.evento.Evento;
import com.ndrewcoding.escola.shared.dominio.evento.Ouvinte;

public class GeraSeloAlunoNovato extends Ouvinte {

    @Override
    protected void reageAo(Evento evento) {

    }

    @Override
    protected boolean deveProcessar(Evento evento) {
        return evento instanceof AlunoMatriculado;
    }

}
