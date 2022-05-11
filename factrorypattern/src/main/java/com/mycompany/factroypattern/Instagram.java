package com.mycompany.factroypattern;


public class Instagram implements SocialMedia{

    @Override
    public void createAccount() {
        System.out.println("You have successfully created an Instagram Account!");
    }
    
}
