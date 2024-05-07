package fr.fms.service;

import fr.fms.dao.TrainingRepository;
import fr.fms.web.TrainingController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

@WebMvcTest(controllers = TrainingController.class)
public class TrainingControllerTest
{
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    TrainingRepository trainingRepository;

    @MockBean
    private ImplTrainingService implTrainingService;

    @Test
    public void testGetTrainings() throws Exception
    {
        mockMvc.perform(get("/api/trainings"))
                .andExpect(status().isOk());
    }
}
