package dk.services;

import dk.entities.User;
import dk.exceptions.DatabaseException;
import dk.persistence.ConnectionPool;
import dk.persistence.UserMapper;

public class UserService {

    public static void registerUser(String email, String password, String role, ConnectionPool cp)
            throws DatabaseException {

        User user = new User(0, email, password, role);
        UserMapper.createUser(user, cp);
    }

    public static User getUserByEmail(String email, ConnectionPool cp)
            throws DatabaseException {

        return UserMapper.getUserByEmail(email, cp);
    }
}