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
public class Email {
    
    private String username;
    private String server;
    
    public Email(){
        this.username = "username";
        this.server = "server.com";
    }
    
    public Email(String email){
        String[] emailParts = email.split("@");
        if (emailParts.length > 2) throw new IllegalArgumentException();
        else {
            this.username = emailParts[0];
            this.server = emailParts[1];
        }
    }
    
    @Override
    public String toString(){
        return this.username + "@" + this.server;
    }
    
    @Override
    public boolean equals(Object o){
        return (o instanceof Email) 
                && (this.username.equalsIgnoreCase(((Email)o).username))
                && (this.server.equalsIgnoreCase(((Email)o).server));
    }
    
    @Override
    public int hashCode(){
        return this.toString().toLowerCase().hashCode();
    }
}
