package com.mahmud.fahim.zaarapp.authentication;

import java.util.Date;

/**
 * Created by fahim on 2017-09-03.
 */

public class User {

    private Long userId;
    private String firstName;
    private String lastName;
    private String userName;
    private String facebookId;
    private Date dateOfBirth;
    private int gender;

    public Long getUserId(){
        return userId;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getUserName(){
        return userName;
    }

    public void setUserName(String userName){
        this.userName = userName;
    }

    public String getFacebookId() {
        return facebookId;
    }

    public void setFacebookId(String fbId){
        facebookId=fbId;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dob){
        dateOfBirth = dob;
    }

    public int getGender(){
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }


}
