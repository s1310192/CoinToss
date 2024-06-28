import java.util.Random;
import java.util.Scanner;

public class Coin{
    int times;

    public Coin(int times){
        this.times = times;
    }
    public static void main(String[] args){
        (new Coin(3)).coinToss();
    }

    public void coinToss(){
        Random rand = new Random();
        int cnt = 0;
	String name;
	Scanner sc = new Scanner(System.in);

	System.out.println("Who are you?");
	name = sc.next();
	System.out.println("Hello, "+name+"!");
        
        System.out.println("Tossing a coin");

        for(int i = 0; i < this.times; i++){
            String coin = "Tails";
            if(rand.nextBoolean()){
                coin = "Heads";
                cnt++;
            }

            System.out.println("Round "+(i+1)+": "+coin);
        } 
        System.out.println("Heads: "+cnt+", Tails: "+(this.times-cnt));
    }
}
