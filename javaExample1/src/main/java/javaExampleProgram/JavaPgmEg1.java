package javaExampleProgram;


public class JavaPgmEg1 {
	public static int personDetails(int age){
		
		String place="abc";
		 String name="anu";
		System.out.println("name : "+name);
		System.out.println("place : "+place);
		System.out.println("age : "+age);
		return age;
		}
		public static void addressDetails(){
			JavaPgmEg1.personDetails(25);
			String housename="def";
			String dist="kollam";
			int pin=567456;
			String state= "kerala";
			
			System.out.println("housename:  "+housename);
			System.out.println("district :  "+dist);
			System.out.println("Pin Code:  "+pin);
			System.out.println("state:  "+state);
		}
		
		
		public static void main(String args[]){
			System.out.println("Details");
		addressDetails();
		
	}
	}	



