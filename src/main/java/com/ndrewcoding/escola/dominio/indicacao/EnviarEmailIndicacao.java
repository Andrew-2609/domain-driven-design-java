package com.ndrewcoding.escola.dominio.indicacao;

import com.ndrewcoding.escola.dominio.aluno.Aluno;

public interface EnviarEmailIndicacao {

    void enviarPara(Aluno indicado);

}
