package atos.upgrade.colmenaapi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import atos.upgrade.colmenaapi.services.PersonaService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/v1/personas")
public class PersonaController {
    
    @Autowired
    private PersonaService personaService;

    public ResponseEntity<?> getAll() {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(personaService.findAll());)    
           } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"" +"Error, Intentalo mas tarde"+ "\"}");
        }
    }
    
}
