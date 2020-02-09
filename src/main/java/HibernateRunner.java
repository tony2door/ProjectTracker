import java.security.Provider;

public class HibernateRunner {
    public static void main(String[] args) {

        CommentService commentService = CommentService.getInstance();
     //   commentService.updateComment(1, "raka taka");
     //  commentService.createComment(1,"merge?");
     //   commentService.deleteCommentById(2);
        StatusService statusService = StatusService.getInstance();
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


    }
}
