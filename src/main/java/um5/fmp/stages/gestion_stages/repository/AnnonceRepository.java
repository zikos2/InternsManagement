package um5.fmp.stages.gestion_stages.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import um5.fmp.stages.gestion_stages.models.Annonce;

public interface AnnonceRepository extends JpaRepository<Annonce, Long> {

}
