package um5.fmp.stages.gestion_stages.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import um5.fmp.stages.gestion_stages.models.Stage;

public interface StageRepository extends JpaRepository<Stage, Long> {

}
