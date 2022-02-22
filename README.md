# Domain Driven Design with Java

### Simple project to understand and practice the core of Domain Driven Design, with Java.

Base project from my [Clean Architecture with Java](https://github.com/Andrew-2609/clean-architecture-java) repository.

Based on an [Alura](https://www.alura.com.br)'s course.

### Below you can see the basic structure of the project:

``` bash
├── pom.xml
├── README.md
└── src
    ├── main
    │   ├── java
    │   │   └── com
    │   │       └── ndrewcoding
    │   │           └── escola
    │   │               ├── academico
    │   │               │   ├── aplicacao
    │   │               │   │   └── aluno
    │   │               │   │       └── matricular
    │   │               │   │           ├── MatricularAlunoDTO.java
    │   │               │   │           └── MatricularAluno.java
    │   │               │   ├── dominio
    │   │               │   │   ├── aluno
    │   │               │   │   │   ├── Aluno.java
    │   │               │   │   │   ├── AlunoMatriculado.java
    │   │               │   │   │   ├── AlunoNaoEncontradoPorCPFException.java
    │   │               │   │   │   ├── CifradorDeSenha.java
    │   │               │   │   │   ├── Email.java
    │   │               │   │   │   ├── FabricaDeAlunos.java
    │   │               │   │   │   ├── LimiteDeTelefonesAtingidoException.java
    │   │               │   │   │   ├── LogDeAlunoMatriculado.java
    │   │               │   │   │   ├── RepositorioDeAlunos.java
    │   │               │   │   │   └── Telefone.java
    │   │               │   │   └── indicacao
    │   │               │   │       ├── EnviarEmailIndicacao.java
    │   │               │   │       └── Indicacao.java
    │   │               │   └── infra
    │   │               │       ├── aluno
    │   │               │       │   ├── CifradorDeSenhaComMD5.java
    │   │               │       │   ├── RepositorioDeAlunosComJDBC.java
    │   │               │       │   └── RepositorioDeAlunosEmMemoria.java
    │   │               │       └── indicacao
    │   │               │           └── EnviarEmailIndicacaoComJavaMail.java
    │   │               ├── gamificacao
    │   │               │   ├── aplicacao
    │   │               │   │   └── GeraSeloAlunoNovato.java
    │   │               │   ├── dominio
    │   │               │   │   └── selo
    │   │               │   │       ├── RepositorioDeSelos.java
    │   │               │   │       └── Selo.java
    │   │               │   └── infra
    │   │               │       └── selo
    │   │               │           └── RepositorioDeSelosEmMemoria.java
    │   │               ├── MatricularAlunoPorLinhaDeComando.java
    │   │               └── shared
    │   │                   └── dominio
    │   │                       ├── CPF.java
    │   │                       └── evento
    │   │                           ├── Evento.java
    │   │                           ├── Ouvinte.java
    │   │                           ├── PublicadorDeEventos.java
    │   │                           └── TipoDeEvento.java
    │   └── resources
    └── test
        └── java
            └── com
                └── ndrewcoding
                    └── escola
                        ├── academico
                        │   ├── aplicacao
                        │   │   └── aluno
                        │   │       └── matricular
                        │   │           └── MatricularAlunoTest.java
                        │   └── dominio
                        │       ├── AlunoTest.java
                        │       ├── EmailTest.java
                        │       └── TelefoneTest.java
                        └── shared
                            └── dominio
                                └── CPFTest.java

38 directories, 35 files
```