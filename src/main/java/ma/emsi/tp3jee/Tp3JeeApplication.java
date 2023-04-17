package ma.emsi.tp3jee;

import ma.emsi.tp3jee.entities.Patient;
import ma.emsi.tp3jee.repositories.PatientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.List;

@SpringBootApplication
public class Tp3JeeApplication {

    public static void main(String[] args) {

        SpringApplication.run(Tp3JeeApplication.class, args);
    }
    @Bean
    CommandLineRunner commandLineRunner(PatientRepository patientRepository){
        return args -> {
            patientRepository.save(
                    new Patient(null,"hind",new Date(),true,56));
            patientRepository.save(
                    new Patient(null,"imane",new Date(),true,130));
            patientRepository.save(
                    new Patient(null,"rania",new Date(),true,99));

            List<Patient> patients = patientRepository.findAll();
            patients.forEach(p->{
                System.out.println(p.getNom());
            });


        };
    }

}
