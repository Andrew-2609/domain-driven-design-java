package com.ndrewcoding.escola.academico.dominio.indicacao;

import com.ndrewcoding.escola.academico.dominio.aluno.Aluno;

public interface EnviarEmailIndicacao {

    void enviarPara(Aluno indicado);

}
