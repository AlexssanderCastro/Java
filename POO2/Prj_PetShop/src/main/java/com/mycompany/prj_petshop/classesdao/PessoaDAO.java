/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prj_petshop.classesdao;

import com.mycompany.prj_petshop.objetos.Pessoa;
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
public class PessoaDAO {
    Connection conn;
    ManipulaData md;

    public PessoaDAO() {
        this.conn = new Conexao().conectar();
        this.md = new ManipulaData();
    }
    
    public Pessoa salvar(Pessoa p){
        try{
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO pessoa(nome,cpf,data_nascimento) values (?,?,?)", Statement.RETURN_GENERATED_KEYS);
            stmt.setString(1, p.getNome());
            stmt.setString(2, p.getCpf());
            stmt.setDate(3, md.string2Date(p.getData_nascimento()));
            stmt.execute();
            
            ResultSet rs = stmt.getGeneratedKeys();
            if(rs.next()){
                p.setId(rs.getInt("idpessoa"));
            }
            else{
                p.setId(-1);
            }
        }
        catch(SQLException ex){
            ex.printStackTrace();
        }
        return p;
        
    }

    
    
    public List<Pessoa> getPessoas(String nome){
        List<Pessoa> lstP = new ArrayList<>();
        ResultSet rs;
        try{
            
            PreparedStatement ppStmt = conn.prepareStatement("SELECT * FROM pessoa WHERE nome ILIKE ?");
            ppStmt.setString(1,nome+"%");
            rs=ppStmt.executeQuery();
            while(rs.next()){
                lstP.add(getPessoa(rs));
            }
            
            
            
        }
        catch(SQLException ex){
            ex.printStackTrace();
        }
        
        return lstP;
    }

    private Pessoa getPessoa(ResultSet rs) throws SQLException {
        
        Pessoa p = new Pessoa();
        p.setId(rs.getInt("idpessoa"));
        p.setNome(rs.getString("nome"));
        p.setData_nascimento(md.date2String(rs.getString("data_nascimento")));
        p.setCpf(rs.getString("cpf"));
        
        
        return p;
    }

    public int editar(Pessoa p) {
        int linhasAfetadas=0;
        
        try{
            PreparedStatement stmt = conn.prepareStatement("UPDATE pessoa set nome=?, cpf=?, data_nascimento=? where idpessoa=?", Statement.RETURN_GENERATED_KEYS);
            stmt.setString(1, p.getNome());
            stmt.setString(2, p.getCpf());
            stmt.setDate(3, md.string2Date(p.getData_nascimento()));
            stmt.setInt(4, p.getId());
            linhasAfetadas=stmt.executeUpdate();
            
        }
        catch(SQLException ex){
            ex.printStackTrace();
        }
        
        return linhasAfetadas;
    }

    public int excluir(int id) {
        int linhasAfetadas=0;
        
        try{
           
            PreparedStatement stmt = conn.prepareStatement("DELETE FROM pessoa WHERE idpessoa=?");
            stmt.setInt(1, id);
            
            linhasAfetadas=stmt.executeUpdate();
            
        }
        catch(SQLException ex){
            ex.printStackTrace();
        }
        
        return linhasAfetadas;
    }

    public List<Pessoa> getPessoas(String nome, String dataInicio, String dataFim) {
        List<Pessoa> lstP = new ArrayList<>();
        ResultSet rs;
        try{
            
            PreparedStatement ppStmt = conn.prepareStatement("SELECT * FROM pessoa WHERE nome ILIKE ? AND data_nascimento BETWEEN ? AND ?");
            ppStmt.setString(1 ,nome+"%");
            ppStmt.setDate(2 ,md.string2Date(dataInicio));
            ppStmt.setDate(3 ,md.string2Date(dataFim));
            rs=ppStmt.executeQuery();
            while(rs.next()){
                lstP.add(getPessoa(rs));
            }
            
            
            
        }
        catch(SQLException ex){
            ex.printStackTrace();
        }
        
        return lstP;
    }

    public List<Pessoa> getPessoas(String dataInicio, String dataFim) {
        List<Pessoa> lstP = new ArrayList<>();
        ResultSet rs;
        try{
            
            PreparedStatement ppStmt = conn.prepareStatement("SELECT * FROM pessoa WHERE data_nascimento BETWEEN ? AND ?");
            ppStmt.setDate(1 ,md.string2Date(dataInicio));
            ppStmt.setDate(2 ,md.string2Date(dataFim));
            rs=ppStmt.executeQuery();
            while(rs.next()){
                lstP.add(getPessoa(rs));
            }
            
            
            
        }
        catch(SQLException ex){
            ex.printStackTrace();
        }
        
        return lstP;
    }

    public Pessoa getPessoa(int id) {
        Pessoa pe = new Pessoa();
        ResultSet rs;
        try{
            
            PreparedStatement ppStmt = conn.prepareStatement("SELECT * FROM pessoa WHERE idpessoa=?");
            ppStmt.setInt(1,id);
            rs=ppStmt.executeQuery();
            while(rs.next()){
                pe=getPessoa(rs);
            }
            
            
            
        }
        catch(SQLException ex){
            ex.printStackTrace();
        }
        
        return pe;
    }
}


