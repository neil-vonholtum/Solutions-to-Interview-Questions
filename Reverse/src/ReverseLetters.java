//Author: Neil VonHoltum


public class ReverseLetters {
	
	public static void main (String args[]){
		
		System.out.println(reverse("a,b$c"));
	}
	
	public static String reverse(String str){
		
		char[] arr = str.toCharArray();
		
		for(int left = 0, right = arr.length - 1; left < right; left++, right--){
			
			while(!Character.isLetter(arr[left])){
				
				left++;
			}
			
			while(!Character.isLetter(arr[right])){
				
				right--;
			}
				
			char leftchar = arr[left];
			arr[left] = arr[right];
			arr[right] = leftchar;
		}
		
		return String.valueOf(arr);	
	}
}
