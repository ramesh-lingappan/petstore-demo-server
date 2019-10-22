package com.petstore.petstore.server.controller;

import com.petstore.api.PetsApi;
import com.petstore.api.model.Pet;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
public class PetsApiController implements PetsApi {

    @Override
    public ResponseEntity<Void> createPets() {
        // create new pet :)
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @Override
    public ResponseEntity<List<Pet>> listPets(@Valid Integer limit) {

        Pet pet1 = new Pet();
        pet1.setId(1L);
        pet1.setName("kitty");
        pet1.setTag("cat");

        Pet pet2 = new Pet();
        pet2.setId(1L);
        pet2.setName("doe");
        pet2.setTag("dog");

        return ResponseEntity.ok(List.of(pet1, pet2));
    }

    @Override
    public ResponseEntity<Pet> showPetById(String petId) {

        Pet pet = new Pet();
        pet.setId(1L);
        pet.setName("kitty");
        pet.setTag("cat");

        return ResponseEntity.ok(pet);
    }
}
