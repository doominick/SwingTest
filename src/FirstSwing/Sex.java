/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package FirstSwing;

import java.lang.IllegalArgumentException;

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
}
