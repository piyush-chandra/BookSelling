package click.piyush.book.service;

import click.piyush.book.dto.UserRegisterRequest;
import click.piyush.book.dto.UserRegisterResponse;

public interface UserService {
    public UserRegisterResponse registerUser(UserRegisterRequest signUpRequest);
}
