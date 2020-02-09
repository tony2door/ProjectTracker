import org.hibernate.Session;
import org.hibernate.Transaction;

public class TypeService {
    private static TypeService instance;

    private TypeService() {

    }

    public static TypeService getInstance() {
        if (instance == null) {
            instance = new TypeService();
        }
        return instance;
    }
    public Type findTypeById(int id) {
        try { //try e un fel de if
            Session session = HibernateUtil.getSessionFactory().openSession();
            Type type = session.find(Type.class, id);
            System.out.println(type);
            return type;
        } catch (Exception ex) { //catch e un fel de else
            ex.printStackTrace();
            return null;
        }
    }
    public void updateType(int id, String updatedType) {
        Transaction transaction = null;
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            Type typeById = findTypeById(id);
            typeById.name = updatedType;
            session.update(typeById);
            session.getTransaction().commit();
        } catch (Exception ex) {
            if (transaction != null) {
                transaction.rollback();
            }
            ex.printStackTrace();
        }
    }
    public void createType (String newType){
        Transaction transaction = null;
        try{
            Session session = HibernateUtil.getSessionFactory().getCurrentSession();
            transaction = session.beginTransaction();
            Type type = new Type();
            type.name=newType;
            session.save(type);
            transaction.commit();
            session.close();
        } catch (Exception ex) {
            if (transaction != null) {
                transaction.rollback();
            }
            ex.printStackTrace();
        }
    }
    public void deleteTypeById(int id) {
        Transaction transaction = null;
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            Type typeById = findTypeById(id);
            session.delete(typeById);
            session.getTransaction().commit();
        } catch (Exception ex) {
            if (transaction != null) {
                transaction.rollback();
            }
            ex.printStackTrace();
        }
    }
}
