package com.example.ecommercetwo;

import java.sql.ResultSet;

public class Login {
    public Customer customerLogin(String userName,String password){
        String loginQuery = "SELECT * FROM customer WHERE email = '"+userName+"' AND password = '"+password+"';";
        //  String loginQuery = new StringBuilder().append("SELECT * FROM customer WHERE email = '").append(userName).append("' AND password = '").append(password).append("'").toString();
        DbConnection conn = new DbConnection();
        ResultSet rs = conn.getQueryTable(loginQuery);
        try {
            if (rs.next()) {
                return new Customer(rs.getInt("id"), rs.getString("name"), rs.getString("email"), rs.getString("mobile"));
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        Login login = new Login();
        Customer customer = login.customerLogin("abc@gmail.com","abc123");
        System.out.println("Welcome : "+ customer.getName());

    }
}



