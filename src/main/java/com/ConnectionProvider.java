package com;

import java.sql.*;

public class ConnectionProvider {

    private static Connection con;

    public static Connection getCon() {
        try {
            if (con == null) {
                Class.forName("com.mysql.cj.jdbc.Driver");

                String url = "jdbc:mysql://localhost:3306/bankingApplication";

                con = DriverManager.getConnection(url, "root", "123456");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }

}
