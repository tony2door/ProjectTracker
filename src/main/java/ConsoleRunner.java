import java.util.Scanner;

public class ConsoleRunner {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Bine ai venit!");
        System.out.println("Alege optiunea: ");
        System.out.println("1. Vezi proiecte \n2. Adauga proiect\n0. Back");
        ConsoleRunnerService runService = ConsoleRunnerService.getInstance();
        ProjectService projectService = ProjectService.getInstance();

        while (true) {
            int option = in.nextInt();
            if (option == 1) {
                runService.veziProiecte();
                System.out.println("Alege un numar de ID pentru a selecta un proiect: ");
                System.out.println("Apasa 0 pentru meniul anterior");

                while (true) {
                    int optionPointOne = in.nextInt();
                    projectService.findProjectById(optionPointOne);

                    runService.meniuEditareSiStergere();
                    int optionPointTwo = in.nextInt();
                    if(optionPointTwo==1){
                        Project projectById = projectService.findProjectById(optionPointOne);
                        System.out.println("Introduceti un update pentru descrierea proiectului");
                        Scanner localIn = new Scanner(System.in);
                        projectById.description = localIn.nextLine();
                        projectService.updateProject(projectById);
                    }
                    else if (optionPointTwo == 2){
                        projectService.deleteProjectById(optionPointOne);
                    }
                    else if (optionPointTwo == 0)
                        runService.veziProiecte();
                }
            }
        }
    }
}
