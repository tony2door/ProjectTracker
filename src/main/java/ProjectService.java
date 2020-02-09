import org.hibernate.Session;
import org.hibernate.Transaction;

public class ProjectService {
    private static ProjectService instance;

    private ProjectService() {

    }

    public static ProjectService getInstance() {
        if (instance == null) {
            instance = new ProjectService();
        }
        return instance;
    }
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
    public void updateProject(Project updatedProject) {
        Transaction transaction = null;
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.update(updatedProject);
            session.getTransaction().commit();
        } catch (Exception ex) {
            if (transaction != null) {
                transaction.rollback();
            }
            ex.printStackTrace();
        }
    }
    public void createProject (Project newProject){
        Transaction transaction = null;
        try{
            Session session = HibernateUtil.getSessionFactory().getCurrentSession();
            transaction = session.beginTransaction();
            session.save(newProject);
            transaction.commit();
            session.close();
        } catch (Exception ex) {
            if (transaction != null) {
                transaction.rollback();
            }
            ex.printStackTrace();
        }
    }
    public void deleteProjectById(int id) {
        Transaction transaction = null;
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            Project projectById = findProjectById(id);
            session.delete(projectById);
            session.getTransaction().commit();
        } catch (Exception ex) {
            if (transaction != null) {
                transaction.rollback();
            }
            ex.printStackTrace();
        }
    }
}
