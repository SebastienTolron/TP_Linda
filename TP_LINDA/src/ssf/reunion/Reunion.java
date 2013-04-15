package ssf.reunion;

import java.util.Calendar;
import java.util.Date;

public class Reunion {

/**
* TP 1 Introduction a larchitecture Linda
* @author Sebastien Tolron sebastien.tolron@etu.univ-savoie.fr>
* @author Samuel De Francesco <samuel.defrancesco@etu.univ-savoie.fr>
* @author François Profizi <francois.profizi@etu.univ-savoie.fr>
*/


	public void testTS(){
		
		System.out.println("== Début du jeu de tests ==");
		
		TupleSpace tuples = new TupleSpace();
		Tuple t1 = new Tuple("Seb Tol",new Date(2013, 9, 15),new Date(2013, 10, 15));
		tuples.out("42",t1);

		
		System.out.println(tuples.in("42"));
		
		//System.out.println(tuples.rd("42"));
		
		
		System.out.println("== Fin du jeu de tests ==");
	}

	public static void main(String[] args){
		Reunion R = new Reunion();
		R.testTS();
	}
	
	



}
