package examplewithoutSpring.proxy;

import examplewithoutSpring.service.Comment;

public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}
