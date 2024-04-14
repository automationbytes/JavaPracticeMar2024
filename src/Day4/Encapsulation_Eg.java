package Day4;

class Std{
    private String CollegeName = "Devlabs Univ";

    public String getCollegeName() {
        return CollegeName;
    }
//
//    public void setCollegeName(String collegeName) {
//        CollegeName = collegeName;
//    }
}

public class Encapsulation_Eg {
    public static void main(String[] args) {
        Std d = new Std();
       // d.setCollegeName("Devops University");
        System.out.println(d.getCollegeName());
       // System.out.println(d.CollegeName);
    }
}
