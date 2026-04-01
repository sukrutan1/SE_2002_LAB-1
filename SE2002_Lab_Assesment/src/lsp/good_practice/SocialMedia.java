public abstract class SocialMedia {
    public void chat(){ System.out.println("Chatting...");}
}

class Instagram extends SocialMedia implements StoryFeature{

    @Override
    public void postStory() { 
        System.out.println("Story posted!");
    }
}

class WhatsApp extends SocialMedia {
    
}