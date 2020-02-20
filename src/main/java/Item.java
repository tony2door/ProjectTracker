import javax.persistence.*;
import java.util.List;

@Entity
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    Integer itemID; //primary key
    String title;
    String description;
    Integer statusID; //foreign key
  //  Integer typeID; // foreign key

    @ManyToOne
    @JoinColumn(name = "typeID")
    Type typeIdForeignKey;

    @Override
    public String toString() {
        return "Item{" +
                "itemID=" + itemID +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", statusID=" + statusID +
                ", typeID=" + typeIdForeignKey.typeID +
                '}';
    }
}
