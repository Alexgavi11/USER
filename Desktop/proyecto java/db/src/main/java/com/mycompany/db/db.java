
package com.mycompany.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class db {
    
    @SuppressWarnings("null")
    public static void main(String[]arg){
    String usuario ="root";
    String password ="";
    String url;
        url = "jdbc:mysql://localhost:3308/ejercicio";

    Connection conexion;
    Statement statement;
    ResultSet Rs;
    
        try {
            conexion= DriverManager.getConnection(url,usuario,password);
            statement=conexion.createStatement();
            Rs=statement.executeQuery("SELECT * FROM `usuario`");
            while (Rs.next()){
                System.out.println(Rs.getString("id")+ " : "+ Rs.getString("nombre")+" : "+ Rs.getString("documento"));
            /*para insertar un nuevo usuario a la base de datos*/
            /*   
            }
            statement.execute("INSERT INTO `usuario` (`id`, `documento`, `nombre`) VALUES (NULL,?,?)");
            System.out.println();
            Rs=statement.executeQuery("SELECT * FROM `usuario`");
            while (Rs.next()){
            System.out.println(Rs.getString("id"));
            }
            
            /*para actualizar un usuario de la base de datos*/
            /*
            }
            statement.execute("UPDATE `usuario` SET `documento` = '11450105', `nombre` = 'maira polo' WHERE `usuario`.`id` = 9;");
            System.out.println();
            Rs=statement.executeQuery("SELECT * FROM `usuario`");
            while (Rs.next()){
            System.out.println(Rs.getString("nombre"));
            }
            */
            /* para borrar un usuario de la base de datos*/
            /*
            }
            statement.execute("DELETE FROM `usuario` WHERE `usuario`.`id` = 8;");
            System.out.println();
            Rs=statement.executeQuery("SELECT * FROM `usuario`");
            while (Rs.next()){
            System.out.println(Rs.getString("nombre"));
            }
            */
            }
           } catch (SQLException ex) {
            Logger.getLogger(db.class.getName()).log(Level.SEVERE, null, ex);
        }
    
}
}
