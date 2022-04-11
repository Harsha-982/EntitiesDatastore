package com.example.NextTrail;

import javax.jdo.annotations.*;

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class Entries {
    @Persistent
    private String Firstname;
    @Persistent
    private String Lastname;

    public Entries(){

    }
    public Entries(String Firstname, String Lastname){
        this.Firstname=Firstname;
        this.Lastname=Lastname;
    }
    public void setFirstname(String Firstname){
        this.Firstname=Firstname;
    }
    public String getFirstname(){
        return Firstname;
    }
    public void setLastname(){
        this.Lastname=Lastname;
    }
    public String getLastname(String Lastname){
        return Lastname;
    }
}
