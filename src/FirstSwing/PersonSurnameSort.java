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
public class PersonSurnameSort implements Comparator<Person> {
    
    @Override
    public int compare(Person one, Person two){
        
        return one.getSurname().toString().concat(one.getName().toString()).
                compareTo(two.getSurname().toString().concat(two.getName().toString()));
    }
    
}
