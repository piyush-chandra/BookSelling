package click.piyush.book.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import click.piyush.book.entities.Users;

public interface UserRepository extends JpaRepository<Users, Long> {
    // here we can check we have username or email already exists ~ use of bloom filter required
    boolean existsByUsername(String username);
    boolean existsByEmail(String email);
    boolean existsByPhone(String phone); 
}
