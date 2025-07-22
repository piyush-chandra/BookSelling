package click.piyush.book.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
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

    @OneToOne
    @JoinColumn(name = "editionId", referencedColumnName = "editionId")
    @JsonBackReference
    private BookEdition bookEdition;
    
    @ManyToOne
    @JoinColumn(name = "cartId", referencedColumnName = "cartId")
    @JsonManagedReference
    private Cart cart;
}
