package um5.fmp.stages.gestion_stages.services;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import um5.fmp.stages.gestion_stages.models.AffectationEmplacementStage;
import um5.fmp.stages.gestion_stages.models.EmplacementStage;
import um5.fmp.stages.gestion_stages.models.Encadrant;
import um5.fmp.stages.gestion_stages.models.Etudiant;
import um5.fmp.stages.gestion_stages.models.Niveau;
import um5.fmp.stages.gestion_stages.models.Stage;
import um5.fmp.stages.gestion_stages.repository.AffectationRepository;
import um5.fmp.stages.gestion_stages.repository.EncadrantRepository;
import um5.fmp.stages.gestion_stages.repository.EtudiantRepository;

@Service
public class EncadrantServiceImpl implements EncadrantService {

    @Autowired
    EncadrantRepository encadrantRepo;

    @Autowired
    EtudiantRepository etudiantRepo;

    @Autowired
    AffectationRepository affectationRepo;

    @Override
    public Encadrant findById(Long id) {
        Optional<Encadrant> encadrant = encadrantRepo.findById(id);
        return encadrant.isPresent() ? encadrant.get() : null;
    }

    @Override
    public List<Etudiant> getStudents(Niveau niveau) {
        return etudiantRepo.getStudents(niveau);
    }

    @Override
    public List<AffectationEmplacementStage> getAssignments(Encadrant encadrant) {
        return affectationRepo.findAll();
    }

    @Override
    public Boolean assignStudentToLocation(Encadrant encadrant, Etudiant etudiant,Stage stage, EmplacementStage location,
            Date date_debut, Date date_fin) {
        AffectationEmplacementStage affectation = new AffectationEmplacementStage();
        affectation.setEncadrant(encadrant);
        affectation.setEtudiant(etudiant);
        affectation.setStage(stage);
        affectation.setEmplacementStage(location);
        affectation.setDate_debut(date_debut);
        affectation.setDate_fin(date_fin);
        return null;
    }

    @Override
    public Boolean updateAssignment(AffectationEmplacementStage affectation) {
        // TODO Auto-generated method stub
        return null;
    }

}
