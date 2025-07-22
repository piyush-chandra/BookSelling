package click.piyush.book.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
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
@ToString
@AllArgsConstructor
public class WishlistItem extends Item {

    @OneToOne
    @JoinColumn(name = "editionId", referencedColumnName = "editionId")
    @JsonBackReference
    private BookEdition bookEdition;

    @ManyToOne
    @JoinColumn(name = "wishlistId", referencedColumnName = "wishlistId")
    @JsonBackReference
    private Wishlist wishlist;
    
}
