package guru.example.petclinic.domain.services;

import guru.example.petclinic.domain.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);
    Pet save(Pet pet);
    Set<Pet> findAll();
}
