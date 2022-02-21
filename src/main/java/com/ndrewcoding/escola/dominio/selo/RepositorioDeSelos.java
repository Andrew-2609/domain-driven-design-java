package com.ndrewcoding.escola.dominio.selo;

import com.ndrewcoding.escola.dominio.aluno.CPF;

import java.util.List;

public interface RepositorioDeSelos {

    void cadastrar(Selo selo);

    List<Selo> listarSelosDoAlunoDeCPF(CPF cpfDoAluno);

}
