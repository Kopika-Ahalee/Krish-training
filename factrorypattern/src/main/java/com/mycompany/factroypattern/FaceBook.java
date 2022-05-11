package com.mycompany.factroypattern;

public class FaceBook implements SocialMedia{

    @Override
    public void createAccount() {
        System.out.println("You have successfully created a Facebook Account!");
    }
    
}
