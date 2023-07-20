import java.io.Serializable;

public class Home implements Serializable {
    public String home;

    public Home(String home) {
        this.home = home;
    }

    public String getHome(){
        return home;
    }
}
