import java.util.HashSet;
import java.util.TreeSet;


public class TestEBook {

	public static void main(String[] args) {
		
		// Making an object of EBook and saving it in a Hashset:
		
		HashSet<EBook> hs= new HashSet<EBook>();
		EBook theDemolishedMan1 = new EBook("The Demolished Man", "Alfred Bester", 1953);
		hs.add(theDemolishedMan1);
		
		//Making another EBook with same characteristics and looking if our Hashset
		//recognize that the EBook is already there.
		EBook theDemolishedMan2 = new EBook("The Demolished Man", "Alfred Bester", 1953);
		

		System.out.println("Does our Hashset has already the Book?" 
		+ "   " +  hs.contains((EBook)theDemolishedMan2));
		
		// making a Treeset 
		
		TreeSet<EBook> treeset = new TreeSet<EBook>();
		
		System.out.println("If out two books are equal the answer should be zero : " 
		+ theDemolishedMan1.compareTo(theDemolishedMan2));
		
		//adding same book threetime:
		treeset.add(theDemolishedMan1);
		treeset.add(theDemolishedMan2);
		treeset.add(theDemolishedMan2);
		
		System.out.println("size of treeset (should be one): " +  treeset.size());
		
		for(EBook ebook: treeset ){
		System.out.println(ebook);
		}
		
		

	}

}
