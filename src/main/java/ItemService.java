import org.hibernate.Session;
import org.hibernate.Transaction;

public class ItemService {
    private static ItemService instance;

    private ItemService() {

    }

    public static ItemService getInstance() {
        if (instance == null) {
            instance = new ItemService();
        }
        return instance;
    }
    public Item findItemById(int id) {
        try { //try e un fel de if
            Session session = HibernateUtil.getSessionFactory().openSession();
            Item item = session.find(Item.class, id);
            System.out.println(item);
            return item;
        } catch (Exception ex) { //catch e un fel de else
            ex.printStackTrace();
            return null;
        }
    }
    public void updateItem(Item updatedItem) {
        Transaction transaction = null;
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.update(updatedItem);
            session.getTransaction().commit();
        } catch (Exception ex) {
            if (transaction != null) {
                transaction.rollback();
            }
            ex.printStackTrace();
        }
    }
    public void createItem (Item newItem){
        Transaction transaction = null;
        try{
            Session session = HibernateUtil.getSessionFactory().getCurrentSession();
            transaction = session.beginTransaction();
            session.save(newItem);
            transaction.commit();
            session.close();
        } catch (Exception ex) {
            if (transaction != null) {
                transaction.rollback();
            }
            ex.printStackTrace();
        }
    }
    public void deleteItemById(int id) {
        Transaction transaction = null;
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            Item itemById = findItemById(id);
            session.delete(itemById);
            session.getTransaction().commit();
        } catch (Exception ex) {
            if (transaction != null) {
                transaction.rollback();
            }
            ex.printStackTrace();
        }
    }
}
