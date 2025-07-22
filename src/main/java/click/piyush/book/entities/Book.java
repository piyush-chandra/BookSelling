package click.piyush.book.entities;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bookId;

    private String title;
    private String isbn;
    private String authorName;

    @OneToMany(mappedBy = "book",cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference
    List<BookEdition> editions = new ArrayList<>();

    @OneToMany(mappedBy = "book", fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<Category> category;

    @ManyToMany(mappedBy = "books", cascade = CascadeType.ALL, fetch = FetchType.LAZY)

    private List<Wishlist> wishlists = new ArrayList<>();


    // One to Many relationship with OrderItem and CartItem
    @ManyToMany(mappedBy = "books")
    private List<OrderItem> orderItems = new ArrayList<>();

    @ManyToMany(mappedBy = "books")
    private List<OrderItem> cartItems = new ArrayList<>();
}