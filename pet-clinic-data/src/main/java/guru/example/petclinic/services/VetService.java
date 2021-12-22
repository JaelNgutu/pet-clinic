package guru.example.petclinic.services;

import guru.example.petclinic.domain.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);
    Vet save(Vet vet);
    Set<Vet> findAll();

}
