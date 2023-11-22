package practice;

public class Test1 {
	
	public static void main(String[]args) {
		String s="Angul is my native place";
		int count=0;
		
		for(int i=0;i<s.length();i++) {
		if(s.charAt(i)!=' ')
				count++;
			
			
		}
		System.out.println("Total number of characters in the string are: "+ count);
		
	}

}
