/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prj_petshop.objetos;

import java.util.List;

/**
 *
 * @author Alexssander
 */
public class Pessoa {
    private int id;
    private String nome;
    private String cpf;
    private String data_nascimento;
    private List<Pet>ListPet;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(String data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public List<Pet> getListPet() {
        return ListPet;
    }

    public void setListPet(List<Pet> ListPet) {
        this.ListPet = ListPet;
    }
    
}
