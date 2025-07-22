package click.piyush.book.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
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
public class OrderItem extends Item {

    @ManyToOne
    @JoinColumn(name = "orderId", referencedColumnName = "orderId")
    private Orders order;


    // need to check this.
    @ManyToMany
    @JoinTable(
        name = "ordered_books",
        joinColumns = @JoinColumn(name = "orderId"),
        inverseJoinColumns = @JoinColumn(name = "bookId")
    )
    private List<Book> books = new ArrayList<>();
    
}
