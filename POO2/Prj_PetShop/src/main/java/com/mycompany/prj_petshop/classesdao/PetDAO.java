/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prj_petshop.classesdao;

import com.mycompany.prj_petshop.classesbo.PessoaBO;
import com.mycompany.prj_petshop.objetos.Pessoa;
import com.mycompany.prj_petshop.objetos.Pet;
import com.mycompany.prj_petshop.utilitarios.Conexao;
import com.mycompany.prj_petshop.utilitarios.ManipulaData;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alexssander
 */
public class PetDAO {
    Connection conn;
    ManipulaData md;

    public PetDAO() {
        this.conn = Conexao.getInstancia().conectar();
        this.md = ManipulaData.getInstancia();
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

    public List<Pet> getPets(String nome) {
        List<Pet> lstP = new ArrayList<>();
        ResultSet rs;
        try{
            
            PreparedStatement ppStmt = conn.prepareStatement("SELECT * FROM pet WHERE nome ILIKE ?");
            ppStmt.setString(1,nome+"%");
            rs=ppStmt.executeQuery();
            while(rs.next()){
                lstP.add(getPet(rs));
            }
             
        }
        catch(SQLException ex){
            ex.printStackTrace();
        }
        
        return lstP;
    }

    private Pet getPet(ResultSet rs) throws SQLException {
        Pet p = new Pet();
        Pessoa pe = new Pessoa();
        
        p.setIdPet(rs.getInt("idpet"));
        p.setNome(rs.getString("nome"));
        p.setEspecie(rs.getString("especie"));
        p.setRaca(rs.getString("raca"));
        p.setPorte(rs.getString("porte"));
        p.setCor(rs.getString("cor"));
        p.setData_nascimento(md.date2String(rs.getString("data_nascimento")));
        
        pe.setId(rs.getInt("idpessoa"));
        PessoaBO pBO = new PessoaBO(); 
        pe=pBO.getPessoa(pe.getId());
        p.setP(pe);
        
        return p;
    }

    public int editar(Pet pet) {
        int linhasAfetadas=0;
        
        try{
            PreparedStatement stmt = conn.prepareStatement("UPDATE pet set nome=?, especie=?, raca=?, porte=?, cor=?, data_nascimento=?,idpessoa=? where idpet=?");
            stmt.setString(1, pet.getNome());
            stmt.setString(2, pet.getEspecie());
            stmt.setString(3, pet.getRaca());
            stmt.setString(4, pet.getPorte());
            stmt.setString(5, pet.getCor());
            stmt.setDate(6, md.string2Date(pet.getData_nascimento()));
            stmt.setInt(7, pet.getP().getId());
            stmt.setInt(8, pet.getIdPet());
            
            linhasAfetadas=stmt.executeUpdate();
            
        }
        catch(SQLException ex){
            ex.printStackTrace();
        }
        
        return linhasAfetadas;
    }

    public int excluir(int idPet) {
        int linhasAfetadas=0;
        
        try{
            PreparedStatement stmt = conn.prepareStatement("DELETE FROM pet where idpet=?");
            
            stmt.setInt(1, idPet);
            
            linhasAfetadas=stmt.executeUpdate();
            
        }
        catch(SQLException ex){
            ex.printStackTrace();
        }
        
        return linhasAfetadas;
    }

    public List<Pet> getPets(String nome, String dataInicio, String dataFim) {
        List<Pet> lstP = new ArrayList<>();
        ResultSet rs;
        try{
            
            PreparedStatement ppStmt = conn.prepareStatement("SELECT * FROM pet WHERE nome ILIKE ? AND data_nascimento BETWEEN ? AND ?");
            ppStmt.setString(1,nome+"%");
            ppStmt.setDate(2 ,md.string2Date(dataInicio));
            ppStmt.setDate(3 ,md.string2Date(dataFim));
            rs=ppStmt.executeQuery();
            while(rs.next()){
                lstP.add(getPet(rs));
            }
            
            
            
        }
        catch(SQLException ex){
            ex.printStackTrace();
        }
        
        return lstP;
    }

    public List<Pet> getPets(String dataInicio, String dataFim) {
        List<Pet> lstP = new ArrayList<>();
        ResultSet rs;
        try{
            
            PreparedStatement ppStmt = conn.prepareStatement("SELECT * FROM pet WHERE data_nascimento BETWEEN ? AND ?");
            ppStmt.setDate(1 ,md.string2Date(dataInicio));
            ppStmt.setDate(2 ,md.string2Date(dataFim));
            rs=ppStmt.executeQuery();
            while(rs.next()){
                lstP.add(getPet(rs));
            }
            
            
            
        }
        catch(SQLException ex){
            ex.printStackTrace();
        }
        
        return lstP;
    }

    public Pet getPet(int id) {
         
        ResultSet rs;
        Pet p = new Pet();
        try{
            
            PreparedStatement ppStmt = conn.prepareStatement("SELECT * FROM pet WHERE idpet=?");
            ppStmt.setInt(1,id);
            rs=ppStmt.executeQuery();
            while(rs.next()){
                p=getPet(rs);
            }
             
        }
        catch(SQLException ex){
            ex.printStackTrace();
        }
        
        return p;
    }
}
