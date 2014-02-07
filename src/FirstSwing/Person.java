/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package FirstSwing;

/**
 *
 * @author Dominik
 */
public class Person {
    
    private Name name;
    private Surname surname;
    private Sex sex;
    private Email email;
    
    public Person(){
        this.name = new Name();
        this.surname = new Surname();
        this.sex = new Sex();
        this.email = new Email();
    }
    
    public Person(String name, String surname, String sex, String email){
        this.name = new Name(name);
        this.surname = new Surname(surname);
        this.sex = new Sex(sex);
        this.email = new Email(email);
    }
    
    public Person(String name, String surname, boolean sex, String email){
        this.name = new Name(name);
        this.surname = new Surname(surname);
        this.sex = new Sex(sex);
        this.email = new Email(email);
    }
    
    
}
