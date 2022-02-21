package com.ndrewcoding.escola.academico.dominio.aluno;

import com.ndrewcoding.escola.shared.dominio.CPF;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// ENTITY - AGGREGATE ROOT
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
        if (this.telefones.size() == 2) {
            throw new LimiteDeTelefonesAtingidoException("Esse aluno já atingiu o limite de telefones cadastrados.");
        }
        this.telefones.add(new Telefone(ddd, numero));
    }

    public void adicionarTelefone(Telefone telefone) {
        this.telefones.add(telefone);
    }

    public CPF getCpf() {
        return cpf;
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
