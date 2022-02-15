package com.ndrewcoding.escola.dominio.aluno;

public class FabricaDeAlunos {

    private Aluno aluno;

    public FabricaDeAlunos comCPFNomeEmail(String cpf, String nome, String email) {
        this.aluno = new Aluno(new CPF(cpf), nome, new Email(email));
        return this;
    }

    public FabricaDeAlunos comTelefone(String ddd, String numero) {
        this.aluno.adicionarTelefone(ddd, numero);
        return this;
    }

    public Aluno construir() {
        return this.aluno;
    }

}
