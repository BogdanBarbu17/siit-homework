package siit.homework02;

public class AlgorithmMain {
    public static void main(String[] args) {

        SalesRepresentative[] reps = new SalesRepresentative[5];
        reps[0] = new SalesRepresentative("rep1", 7, 800, 0);
        reps[1] = new SalesRepresentative("rep2", 10, 700, 0);
        reps[2] = new SalesRepresentative("rep3", 5, 600, 0);
        reps[3] = new SalesRepresentative("rep4", 2, 900, 0);
        reps[4] = new SalesRepresentative("rep5", 9, 300, 0);


        System.out.println(" ");
        System.out.println("==== Representatives before revenue calculations ====");
        for (SalesRepresentative salesRepresentative : reps) {
            System.out.println(salesRepresentative);
        }

        Sort.calculateRevenue(reps);

        System.out.println(" ");
        System.out.println("==== Unsorted representatives ====");
        for (SalesRepresentative salesRepresentative : reps) {
            System.out.println(salesRepresentative);
        }

        SalesRepresentative [] sortedReps = Sort.bubbleSort(reps);

        System.out.println(" ");
        System.out.println("==== Sorted representatives ====");
        for (SalesRepresentative salesRepresentative : sortedReps) {
            System.out.println(salesRepresentative);
        }

    }

}
