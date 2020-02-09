import org.hibernate.Session;
import org.hibernate.Transaction;

public class StatusService {

    private static StatusService instance;
    private StatusService() {

    }

    public static StatusService getInstance() {
        if (instance == null) {
            instance = new StatusService();
        }
        return instance;
    }

    public Status findStatusById(int id) {
        try { //try e un fel de if
            Session session = HibernateUtil.getSessionFactory().openSession();
            Status status = session.find(Status.class, id);
            System.out.println(status);
            return status;
        } catch (Exception ex) { //catch e un fel de else
            ex.printStackTrace();
            return null;
        }
    }



}
