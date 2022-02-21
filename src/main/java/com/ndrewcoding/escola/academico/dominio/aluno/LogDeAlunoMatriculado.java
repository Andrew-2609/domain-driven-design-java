package com.ndrewcoding.escola.academico.dominio.aluno;

import com.ndrewcoding.escola.academico.dominio.Evento;
import com.ndrewcoding.escola.academico.dominio.Ouvinte;

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
