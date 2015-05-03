/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.iit.sat.itmd4515.yzhan214.fp.service;

import edu.iit.sat.itmd4515.yzhan214.fp.domain.PetOwner;
import java.util.List;
import javax.ejb.Stateless;

/**
 *
 * @author ln1878
 */
@Stateless
public class PetOwnerService extends AbstractService<PetOwner>{

    public PetOwnerService() {
        super(PetOwner.class);
    }

    @Override
    public List<PetOwner> findAll() {
        return getEntityManager().createNamedQuery("PetOwner.findAll", PetOwner.class).getResultList();
    }

    @Override
    public PetOwner findByUsername(String username) {
        return getEntityManager().createNamedQuery("PetOwner.findByUsername", PetOwner.class).setParameter("username", username).getSingleResult();
    }
    
}
