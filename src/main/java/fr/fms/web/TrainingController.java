package fr.fms.web;

import fr.fms.entities.Category;
import fr.fms.entities.Training;
import fr.fms.exeptions.RecordNotFoundException;
import fr.fms.service.ImplTrainingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Objects;

@CrossOrigin("*")
@RestController
@RequestMapping("/api")
public class TrainingController
{
    @Autowired
    private ImplTrainingService implTrainingService;

    @GetMapping("/trainings")
    public List<Training> alltrainings()
    {
       return implTrainingService.getAllTrainings();
    }

    @GetMapping("/trainingsCat/{id}")
    public List<Training> allTrainingsCat(@PathVariable("id") Long id)
    {
        return implTrainingService.getByCategoryId(id);
    }

    @PostMapping("/trainings")
    public ResponseEntity<Training> saveTraining(@RequestBody Training t)
    {
        Training training = implTrainingService.saveTraining(t);
        if (Objects.isNull(training))
        {
            return ResponseEntity.noContent().build();
        }

        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(training.getId())
                .toUri();
        return ResponseEntity.created(location).build();
    }

    @DeleteMapping("/training/{id}")
    public void deleteTraining(@PathVariable("id") Long id)
    {
        implTrainingService.deleteTraining(id);
    }

//    @GetMapping("trainings/{id}")
//    public ResponseEntity<Training> getTrainingById(@PathVariable("id") Long id)
//    {
//        Optional<Training> training = implTrainingService.getTraining(id);
//
//        if(training.isPresent())
//        {
//            return new ResponseEntity<>(training.get() , HttpStatus.OK);
//        }
//        return null;
//    }

    @GetMapping("/trainings/{id}")
    public Training getTrainingById(@PathVariable("id") Long id)
    {
        return implTrainingService.getTraining(id)
                .orElseThrow( () -> new RecordNotFoundException("id de formation "+id+" n'existe pas "));
    }
}
