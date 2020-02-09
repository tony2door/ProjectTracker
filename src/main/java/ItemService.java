import org.hibernate.Session;

public class ItemService {
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
}
