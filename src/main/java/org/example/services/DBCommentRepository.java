package org.example.services;

import org.example.model.Comment;
import org.example.repositories.CommentRepository;
import org.springframework.stereotype.Repository;

@Repository
public class DBCommentRepository implements CommentRepository {
    @Override
    public void storeComment(Comment comment){
        System.out.println("Storing comment: " + comment.getText());
    }
}
