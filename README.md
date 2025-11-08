# 📋 Sistema de Cadastro de Usuários

## 📖 Descrição

Este é um sistema de cadastro de usuários desenvolvido com Spring Boot, oferecendo operações CRUD completas para gerenciamento de usuários. Utiliza banco de dados H2 em memória para simplicidade e demonstração.

## 🚀 Tecnologias Utilizadas

- **Java 24**
- **Spring Boot 3.5.0**
- **Spring Data JPA**
- **H2 Database**
- **Lombok**
- **Maven**
- **Spring Validation**

## 📋 Funcionalidades

- ✅ CRUD Completo de Usuários (Criar, Ler, Atualizar, Deletar)
- ✅ Validação de Dados (Email único, campos obrigatórios)
- ✅ API RESTful
- ✅ Banco de Dados H2 em Memória
- ✅ Tratamento de Erros Básico

## 🔧 Pré-requisitos

- **Java 24** ou superior instalado
- **Maven 3.6+** instalado
- Conexão com internet para download de dependências (opcional)

## 📦 Instalação

1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/cadastro-usuario.git
   cd cadastro-usuario
   ```

2. Navegue até o diretório do projeto:
   ```bash
   cd cadastro-usuario
   ```

3. Compile o projeto:
   ```bash
   mvn clean compile
   ```

## ▶️ Como Executar

1. Execute a aplicação:
   ```bash
   mvn spring-boot:run
   ```

2. A aplicação estará rodando em: `http://localhost:8081`

## 📚 Endpoints da API

A API oferece os seguintes endpoints para gerenciamento de usuários:

### Criar Usuário
- **POST** `/usuario`
- **Descrição:** Cria um novo usuário.
- **Corpo da Requisição (JSON):**
  ```json
  {
    "nome": "João Silva",
    "email": "joao.silva@example.com",
    "senha": "senha123"
  }
  ```
- **Resposta de Sucesso:** `201 Created`
- **Resposta de Erro:** `400 Bad Request` (se email já existir)

### Buscar Usuário por Email
- **GET** `/usuario?email={email}`
- **Descrição:** Busca um usuário pelo email.
- **Exemplo:** `GET /usuario?email=joao.silva@example.com`
- **Resposta de Sucesso (JSON):**
  ```json
  {
    "id": 1,
    "nome": "João Silva",
    "email": "joao.silva@example.com",
    "senha": "senha123"
  }
  ```
- **Resposta de Erro:** `404 Not Found` (se usuário não existir)

### Atualizar Usuário
- **PUT** `/usuario?id={id}`
- **Descrição:** Atualiza um usuário existente pelo ID.
- **Corpo da Requisição (JSON):**
  ```json
  {
    "nome": "João Silva Atualizado",
    "email": "joao.atualizado@example.com",
    "senha": "novaSenha123"
  }
  ```
- **Exemplo:** `PUT /usuario?id=1`
- **Resposta de Sucesso:** `200 OK`
- **Resposta de Erro:** `404 Not Found` (se ID não existir)

### Deletar Usuário
- **DELETE** `/usuario?email={email}`
- **Descrição:** Deleta um usuário pelo email.
- **Exemplo:** `DELETE /usuario?email=joao.silva@example.com`
- **Resposta de Sucesso:** `204 No Content`
- **Resposta de Erro:** `404 Not Found` (se usuário não existir)

## 🗃️ Banco de Dados H2

O projeto utiliza H2 como banco de dados em memória para desenvolvimento e testes.

- **Console do H2:** `http://localhost:8081/h2-console`
- **Configurações:**
  - **JDBC URL:** `jdbc:h2:mem:testdb`
  - **Usuário:** `sa`
  - **Senha:** _(vazia)_

## 🧪 Testes

Para executar os testes:
```bash
mvn test
```



## 📄 Licença

Este projeto está sob a licença MIT. Veja o arquivo `LICENSE` para mais detalhes.
