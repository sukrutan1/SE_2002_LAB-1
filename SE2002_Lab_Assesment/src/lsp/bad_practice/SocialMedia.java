public abstract class SocialMedia {
    public abstract void chat();
    public abstract void postStory();
}

class Instagram extends SocialMedia {
    public void chat() { System.out.println("Chatting..."); }
    public void postStory() { System.out.println("Story posted!"); }
}

class WhatsApp extends SocialMedia {
    public void chat() { System.out.println("Chatting..."); }
    
    @Override
    public void postStory() {
        // Violation: WhatsApp doesn't have public stories like IG, breaking the contract.
        throw new UnsupportedOperationException("WhatsApp doesn't support public stories!");
    }
}