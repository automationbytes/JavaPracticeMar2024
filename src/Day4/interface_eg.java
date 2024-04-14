package Day4;

interface mobile{
    void call();
    void sms();
}

interface camera{
    void photo();
}


class apple implements mobile,camera{

    @Override
    public void call() {
        System.out.println("Apple's call");
    }

    @Override
    public void sms() {
        System.out.println("Apple's sms");
    }

    @Override
    public void photo() {
        System.out.println("Apple's photo");
    }
}

class samsung implements mobile{

    @Override
    public void call() {
        System.out.println("Samsung call");
    }

    @Override
    public void sms() {
        System.out.println("Samsung sms");
    }
}
public class interface_eg {
    public static void main(String[] args) {

        apple a = new apple();
        a.call();
        a.sms();

        samsung s = new samsung();
        s.call();
        s.sms();
    }

}
