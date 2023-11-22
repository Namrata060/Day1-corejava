package practice;

public class Test2 {
	
	public static void main(String[]args) {
		int vCount=0;
		String str ="Angul is my native place";
		
		str=str.toLowerCase();
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
				
				vCount++;
			}
		}
		
		System.out.println("Numbers of vowels are:"+ vCount);
	}
		

	

}
