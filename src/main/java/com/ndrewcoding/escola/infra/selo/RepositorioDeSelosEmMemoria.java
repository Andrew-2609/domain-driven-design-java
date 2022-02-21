package com.ndrewcoding.escola.infra.selo;

import com.ndrewcoding.escola.dominio.aluno.CPF;
import com.ndrewcoding.escola.dominio.selo.RepositorioDeSelos;
import com.ndrewcoding.escola.dominio.selo.Selo;

import java.util.List;

public class RepositorioDeSelosEmMemoria implements RepositorioDeSelos {

    @Override
    public void cadastrar(CPF cpfDoAluno) {

    }

    @Override
    public Selo buscarPorNome(String nome) {
        return null;
    }

    @Override
    public List<Selo> listarTodosOsSelosCadastrados() {
        return null;
    }
    
}
