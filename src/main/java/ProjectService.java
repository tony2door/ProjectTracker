import org.hibernate.Session;

public class ProjectService {
    public Project findProjectById(int id) {
        try { //try e un fel de if
            Session session = HibernateUtil.getSessionFactory().openSession();
            Project project = session.find(Project.class, id);
            System.out.println(project);
            return project;
        } catch (Exception ex) { //catch e un fel de else
            ex.printStackTrace();
            return null;
        }
    }
}
