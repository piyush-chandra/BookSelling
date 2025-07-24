package click.piyush.book.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import click.piyush.book.dto.UserRegisterRequest;
import click.piyush.book.dto.UserRegisterResponse;
import click.piyush.book.service.UserService;

@RestController
public class UserControlller {

    @Autowired
    private UserService userService;
    
    @PostMapping("/register")
    public ResponseEntity<?> registerUser(@RequestBody UserRegisterRequest registrationDto) {
        UserRegisterResponse registerResponse = userService.registerUser(registrationDto);
        return ResponseEntity.ok(registerResponse);
    }

    @GetMapping("/address")
    public ResponseEntity<?> getUserAddress() {
        // Logic to fetch user address
        return ResponseEntity.ok("User address fetched successfully");
    }

    @PostMapping("/address")
    public ResponseEntity<?> addUserAddress() {
        // Logic to fetch user address
        return ResponseEntity.ok("User address added successfully");
    }

    @GetMapping("/wishlist")
    public ResponseEntity<?> getUserWishlist() {
        // Logic to fetch user wishlist
        return ResponseEntity.ok("User wishlist fetched successfully");     
    }

    @PostMapping("/wishlist")
    public ResponseEntity<?> addUserWishlist() {
        // Logic to add item to user wishlist
        return ResponseEntity.ok("Item added to user wishlist successfully");
    }

    @GetMapping("/cart")
    public ResponseEntity<?> getUserCart() {
        // Logic to fetch user cart
        return ResponseEntity.ok("User cart fetched successfully");     
    }

    @PostMapping("/cart")
    public ResponseEntity<?> addUserCart() {
        // Logic to add item to user cart
        return ResponseEntity.ok("Item added to user cart successfully");   
    }

    @GetMapping("/orders")
    public ResponseEntity<?> getUserOrders() {
        // Logic to fetch user orders
        return ResponseEntity.ok("User orders fetched successfully");
    }

    @PostMapping("/orders")
    public ResponseEntity<?> placeUserOrder() {
        // Logic to place user order
        return ResponseEntity.ok("User order placed successfully");     
    }

    @GetMapping("/profile")
    public ResponseEntity<?> getUserProfile() {
        // Logic to fetch user profile
        return ResponseEntity.ok("User profile fetched successfully");  
    }

    @PostMapping("/profile")
    public ResponseEntity<?> updateUserProfile() {
        // Logic to update user profile
        return ResponseEntity.ok("User profile updated successfully");  
    }
}
