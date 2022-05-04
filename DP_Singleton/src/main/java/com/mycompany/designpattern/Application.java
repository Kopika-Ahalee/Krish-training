package com.mycompany.designpattern;

import java.sql.Connection;


public class Application {

    
    public static void main(String[] args) {
        
        long start;
        long end;
        
        DBManager dBManager = DBManager.getdBManager();
        System.out.println(dBManager);
        
        start = System.currentTimeMillis();
        Connection connection = dBManager.getConnection();
        end = System.currentTimeMillis();
        System.out.println("First time");
        System.out.println(end-start);
        
        DBManager dBManager1 = DBManager.getdBManager();
        System.out.println(dBManager1);
        
        start = System.currentTimeMillis();
        Connection connection1 = dBManager1.getConnection();
        end = System.currentTimeMillis();
        
        System.out.println("Second time");
        System.out.println(end-start);
    }
    
}
