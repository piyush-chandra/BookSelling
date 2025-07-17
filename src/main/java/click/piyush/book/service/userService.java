package click.piyush.book.service;


import click.piyush.book.dto.LoginRequest;
import click.piyush.book.dto.LoginResponse;
import click.piyush.book.dto.SignUpRequest;
import click.piyush.book.dto.SignUpResponse;

public interface userService {
    public SignUpResponse userSignUp(SignUpRequest signUpRequest);
    public LoginResponse userLogin(LoginRequest loginRequest);
}
