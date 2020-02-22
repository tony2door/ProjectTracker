public class HibernateRunner {
    public static void main(String[] args) {

        CommentService commentService = CommentService.getInstance();
        //   commentService.updateComment(1, "raka taka");
        //  commentService.createComment(1,"merge?");
        //   commentService.deleteCommentById(2);
        StatusService statusService = StatusService.getInstance();
        ProjectService projectService = ProjectService.getInstance();
        //   statusService.updateStatus(1,"Done");
        //  statusService.createStatus("shit");
//        ProjectService projectService = ProjectService.getInstance();
//        Project projectById = projectService.findProjectById(1);
//        projectById.description = "Descriere noua!!!!!!!!!!";
//        projectService.updateProject(projectById);

//        ItemService itemService = ItemService.getInstance();
//        Item itemUpdate = itemService.findItemById(1);
//        itemUpdate.description = "Failed engine on start";
//        itemService.updateItem(itemUpdate);

        //Create a new proj
//        Project project = new Project();
//        project.name = "The experiment";
//        project.shortName = "Xzibit";
//        project.description = "this is a new description";
//        project.statusIdForeignKey = statusService.findStatusById(1);
//
//        projectService.createProject(project);


//        int id = 1;
//        Status statusById = statusService.findStatusById(id);
//        System.out.println("-------------------");
//        System.out.println(statusById.projectList);

        //projectService.deleteProjectById(3);

//        Project nouProj = new Project();
//        Status status = new Status();
//        nouProj.statusIdForeignKey = status.statusOption(Status.Statuses.NEW);
//        nouProj.name = "Proiectul Cu enum";
//        nouProj.description = "am adaugat Enumuri sa vad daca pot forta userul sa aleaga una din 3 variante";
//        nouProj.shortName = "eNuM";
//        projectService.createProject(nouProj);

//        TypeService typeService = TypeService.getInstance();
//       Type typeById = typeService.findTypeById(2);

//        System.out.println("-----------------------------------------");
//        System.out.println(typeById.itemList);

    }
}
