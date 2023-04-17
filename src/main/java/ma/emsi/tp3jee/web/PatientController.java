package ma.emsi.tp3jee.web;

import lombok.AllArgsConstructor;
import ma.emsi.tp3jee.entities.Patient;
import ma.emsi.tp3jee.repositories.PatientRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@AllArgsConstructor
public class PatientController {

    private PatientRepository patientRepository;
    @GetMapping("/index")
    public String patients(Model model){
        List<Patient> patients = patientRepository.findAll();
        model.addAttribute("listPatient",patients);
        return"patients";
}

}
