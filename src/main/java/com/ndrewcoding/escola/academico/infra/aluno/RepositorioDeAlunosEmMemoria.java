package com.ndrewcoding.escola.academico.infra.aluno;

import com.ndrewcoding.escola.academico.dominio.aluno.Aluno;
import com.ndrewcoding.escola.academico.dominio.aluno.CPF;
import com.ndrewcoding.escola.academico.dominio.aluno.RepositorioDeAlunos;
import com.ndrewcoding.escola.academico.dominio.aluno.AlunoNaoEncontradoPorCPFException;

import java.util.ArrayList;
import java.util.List;

public class RepositorioDeAlunosEmMemoria implements RepositorioDeAlunos {

    private final List<Aluno> alunosMatriculados = new ArrayList<>();

    @Override
    public void matricular(Aluno aluno) {
        this.alunosMatriculados.add(aluno);
    }

    @Override
    public Aluno buscarPorCPF(CPF cpf) {
        return alunosMatriculados
                .stream()
                .filter(aluno -> aluno.getCpf().getNumero().equals(cpf.getNumero()))
                .findFirst()
                .orElseThrow(() -> new AlunoNaoEncontradoPorCPFException(cpf));
    }

    @Override
    public List<Aluno> listarTodosAlunosMatriculados() {
        return this.alunosMatriculados;
    }

}
