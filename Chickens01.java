public class Chickens01 {
    public static void main(String[] args) {
        //Put your code here
        int totalEggs = 0;
        int eggsPerChicken = 5;
        int chickenCount = 3;

        //Monday
        totalEggs = countEggs(eggsPerChicken,chickenCount);
        System.out.println(totalEggs);

        // Tuesday
        ++chickenCount;  // Incremented chickenCount
        totalEggs += countEggs(eggsPerChicken,chickenCount);
        System.out.println(totalEggs);

        // Wednesday
        chickenCount /= 2;
        totalEggs += countEggs(eggsPerChicken,chickenCount);

        System.out.println("Total Eggs:" + totalEggs);



    }
    // Calculates totalEggs
    public static int /*<-return type*/ countEggs(int eggsPerChicken, int chickenCount){
        return eggsPerChicken * chickenCount;
    }
}
