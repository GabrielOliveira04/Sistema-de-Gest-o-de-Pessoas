package org.example.pessoas;

import org.example.composicao.Endereco;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;

public class Cliente extends Pessoa {
    private String codigo;
    private String profissao;

    public Cliente(String nome, LocalDate dataNascimento, Endereco endereco, List<String> telsContato, String codigo, String profissao) {
        super(nome, dataNascimento, endereco, telsContato);
        this.codigo = codigo;
        this.profissao = profissao;
    }
    public void atualizarProfissao(String novaProfissao) {
        this.profissao = novaProfissao;
    }

    public void atualizarEndereco(Endereco novoEndereco) {
        this.setEndereco(novoEndereco);
    }

    public int obterIdade() {
        LocalDate dataAtual = LocalDate.now();
        Period periodo = Period.between(this.getDataNascimento(), dataAtual);
        return periodo.getYears();
    }


    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }
}
