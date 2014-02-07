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
public class Sex {
    
    private boolean sex;
    
    public Sex(){
        this.sex = true;
    }
    
    public Sex(String sex){
        switch (sex){
            case "male":
                this.sex = true;
                break;
            case "female":
                this.sex = false;
                break;
            default:
                throw new IllegalArgumentException();
        }
    }
    
    public Sex(boolean sex){
        this.sex = sex;
    }
    
    @Override
    public String toString(){
        if (this.sex) return "male";
        else return "female";
    }
    
    @Override
    public boolean equals(Object o){
        return (o instanceof Sex) && (this.sex == ((Sex)o).sex);
    }
    
    @Override
    public int hashCode(){
        if (this.sex) return 1;
        else return 0;
    }
}
