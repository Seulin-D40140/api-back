package fr.fms;

import fr.fms.dao.CategoryRepository;
import fr.fms.dao.TrainingRepository;
import fr.fms.dao.UserRepository;
import fr.fms.entities.Category;
import fr.fms.entities.Training;
import fr.fms.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiTrainings2Application implements CommandLineRunner
{
	@Autowired
	private CategoryRepository categoryRepository;

	@Autowired
	private TrainingRepository trainingRepository;

	@Autowired
	private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(ApiTrainings2Application.class, args);
	}

	@Override
	public void run (String... args) throws Exception
	{
	 generateData();
	}
	public void generateData()
	{
		Category back = categoryRepository.save(new Category("backend" , "server , bdd..."));
		Category front = categoryRepository.save(new Category("frontend" , "client , interaction..."));

		trainingRepository.save(new Training(null , "java" , "fullstack" , 2500 , 1 , back));
		trainingRepository.save(new Training(null , "php" , "backend" , 3500 , 1 , back));
		trainingRepository.save(new Training(null , "javascript" , "frontend" , 500 , 1 , front));
		trainingRepository.save(new Training(null , "go" , "fullstack" , 2500 , 1 , front));
		trainingRepository.save(new Training(null , "rust" , "backend" , 3500 , 1 , back));
		trainingRepository.save(new Training(null , "ruby" , "frontend" , 900 , 1 , front));
		trainingRepository.save(new Training(null , "java++" , "fullstack" , 2500 , 1 , back));
		trainingRepository.save(new Training(null , "php++" , "backend" , 3500 , 1 , back));
		trainingRepository.save(new Training(null , "javascript++" , "frontend" , 9000 , 1 , front));

		userRepository.save(new User( null , "nel" , "12345" , 1));
		userRepository.save(new User( null , "itai" , "12345" , 1));
	}
}
