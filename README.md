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
* shared (shared π€)

The explanation of these divisions can be found in several places, and I believe that, if you are checking this
repository out, probably they seem quite familiar (sorry, I'm just too lazy to explain).

## What is Domain Driven Design?

Here is the most basic definition:

Domain-driven design is a software design approach focusing on modelling software to match a domain according to input
from that domain's experts. In terms of object-oriented programming it means that the structure and language of software
code should match the business domain.

For more information, you can check the following links:

* π§π· [O que Γ© DDD β Domain Driven Design](https://fullcycle.com.br/domain-driven-design/) - Full Cycle
* πΊπΈ [DomainDrivenDesign](https://martinfowler.com/bliki/DomainDrivenDesign.html) - Martin Fowler

### You can see the basic structure of the project below:

``` bash
βββ pom.xml
βββ README.md
βββ src
    βββ main
    βΒ Β  βββ java
    βΒ Β  βΒ Β  βββ com
    βΒ Β  βΒ Β      βββ ndrewcoding
    βΒ Β  βΒ Β          βββ escola
    βΒ Β  βΒ Β              βββ academico
    βΒ Β  βΒ Β              βΒ Β  βββ aplicacao
    βΒ Β  βΒ Β              βΒ Β  βΒ Β  βββ aluno
    βΒ Β  βΒ Β              βΒ Β  βΒ Β      βββ matricular
    βΒ Β  βΒ Β              βΒ Β  βΒ Β          βββ MatricularAlunoDTO.java
    βΒ Β  βΒ Β              βΒ Β  βΒ Β          βββ MatricularAluno.java
    βΒ Β  βΒ Β              βΒ Β  βββ dominio
    βΒ Β  βΒ Β              βΒ Β  βΒ Β  βββ aluno
    βΒ Β  βΒ Β              βΒ Β  βΒ Β  βΒ Β  βββ Aluno.java
    βΒ Β  βΒ Β              βΒ Β  βΒ Β  βΒ Β  βββ AlunoMatriculado.java
    βΒ Β  βΒ Β              βΒ Β  βΒ Β  βΒ Β  βββ AlunoNaoEncontradoPorCPFException.java
    βΒ Β  βΒ Β              βΒ Β  βΒ Β  βΒ Β  βββ CifradorDeSenha.java
    βΒ Β  βΒ Β              βΒ Β  βΒ Β  βΒ Β  βββ Email.java
    βΒ Β  βΒ Β              βΒ Β  βΒ Β  βΒ Β  βββ FabricaDeAlunos.java
    βΒ Β  βΒ Β              βΒ Β  βΒ Β  βΒ Β  βββ LimiteDeTelefonesAtingidoException.java
    βΒ Β  βΒ Β              βΒ Β  βΒ Β  βΒ Β  βββ LogDeAlunoMatriculado.java
    βΒ Β  βΒ Β              βΒ Β  βΒ Β  βΒ Β  βββ RepositorioDeAlunos.java
    βΒ Β  βΒ Β              βΒ Β  βΒ Β  βΒ Β  βββ Telefone.java
    βΒ Β  βΒ Β              βΒ Β  βΒ Β  βββ indicacao
    βΒ Β  βΒ Β              βΒ Β  βΒ Β      βββ EnviarEmailIndicacao.java
    βΒ Β  βΒ Β              βΒ Β  βΒ Β      βββ Indicacao.java
    βΒ Β  βΒ Β              βΒ Β  βββ infra
    βΒ Β  βΒ Β              βΒ Β      βββ aluno
    βΒ Β  βΒ Β              βΒ Β      βΒ Β  βββ CifradorDeSenhaComMD5.java
    βΒ Β  βΒ Β              βΒ Β      βΒ Β  βββ RepositorioDeAlunosComJDBC.java
    βΒ Β  βΒ Β              βΒ Β      βΒ Β  βββ RepositorioDeAlunosEmMemoria.java
    βΒ Β  βΒ Β              βΒ Β      βββ indicacao
    βΒ Β  βΒ Β              βΒ Β          βββ EnviarEmailIndicacaoComJavaMail.java
    βΒ Β  βΒ Β              βββ gamificacao
    βΒ Β  βΒ Β              βΒ Β  βββ aplicacao
    βΒ Β  βΒ Β              βΒ Β  βΒ Β  βββ GeraSeloAlunoNovato.java
    βΒ Β  βΒ Β              βΒ Β  βββ dominio
    βΒ Β  βΒ Β              βΒ Β  βΒ Β  βββ selo
    βΒ Β  βΒ Β              βΒ Β  βΒ Β      βββ RepositorioDeSelos.java
    βΒ Β  βΒ Β              βΒ Β  βΒ Β      βββ Selo.java
    βΒ Β  βΒ Β              βΒ Β  βββ infra
    βΒ Β  βΒ Β              βΒ Β      βββ selo
    βΒ Β  βΒ Β              βΒ Β          βββ RepositorioDeSelosEmMemoria.java
    βΒ Β  βΒ Β              βββ MatricularAlunoPorLinhaDeComando.java
    βΒ Β  βΒ Β              βββ shared
    βΒ Β  βΒ Β                  βββ dominio
    βΒ Β  βΒ Β                      βββ CPF.java
    βΒ Β  βΒ Β                      βββ evento
    βΒ Β  βΒ Β                          βββ Evento.java
    βΒ Β  βΒ Β                          βββ Ouvinte.java
    βΒ Β  βΒ Β                          βββ PublicadorDeEventos.java
    βΒ Β  βΒ Β                          βββ TipoDeEvento.java
    βΒ Β  βββ resources
    βββ test
        βββ java
            βββ com
                βββ ndrewcoding
                    βββ escola
                        βββ academico
                        βΒ Β  βββ aplicacao
                        βΒ Β  βΒ Β  βββ aluno
                        βΒ Β  βΒ Β      βββ matricular
                        βΒ Β  βΒ Β          βββ MatricularAlunoTest.java
                        βΒ Β  βββ dominio
                        βΒ Β      βββ AlunoTest.java
                        βΒ Β      βββ EmailTest.java
                        βΒ Β      βββ TelefoneTest.java
                        βββ shared
                            βββ dominio
                                βββ CPFTest.java

38 directories, 35 files
```