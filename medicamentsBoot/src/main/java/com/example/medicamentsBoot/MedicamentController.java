package com.example.medicamentsBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


 
@Controller
@RequestMapping("/medicaments")
public class MedicamentController {

    @Autowired
    MedicamentService service;
    
    @RequestMapping("/farmacia")
    public String showMedicaments (Model model) {
        
            
       // model.addAttribute("medicaments", service.findAll());
        return "medicaments/farmacia";
    }

      @RequestMapping("/newMedicament")
    public String newMedicament() {
        
        
        return "medicaments/newMedicament.html";
    }
    
    






      @RequestMapping("/insertMedicament")
    public String insertMedicament (Medicament medicament, Model model) {
        
        service.insertMedicament(medicament);
        //model.addAttribute("farmacia",service.findAll());
        
        return "medicaments/farmacia.html";    }
    




    @RequestMapping("/deleteMedicament")
    public String deleteBook(@RequestParam("medicamentId") String title, Model model) {
        
        //Medicament medicament = new Medicament(medicamentId);
        
        //service.deleteMedicament(medicament);
        //model.addAttribute("farmacia",service.findAll());
        
        return "medicaments/farmacia.html";
    }

}
