/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.iit.sat.itmd4515.yzhan214.fp.service;

import edu.iit.sat.itmd4515.yzhan214.fp.domain.security.Group;
import java.util.List;
import javax.ejb.Stateless;

/**
 *
 * @author ln1878
 */
@Stateless
public class GroupService extends AbstractService<Group> {

    public GroupService() {
        super(Group.class);
    }

    @Override
    public List<Group> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Group findByUsername(String username) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
