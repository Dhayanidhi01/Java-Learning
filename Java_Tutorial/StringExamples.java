package Java_Tutorial;

public class StringExamples {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "Dhayanidhi";
		int number=3;
		
		
		System.out.println(name.charAt(2));
		
		System.out.println(name.codePointAt(2));
		
		System.out.println(name.codePointBefore(1));
		
		System.out.println(name.codePointCount(1, 5));
		
		System.out.println(name.concat("A"));
		
		System.out.println(name.length());
		
		
		System.out.println(name.equals("Dhayanidh"));
		
		System.out.println(name.equalsIgnoreCase("DHAYANIDHI"));
	
       System.out.println(name.isEmpty());
       
       System.out.println(name.indexOf("n"));
       
       System.out.println(name.substring(5));
       
       System.out.println(name.substring(1, 5));
       
       System.out.println(name.replace("a", "A"));
       
       System.out.println(name.replaceAll(name, "This is my name"));
	}
}
