import org.hibernate.Session;

public class TypeService {
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
}
