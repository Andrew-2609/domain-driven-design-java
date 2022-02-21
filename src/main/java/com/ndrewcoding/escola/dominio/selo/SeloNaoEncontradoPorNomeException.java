package com.ndrewcoding.escola.dominio.selo;

public class SeloNaoEncontradoPorNomeException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public SeloNaoEncontradoPorNomeException(String nome) {
        super(String.format("Selo com o nome %s não foi encontrado.", nome));
    }

}
