package facade;

public class LinkedIn implements SocialShare {
    private String message;

    @Override
    public void share() {
        System.out.println("Sharing to Facebook:" + this.message);
    }

    @Override
    public void setMessage(String message) {
        this.message = message;
    }
}