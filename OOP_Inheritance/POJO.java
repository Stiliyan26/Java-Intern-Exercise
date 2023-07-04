package OOP_Inheritance;
public class POJO {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++){
            LPAStudent student = new LPAStudent("S92300" + i,
                    switch(i){
                        case 1 -> "Kiro";
                        case 2 -> "Mirko";
                        case 3 -> "Jozi";
                        case 4 -> "Peter";
                        case 5 -> "Hrisi";
                        default -> "Annonymous";
                    },
                    "05/11/2002",
                    "Java MasterClass");

            System.out.println(student);
        }
    }
}
