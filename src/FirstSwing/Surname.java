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
public class Surname {

    private String surname;
    
    Surname(){
        this.surname = "";
    }
    
    Surname(String surname){
        this.surname = surname;
    }
    
    @Override
    public String toString(){
        return this.surname;
    }
    
    @Override
    public boolean equals(Object o){
        return (o instanceof Surname)
                && (this.surname.equals(((Surname)o).surname));
    }
    
    @Override
    public int hashCode(){
        return this.surname.hashCode();
    }
}
