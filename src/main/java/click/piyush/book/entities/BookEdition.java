package click.piyush.book.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class BookEdition {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long editionId;

    @ManyToOne
    @JoinColumn(name = "bookId", referencedColumnName = "bookId")
    @JsonBackReference
    private Book book;

    private String quantity;
    private Double price;
    private String edition;
    private String URI;

    @OneToOne(mappedBy = "bookEdition", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonManagedReference
    private WishlistItem wishlistItem;

    @OneToOne(mappedBy = "bookEdition", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonManagedReference
    private CartItem cartItem;

    @OneToOne(mappedBy = "bookEdition", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonManagedReference
    private OrderItem orderItem;
}