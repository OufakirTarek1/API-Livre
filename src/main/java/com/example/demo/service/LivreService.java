package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import com.example.demo.entities.Livre;
import com.example.demo.repos.LivreRepo;
import java.util.List;

@Service
public class LivreService {
	@Autowired
    private LivreRepo livrerepo;

    public List<Livre> getAllLivres(){
      return livrerepo.findAll();
    };

    public Livre getLivreById(Integer id){
        return livrerepo.findById(id).get();
    };

    public void saveLivre(Livre l){
        livrerepo.save(l);
    }

    public void deleteLivre(Livre l){
        livrerepo.delete(l);
    }
    public void removeLivreById(Integer  id) {
    	livrerepo.deleteById(id);
    }

	
}
