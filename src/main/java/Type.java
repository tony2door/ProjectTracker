import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Type {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer typeID;
    String name;

    @Override
    public String toString() {
        return "Type{" +
                "typeID=" + typeID +
                ", name='" + name + '\'' +
                '}';
    }
}
