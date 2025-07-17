package click.piyush.book.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;
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
public class CartItem extends Item {
    
    @ManyToOne
    @JoinColumn(name = "cartId", referencedColumnName = "cartId")
    private Cart cart;

    @ManyToMany
    @JoinTable(
        name = "cart_books",
        joinColumns = @JoinColumn(name = "cartId"),
        inverseJoinColumns = @JoinColumn(name = "bookId")
    )
    private List<Book> books = new ArrayList<>();

    
}
