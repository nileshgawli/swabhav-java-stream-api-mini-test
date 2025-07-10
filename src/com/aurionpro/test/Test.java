package com.aurionpro.test;

import java.util.List;

import com.aurionpro.model.DistinctWordCount;
import com.aurionpro.model.Employee;
import com.aurionpro.model.EvenSquares;
import com.aurionpro.model.FirstNonRepeatingCharacter;
import com.aurionpro.model.FlattenAlphabetise;
import com.aurionpro.model.MapVsFlatmap;
import com.aurionpro.model.Tx;

public class Test {
	public static void main(String[] args) {
		/*
		 * 1 Even Squares
		 */
		System.out.println("---------------------------------");
		System.out.println("1. Even Squares: ");
		List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		System.out.println(EvenSquares.squareOfEvenNo(numbers));

		/*
		 * 2 Case Sensitive Distinct Word Count
		 */
		System.out.println("---------------------------------");
		System.out.println("2. Case Sensitive Distinct Word Count: ");
		List<String> words = List.of("Apple", "Banana", "cherry", "orange", "Cherry", "OranGe", "Orange");
		System.out.println(DistinctWordCount.distinctCount(words));

		/*
		 * 3 Average Salary per Department (Medium)
		 */
		System.out.println("---------------------------------");
		System.out.println("3. Average Salary per Department: ");
		List<Employee> staff = List.of(new Employee(1, "Nilesh", "Transit", 80000),
				new Employee(2, "Rohit", "Lending", 50000), new Employee(3, "Virat", "Transaction Banking", 20000),
				new Employee(4, "Shreyas", "Captive", 10000), new Employee(5, "Hardik", "Captive", 20000),
				new Employee(6, "Rishabh", "Transaction Banking", 60000), new Employee(7, "Bumrah", "Transit", 75000),
				new Employee(8, "Bhuvi", "Lending", 70000));

		System.out.println(Employee.averageSalaryByDept(staff));

		/*
		 * 4 Flatten & Alphabetise
		 */

		System.out.println("---------------------------------");
		System.out.println("4. Flatten & Alphabetise:");
		List<List<String>> nested = List.of(List.of("Nilesh", "Rohit", "Virat", " "),
				List.of("Sachin", "Sehwag", "", "Kaif"), List.of("Gill", "           "));
		System.out.println(FlattenAlphabetise.flattenAndSort(nested));

		/*
		 * 5 First Non-Repeating Character
		 */
		System.out.println("---------------------------------");
		System.out.println("5. First Non-Repeating Character: ");
		System.out.println(FirstNonRepeatingCharacter.firstUnique("Transaction").toString());

		/*
		 * 6 Top Traders by Year
		 */
		System.out.println("---------------------------------");
		System.out.println("6. Top Traders by year: ");
		List<Tx> txs = List.of(new Tx(2021, "Nilesh", 5000), new Tx(2021, "Rohit", 2000), new Tx(2021, "Virat", 2500),
				new Tx(2021, "Shreyas", 1000), new Tx(2022, "Nilesh", 1000), new Tx(2022, "Virat", 2200),
				new Tx(2022, "Shreyas", 7000), new Tx(2022, "Rohit", 12000), new Tx(2023, "Nilesh", 15000),
				new Tx(2023, "Virat", 5500), new Tx(2023, "Shreyas", 1000));

		System.out.println(Tx.topTraders(txs));

		/*
		 * 8 map vs flatmap demonstration
		 */

		System.out.println("---------------------------------");
		System.out.println("8. Map vs Flatmap Demonstration:");
		System.out.println("---------------------------------");

		List<String> demo = List.of("Adults can grow", "Weakness is a potential asset", "Error is an opportunity");
		System.out.println("FlatMap: ");
		System.out.println(MapVsFlatmap.allUniqueSortedWords(demo));
		System.out.println("---------------------------------");
		System.out.println("Map:");
		System.out.println(MapVsFlatmap.wordsBySentence(demo));

	}
}
