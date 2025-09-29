package Session35;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SinlePrincipleAfter {
}
class UserValidation {
    public void validation(String name, String email, String password) {
        if(name == null || name.length()<2) {
            throw new IllegalArgumentException("Username validation failed");
        }
        if (!email.contains("@")) {
            throw new IllegalArgumentException("email validation failed");
        }
        if (password.length()<6) {
            throw new IllegalArgumentException("password validation failed");
        }
    }
}
class UserRepoistory {
    public void saveUser(String name, String email, String password) {
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
class UserEmailService {
    public void sentEmail(String name, String email, String password) {
        try {
            //email config
            //email send
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
class UserRegistrationService {
    private UserValidation userValidation;
    private UserRepoistory userRepoistory;
    private UserEmailService userEmailService;

    public UserRegistrationService(UserValidation userValidation, UserRepoistory userRepoistory, UserEmailService userEmailService) {
        this.userValidation = userValidation;
        this.userRepoistory = userRepoistory;
        this.userEmailService = userEmailService;
    }

    public void registrationUser(String name, String email, String password) {
        userValidation.validation(name,email,password);
        userRepoistory.saveUser(name,email,password);
        userEmailService.sentEmail(name,email,password);
    }
}
