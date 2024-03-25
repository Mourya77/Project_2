package com.example.login_register;

public class ReadWriteUserDetails {
    public String  dob, gender, mobile, profession;

    //Constructor
    public ReadWriteUserDetails(){};
    public ReadWriteUserDetails(String textDob, String textGender, String textMobile, String textProfession){
        this.dob = textDob;
        this.gender = textGender;
        this.mobile = textMobile;
        this.profession = textProfession;
    }
}
