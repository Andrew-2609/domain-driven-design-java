package com.ndrewcoding.escola.academico.aplicacao.aluno.matricular;

import com.ndrewcoding.escola.academico.dominio.PublicadorDeEventos;
import com.ndrewcoding.escola.academico.dominio.aluno.Aluno;
import com.ndrewcoding.escola.academico.dominio.aluno.AlunoMatriculado;
import com.ndrewcoding.escola.shared.dominio.CPF;
import com.ndrewcoding.escola.academico.dominio.aluno.RepositorioDeAlunos;

import java.util.List;
import java.util.stream.Collectors;

public class MatricularAluno {

    private final RepositorioDeAlunos repositorioDeAlunos;
    private final PublicadorDeEventos publicadorDeEventos;

    public MatricularAluno(RepositorioDeAlunos repositorioDeAlunos, PublicadorDeEventos publicadorDeEventos) {
        this.repositorioDeAlunos = repositorioDeAlunos;
        this.publicadorDeEventos = publicadorDeEventos;
    }

    public void executar(MatricularAlunoDTO matricularAlunoDTO) {
        Aluno novoAluno = matricularAlunoDTO.criarAluno();
        repositorioDeAlunos.matricular(novoAluno);

        AlunoMatriculado eventoAlunoMatriculado = new AlunoMatriculado(novoAluno.getCpf());
        publicadorDeEventos.publicar(eventoAlunoMatriculado);
    }

    public MatricularAlunoDTO buscarPorCPF(CPF cpf) {
        Aluno aluno = repositorioDeAlunos.buscarPorCPF(cpf);
        return new MatricularAlunoDTO(aluno);
    }

    public List<MatricularAlunoDTO> listarTodosAlunosMatriculados() {
        List<Aluno> alunos = repositorioDeAlunos.listarTodosAlunosMatriculados();
        return alunos.stream()
                .map(MatricularAlunoDTO::new)
                .collect(Collectors.toList());
    }

}
