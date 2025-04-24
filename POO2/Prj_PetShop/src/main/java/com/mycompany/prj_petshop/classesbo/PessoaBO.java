/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prj_petshop.classesbo;

import com.mycompany.prj_petshop.classesdao.PessoaDAO;
import com.mycompany.prj_petshop.objetos.Pessoa;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alexssander
 */
public class PessoaBO {
    PessoaDAO pDAO;
    public PessoaBO(){
        pDAO = new PessoaDAO();
    }
    
    
    
    public Pessoa salvar(Pessoa p){
        return pDAO.salvar(p);
    }
    
    public List<Pessoa> getPessoas(String nome){
        return pDAO.getPessoas(nome);
    }

    public int editar(Pessoa pessoa) {
        return pDAO.editar(pessoa);
    }

    public int excluir(int id) {
        return pDAO.excluir(id);
    }

    public List<Pessoa> getPessoas(String nome, String dataInicio, String dataFim) {
        return pDAO.getPessoas(nome,dataInicio,dataFim);
    }

    public List<Pessoa> getPessoas(String dataInicio, String dataFim) {
        return pDAO.getPessoas(dataInicio,dataFim);
    }

    public Pessoa getPessoa(int id) {
        return pDAO.getPessoa(id);
    }
}
