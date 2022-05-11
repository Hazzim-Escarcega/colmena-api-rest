package atos.upgrade.colmenaapi.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import atos.upgrade.colmenaapi.entities.Persona;
import atos.upgrade.colmenaapi.repositories.PersonaDAO;

@Service
public class PersonaService implements BaseService<Persona> {
    @Autowired
    private PersonaDAO personaDAO;

    @Override
    @Transactional
    public List<Persona> findAll() throws Exception {
        try {
            List<Persona> entities = personaDAO.findAll();
            return entities;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Persona findById(Long id) throws Exception {
        // TODO Auto-generated method stub
        try {
            Optional<Persona> entity = personaDAO.findById(id);
            return entity.get();
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }

    }

    @Override
    @Transactional
    public Persona save(Persona entity) throws Exception {
        try {
            entity = personaDAO.save(entity);
            return entity;

        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }

    }

    @Override
    @Transactional
    public Persona update(Long id, Persona entity) throws Exception {
        try {
            Optional<Persona> entityOptional = personaDAO.findById(id);
            Persona persona = entityOptional.get();
            persona = personaDAO.save(persona);
            return persona;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public boolean deleteById(Long id) throws Exception {
        try {
            if (personaDAO.existsById(id)) {
                personaDAO.deleteById(id);
                return true;
            } else {
                throw new Exception("No existe el registro con id: " + id);
            }
        } catch (Exception e) {
            throw new Exception(e.getMessage());

        }

    }
}