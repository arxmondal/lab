package com.cms.db;

// Importing necessary packages
import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {
    public static Connection connect() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/cms", "root", "Arnab@2003");
    }
}
