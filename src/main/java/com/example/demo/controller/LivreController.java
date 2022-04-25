package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entities.Livre;
import com.example.demo.repos.LivreRepo;
import com.example.demo.service.LivreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(path = "/emsi_api")
public class LivreController {

	@Autowired
    private LivreService livreService;

    @GetMapping("/livres")
    public List<Livre> findAllLivres(){
        return livreService.getAllLivres();
    }

    @GetMapping("/livres/{id}")
    public Livre findLivreById(@PathVariable Integer id){
        return livreService.getLivreById(id);
    }
    @PostMapping("/save")
    public String saveLivre(@RequestBody Livre livre) {
        livreService.saveLivre(livre);
        return "livre saved";
    }
    
    @PutMapping("/livres/{id}")
    public String updateLivre(@PathVariable Integer id, @RequestBody Livre livreupdate){
        Livre livre = livreService.getLivreById(id);
        livre.settitre(livreupdate.gettitre());
        livre.setmaisonedition(livreupdate.getmaisonedition());
        livre.setauteur(livreupdate.getauteur());
        livre.setdisponible(livreupdate.getdisponible());
        livre.setDatedatedederniereconsultation(bookDetails.getdatedederniereconsultation());
        livre.setdatedesortie(livreupdate.getdatedesortie());
        livre.setisbn(livre.getisbn());
        livre.setnombredepage(livreupdate.getnombredepage());
        livreService.saveLivre(livre);
        return "successful update";
    }
    @DeleteMapping("/livres/{id}")
    public String removeLivre(@PathVariable Integer id){
        livreService.removeLivreById(id);

        return "successful delete";
    }
}
