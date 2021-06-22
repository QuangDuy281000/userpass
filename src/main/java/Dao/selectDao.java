package Dao;


import Bean.Account;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class selectDao {
    public static List<Account> SelectAccount(Connection conn){
        List<Account> list = new ArrayList<Account>();

        PreparedStatement ptmt = null;

        String sql =" SELECT * FROM Account";
        try {
            ptmt = conn.prepareStatement(sql);
            ResultSet rs = ptmt.executeQuery();
            while (rs.next()){
                Account acc = new Account();
                String name = rs.getString("username");
                String pass = rs.getString("password");
                acc.setUsername(name);
                acc.setPassword(pass);
                list.add(acc);
            }
            ptmt.close();
            rs.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return list;
    }
}
