package siit.homework12;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {


        String fileName = "inputFile.tnx";
        Integer requiredMonth = 8;
        String outFileName = "outFile.txt";

        PersonRepository personRepository = new PersonRepository();

        personRepository.readFile(fileName, requiredMonth, outFileName);


    }

}
