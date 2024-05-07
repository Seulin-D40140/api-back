package fr.fms.service;

import fr.fms.entities.Category;
import fr.fms.entities.Training;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ItraingService
{
    List<Training> getAllTrainings();

    Training saveTraining(Training training);

    void deleteTraining ( Long id);

    List<Category> getAllCategories();

    List<Training> getByCategoryId(Long id);
}
