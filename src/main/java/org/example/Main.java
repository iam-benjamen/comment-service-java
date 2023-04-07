package org.example;

import org.example.model.Comment;
import org.example.services.CommentService;
import org.example.services.DBCommentRepository;
import org.example.services.EmailCommentNotificationProxy;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var comment = new Comment();
        comment.setAuthor("Benjamen");
        comment.setText("Just some random text to test this service");

        var commentService = context.getBean(CommentService.class);
        commentService.publishComment(comment);
    }
}