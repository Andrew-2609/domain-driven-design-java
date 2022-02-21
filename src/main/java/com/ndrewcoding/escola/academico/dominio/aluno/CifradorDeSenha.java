package com.ndrewcoding.escola.academico.dominio.aluno;

public interface CifradorDeSenha {

    String cifrarSenha(String senha);

    boolean validarSenhaCifrada(String senha, String senhaCifrada);

}
