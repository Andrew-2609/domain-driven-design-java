package com.ndrewcoding.escola.gamificacao.aplicacao;

import com.ndrewcoding.escola.gamificacao.dominio.selo.RepositorioDeSelos;
import com.ndrewcoding.escola.gamificacao.dominio.selo.Selo;
import com.ndrewcoding.escola.shared.dominio.CPF;
import com.ndrewcoding.escola.shared.dominio.evento.Evento;
import com.ndrewcoding.escola.shared.dominio.evento.Ouvinte;
import com.ndrewcoding.escola.shared.dominio.evento.TipoDeEvento;

public class GeraSeloAlunoNovato extends Ouvinte {

    private final RepositorioDeSelos repositorioDeSelos;

    public GeraSeloAlunoNovato(RepositorioDeSelos repositorioDeSelos) {
        this.repositorioDeSelos = repositorioDeSelos;
    }

    @Override
    protected void reageAo(Evento evento) {
        CPF cpfDoAluno = (CPF) evento.informacoes().get("cpfDoAluno");
        Selo seloDeNovato = new Selo(cpfDoAluno, "Novato");
        repositorioDeSelos.cadastrar(seloDeNovato);
    }

    @Override
    protected boolean deveProcessar(Evento evento) {
        return evento.tipo() == TipoDeEvento.ALUNO_MATRICULADO;
    }

}
