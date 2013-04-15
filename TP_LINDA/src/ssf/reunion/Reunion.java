package ssf.reunion;

public class Reunion {


	public void testTS(){
		
		System.out.println("== Début du jeu de tests ==");
		
		TupleSpace tuples = new TupleSpace();
		
		tuples.out("42", 32);
		tuples.out("42", 42);
		tuples.out("44", 43);
		
		System.out.println(tuples.rd("42"));
		
		System.out.println("== Fin du jeu de tests ==");
	}

	public static void main(String[] args){
		Reunion R = new Reunion();
		R.testTS();
	}
	
	



}
