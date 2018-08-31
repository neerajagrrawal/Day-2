package com.capgemini.day2;

public class DeleteWord {

	public static String deleteTheWord(String find, int i) {
		//System.out.print("Input: ");
		//String find=br.readLine();
		String rem[]=find.split(" ") ;
		//System.out.println("write word to delete");
		//String find1=br.readLine();
		//System.out.println("write word position");
		int pos=i ;
		int ind=pos ;
		String sup="" ;
		for(int k=0;k<rem.length;k++)
		{
			if(k!=ind)
			sup+=rem[k]+" " ;
			//System.out.print(find); ;
		}


		return sup ;
	}

}
