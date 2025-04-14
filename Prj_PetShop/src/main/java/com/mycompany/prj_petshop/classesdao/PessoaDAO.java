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

    public ArrayList<Pessoa> verTutoresPorNome(String texto) {
    ArrayList<Pessoa> tutores = new ArrayList<>();

    try {
        // Corrigir o SELECT e garantir que os campos estejam corretos
        PreparedStatement stmt;
        if(texto.equals("")){
            stmt = conn.prepareStatement("SELECT idpessoa,nome FROM pessoa");
        }else{
            stmt = conn.prepareStatement("SELECT idpessoa,nome FROM pessoa WHERE nome LIKE ?");
            stmt.setString(1, texto + "%");
        }
        

        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
            Pessoa p = new Pessoa();
            p.setId(rs.getInt("idpessoa"));
            p.setNome(rs.getString("nome"));
            tutores.add(p);
        }

    } catch (SQLException ex) {
        ex.printStackTrace();
    }

    return tutores;
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
            PreparedStatement stmt = conn.prepareStatement("Update pet set idpessoa = null WHERE idpessoa=?");
            stmt.setInt(1, id);
            stmt.executeUpdate();
            
            stmt = conn.prepareStatement("DELETE FROM pessoa WHERE idpessoa=?");
            stmt.setInt(1, id);
            
            linhasAfetadas=stmt.executeUpdate();
            
        }
        catch(SQLException ex){
            ex.printStackTrace();
        }
        
        return linhasAfetadas;
    }
}


