package com.ndrewcoding.escola.dominio.aluno;

import com.ndrewcoding.escola.dominio.Evento;
import com.ndrewcoding.escola.dominio.Ouvinte;

import java.time.format.DateTimeFormatter;

public class LogDeAlunoMatriculado extends Ouvinte {

    @Override
    public void reageAo(Evento evento) {
        String momentoFormatado = evento.momento().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
        String log = String.format("Aluno com CPF %s, matriculado em %s", ((AlunoMatriculado) evento).getCpfDoAluno(), momentoFormatado);
        System.out.println(log);
    }

    @Override
    protected boolean deveProcessar(Evento evento) {
        return evento instanceof AlunoMatriculado;
    }

}
