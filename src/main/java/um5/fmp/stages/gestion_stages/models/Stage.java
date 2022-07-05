package um5.fmp.stages.gestion_stages.models;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Stage {

    @Id
    private Long id;
    private String nom;
}
