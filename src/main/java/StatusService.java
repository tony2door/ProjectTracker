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
    public void updateStatus(int id, String updatedStatus) {
        Transaction transaction = null;
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            Status statusById = findStatusById(id);
            statusById.statusName = updatedStatus;
            session.update(statusById);
            session.getTransaction().commit();
        } catch (Exception ex) {
            if (transaction != null) {
                transaction.rollback();
            }
            ex.printStackTrace();
        }
    }
    public void createStatus (String addNewStatus){
        Transaction transaction = null;
        try{
            Session session = HibernateUtil.getSessionFactory().getCurrentSession();
            transaction = session.beginTransaction();
            Status newStatus = new Status();
            newStatus.statusName = addNewStatus;
            session.save(newStatus);
            transaction.commit();
            session.close();
        } catch (Exception ex) {
            if (transaction != null) {
                transaction.rollback();
            }
            ex.printStackTrace();
        }
    }

    public void deleteStatusById(int id) {
        Transaction transaction = null;
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            Status statusById = findStatusById(id);
            session.delete(statusById);
            session.getTransaction().commit();
        } catch (Exception ex) {
            if (transaction != null) {
                transaction.rollback();
            }
            ex.printStackTrace();
        }
    }
}
