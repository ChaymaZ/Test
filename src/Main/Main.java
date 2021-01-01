package Main;

import java.util.ArrayList;

import Class.Employee;

public class Main {
	
	////////////QUESTION1
public boolean Rotation(String s1,String s2){
	////vérifier si les chaines null ou pas et de la même  longueur
		if(s1==null||s2==null||s1.length()!=s2.length())
			return false;
		if(s1.equals("")&&s2.equals(""))
			return true;
		String s1s1=s1+s1;
		return isSubstring(s1s1,s2);
	}

	private boolean isSubstring(String s1s1, String s2) {
		int len=s2.length();
		for(int i=0;i<len;i++){
			///Renvoie une séquence de caractères qui est une sous-séquence de cette séquence
			if(s1s1.subSequence(i, i+len).equals(s2))
				return true;			
		}
		return false;
	}
	


	public static void main(String[] args) {
		////////////////QUESTION2
	  	Main so = new Main();
		String s1="waterbottle";
		String s2="erbottlewat";
		String s3="waterbottle";
		String s4="brbovtlewat";
		System.out.println(so.Rotation(s1, s2));
		System.out.println(so.Rotation(s3, s4));

		
		///////////Question2
		//////////Sorting and Searching
		 // Créer un ArrayList<integer>
	     ArrayList<Integer> arraylist = new ArrayList<Integer>();
	 
	     //Remplir  l'ArrayList avec des entiers
	     arraylist.add(2);
	     arraylist.add(5);
	     arraylist.add(90);
	     arraylist.add(1);
	     arraylist.add(6);
	     arraylist.add(8);
	     arraylist.add(11);

	     
	     System.out.println(" la position de l'élément "+arraylist.get(1)+" :"+arraylist.indexOf(5));
	     System.out.println(" la position de l'élément 90 :"+arraylist.indexOf(90));


	    
		

	}
}