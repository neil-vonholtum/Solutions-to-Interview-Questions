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
			StringBuilder row = new StringBuilder(), bottom = new StringBuilder(), top = new StringBuilder();
			
			for(int i = 0; i < half; i++){
				
				row.append(' ');
			}
			
			row.append('*');
			
			for(int i = half; i < size; i++){
				
				row.append(' ');
			}
			
			row.append(System.lineSeparator());
			String flrow = row.toString();
			bottom.insert(0, flrow);
			top.append(flrow);
			
			for(int lesserx = half-1, greaterx = half+1; lesserx > 0; lesserx--, greaterx++){
			
				row.setCharAt(lesserx,  '*');
				row.setCharAt(greaterx, '*');
				String next = row.toString();
				bottom.insert(0, next);
				top.append(next);
			}
			
			row.setCharAt(0, '*');
			row.setCharAt(size-1, '*');
			System.out.println(top.append(row.toString()).append(bottom).toString());
		}
	}
}