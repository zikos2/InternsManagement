package um5.fmp.stages.gestion_stages.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import um5.fmp.stages.gestion_stages.models.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Long> {

}
