/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package FirstSwing;

import java.util.Comparator;

/**
 *
 * @author Dominik
 */
public class PersonNameSort implements Comparator<Person> {
    
    @Override
    public int compare(Person one, Person two){
        return one.getName().toString().compareTo(two.getName().toString());
    }
}
