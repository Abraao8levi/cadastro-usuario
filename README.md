# 📋 Sistema de Cadastro de Usuários

## 🚀 Tecnologias Utilizadas

- **Java 21**
- **Spring Boot 3.5.7**
- **Spring Data JPA**
- **H2 Database** 
- **Lombok**
- **Maven**
- **Spring Validation**

## 📋 Funcionalidades

- ✅ CRUD Completo de Usuários
- ✅ Validação de Dados
- ✅ API RESTful
- ✅ Banco H2 em Memória

## 🔧 Como Executar

```bash
mvn clean compile
mvn spring-boot:run
```

**Acesso:** `http://localhost:8081`

## 📚 Endpoints

- `POST /usuario` - Criar usuário
- `GET /usuario?email={email}` - Buscar por email
- `PUT /usuario?id={id}` - Atualizar usuário
- `DELETE /usuario?email={email}` - Deletar usuário

## 🗃️ Banco H2

**Console:** `http://localhost:8081/h2-console`  
**JDBC URL:** `jdbc:h2:mem:testdb`  
**Usuário:** `sa`  
**Senha:** _(vazia)_
