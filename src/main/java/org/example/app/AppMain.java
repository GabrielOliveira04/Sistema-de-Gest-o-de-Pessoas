package org.example.app;

import org.example.composicao.Endereco;
import org.example.pessoas.Cliente;
import org.example.pessoas.Funcionario;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class AppMain {

    public static void main(String[] args) {
        Endereco endereco = new Endereco("Rua A", "123", "580000", "João Pessoa", "Paraíba", "58000-000");
        List<String> telsContato = Arrays.asList("83 99999-9999", "83 98888-8888");

        System.out.println("-----------------------------------------------------------------CLIENTE--------------------------------------------------------------");

        Cliente cliente = new Cliente("Maria", LocalDate.of(1995, 1, 1), endereco, telsContato, "001", "Advogada");

        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Idade: " + cliente.obterIdade());
        System.out.println("Profissão: " + cliente.getProfissao());

        cliente.atualizarProfissao("Analista de Sistemas");
        System.out.println("Nova profissão: " + cliente.getProfissao());

        Endereco novoEndereco = new Endereco("Rua B", "456", "Centro", "João Pessoa", "PB", "58000-000");
        cliente.atualizarEndereco(novoEndereco);
        System.out.println("Novo endereço: " + cliente.getEndereco());

        System.out.println("-----------------------------------------------------------------CLIENTE2--------------------------------------------------------------");
        Cliente cliente2 = new Cliente("Fulano", LocalDate.of(1990, 1, 1), endereco, telsContato, "123", "Programador");

        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Idade: " + cliente.obterIdade());
        System.out.println("Profissão: " + cliente.getProfissao());

        cliente.atualizarProfissao("Analista de Sistemas");
        System.out.println("Nova profissão: " + cliente.getProfissao());
        System.out.println("-----------------------------------------------------------------fUNCIONARIO--------------------------------------------------------------");


        Funcionario funcionario = new Funcionario("João", LocalDate.of(1990, 1, 1), endereco, telsContato, 123, "Gerente", 5000.0, LocalDate.of(2020, 1, 1));
        System.out.println("Funcionário: " + funcionario.getNome() + ", " + funcionario.getCargo() + ", " + funcionario.getSalario());
        Endereco endereco2 = new Endereco("Rua A", "123", "Centro", "João Pessoa", "PB", "58000-000");


        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Idade: " + funcionario.obterIdade());
        System.out.println("Cargo: " + funcionario.getCargo());
        System.out.println("Salário: " + funcionario.getSalario());

        funcionario.reajustarSalario(10.0);
        System.out.println("Novo salário: " + funcionario.getSalario());

        funcionario.promover("Analista de Sistemas");
        System.out.println("Novo cargo: " + funcionario.getCargo());
        System.out.println("-----------------------------------------------------------------fUNCIONARIO2--------------------------------------------------------------");

        Funcionario funcionario2 = new Funcionario("Fulano", LocalDate.of(1990, 1, 1), endereco, telsContato, 123, "Programador", 5000.0, LocalDate.of(2020, 1, 1));

        System.out.println("Nome: " + funcionario2.getNome());
        System.out.println("Idade: " + funcionario2.obterIdade());
        System.out.println("Cargo: " + funcionario2.getCargo());
        System.out.println("Salário: " + funcionario2.getSalario());



        funcionario.reajustarSalario(10.0);
        System.out.println("Novo salário: " + funcionario2.getSalario());

        funcionario.promover("Analista de Sistemas");
        System.out.println("Novo cargo: " + funcionario2.getCargo());
    }

}
