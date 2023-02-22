package com.instagram.service;

import com.instagram.entity.User;
import com.instagram.exception.domain.EmailExistException;
import com.instagram.exception.domain.EmailNotFoundException;
import com.instagram.exception.domain.UserNotfoundException;
import com.instagram.exception.domain.UsernameExistException;
import org.springframework.web.multipart.MultipartFile;

import javax.mail.MessagingException;
import java.io.IOException;
import java.util.List;

public interface UserService {
    User register(String firstName, String lastName, String username, String email) throws UserNotfoundException, EmailExistException, UsernameExistException, MessagingException;
    List<User> getUsers();
    User findUserByUsername(String username);
    User findUserByEmail(String email);
    User addNewUser(String firstName, String lastName, String username, String email, String role, boolean inNonLocked, boolean isActive, MultipartFile profileImage) throws EmailExistException, UsernameExistException, IOException;
    User updateUser(String currentUsername, String newFirstName, String newLastName, String newUsername, String newEmail, String role, boolean inNonLocked, boolean isActive, MultipartFile profileImage) throws EmailExistException, UsernameExistException, IOException;
    void deleteUser(Long id);
    void resetPassword(String email) throws EmailNotFoundException, MessagingException;
    User updateProfileImage(String username, MultipartFile profileImage) throws EmailExistException, UsernameExistException, IOException;

}
