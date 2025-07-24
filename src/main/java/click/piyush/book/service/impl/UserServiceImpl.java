package click.piyush.book.service.impl;

import click.piyush.book.dto.UserRegisterRequest;
import click.piyush.book.dto.UserRegisterResponse;
import click.piyush.book.entities.Users;
import click.piyush.book.repository.UserRepository;
import click.piyush.book.service.UserService;

public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserRegisterResponse registerUser(UserRegisterRequest signUpRequest) {
        if(userRepository.existsByUsername(signUpRequest.userName())) {
            throw new RuntimeException("Username already exists");
        }
        if(userRepository.existsByEmail(signUpRequest.email())) {
            throw new RuntimeException("Email already exists");
        }
        if(userRepository.existsByPhone(signUpRequest.phone())) {
            throw new RuntimeException("Phone number already exists");
        }

        Users user = Users.Builder()
                .userName(signUpRequest.userName())
                .email(signUpRequest.email())
                .phone(signUpRequest.phone())
                .password(signUpRequest.password())
                .build();

        userRepository.save(user);
        
        return new UserRegisterResponse(user.getUserName(), "User registered successfully");
    }
}
