package click.piyush.book.entities;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
@AllArgsConstructor
@Builder
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bookId;

    private String title;
    private String isbn;
    private String authorName;

    @OneToMany(mappedBy = "book", cascade = CascadeType.ALL, orphanRemoval = true)
    List<BookEdition> editions = new ArrayList<>();

    @OneToOne(mappedBy = "book", cascade = CascadeType.ALL)
    private Category category;

    @ManyToMany(mappedBy = "books")
    private List<Wishlist> wishlists = new ArrayList<>();

    @ManyToMany(mappedBy = "books")
    private List<OrderItem> orderItems = new ArrayList<>();

    @ManyToMany(mappedBy = "books")
    private List<OrderItem> cartItems = new ArrayList<>();
}