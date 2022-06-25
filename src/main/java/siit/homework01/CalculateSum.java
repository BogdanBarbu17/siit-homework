package siit.homework01;

public class CalculateSum {

    public static Integer sum(int a, int b){
        if(a>=b){
            return sum(b,a);
        }

        int sum = 0;
        for (; a<=b; a++){
            sum += a;
        }

        return (sum);

    }

}
