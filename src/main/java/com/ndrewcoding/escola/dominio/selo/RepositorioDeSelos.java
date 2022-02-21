package com.ndrewcoding.escola.dominio.selo;

import com.ndrewcoding.escola.dominio.aluno.CPF;

import java.util.List;

public interface RepositorioDeSelos {

    void cadastrar(CPF cpfDoAluno);
    
    Selo buscarPorNome(String nome);

    List<Selo> listarTodosOsSelosCadastrados();

}
