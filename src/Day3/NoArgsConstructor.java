package Day3;

public class NoArgsConstructor {
    String name;

    public NoArgsConstructor(){
        this.name = "Java";
    }

    public static void main(String[] args) {
        NoArgsConstructor n = new NoArgsConstructor();
        System.out.println(n.name);
    }
}
