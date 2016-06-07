//Author: Neil VonHoltum

public class DiamondGenerator {

	public static void main (String[] args){
		
		printDiamond(21);
	}
	
	private static void printDiamond(int size){
		
		if(size < 3 || size%2 == 0){
			
			System.out.println("Not a diamond");
		}
		
		else{
			
			int half = size/2;
			char[][] dirows = new char[half+1][size];
			char[] prev = new char[size];
			
			for(int i = 0; i < size; i++){
				
				prev[i] = ' ';
			}
			
			//create and print lower half of diamond including the horizontal center
			for(int yandlowerx = half, upperx = half; yandlowerx >= 0; yandlowerx--, upperx++){
				
				dirows[yandlowerx] = prev.clone();
				dirows[yandlowerx][upperx] = dirows[yandlowerx][yandlowerx] = '*';
				System.out.println(prev = dirows[yandlowerx]);
			}
			
			//print previously created half of diamond in reverse excluding the horizontal center
			for(int y = 1; y <= half; y++){
				
				System.out.println(dirows[y]);
			}
		}
	}
}