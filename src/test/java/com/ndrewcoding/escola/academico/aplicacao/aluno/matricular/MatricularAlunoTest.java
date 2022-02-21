package com.ndrewcoding.escola.academico.aplicacao.aluno.matricular;

import com.ndrewcoding.escola.academico.dominio.aluno.CPF;
import com.ndrewcoding.escola.academico.dominio.PublicadorDeEventos;
import com.ndrewcoding.escola.academico.dominio.aluno.LogDeAlunoMatriculado;
import com.ndrewcoding.escola.academico.infra.aluno.RepositorioDeAlunosEmMemoria;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class MatricularAlunoTest {

    private static final PublicadorDeEventos PUBLICADOR_DE_EVENTOS = new PublicadorDeEventos();

    @BeforeAll
    static void setUp() {
        PUBLICADOR_DE_EVENTOS.adicionar(new LogDeAlunoMatriculado());
    }

    @Test
    void alunoDeveriaSerPersistido() {
        MatricularAluno useCase = new MatricularAluno(new RepositorioDeAlunosEmMemoria(), PUBLICADOR_DE_EVENTOS);

        MatricularAlunoDTO dto = new MatricularAlunoDTO("123.456.789-00", "Andrew Monteiro", "andrew@email.com");

        useCase.executar(dto);

        MatricularAlunoDTO alunoEncontrado = useCase.buscarPorCPF(new CPF("123.456.789-00"));

        assertNotNull(alunoEncontrado);
        assertEquals("123.456.789-00", alunoEncontrado.getCpfAluno());
        assertEquals("Andrew Monteiro", alunoEncontrado.getNomeAluno());
        assertEquals("andrew@email.com", alunoEncontrado.getEmailAluno());
    }

}
