package ssf.reunion;

import java.util.ArrayList;
import java.util.Hashtable;

/**
* TP 1 Introduction a larchitecture Linda
* @author Sebastien Tolron sebastien.tolron@etu.univ-savoie.fr>
* @author Samuel De Francesco <samuel.defrancesco@etu.univ-savoie.fr>
* @author François Profizi <francois.profizi@etu.univ-savoie.fr>
*/


public class TupleSpace {

	
	private Hashtable<Object, ArrayList<Tuple>> hashT;
	
	
/* Declaration des methodes */
	
/** 
 * Méthode rd qui permet de lire une valeur dans un espace de tuple
*  @param key La clé du tuple à consommer
*  @return La valeur du tuple
*/
	
	public Object rd (Object clef){
		try {
			
		
		ArrayList<Tuple> values = this.hashT.get(clef);
		return values.get(values.size()-1).ToString();	
		}
	catch(Exception e){
		System.err.println("La clef ne correspond a aucune valeur dans l'espace de tuple");
		return null;
		}
	}
	
	
/** 
 * Méthode in qui permet de consommer un tuple dans un espace de tuple
*  @param key La clé du tuple à consommer
*  @return La valeur du tuple
*/
	
	
	public Object in (Object clef ){
	
		
		try{
			int last = this.hashT.get(clef).size() - 1;
			
			Tuple value = this.hashT.get(clef).get(last);			
			this.hashT.get(clef).remove(last);
			
			
			if(this.hashT.get(clef).isEmpty()){
				
			this.hashT.remove(clef);
			}
			return value.ToString();
			}
		
		catch(Exception e){
			System.err.println("La clef ne correspond a aucune valeur dans l'espace de tuple");
			return null;
			}
	}

	
/** 
 * Méthode out qui permet d'ajouter un tuple à l'espace de tuple
*  @param key La clé du tuple à consommer
*  @return La valeur du tuple
*/
	
	
	public void out (Object clef, Tuple value ){
		
			if(this.hashT.containsKey(clef)){
			this.hashT.get(clef).add(value);
			}
			else{
			ArrayList<Tuple> values = new ArrayList<Tuple>();
			values.add(value);
			this.hashT.put(clef, values);
		
			}
			System.out.println(" Le tuple avec la clef "+clef+" a été ajouté");
			}
		
		
		
	
	

	public TupleSpace(){
		this.hashT = new Hashtable<Object, ArrayList<Tuple>>();
	}
	
	
}
