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

        Student pojoStudent = new Student("1dsad", "Ann",
                "05/11/1985", "Java Masterclass");

        LPAStudent recordStudent = new LPAStudent("asdac", "Bill",
                "05/12/2002", "Java Masterclass");

        System.out.println(pojoStudent);
        System.out.println(recordStudent);

        pojoStudent.setClassList(pojoStudent.getClassList() + ", Java OCP Exam 829");
//        recordStudent.classList(recordStudent.classList() + ", Java OCP Exam 829");

        System.out.println(pojoStudent.getName() + " is taking " + pojoStudent.getClassList());
        System.out.println(recordStudent.name() + " is taking " + recordStudent.classList());
    }
}
