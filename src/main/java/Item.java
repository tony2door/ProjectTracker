import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    Integer itemID; //primary key
    String title;
    String description;
    Integer statusID; //foreign key
    Integer typeID; // foreign key

    @Override
    public String toString() {
        return "Item{" +
                "itemID=" + itemID +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", statusID=" + statusID +
                ", typeID=" + typeID +
                '}';
    }
}
