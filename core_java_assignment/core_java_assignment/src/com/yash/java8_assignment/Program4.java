package com.yash.java8_assignment;

@FunctionalInterface
interface StringIndex{
    String stringIndex(String str1,String str2,int index);
}

public class Program4 {
	
private static String result;
	
	public static void main(String[] args) {
		
		 StringIndex obj = (str1,str2,index) ->{
			 result = new String();
			 
			 for (int i = 0; i < str1.length(); i++) {
		         result += str1.charAt(i);
		         if (i == index) {
		            result += str2;
		         }
		      }
			return result;

			};
			
			result = null;
			String str1="PBhavsar";
			String str2="riyanka";
			 int index = 0;
			 
			 System.out.println(obj.stringIndex(str1,str2, index));
			 
			 System.gc();
	}
	
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		//super.finalize();
		System.out.println(this.result + "success!");
	}


}
