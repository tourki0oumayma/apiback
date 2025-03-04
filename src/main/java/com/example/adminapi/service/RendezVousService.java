package com.example.adminapi.service;
import com.example.adminapi.model.RendezVous;
import com.example.adminapi.Repository.RendezVousRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RendezVousService {

    @Autowired
    private RendezVousRepository Repository;

    public List<RendezVous> getAllRendezVous1() {
        return Repository.findAll();
    }

    public Optional<RendezVous> getRendezVousById(Long id) {
        return Repository.findById(id);
    }

    public RendezVous saveRendezVous(RendezVous rendezVous) {
        return Repository.save(rendezVous);
    }

    public void deleteRendezVous(Long id) {
        Repository.deleteById(id);
    }

	public List<RendezVous> getAllRendezVous() {
		// TODO Auto-generated method stub
		return null;
	}
}

