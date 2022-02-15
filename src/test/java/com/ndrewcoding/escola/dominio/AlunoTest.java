package com.ndrewcoding.escola.dominio;

import com.ndrewcoding.escola.dominio.aluno.Aluno;
import com.ndrewcoding.escola.dominio.aluno.CPF;
import com.ndrewcoding.escola.dominio.aluno.Email;
import com.ndrewcoding.escola.dominio.aluno.LimiteDeTelefonesAtingidoException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

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

    @Test
    void deveriaPermitirAdicionarDoisTelefones() {
        this.aluno.adicionarTelefone("85", "91234-5678");
        this.aluno.adicionarTelefone("85", "95678-9012");

        assertEquals(2, this.aluno.getTelefones().size());
    }

    @Test
    void naoDeveriaPermitirAdicionarTresTelefones() {
        this.aluno.adicionarTelefone("85", "91234-5678");
        this.aluno.adicionarTelefone("85", "95678-9012");

        assertThrows(LimiteDeTelefonesAtingidoException.class, () -> this.aluno.adicionarTelefone("85", "93456-7890"));
    }

}
