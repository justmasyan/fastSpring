package examplewithoutSpring.service;

import examplewithoutSpring.proxy.CommentNotificationProxy;
import examplewithoutSpring.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CommentService {
    private final CommentRepository COMMENT_REPOSITORY;
    private final CommentNotificationProxy COMMENT_NOTIFICATION_PROXY;


    public CommentService(CommentRepository commentRepository, @Qualifier("EMAIL")CommentNotificationProxy notificationProxy){
        COMMENT_NOTIFICATION_PROXY = notificationProxy;
        COMMENT_REPOSITORY = commentRepository;
    }

    public CommentService(){
        COMMENT_REPOSITORY = null;
        COMMENT_NOTIFICATION_PROXY = null;
    }

    public void publishComment(Comment comment){
        COMMENT_REPOSITORY.storeComment(comment);
        COMMENT_NOTIFICATION_PROXY.sendComment(comment);
    }

    public void show(){
        System.out.println("ILIVE");
    }
}
