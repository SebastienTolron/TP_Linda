package ssf.reunion;

import java.util.Date;


/**
* TP 1 Introduction a larchitecture Linda
* @author Sebastien Tolron sebastien.tolron@etu.univ-savoie.fr>
* @author Samuel De Francesco <samuel.defrancesco@etu.univ-savoie.fr>
* @author François Profizi <francois.profizi@etu.univ-savoie.fr>
*/


public class Tuple {
	
	/* Declaration des attributs */
	
	public String autheur ;
	public Date date_preference;
	public Date date_exclues;
	
	/** 
	 * Méthode qui convertit un tuple en string
	* 
	*  @return La valeur du tuple en string
	*/
		
	
	public String ToString()
	{
		
		
		return (" Autheur = "+this.autheur+"\n Date preferenciel = "+this.date_preference+" \n Date exclues = "+this.date_exclues);
		
		
	}

	public Tuple(String autheur, Date date_preference, Date date_exclues) {
		super();
		this.autheur = autheur;
		this.date_preference = date_preference;
		this.date_exclues = date_exclues;
	}

}
