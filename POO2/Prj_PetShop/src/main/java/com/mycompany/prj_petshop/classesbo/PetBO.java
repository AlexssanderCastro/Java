/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prj_petshop.classesbo;

import com.mycompany.prj_petshop.classesdao.PetDAO;
import com.mycompany.prj_petshop.objetos.Pessoa;
import com.mycompany.prj_petshop.objetos.Pet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alexssander
 */
public class PetBO {
    PetDAO pDAO;

    public PetBO() {
        pDAO = new PetDAO();
    }

    public Pet salvar(Pet pet) {
        return pDAO.salvar(pet);
    }

    public List<Pessoa> getPessoas(String nome) {
        PessoaBO peBO = new PessoaBO();
        return peBO.getPessoas(nome);
    }

    public List<Pet> getPets(String nome) {
        return pDAO.getPets(nome);
    }

    public int editar(Pet pet) {
        return pDAO.editar(pet);
    }

    public int excluir(int idPet) {
        return pDAO.excluir(idPet);
    }
    
    
    
}
