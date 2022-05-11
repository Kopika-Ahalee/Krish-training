package com.mycompany.factroypattern;

public class Twitter implements SocialMedia{

    @Override
    public void createAccount() {
       System.out.println("You have successfully created a Twitter Account!");
    }
    
}
