public class HibernateRunner {
    public static void main(String[] args) {

        CommentService commentService = CommentService.getInstance();
     //   commentService.updateComment(1, "raka taka");
     //   commentService.createComment(1,"merge?");
        commentService.deleteCommentById(2);


    }
}
