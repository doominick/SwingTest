/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package FirstSwing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Dominik
 */
public class PersonDB {
    
    private List<Person> personDatabase;
    
    public PersonDB(){
        this.personDatabase = new ArrayList<Person>();
    }
    
    public void addPerson(Person person){
        this.personDatabase.add(person);
    }
    
    public void removePerson(Person person){
        this.personDatabase.remove(person);
    }
    
    public void sortByName(){
        PersonNameSort ns = new PersonNameSort();
        Collections.sort(personDatabase, ns);
    }
    
    public void sortBySurname(){
        PersonSurnameSort ss = new PersonSurnameSort();
        Collections.sort(personDatabase, ss);
    }
    
    public void sortByEmail(){
        PersonEmailSort es = new PersonEmailSort();
        Collections.sort(personDatabase, es);
    }
    
    public int getSize(){
        return this.personDatabase.size();
    }
    
    public Person getPerson(int index){
        return this.personDatabase.get(index);
    }
}