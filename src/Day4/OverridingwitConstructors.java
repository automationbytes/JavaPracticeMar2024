package Day4;

class Google1{
    String username;
    String locationlogged;

//    Google1(String username, String locationlogged){
//        this.username = username;
//        this.locationlogged = locationlogged;
//    }


    public Google1(String username, String locationlogged) {
        this.username = username;
        this.locationlogged = locationlogged;
    }

    void toDisplay(){
        System.out.println(this.username+" logged from the location "+this.locationlogged);
    }

}

class Youtube1 extends Google1{
    String channelName;

    Youtube1(String username, String locationlogged,String channelName){
        super(username, locationlogged);
        this.channelName = channelName;
    }

    void toDisplay(){
        super.toDisplay();
        System.out.println(this.channelName + " is my channel name");
    }
}

public class OverridingwitConstructors {
    public static void main(String[] args) {

        Youtube1 y = new Youtube1("Devlabsuser","India","SeleniumJava");
        y.toDisplay();

    }
}
