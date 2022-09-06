package facade;

public class Twitter implements SocialShare {
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public void share() {

    }

    public void shere() {
        System.out.println("Sharing to Twitter:" + this.message);
    }
}

