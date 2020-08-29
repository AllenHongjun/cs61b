package intro2;

public class Dog {
    public int weightInPounds;
    public static String binomen = "Canis familiaries";

    public Dog(int w){
        weightInPounds = w;
    }

    public void makeNoise(){
        if (weightInPounds < 10){
            System.out.println("Yip!");
        }else if (weightInPounds < 30){
            System.out.println("bark.");
        }else {
            System.out.println("wooooof!");
        }
    }

    public static Dog maxDog(Dog d1, Dog d2){
        if (d1.weightInPounds > d2.weightInPounds){
            return d1;
        }
        return d2;
    }
}
