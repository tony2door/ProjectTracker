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

    enum Statuses {
        DONE(1),
        IN_PROGRESS(2),
        NEW(3);

        Statuses(int i) {
        }
    }
    public Status statusOption(Statuses statusOption) {
        switch (statusOption) {
            case DONE:
                Status status = new Status();
                status.statusID = 1;
                return status;
            case IN_PROGRESS:
                Status status1 = new Status();
                status1.statusID = 2;
                return status1;
            case NEW:
                Status status2 = new Status();
                status2.statusID = 3;
                return status2;
        }
        return null;
    }
}
