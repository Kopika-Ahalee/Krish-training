package com.mycompany.factroypattern;

import java.util.Scanner;

public class SocialmediaService {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your preference: FACEBOOK / INSTAGRAM / TWITTER / TIKTOK ");
        String input = sc.nextLine();
        
        SocialmediaFactory socialmediaFactory = new SocialmediaFactory();
        SocialMedia sm = socialmediaFactory.createSocialmedia(input);
        sm.createAccount();
    }
    
}
