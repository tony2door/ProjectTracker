import javax.persistence.*;
import java.util.List;

@Entity // MANY
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    Integer projectID; //primary key
    String name;
    String shortName;
    String description;
  //  Integer statusID; //foreign key

    // Many Projects to one status
    @ManyToOne
    @JoinColumn(name = "statusID")
    Status statusIdForeignKey;


    @Override
    public String toString() {
        return "Project{" +
                "projectID=" + projectID +
                ", name='" + name + '\'' +
                ", shortName='" + shortName + '\'' +
                ", description='" + description + '\'' +
                ", statusID=" + statusIdForeignKey.statusID +
                '}';
    }
}
