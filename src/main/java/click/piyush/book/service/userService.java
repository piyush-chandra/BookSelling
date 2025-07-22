package click.piyush.book.service;


import click.piyush.book.dto.LoginRequest;
import click.piyush.book.dto.LoginResponse;
import click.piyush.book.dto.UserRegisterRequest;
import click.piyush.book.dto.UserRegisterResponse;

public interface UserService {
    public UserRegisterResponse userSignUp(UserRegisterRequest signUpRequest);
    public LoginResponse userLogin(LoginRequest loginRequest);
}
