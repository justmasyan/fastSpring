package examplewithoutSpring.repository;

import examplewithoutSpring.service.Comment;

public interface CommentRepository {
    void storeComment(Comment comment);
}
