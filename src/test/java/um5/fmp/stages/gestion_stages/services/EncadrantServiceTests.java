package um5.fmp.stages.gestion_stages.services;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.when;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import um5.fmp.stages.gestion_stages.models.Encadrant;

@SpringBootTest
public class EncadrantServiceTests {

    @MockBean
    EncadrantServiceImpl encadrantService;

    @Test
    public void addingAndCheckingEncadrant() throws Exception {
        Encadrant encadrant = new Encadrant();
        encadrant.setNom("zakaria");
        encadrant.setPrenom("ettani");
        encadrant.setEmail("test@email.com");
        encadrant.setPassword("pwd123");
        encadrant.setUsername("zakaria");

        when(encadrantService.add(encadrant)).thenReturn(true);

    }

}
