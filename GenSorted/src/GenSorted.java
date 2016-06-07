import java.util.LinkedList;

//Author: Neil VonHoltum

public class GenSorted {

	static int[] aarr, barr;
	
	public static void main(String[] args){
		
		int[] fora = {10, 15, 25};
		int[] forb = {1, 5, 20, 30};
		aarr = fora;
		barr = forb;
		genarrs(new LinkedList<Integer>(), -1, -1, 0, aarr[0] - 1);
	}
	
	public static void genarrs(LinkedList<Integer> intlst, int lastaind, int lastbind, int lasta, int lastb){
		
		int localbind = lastbind;
		
		while(++lastaind < aarr.length){
		
			if(aarr[lastaind] > lastb){
				
				do{
				
					lasta = aarr[lastaind];
					
					while(++localbind < barr.length){
						
						if(barr[localbind] > lasta){
							
							do{
							
								lastb = barr[localbind];
								LinkedList<Integer> nintlst = new LinkedList<Integer>(intlst);
								nintlst.add(lasta);
								nintlst.add(lastb);
								System.out.println(nintlst);
								genarrs(nintlst, lastaind, localbind, lasta, lastb);
								
							} while(++localbind < barr.length);
						}
					}
					
					localbind = lastbind;
					
				}while(++lastaind < aarr.length);
			}
		}
	}
}
