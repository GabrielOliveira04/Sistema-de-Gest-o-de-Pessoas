package org.example.pessoas;

import org.example.composicao.Endereco;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;

public class Funcionario extends Pessoa {
    private int matricula;
    private String cargo;
    private double salario;
    private LocalDate dataAdmissao;

    public Funcionario(String nome, LocalDate dataNascimento, Endereco endereco, List<String> telsContato, int matricula, String cargo, double salario, LocalDate dataAdmissao) {
        super(nome, dataNascimento, endereco, telsContato);
        this.matricula = matricula;
        this.cargo = cargo;
        this.salario = salario;
        this.dataAdmissao = dataAdmissao;
    }
    public int obterIdade() {
        LocalDate dataAtual = LocalDate.now();
        Period periodo = Period.between(this.getDataNascimento(), dataAtual);
        return periodo.getYears();
    }


    public void reajustarSalario(double percentual) {
        double acrescimo = 1 + (percentual/100);
        this.salario = this.salario * acrescimo;
    }

    public void promover(String novoCargo) {
        this.cargo = novoCargo;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public LocalDate getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(LocalDate dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public String getCargo() {
        return cargo;
    }

    public double getSalario() {
        return salario;
    }





}

