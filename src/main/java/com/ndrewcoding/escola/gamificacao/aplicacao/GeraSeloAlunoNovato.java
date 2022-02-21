package com.ndrewcoding.escola.gamificacao.aplicacao;

import com.ndrewcoding.escola.shared.dominio.evento.Evento;
import com.ndrewcoding.escola.shared.dominio.evento.Ouvinte;

public class GeraSeloAlunoNovato extends Ouvinte {

    @Override
    protected boolean deveProcessar(Evento evento) {
        return false;
    }

    @Override
    protected void reageAo(Evento evento) {

    }

}
