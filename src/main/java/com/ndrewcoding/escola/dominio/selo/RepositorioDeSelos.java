package com.ndrewcoding.escola.dominio.selo;

import java.util.List;

public interface RepositorioDeSelos {

    void cadastrar(Selo selo);

    Selo buscarPorNome(String nome);

    List<Selo> listarTodosOsSelosCadastrados();

}
