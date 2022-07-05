package um5.fmp.stages.gestion_stages.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class Affectation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String location;

    @ManyToOne
    private Stage stage;

    @ManyToOne
    private Etudiant etudiant;

    @ManyToOne
    private Encadrent encadrent;

    @OneToMany
    private List<Document> document;

}
