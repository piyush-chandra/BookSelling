package click.piyush.book.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/auth")
public class AuthController {

    @PostMapping("login")
    public String userLogin(@RequestBody String entity) {
        return entity;  
    }

    @PostMapping("/logout")
    public String logout(@RequestBody String entity) {
        // Logic to handle user logout        
        return entity;
    }
    
}
