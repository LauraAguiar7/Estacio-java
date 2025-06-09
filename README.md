- Sistema Acadêmico com Padrões de Projeto GoF

Este projeto simula um sistema acadêmico de matrícula de alunos, utilizando quatro padrões de projeto do catálogo **GoF (Gang of Four)**:

- Padrões de Criação: **Singleton** e **Factory Method**
- Padrão Estrutural: **Facade**
- Padrão Comportamental: **Observer**

---

- Objetivo

Demonstrar, na prática, a aplicação dos principais padrões de projeto, organizando o código de forma reutilizável, flexível e de fácil manutenção.

---

-- Arquitetura de Padrões

-- Singleton – `RegistroLog`
Garante que só exista uma única instância de log em todo o sistema, centralizando os registros de mensagens.

-- Factory Method – `SistemaMatricula`, `MatriculaPresencial`, `MatriculaOnline`
Permite criar diferentes tipos de curso (presencial ou online) de forma flexível, sem acoplar a lógica principal às classes concretas.

-- `SistemaAcademicoFacade`
Oferece uma interface única para controlar todo o processo de matrícula, escondendo a complexidade de criação e registro.

-- Observer – `Observer`, `Subject`, `RegistroLog`
Quando uma matrícula é realizada, os observadores (como o log) são automaticamente notificados, permitindo reações independentes a esse evento.

---


