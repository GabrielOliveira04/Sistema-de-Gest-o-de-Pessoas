package org.example.pessoas;

import org.example.composicao.Endereco;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;

public class Pessoa {
    private String nome;
    private LocalDate dataNascimento;
    private Endereco endereco;
    private List<String> telsContato;

    public Pessoa(String nome, LocalDate dataNascimento, Endereco endereco, List<String> telsContato) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        this.telsContato = telsContato;
    }

    public int obterIdade() {
        return Period.between(dataNascimento, LocalDate.now()).getYears();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public List<String> getTelsContato() {
        return telsContato;
    }

    public void setTelsContato(List<String> telsContato) {
        this.telsContato = telsContato;
    }
}

