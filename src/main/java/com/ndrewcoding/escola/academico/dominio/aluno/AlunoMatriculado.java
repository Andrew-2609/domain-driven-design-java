package com.ndrewcoding.escola.academico.dominio.aluno;

import com.ndrewcoding.escola.shared.dominio.CPF;
import com.ndrewcoding.escola.shared.dominio.evento.Evento;
import com.ndrewcoding.escola.shared.dominio.evento.TipoDeEvento;

import java.time.LocalDateTime;

public class AlunoMatriculado implements Evento {

    private final CPF cpfDoAluno;
    private final LocalDateTime momento;

    public AlunoMatriculado(CPF cpfDoAluno) {
        this.cpfDoAluno = cpfDoAluno;
        this.momento = LocalDateTime.now();
    }

    @Override
    public LocalDateTime momento() {
        return this.momento;
    }

    @Override
    public TipoDeEvento tipo() {
        return TipoDeEvento.ALUNO_MATRICULADO;
    }

    public CPF getCpfDoAluno() {
        return cpfDoAluno;
    }

}
