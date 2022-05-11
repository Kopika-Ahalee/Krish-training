package com.mycompany.factroypattern;

public class SocialmediaFactory {
    public SocialMedia createSocialmedia(String media){
        if(media == null || media.isEmpty())
            return null;
            switch(media){
                case "FACEBOOK":
                    return new FaceBook();
                case "INSTAGRAM":
                    return new Instagram();    
                case "TWITTER":
                    return new Twitter();
                case "TIKTOK":
                    return new TikTok();
                default:
                    throw new IllegalArgumentException("Unknown media " + media);
            }   
    }
}
