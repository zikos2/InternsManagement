package um5.fmp.stages.gestion_stages.services;

import java.util.Date;
import java.util.List;

import um5.fmp.stages.gestion_stages.models.AffectationEmplacementStage;
import um5.fmp.stages.gestion_stages.models.EmplacementStage;
import um5.fmp.stages.gestion_stages.models.Encadrant;
import um5.fmp.stages.gestion_stages.models.Etudiant;
import um5.fmp.stages.gestion_stages.models.Niveau;
import um5.fmp.stages.gestion_stages.models.Stage;

public interface EncadrantService {

    public Encadrant findById(Long id);

    /**
     * Get students of same level as the mentor
     */
    public List<Etudiant> getStudents(Niveau niveau);

    public List<AffectationEmplacementStage> getAssignments(Encadrant encadrant);

    public Boolean assignStudentToLocation(Encadrant encadrant, Etudiant etudiant, Stage stage,
            EmplacementStage location,
            Date date_debut, Date date_fin);

    public Boolean updateAssignment(AffectationEmplacementStage affectation);
}
