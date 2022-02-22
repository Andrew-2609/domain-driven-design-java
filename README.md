# Domain Driven Design with Java

## What is this repository?

This is a simple project to understand and practice the core of Domain Driven Design, with Java.

Base project from my [Clean Architecture with Java](https://github.com/Andrew-2609/clean-architecture-java) repository.

Based on an [Alura](https://www.alura.com.br)'s course.

### What is this project about?

This project is about the enrollment and management of students of a school. The basic structure of it can be seen in
the last section.

Everything is about keep classes and contexts organized as much as possible, and there are uncountable ways of doing it.
In this project, classes are divided in **three main packages**:

* aplicacao (application)
* dominio (domain)
* infra (infrastructure)

And it is divided in **three main contexts**:

* academico (academic)
* gamificacao (gamification)
* shared (shared 🤔)

The explanation of these divisions can be found in several places, and I believe that, if you are checking this
repository out, probably they seem quite familiar (sorry, I'm just too lazy to explain).

## What is Domain Driven Design?

Here is the most basic definition:

Domain-driven design is a software design approach focusing on modelling software to match a domain according to input
from that domain's experts. In terms of object-oriented programming it means that the structure and language of software
code should match the business domain.

For more information, you can check the following links:

* 🇧🇷 [O que é DDD – Domain Driven Design](https://fullcycle.com.br/domain-driven-design/) - Full Cycle
* 🇺🇸 [DomainDrivenDesign](https://martinfowler.com/bliki/DomainDrivenDesign.html) - Martin Fowler

### You can see the basic structure of the project below:

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