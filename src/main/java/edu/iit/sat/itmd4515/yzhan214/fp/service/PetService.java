/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.iit.sat.itmd4515.yzhan214.fp.service;

import edu.iit.sat.itmd4515.yzhan214.fp.domain.Pet;
import java.util.List;
import javax.ejb.Stateless;

/**
 *
 * @author ln1878
 */
@Stateless
public class PetService extends AbstractService<Pet>{

    public PetService() {
        super(Pet.class);
    }

    @Override
    public List<Pet> findAll() {
        return getEntityManager().createNamedQuery("Pet.findAll", Pet.class).getResultList();
    }

    @Override
    public Pet findByUsername(String username) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
