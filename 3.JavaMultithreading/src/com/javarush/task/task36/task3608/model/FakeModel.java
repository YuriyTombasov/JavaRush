/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javarush.task.task36.task3608.model;

import com.javarush.task.task36.task3608.bean.User;
import java.util.*;

/**
 *
 * @author tombasov_ya
 */
public class FakeModel implements Model{
    
    private ModelData modelData = new ModelData();

    @Override
    public ModelData getModelData() {
        return null;
    }

    @Override
    public void loadUsers() {
        
        List<User> users = new LinkedList<User>();
        users.add(new User("A", 1, 1));
        users.add(new User("B", 2, 1));
        users.add(new User("C", 3, 4));
        modelData.setUsers(users);
    }
    
}
