import java.util.Scanner;

public class ConsoleRunnerService {

    ProjectService projectService = ProjectService.getInstance();
    private static ConsoleRunnerService instance;
    Scanner in = new Scanner(System.in);

    private ConsoleRunnerService() {

    }

    public static ConsoleRunnerService getInstance() {
        if (instance == null) {
            instance = new ConsoleRunnerService();
        }
        return instance;
    }

    public void veziProiecte () {
        ProjectService projectService = ProjectService.getInstance();
        projectService.findAllProjects();
    }

    public void arataMeniu(){
        System.out.println("Alege optiunea: ");
        System.out.println("1. Vezi proiecte \n2. Adauga proiect\n0. Back");
    }

    public void meniuEditareSiStergere(){
        System.out.println("1. pentru editare, 2 pentru stergere, 0 pentru meniu anterior");
    }
}
