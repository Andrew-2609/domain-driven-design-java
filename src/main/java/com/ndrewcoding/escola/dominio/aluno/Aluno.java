package com.ndrewcoding.escola.dominio.aluno;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// ENTITY
public class Aluno {

    private final CPF cpf;
    private final String nome;
    private final Email email;
    private final List<Telefone> telefones = new ArrayList<>();

    public Aluno(CPF cpf, String nome, Email email) {
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
    }

    public void adicionarTelefone(String ddd, String numero) {
        this.telefones.add(new Telefone(ddd, numero));
    }

    public void adicionarTelefone(Telefone telefone) {
        this.telefones.add(telefone);
    }

    public String getCpf() {
        return cpf.getNumero();
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email.getEndereco();
    }

    public List<Telefone> getTelefones() {
        return Collections.unmodifiableList(telefones);
    }

    @Override
    public String toString() {
        return "Aluno("
                .concat("CPF: " + this.cpf)
                .concat(", Nome: " + this.nome)
                .concat(", Email: " + this.email)
                .concat(", Telefone(s): " + this.telefones)
                .concat(")");
    }

}
