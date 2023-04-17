package ma.emsi.tp3jee.repositories;

import ma.emsi.tp3jee.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient,Long> {

}
