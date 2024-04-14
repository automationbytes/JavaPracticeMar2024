package Day4;

class Google{
    void LoginPage(){
        System.out.println("Google Sign Page");
    }

    void HomePage(){
        System.out.println("Google Home Page");
    }
}

class Youtube extends Google{

   // @Override
    void HomePage(){
        System.out.println("Youtube Home Page");
    }
}

public class Overriding2 {
    public static void main(String[] args) {

        Youtube y = new Youtube();
        y.HomePage();
        y.LoginPage();
    }
}
