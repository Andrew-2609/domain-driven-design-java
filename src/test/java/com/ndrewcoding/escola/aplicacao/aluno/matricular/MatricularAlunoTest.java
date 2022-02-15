package com.ndrewcoding.escola.aplicacao.aluno.matricular;

import com.ndrewcoding.escola.dominio.aluno.CPF;
import com.ndrewcoding.escola.infra.aluno.RepositorioDeAlunosEmMemoria;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class MatricularAlunoTest {

    @Test
    void alunoDeveriaSerPersistido() {
        MatricularAluno useCase = new MatricularAluno(new RepositorioDeAlunosEmMemoria());

        MatricularAlunoDTO dto = new MatricularAlunoDTO("123.456.789-00", "Andrew Monteiro", "andrew@email.com");

        useCase.executar(dto);

        MatricularAlunoDTO alunoEncontrado = useCase.buscarPorCPF(new CPF("123.456.789-00"));

        assertNotNull(alunoEncontrado);
        assertEquals("123.456.789-00", alunoEncontrado.getCpfAluno());
        assertEquals("Andrew Monteiro", alunoEncontrado.getNomeAluno());
        assertEquals("andrew@email.com", alunoEncontrado.getEmailAluno());
    }

}
