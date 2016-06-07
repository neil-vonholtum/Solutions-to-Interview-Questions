import java.util.Arrays;

//Author: Neil VonHoltum

public class ZigZagInts {
	
	public static void main(String[] args){
		
		int[] inarr = {1, 4, 3, 2};
		System.out.println(Arrays.toString(zigZag(inarr)));
	}

	public static int[] zigZag(int [] input){
		
		for(int left = 0, right = 1; right < input.length; left++, right++){
			
			if(input[left] > input[right]){
				
				int greater = input[left];
				input[left] = input[right];
				input[right] = greater;
			}
			
			if(++right < input.length && input[++left] < input[right]){
				
				int lesser = input[left];
				input[left] = input[right];
				input[right] = lesser;
			}
		}
		
		return input;
	}
}
