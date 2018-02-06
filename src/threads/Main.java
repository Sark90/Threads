package threads;

public class Main {

    public static void main(String[] args) {
        threads.ArrSum as = new threads.ArrSum();
        //ICountSum count = (op) ->
        threads.ArrOperations.count(as);
        //count.countSum(as);

        //count = (op) ->
        threads.ArrOperations.getOptimalThreadsNum(as);
        //count.countSum(as);
    }

}
