package com.ndrewcoding.escola.infra.selo;

import com.ndrewcoding.escola.dominio.selo.RepositorioDeSelos;
import com.ndrewcoding.escola.dominio.selo.Selo;
import com.ndrewcoding.escola.dominio.selo.SeloNaoEncontradoPorNomeException;

import java.util.ArrayList;
import java.util.List;

public class RepositorioDeSelosEmMemoria implements RepositorioDeSelos {

    private final List<Selo> selos = new ArrayList<>();

    @Override
    public void cadastrar(Selo selo) {
        this.selos.add(selo);
    }

    @Override
    public Selo buscarPorNome(String nome) {
        return selos.stream()
                .filter(selo -> selo.getNome().equals(nome))
                .findFirst()
                .orElseThrow(() -> new SeloNaoEncontradoPorNomeException(nome));
    }

    @Override
    public List<Selo> listarTodosOsSelosCadastrados() {
        return this.selos;
    }

}
