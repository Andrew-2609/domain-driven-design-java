package com.ndrewcoding.escola.dominio.aluno;

import java.time.format.DateTimeFormatter;

public class LogDeAlunoMatriculado {

    public void reageAo(AlunoMatriculado evento) {
        String momentoFormatado = evento.momento().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
        String log = String.format("Aluno com CPF %s, matriculado em %s", evento.getCpfDoAluno(), momentoFormatado);
        System.out.println(log);
    }

}
