package siit.homework02;

public class Sort {

    /***
     * calculates revenue for representatives
     * @param reps sales representatives to be calculate revenue for
     */
    public static void calculateRevenue(SalesRepresentative[] reps){
        int revenue;
        for (int i = 0; i < reps.length; i++){
            revenue = reps[i].getSales() * reps[i].getQuota();
            reps[i].setRevenue( revenue);
        }
    }


    /***
     * sort sales representatives in descending order by revenue amount
     * @param reps sales representatives to be sorted
     * @return sorted representatives
     */
    public static SalesRepresentative[] bubbleSort(SalesRepresentative[] reps){
        for (int i = 0; i < reps.length - 1; i++){
            for (int j = 0; j < reps.length - i - 1; j ++){
                if ((reps[j].getRevenue()) < (reps[j + 1].getRevenue())){
                    SalesRepresentative temp = reps[j];
                    reps[j] = reps[j + 1];
                    reps[j + 1] = temp;
                }
            }
        }
        return reps;
    }

}
