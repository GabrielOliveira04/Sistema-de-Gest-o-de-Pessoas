# Sistema de Gestão de Pessoas
### Alunos:Gabriel de Oliveira Pontes e Matheus Lucas Santos Maul de Andrade
## Descrição do Projeto:
  O Sistema de Gestão de Pessoas é uma aplicação Java desenvolvida para facilitar o gerenciamento de informações sobre clientes e funcionários,
  proporcionando uma estrutura organizada para representar dados como nome, data de nascimento, endereço, entre outros.


## Funcionalidades  
  ### Clientes:
  Cadastro de clientes com informações pessoais e profissionais.
  Atualização de profissão e endereço do cliente.
  Cálculo da idade do cliente
    
### Funcionário:
    Cadastro de funcionários com dados como matrícula, cargo, salário e data de admissão.
    Reajuste salarial e promoção de funcionários.
    Cálculo da idade do funcionário.


## Estrutura do Projeto
    |-- src
  |   |-- org.example.pessoas
  |       |-- Cliente.java
  |       |-- Funcionario.java
  |   |-- org.example.composicao
  |       |-- Endereco.java
  |-- ...


## Como Usar:
    // Exemplo de como instanciar um Cliente
Cliente cliente = new Cliente("Nome", LocalDate.of(2000, 1, 1), new Endereco(...), List.of(...), "C001", "Profissão");

  // Exemplo de como usar um método da classe Cliente
  cliente.atualizarProfissao("Nova Profissão");

  // Exemplo de como instanciar um Funcionário
Funcionario funcionario = new Funcionario("Nome", LocalDate.of(1990, 5, 10), new Endereco(...), List.of(...), 123456, "Cargo", 5000.0, LocalDate.of(2022, 1, 1));

// Exemplo de como usar um método da classe Funcionario
funcionario.reajustarSalario(10.0);

## Contribuição: 
  ua contribuição é bem-vinda! Sinta-se à vontade para abrir issues, enviar pull requests ou fornecer feedback.

    Faça um fork do projeto.
    Crie uma branch com sua feature: git checkout -b feature/nova-feature
    Faça commit das suas alterações: git commit -m 'Adiciona nova feature'
    Faça push para a branch: git push origin feature/nova-feature
    Abra um pull request.

    

  

