/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.os.dao;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Notorius B.I.G
 */
public class ModuloConexao {

    //estabelecer conexao com o banco 
    public static Connection conector() {
        java.sql.Connection conexao = null;
        //chama do drive
        String driver = "com.mysql.jdbc.Driver";
        //informacao do banco 
        String url = "jdbc:mysql://localhost:3306/dbinfox";
        String user = "root";
        String password = "";
        //Estabelecendo conexao com o banco True ou False 
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        } catch (Exception e) {
//            System.out.println(e);//imprimir erro
            return null;
        }
    }
}
