/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prj_petshop.classesdao;

import com.mycompany.prj_petshop.objetos.Pet;
import com.mycompany.prj_petshop.utilitarios.Conexao;
import com.mycompany.prj_petshop.utilitarios.ManipulaData;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Alexssander
 */
public class PetDAO {
    Connection conn;
    ManipulaData md;

    public PetDAO() {
        this.conn = new Conexao().conectar();
        this.md = new ManipulaData();
    }
    
    public Pet salvar(Pet p){
        try{
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO pet(nome,especie,raca,porte,cor,data_nascimento,idpessoa) values (?,?,?,?,?,?,?)", Statement.RETURN_GENERATED_KEYS);
            stmt.setString(1, p.getNome());
            stmt.setString(2, p.getEspecie());
            stmt.setString(3, p.getRaca());
            stmt.setString(4, p.getPorte());
            stmt.setString(5, p.getCor());
            stmt.setDate(6, md.string2Date(p.getData_nascimento()));
            stmt.setInt(7, p.getP().getId());
            
            stmt.execute();
            
            ResultSet rs = stmt.getGeneratedKeys();
            if(rs.next()){
                p.setIdPet(rs.getInt("idpet"));
            }
            else{
                p.setIdPet(-1);
            }
        }
        catch(SQLException ex){
            ex.printStackTrace();
        }
        return p;
        
    }
}
