package click.piyush.book.strategy;

import click.piyush.book.dto.LoginRequest;
import click.piyush.book.dto.LoginResponse;

public class UserNameLoginStrategy implements LoginStategy {

    public boolean supports(LoginRequest request) {
        return request.userName() != null && !request.userName().isEmpty();
    }

    public LoginResponse login(LoginRequest request) {
        // Users user = new Users();
        // user.setUsername(request.userName());
        // return user;
        return null;
    }
    
}
