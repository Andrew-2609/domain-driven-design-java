package com.ndrewcoding.escola.dominio.aluno;

public interface CifradorDeSenha {

    String cifrarSenha(String senha);

    boolean validarSenhaCifrada(String senha, String senhaCifrada);

}
