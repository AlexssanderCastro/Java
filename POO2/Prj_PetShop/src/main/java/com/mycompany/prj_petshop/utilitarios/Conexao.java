/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prj_petshop.utilitarios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Alexssander
 */
public class Conexao {
    
    final private String driver = "org.postgresql.Driver";
    final private String url = "jdbc:postgresql://localhost:5432/" +"petshop";
    final private String usuario ="postgres";
    final private String senha = "Ajoc1112=";
            
    public Connection conectar(){
        Connection conn = null;
        try{
            Class.forName(driver);
            conn=DriverManager.getConnection(url,usuario,senha);
        }
        catch(ClassNotFoundException ex){
            
            ex.printStackTrace();
        }
        catch(SQLException ex){
            ex.printStackTrace();
        }
        return conn;
    }
    
}
