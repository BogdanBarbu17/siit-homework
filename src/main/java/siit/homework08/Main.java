package siit.homework08;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

    private static final Logger LOG = LogManager.getLogger(Main.class);

    public static void main(String[] args) {

        StudentRepo studentDataBase = new StudentRepo();

        studentDataBase.addStudent("John","Doe",2000,Gender.M,"1");
        studentDataBase.addStudent("Jane","Austen",2002,Gender.F,"2");
        studentDataBase.addStudent("Jane","Fonda",2002,Gender.F,"7");

        studentDataBase.printStudents();

        System.out.println();
        studentDataBase.deleteStudent("");

        studentDataBase.printStudents();

        System.out.println();
        studentDataBase.printStudentWithCertainAge(20);
        System.out.println(" ");


        studentDataBase.printStudentsByLastName();
        System.out.println();
        studentDataBase.printStudentsByDateOfBirth();






    }
}
