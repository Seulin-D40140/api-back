package fr.fms.service;

import fr.fms.dao.CategoryRepository;
import fr.fms.dao.TrainingRepository;
import fr.fms.entities.Category;
import fr.fms.entities.Training;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ImplTrainingService implements ItraingService
{
    @Autowired
    CategoryRepository categoryRepository;
    @Autowired
    TrainingRepository trainingRepository;

    public List<Training> getAllTrainings()
    {
        return trainingRepository.findAll();
    }

    public Training saveTraining (Training training)
    {
        return trainingRepository.save(training);
    }

    public Optional<Training> getTraining(Long id)
    {
        return trainingRepository.findById(id);
    }

    public void deleteTraining(Long id)
    {
        trainingRepository.deleteById(id);
    }

    public List<Category> getAllCategories() { return categoryRepository.findAll(); }

    public  List<Training> getByCategoryId(Long id) { return trainingRepository.findByCategoryId(id); }
}
