package assignments;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Assignment4_ArrayAndCollections {

	public static void main(String[] args) {
		//1. Create Lists with area of top 5 largest cities. Print the total area of the 3rd and 4th cities combined.

		ArrayList<String> largestcities=new ArrayList<String>();
		largestcities.add("Mumbai");
		largestcities.add("Delhi");
		largestcities.add("Bengaluru");
		largestcities.add("Hyderabad");
		largestcities.add("Ahmedabad");

		int[] AreaofCity= new int[5];

		AreaofCity[0]=12442373;
		AreaofCity[1]=11034555;
		AreaofCity[2]=8443675;
		AreaofCity[3]=6993262;
		AreaofCity[4]=5577940;

		int AreaofcombinedCities=AreaofCity[2]+AreaofCity[3];
		System.out.println("Total Area of 3rd & 4th Combined cities " +AreaofcombinedCities);

		//2. Create a set of the top 10 most visited tourist attractions in the world and print out all of them and its size.
		Set<String> touristAttractions = new HashSet<String>();
		touristAttractions.add("Statue of Unity");
		touristAttractions.add("Statue of Liberty ");
		touristAttractions.add(" Taj Mahal");
		touristAttractions.add(" Effil Tower");
		touristAttractions.add("Great wall of China");
		touristAttractions.add("Vatican Museum ");
		touristAttractions.add("Disney Land");
		touristAttractions.add(" Niagara waterfalls");
		touristAttractions.add(" Collosseum");
		touristAttractions.add(" machu pichu");

		System.out.println("Number of Tourist Attractions: " + touristAttractions.size());
		System.out.println(touristAttractions);

		//3. Create an array of 10 numbers (any 10 numbers) and print out the Average of 5th and 6th Value.
		
		int[] Numbers= {10,20,30,40,50,60,70,80,90,100};
		int Avg1=Numbers[4];//50
		int Avg2=Numbers[5];//60
		double Avg=(Avg1+Avg2)/2;
		System.out.println("Average of 5th & 6th Value is "+Avg);
		
		//4 Create a list of the top 5 highest-grossing movies of all time and print out the third movie on the list.
		
	     List<String> highestGrossingMovies = new ArrayList<>();
	        highestGrossingMovies.add("pushpa");
	        highestGrossingMovies.add("war2");
	        highestGrossingMovies.add("coolie");
	        highestGrossingMovies.add("pushpa");
	        highestGrossingMovies.add("Bahubali");
	        System.out.println("3rd Highest-Grossing Movie: " + highestGrossingMovies.get(2));

	}

}
