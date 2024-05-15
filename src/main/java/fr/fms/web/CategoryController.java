package fr.fms.web;

import fr.fms.entities.Category;
import fr.fms.service.ImplTrainingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/api")
public class CategoryController
{
    @Autowired
    private ImplTrainingService implTrainingService;

    @GetMapping("/categories")
    public List<Category> allCategories()
    {
        return implTrainingService.getAllCategories();
    }
}
