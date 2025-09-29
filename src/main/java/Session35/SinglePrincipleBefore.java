package Session35;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SinglePrincipleBefore {
}

class UserRegistration {
    public void registrationUser(String name, String email, String password) {
        //validare
        if(name == null || name.length()<2) {
            throw new IllegalArgumentException("Username validation failed");
        }
        if (!email.contains("@")) {
            throw new IllegalArgumentException("email validation failed");
        }
        if (password.length()<6) {
            throw new IllegalArgumentException("password validation failed");
        }

        //add user in DB
        try(Connection connection= DriverManager.getConnection("con1")) {
            String sql = "insert into Users (username, email, pass) values (?, ?, ?)";
            PreparedStatement statement= connection.prepareStatement(sql);
            statement.setString(1,name);
            statement.setString(2,email);
            statement.setString(3,password);
            statement.executeUpdate();
        } catch (SQLException e){
            throw  new RuntimeException(e);
        }
    }
}