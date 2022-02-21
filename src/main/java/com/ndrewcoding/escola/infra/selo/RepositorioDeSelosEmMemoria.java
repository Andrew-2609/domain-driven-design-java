package com.ndrewcoding.escola.infra.selo;

import com.ndrewcoding.escola.dominio.aluno.CPF;
import com.ndrewcoding.escola.dominio.selo.RepositorioDeSelos;
import com.ndrewcoding.escola.dominio.selo.Selo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RepositorioDeSelosEmMemoria implements RepositorioDeSelos {

    private final List<Selo> selos = new ArrayList<>();

    @Override
    public void cadastrar(Selo selo) {
        this.selos.add(selo);
    }

    @Override
    public List<Selo> listarSelosDoAlunoDeCPF(CPF cpfDoAluno) {
        return selos.stream()
                .filter(selo -> selo.getCpfDoAluno().equals(cpfDoAluno))
                .collect(Collectors.toList());
    }

}
