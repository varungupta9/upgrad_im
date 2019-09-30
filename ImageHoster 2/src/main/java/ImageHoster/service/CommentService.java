package ImageHoster.service;

import ImageHoster.model.Comment;
import ImageHoster.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentService {
    @Autowired
    CommentRepository commentRepository;
    //The method calls the insertComment() method in the Repository and passes the comment to be persisted into the database.
    public Comment insertComment(Comment comment)
    {
        return commentRepository.insertComment(comment);
    }
}
