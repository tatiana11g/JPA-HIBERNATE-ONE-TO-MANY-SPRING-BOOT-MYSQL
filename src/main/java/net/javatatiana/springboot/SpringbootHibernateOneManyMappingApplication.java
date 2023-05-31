package net.javatatiana.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.javatatiana.springboot.entity.Comment;
import net.javatatiana.springboot.entity.Post;
import net.javatatiana.springboot.repository.PostRepository;

@SpringBootApplication
public class SpringbootHibernateOneManyMappingApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootHibernateOneManyMappingApplication.class, args);
	}

	//inyectamos
	 @Autowired
	    private PostRepository postRepository;


	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		//se manda el titulo y la descripcion
		Post post = new Post("one to many mapping usando JPA y hibernate", "one to many mapping usando JPA y hibernate");

        Comment comment1 = new Comment("Muy util");
        Comment comment2 = new Comment("informativo");
        Comment comment3 = new Comment("Genial Post");

       //es la lista  getComments() a la lista se le agrega los objeto
        post.getComments().add(comment1);
        post.getComments().add(comment2);
        post.getComments().add(comment3);

        this.postRepository.save(post);
		
		
		
		
		
		
	}

}
