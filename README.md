# 📊 Tabela Fipe - Consulta de Veículos  

**Projeto de consulta à tabela FIPE (Fundação Instituto de Pesquisas Econômicas)**, desenvolvido em Java para buscar informações sobre marcas, modelos, anos e valores de veículos.  

🔗 **GitHub**: [https://github.com/camilleoliveira324/TabelaFipe](https://github.com/camilleoliveira324/TabelaFipe)  

---

## 🛠️ Tecnologias e Habilidades Utilizadas  

### **Backend**  
- **Java 17** (Linguagem principal)  
- **Spring Boot** (Framework para desenvolvimento rápido)  
- **Spring Web** (Para requisições HTTP e APIs REST)  
- **Jackson** (Processamento de JSON)  
- **Maven** (Gerenciamento de dependências e build) 
- **Record** (Classes imutáveis para DTOs)  
- **Streams API** (Manipulação de coleções de forma funcional)  

### **Ferramentas e Boas Práticas**  
- **Git & GitHub** (Versionamento de código)  
- **Clean Code** (Código organizado e legível)  
- **Tratamento de Exceções** (Resiliência em requisições HTTP)  
- **Princípios SOLID** (Design de código modular)  
- **Padrão MVC** (Separação de responsabilidades)  

---

## 📌 Funcionalidades  

✅ **Consultar marcas de veículos** (Carros, Motos, Caminhões)  
✅ **Buscar modelos por marca**  
✅ **Listar anos disponíveis de um modelo**  
✅ **Obter valor FIPE por ano e modelo**  
✅ **Exibir resultados formatados no terminal**  

---

## 🚀 Como Executar o Projeto  

1. **Clone o repositório**  
   ```bash
   git clone https://github.com/camilleoliveira324/TabelaFipe.git
   cd TabelaFipe
   ```

2. **Execute com Maven**  
   ```bash
   ./mvnw spring-boot:run
   ```

3. **Siga as instruções no terminal** para interagir com a aplicação.  

---

## 📝 Aprendizados e Desafios  

🔹 **Integração com API REST** (Consumo de dados da tabela FIPE)  
🔹 **Manipulação de JSON** (Desserialização com Jackson)  
🔹 **Programação orientada a objetos** (Abstração de domínio: Marca, Modelo, Ano, Valor)  
🔹 **Tratamento de erros** (Respostas HTTP falhas, JSON inválido)  
🔹 **Eficiência em Streams e Collections** (Processamento de listas de dados)  

---

Aqui está a seção **"Possíveis Melhorias (Roadmap)"** do seu README.md reformulada com **linguagem positiva** e **foco em crescimento**, incorporando todos os pontos que discutimos:

---

## 🚀 **Possíveis Melhorias (Roadmap de Evolução)**  

### **🛠️ Aprimoramentos Técnicos**  
- **Arquitetura Modular**  
  Refatorar para MVC (Controller/Service/Client) para melhor organização e testabilidade  
- **Tratamento de Erros Resiliente**  
  Adicionar exceções customizadas e fallbacks para APIs externas  
- **Cache Inteligente**  
  Implementar memoização de requisições repetidas (ex: consultas a marcas)  

### **⚡ Performance**  
- **Processamento Paralelo**  
  Usar `parallelStream()` para consultas independentes (ex: valores por ano)  
- **Compressão de Dados**  
  Reduzir payloads com técnicas como gzip para respostas HTTP  

### **🧪 Confiabilidade**  
- **Testes Automatizados**  
  Adicionar:  
  - ✅ Testes unitários com JUnit 5  
  - ✅ Testes de integração com MockWebServer  
  - ✅ Cobertura mínima de 80% 

### **📚 Boas Práticas**  
- **Documentação Viva**  
  - JavaDoc em métodos críticos 
- **Padronização**  
  - Adoção de Records para DTOs  
  - Enums para constantes relacionadas (ex: `TipoVeiculo`)  

### **✨ Funcionalidades Futuras**  
- **Persistência**  
  Salvar consultas recentes em banco embutido (H2)  
- **Dashboard Web**  
  Frontend simples com Thymeleaf ou React  
- **Deploy Contínuo**  
  Pipeline CI/CD com GitHub Actions + deploy na AWS  

---

## 🤝 Contribuições  

Contribuições são bem-vindas! Sinta-se à vontade para abrir **issues** ou **pull requests**.  

---

## 📧 Contato  

👩‍💻 **Camille Oliveira**  
📧 camilleoliveira324@gmail.com | [LinkedIn](https://www.linkedin.com/in/camilledeoliveira324)
🔗 [Outros projetos](https://github.com/camilleoliveira324)  

---

✨ **Obrigada pelo interesse!** ✨  
