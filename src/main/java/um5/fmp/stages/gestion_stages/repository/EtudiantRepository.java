package um5.fmp.stages.gestion_stages.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import um5.fmp.stages.gestion_stages.models.Etudiant;
import um5.fmp.stages.gestion_stages.models.Niveau;

public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {
    /**
     * Fetch student of a specifique year
     */

    @Query("Select e From Etudiant e Where e.niveau = :niveau")
    List<Etudiant> getStudents(Niveau niveau);

}
