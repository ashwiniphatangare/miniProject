package miniProject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//class food {
//
//	String ItemName;
//	double price;
//
//	public void info() {
//		System.out.println(ItemName + "\t" + price);
//	}
//}

public class cafemanagement {
	private static int choice;

	public static void main(String args[]) throws NumberFormatException, IOException {
		ArrayList<cafe> cafeArray = new ArrayList<cafe>();
		String ItemName;
		double price;
		int status1 = 1;
		Scanner sc1 = new Scanner(System.in);

		while (status1 == 1) {

			System.out.print("*********************(WELCOME IN AB'S Cafe)*************************\n");

			System.out.print("                     1. Menu List of Our CAFE.....         \n");
			System.out.print("                     2. Add Item in our Cafe Menu.....   \n");
			System.out.print("                     3. show Recentle added Item of Cafe Menu.....\n");
			System.out.print("                     4. update Item Price and Menu Item.....         \n");
			System.out.print("                     5. Delete Item from Menu.....       \n");
			System.out.print("                     6. Exit .........                      \n");

			System.out.println("*********************************************************************");

			System.out.print("Enter your choice:    ");
			Scanner sc = new Scanner(System.in);
			choice = sc.nextInt();
			status1 = 1;
			switch (choice) {
			case 2: {

				System.out.println("Enter Item name:");
				ItemName = sc.next();
				System.out.println("Enter Item Price:");
				price = sc.nextInt();
				cafe c = new cafe();
				c.setItemName(ItemName);

				c.setPrice(price);
				cafeArray.add(c);
				System.out.println("**....Item DETAILS IS ADDED SUCCESFULY.........**");
				break;
			}
			case 3:
				for (int i = 0; i < cafeArray.size(); i++) {
					System.out.println("Item Name  " + "\t" + "Price of Item  ");

					System.out
							.println(cafeArray.get(i).getItemName() + "                " + cafeArray.get(i).getPrice());
					break;

				}
				break;
			case 4:

				System.out.println("***************************");
				System.out.println("enter item name,price to update");
				ItemName = sc.next();
				int count2 = 0;

				for (int i = 0; i < cafeArray.size(); i++) {
					if (cafeArray.get(i).getItemName().contains(ItemName)) {
						System.out.println(" record" + (i + 1));
						System.out.println("enter Item want to update");
						ItemName = sc.next();
						System.out.println("enter item price want to update");
						price = sc.nextInt();

						cafeArray.get(i).setItemName(ItemName);
						cafeArray.get(i).setPrice(price);
						count2++;
					}

				}
				if (count2 == 0) {
					System.out.println("no record");
				} else {
					System.out.println("update done succesfully");
				}

				break;

			case 5:
				System.out.println("Enter name to delete");
				ItemName=sc.next();
				int search=0;
				for(int i=0;i<cafeArray.size();i++) {
					if(cafeArray.get(i).getItemName().contains(ItemName)) {
						System.out.println(" Record:  "+(++search));
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
				cafe[] c = new cafe[100];
				int i;
				int count = 6;
				for (i = 0; i < 10; i++)
					c[i] = new cafe();
				c[0].ItemName = "   brownie                      ";
				c[0].price = 50.0;
				c[1].ItemName = "   Burger                       ";
				c[1].price = 250.0;
				c[2].ItemName = "   Choco Craze Speciality       ";
				c[2].price = 800.0;
				c[3].ItemName = "   Chocolicks                   ";
				c[3].price = 100.0;
				c[4].ItemName = "   Fries                        ";
				c[4].price = 40.0;
				c[5].ItemName = "   Frolick with Iceceames       ";
				c[5].price = 90.0;
				c[6].ItemName = "   Frolick                      ";
				c[6].price = 70.0;
				Scanner s = new Scanner(System.in);

				System.out.println("*******************************************************************\n");
				System.out.println("                          Food Menu                                  ");
				System.out.println("----------------------------------------------------------------- \n");
				System.out.println("\tItem Name                      \t Price.");
				System.out.println("------------------------------------------------------------------ \n");

				for (int j = 0; j < count; j++) {
					c[j].info();

				}
//				System.out.print("Enter 1 for search Item By name and Enter 2 for to see price wise Menu        ");
//
//				choice = sc.nextInt();
//				status1 = 1;
//				switch (choice) {
//				case 1: {
//					System.out.println("search Item By name\n");
//					
//
//				}
//				case 2: 
//				{
//					System.out.println("Sorting of Price\n");
//
//				}
//				}
//						System.out.println("return to back 1 for cafe menu");
//						status = sc.nextInt();

			}

		}
	}
}