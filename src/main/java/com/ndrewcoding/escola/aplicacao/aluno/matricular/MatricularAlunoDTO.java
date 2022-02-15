package com.ndrewcoding.escola.aplicacao.aluno.matricular;

import com.ndrewcoding.escola.dominio.aluno.Aluno;
import com.ndrewcoding.escola.dominio.aluno.CPF;
import com.ndrewcoding.escola.dominio.aluno.Email;

public class MatricularAlunoDTO {

    private final String cpfAluno;
    private final String nomeAluno;
    private final String emailAluno;

    public MatricularAlunoDTO(String cpfAluno, String nomeAluno, String emailAluno) {
        this.cpfAluno = cpfAluno;
        this.nomeAluno = nomeAluno;
        this.emailAluno = emailAluno;
    }

    public MatricularAlunoDTO(Aluno aluno) {
        this.cpfAluno = aluno.getCpf();
        this.nomeAluno = aluno.getNome();
        this.emailAluno = aluno.getEmail();
    }

    public Aluno criarAluno() {
        return new Aluno(new CPF(cpfAluno), nomeAluno, new Email(emailAluno));
    }

    public String getCpfAluno() {
        return cpfAluno;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public String getEmailAluno() {
        return emailAluno;
    }

}
