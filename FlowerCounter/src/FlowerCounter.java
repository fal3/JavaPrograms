import java.util.Scanner;


public class FlowerCounter {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int amount;
		int total;
		int currentFlower;
		String flower;
		String[] flowers = {"Petunia", "Pansy", "Rose", "Violet", "Carnation"};
		double[] cost = { 0.50, 0.75, 1.50, 0.50, 0.80};
		System.out.print("The names of the flowers are..");
		for(int i = 0; i < flowers.length; i++){
			System.out.print("," + flowers[i]);
		}
		System.out.print("Enter a flower name");
		flower = keyboard.next();
		System.out.print("Enter the number of flowers: ");
		amount = keyboard.nextInt();
		for(int j = 0; j < flowers.length; j++ ){
			if(flowers[j].equals(flower)){
				currentFlower = j;
			}
			
		}
		total = (int) (cost[currentFlower] * amount);

		
	}
	
}
