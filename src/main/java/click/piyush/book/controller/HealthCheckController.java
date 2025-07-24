package click.piyush.book.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {
        
    @GetMapping("/health")
    public String healthCheck() {
        return "Service is up and running!";
    }
}
