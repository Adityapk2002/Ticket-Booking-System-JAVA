package org.example.services;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

import org.example.entities.User;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class UserBookingService {

    private User user;
    private List<User> userList;
    private ObjectMapper objectMapper = new ObjectMapper();
    private static final String USERS_PATH = "app/src/main/java/org/example/localDb/users.json";

    // type reference is used to deseralize
    public UserBookingService(User user1) throws IOException {
        this.user = user1;
        File users = new File(USERS_PATH);
        userList = objectMapper.readValue(users, new TypeReference<List<User>>() {
        });
    }

    // public Boolean loginUser() {

    // }

}
