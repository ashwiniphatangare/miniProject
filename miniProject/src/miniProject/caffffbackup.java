package miniProject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

interface Food {

	public String prepareFood();

	public double foodPrice();

}

class NonVegFood extends FoodDecorator {

	public NonVegFood(Food newFood) {
		super(newFood);

	}

	public String prepareFood() {
		return super.prepareFood() + " With Roasted Chiken and Chiken Curry  ";

	}

	public double foodPrice() {
		return super.foodPrice() + 150.0;

	}

}

class VegFood implements Food {

	public String prepareFood() {

		return "Veg Food";

	}

	public double foodPrice() {

		return 50.0;

	}

}

abstract class FoodDecorator implements Food

{
	private Food newFood;

	public FoodDecorator(Food newFood) {

		this.newFood = newFood;

	}

	@Override
	public String prepareFood() {
		return newFood.prepareFood();

	}

	public double foodPrice() {
		return newFood.foodPrice();

	}

}

class ChineeseFood extends FoodDecorator {

	public ChineeseFood(Food newFood) {
		super(newFood);

	}

	public String prepareFood() {
		return super.prepareFood() + " With Fried Rice and Manchurian  ";

	}

	public double foodPrice() {
		return super.foodPrice() + 65.0;

	}

}

public class cafemanagement {
	private static int choice;

	public static void main(String args[]) throws NumberFormatException, IOException {
		ArrayList<cafe> cafeArray=new ArrayList<cafe>();
		String ItemName;
		double price;
		int status1=1;
		Scanner sc1=new Scanner(System.in);

		while(status1==1) {

		System.out.print("==========================WELCOME IN AB'S Cafe===================== \n");
		System.out.print("                     1. Menu List of Our CAFE.....         \n");

		System.out.print("                     2. Add Item .....   \n");
		System.out.print("                     3. show Item.....\n");
		System.out.print("                     4. update Item.....         \n");
		System.out.print("                     5. Delete Item .....       \n");
		System.out.print("                     6. Exit.........                      \n");
		System.out.print("Enter your choice:        ");
		//BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc=new Scanner(System.in);
		//choice = Integer.parseInt(br1.readLine());
		choice = sc.nextInt();
		status1=1;
		switch (choice) {
		case 2:
		{
		
			System.out.println("Enter Item name:");
			ItemName = sc.next();
			System.out.println("Enter Item Price:");
			price = sc.nextInt();
			cafe c=new cafe();
			c.setItemName(ItemName);;
			c.setPrice(price);
			cafeArray.add(c);
			System.out.println("**....Item DETAILS IS ADDED SUCCESFULY.........**");
			break;
		}
		case 3:
			for(int i=0;i<cafeArray.size();i++) {
				System.out.println("name:  "+cafeArray.get(i).getItemName());
				System.out.println("price:   "+cafeArray.get(i).getPrice());
				//System.out.println("city:  "+cafeArray.get(i).getCity());
				//System.out.println("Degree:  "+cafeArray.get(i).getDegree());
				break;

			}
			break;
		case 4:
			
			System.out.println("***************************");
			System.out.println("enter item name,price to update");
			 ItemName=sc.next();
			int count2=0;
		
			for(int i=0;i<cafeArray.size();i++) {
				if(cafeArray.get(i).getItemName().contains(ItemName)) {
					System.out.println(" record"+(i+1));
					System.out.println("enter Item want to update");
					ItemName=sc.next();
					System.out.println("enter item price want to update");
					price=sc.nextInt();
					
					cafeArray.get(i).setItemName(ItemName);
					cafeArray.get(i).setPrice(price);
					count2++;
				}
				
			}
			if(count2==0) {
			System.out.println("no record");	
			}
			else {
				System.out.println("update done succesfully");
			}

			break;

			
		
		case 5:
			System.out.println("Enter Item name to delete");
			ItemName=sc.next();
			int search=0;
			for(int i=0;i<cafeArray.size();i++) {
				if(cafeArray.get(i).getItemName().contains(ItemName)) {
					System.out.println("Student Record:  "+(++search));
					cafeArray.remove(i);
					
				}
				
			}
			if(search==0){
				System.out.println("record not found");
			}
			else {
				System.out.println("record deleted succesfully......");

			}
		break;

	case 1:

			int status = 1;
			while (status == 1) {
				System.out.print("========= Food Menu ============ \n");
//				System.out.print("            1. Vegetarian Food.   \n");
//				System.out.print("            2. Non-Vegetarian Food.\n");
//				System.out.print("            3. Chineese Food.         \n");
//				System.out.print("            4. Exit                        \n");
//				System.out.print("            1. Vegetarian Food.   \n");

				System.out.print(" Vegetarian Food. \t Non-Vegetarian Food. \t Chineese Food.   ");
				
				System.out.println(" enter your choice...." );
				choice = sc.nextInt();
				switch (choice) {
				case 1:

				{
                    cafe[] c=new cafe[10];
                    int i;
                    int count=6;
                    for(i=0;i<10;i++)
                    	c[i]=new cafe();
					VegFood vf = new VegFood();

					System.out.println(vf.prepareFood());

					System.out.println(vf.foodPrice());

//				}
//					break;
//
//				case 2:
//
//				{

					Food f1 = new NonVegFood((Food) new VegFood());

					System.out.println(f1.prepareFood());

					System.out.println(f1.foodPrice());

//				}
//					break;
//
//				case 3:
//
//				{

					Food f2 = new ChineeseFood((Food) new VegFood());

					System.out.println(f2.prepareFood());

					System.out.println(f2.foodPrice());

				}
					break;

				
				
				}	System.out.println("return to back 1 for cafe menu");
				status=sc.nextInt();
		}
			
			
		}
		
//System.out.println("enter to exit 5");
//		
//		status1=sc1.nextInt();
	}
		
}
}