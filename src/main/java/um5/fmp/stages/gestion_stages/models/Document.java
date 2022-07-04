package um5.fmp.stages.gestion_stages.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Document {
    @Id
    private Long id;
    private String lien;

    @ManyToOne
    @JsonIgnoreProperties("{documents}")
    private Etudiant proprietaire;
}