package net.javatatiana.springboot.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import net.javatatiana.springboot.entity.Comment;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long>{

}