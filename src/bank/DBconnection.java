/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.SQLException;


/**
 *
 * @author Tareq
 */
public class DBconnection {
    Connection con = null;
    
    public  DBconnection() throws ClassNotFoundException{
        Connect();
    }
    public void Connect() throws ClassNotFoundException{
        
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String URL = "jdbc:sqlserver://localhost:1433; databaseName= Online Bank; integratedSecurity=true;";
            con = DriverManager.getConnection(URL);
            con.close();
            System.out.println("Mabroooook");
        }catch(SQLException e){
            System.out.println("dasdsad");
        }
    } 
}
