package com.ndrewcoding.escola.gamificacao.aplicacao;

import com.ndrewcoding.escola.shared.dominio.evento.Evento;
import com.ndrewcoding.escola.shared.dominio.evento.Ouvinte;
import com.ndrewcoding.escola.shared.dominio.evento.TipoDeEvento;

public class GeraSeloAlunoNovato extends Ouvinte {

    @Override
    protected void reageAo(Evento evento) {

    }

    @Override
    protected boolean deveProcessar(Evento evento) {
        return evento.tipo() == TipoDeEvento.ALUNO_MATRICULADO;
    }

}
