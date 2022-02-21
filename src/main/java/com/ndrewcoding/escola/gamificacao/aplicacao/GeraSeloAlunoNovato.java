package com.ndrewcoding.escola.gamificacao.aplicacao;

import com.ndrewcoding.escola.academico.dominio.Evento;
import com.ndrewcoding.escola.academico.dominio.Ouvinte;

public class GeraSeloAlunoNovato extends Ouvinte {

    @Override
    protected boolean deveProcessar(Evento evento) {
        return false;
    }

    @Override
    protected void reageAo(Evento evento) {

    }

}
