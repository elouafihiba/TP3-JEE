package ma.emsi.tp3jee.web;

import lombok.AllArgsConstructor;
import ma.emsi.tp3jee.entities.Patient;
import ma.emsi.tp3jee.repositories.PatientRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@AllArgsConstructor
public class PatientController {
    private PatientRepository patientRepository;
    @GetMapping("/index")
    public String patients(Model model,
                           @RequestParam(name ="page",defaultValue ="0" ) int page,
                           @RequestParam (name ="size",defaultValue ="5" ) int size,
                           @RequestParam (name ="keyword",defaultValue ="" ) String keyword
                           ){
        Page<Patient> pagepatients = patientRepository.findByNomContains(keyword,PageRequest.of(page,size));
        model.addAttribute("listPatient",pagepatients.getContent());
        model.addAttribute("pages",new int[pagepatients.getTotalPages()]);
        model.addAttribute("currentPage",page);
        model.addAttribute("keyword",keyword);
        return"patients";

    }
//    @GetMapping("/index")
//    public String patients(Model model) {
//        List<Patient> patients = patientRepository.findAll();
//        model.addAttribute("listPatient",patients);
//        return "patients";
//    }


    @GetMapping("/delete")
    public  String delete(Long id,String keyword,int page){
            patientRepository.deleteById(id);
            return "redirect:/index?page="+page+"&keyword="+keyword;
    }
    @GetMapping("/")
    public  String home(){
        return "redirect:/index";}

    @GetMapping("/patients")
    @ResponseBody
    public List<Patient> patientList(){
        return patientRepository.findAll();
    };


}
