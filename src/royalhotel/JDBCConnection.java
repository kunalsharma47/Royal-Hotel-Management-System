/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package royalhotel;

import java.sql.*;
/**
 *
 * @author Kunal Sharma
 */
public class JDBCConnection {

    private static final String connectionUrl = 
           "jdbc:sqlserver://localhost:1433;" +
           "databaseName=ROYALHOTEL;integratedSecurity=true;";
    static Connection con=null;

    public static Connection getConnection(){
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con=DriverManager.getConnection(connectionUrl);
            }catch(Exception e){
            //JOptionPane.showMessageDialog(rootPane, e, null, JOptionPane.ERROR_MESSAGE); 
        }
        return con;
    }
}
