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

    public ArrayList<Pessoa> verTutoresPorNome(String texto) {
        PessoaBO peBO = new PessoaBO();
        return peBO.verTutoresPorNome(texto);
    }
    
    
    
}
