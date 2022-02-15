package com.ndrewcoding.escola.dominio;

import com.ndrewcoding.escola.dominio.aluno.Aluno;
import com.ndrewcoding.escola.dominio.aluno.CPF;
import com.ndrewcoding.escola.dominio.aluno.Email;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AlunoTest {

    private Aluno aluno;

    @BeforeEach
    void setUp() {
        this.aluno = new Aluno(
                new CPF("123.456.789-00"),
                "Andrew",
                new Email("andrew@email.com")
        );
    }

    @Test
    void deveriaPermitirAdicionarUmTelefone() {
        this.aluno.adicionarTelefone("85", "91234-5678");
        
        assertEquals(1, this.aluno.getTelefones().size());
    }

}
