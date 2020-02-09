import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer commentID; //primary key
    String text;
    int itemID; //foreign key

    @Override
    public String toString() {
        return "Comment{" +
                "commentID=" + commentID +
                ", text='" + text + '\'' +
                ", itemID='" + itemID + '\'' +
                '}';
    }
}
