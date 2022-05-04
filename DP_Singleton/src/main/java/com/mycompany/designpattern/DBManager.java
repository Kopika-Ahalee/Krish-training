package com.mycompany.designpattern;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBManager {
    
    private static volatile DBManager dBManager;// = new DBManager();
    private static volatile Connection connection;
    
    private DBManager(){
        if(dBManager != null){
            throw new RuntimeException("Please use the getdBManager method");
        }
    }

    public static DBManager getdBManager() {
        if(dBManager == null){
        synchronized(DBManager.class){
            if(dBManager == null)
            {
        dBManager = new DBManager();
        }
        }
        }
        return dBManager;
    }

    public Connection getConnection() {
        if(connection == null){
            synchronized(DBManager.class){
                if(connection == null){
                    String url = "jdbc:derby:memory:sample;create=true";
                    try {
                        connection = DriverManager.getConnection(url);
                    } catch (SQLException e) {
                        e.printStackTrace();
                        //Logger.getLogger(DBManager.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }
        
        return connection;
    }
    
    
}
