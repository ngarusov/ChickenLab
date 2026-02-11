public class Chickens02 {
    public static void main(String[] args) {
        //Put your code here
        int numEggs = 0;
        double dailyAverage = 0;
        double monthlyAverage = 0;
        double monthlyProfit = 0 ;

        //Monday
        numEggs = 100;

        //Tuesday
        numEggs += 121;

        //Wednesday
        numEggs += 117;

        dailyAverage = numEggs / 3.0; // by using decimal showing how to  use

        monthlyAverage = dailyAverage * 30;

        monthlyProfit = monthlyAverage * 0.18;


        System.out.println("Daily Average:   " +dailyAverage);

        System.out.println("Monthly Average: " +monthlyAverage);

        System.out.println("Monthly Profit:  $" +monthlyProfit);

    }

}
