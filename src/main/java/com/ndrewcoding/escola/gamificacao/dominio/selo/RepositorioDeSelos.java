package com.ndrewcoding.escola.gamificacao.dominio.selo;

import com.ndrewcoding.escola.academico.dominio.aluno.CPF;

import java.util.List;

public interface RepositorioDeSelos {

    void cadastrar(Selo selo);

    List<Selo> listarSelosDoAlunoDeCPF(CPF cpfDoAluno);

}
