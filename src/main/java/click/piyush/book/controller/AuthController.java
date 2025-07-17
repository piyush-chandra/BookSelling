package click.piyush.book.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/auth")
public class AuthController {
    
    @PostMapping("signup")
    public String userSignUp(@RequestBody String entity) {
        
        
        return entity;
    }

    @PostMapping("login")
    public String userLogin(@RequestBody String entity) {
        return entity;  
    }
    
}
