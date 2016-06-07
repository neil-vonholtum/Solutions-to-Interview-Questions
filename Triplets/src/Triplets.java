//Author: Neil VonHoltum

public class Triplets {
	
	public static void main (String[] args){
	
		int[] distints = {5, 1, 3, 4, 7};
		System.out.println(counter(distints, 12));
	}

	public static int counter(int[] arr, int sum){
		
		int count = 0;
		
		for(int first = 0; first < arr.length - 2; first++){
			
			int triplet = arr[first];
			
			for(int second = first+1; second < arr.length - 1; second++){
				
				triplet += arr[second];
				
				for(int third = second+1; third < arr.length; third++){
					
					if(triplet + arr[third] < sum){
						
						count++;
					}
				}
			}
		}
		
		return count;
	}
}
