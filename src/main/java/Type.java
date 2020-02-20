import javax.persistence.*;
import java.util.List;

@Entity
public class Type {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer typeID;
    String name;

    @OneToMany(mappedBy = "typeIdForeignKey")
    List<Item>itemList;

    @Override
    public String toString() {
        return "Type{" +
                "typeID=" + typeID +
                ", name='" + name + '\'' +
                '}';
    }
}
