package um5.fmp.stages.gestion_stages.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import um5.fmp.stages.gestion_stages.models.Etudiant;

public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {
    /**
     * Fetch student of a specifique year
     */

}
