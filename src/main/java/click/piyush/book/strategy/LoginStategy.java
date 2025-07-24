package click.piyush.book.strategy;

import click.piyush.book.dto.LoginRequest;
import click.piyush.book.dto.LoginResponse;

public interface LoginStategy {
    boolean supports(LoginRequest request);
    LoginResponse login(LoginRequest request);
}
