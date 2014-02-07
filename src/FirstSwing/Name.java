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
public class Name {
    private String name;
    
    public Name(){
        this.name = "";
    }
    
    public Name(String name){
        this.name = name;
    }
    
    @Override
    public String toString(){
        return this.name;
    }
    
    @Override
    public boolean equals(Object o){
        return (o instanceof Name)
                && (this.name.equals(((Name)o).name));
    }
    
    @Override
    public int hashCode(){
        return this.name.hashCode();
    }
}
