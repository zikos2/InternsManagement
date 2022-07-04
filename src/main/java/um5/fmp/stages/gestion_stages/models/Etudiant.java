package um5.fmp.stages.gestion_stages.models;

import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(callSuper=true)
@DiscriminatorValue(value = "ETUDIANT")
public class Etudiant extends User {
    @ManyToOne
    private Niveau niveau;

    @OneToMany
    @JsonIgnoreProperties("{proprietaire}")
    private List<Document> documents;

    @OneToMany
    @JsonIgnoreProperties("{proprietaire}")
    private List<Affectation> affectations;
}
