package examplewithoutSpring.proxy;

import examplewithoutSpring.service.Comment;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("EMAIL")
public class EmailCommentNotificationProxy implements CommentNotificationProxy{

    public void setStr(String str) {
        this.str = str;
    }

    private String str;

    @Override
    public void sendComment(Comment comment) {
        System.out.println("EmailComment:" + " " + str + " " + comment.getText());
    }
}
