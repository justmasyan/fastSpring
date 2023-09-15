package examplewithoutSpring.repository;

import examplewithoutSpring.service.Comment;
import org.springframework.stereotype.Component;

@Component
public class DBCommentRepository implements CommentRepository{

    public void setStr(String str) {
        this.str = str;
    }

    private String str;

    @Override
    public void storeComment(Comment comment) {
        System.out.println("Comment:" + " " + str + " " + comment.getText());
    }
}
