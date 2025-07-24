package click.piyush.book.service;

import click.piyush.book.entities.Users;

public interface AuthService {
    Users login(String username, String email, String phone,String password);
    void logout(Long userId);
}
