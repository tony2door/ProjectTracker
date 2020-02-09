import javax.persistence.*;
import java.util.List;

@Entity // ONE
public class Status {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    Integer statusID;
    String statusName;

    //One status to many Projects
    @OneToMany(mappedBy = "statusIdForeignKey")
    List<Project> projectList;

    @Override
    public String toString() {
        return "Status{" +
                "statusID=" + statusID +
                ", statusName='" + statusName + '\'' +
                '}';
    }
}
