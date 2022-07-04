package um5.fmp.stages.gestion_stages.models;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
@DiscriminatorValue(value = "ENCADRENT")
public class Encadrent extends User {
    @ManyToOne
    private Niveau niveau;
}
