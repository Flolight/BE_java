package core;

public class Label_A_Star extends Label{
	
	/**
	 * L'estimation "� vol d'oiseau" entre le sommet et la destination
	 * Initialis� � 0
	 * @see Label_A_Star#Label(Noeud) 
	 */	
	private double estimation;
	
	
	public Label_A_Star(Noeud n){
		super(n);
	}
	
	/**
	 * Met � jour l'estimation pour aller de ce sommet � la destination "� vol d'oiseau"
	 * @param est La nouvelle estimation
	 */
	public void updateEstimation(double est){
		this.estimation = est;
	}
	
	/**
	 * Donne l'estimation de distance "� vol d'oiseau" de ce sommet vers la destination
	 * @return
	 */
	public double getEstimation(){return this.estimation;}
	
	
	/**
	 * Permet de comparer deux labels (_A_Star ou pas)
	 * @param lab le deuxi�me label � comparer
	 * @return 0 si les labels sont �gaux en cout
	 * 		   1 this plus grand que lab
	 *        -1 this plus petit que lab
	 *        
	 * On r�alise ici une red�finition et non pas une surcharge pour �viter les probl�mes des m�thodes binaires
	 */
	public int compareTo(Label lab){
		Double this_cout = (this.getCout()+this.getEstimation());
		Double lab_cout = (((Label_A_Star)lab).getCout() + ((Label_A_Star)lab).getEstimation());
		if(this_cout.compareTo(lab_cout) == 0){
			if(this.getEstimation() == ((Label_A_Star)lab).getEstimation()){
			return 0;
			}
			
		}
		return this_cout.compareTo(lab_cout);
		//si = on retourne l'heuristique la plus petite !!!!!!!!!!!!!!!!!!!!!!! TODO !!!!!!!!!!!!!!!!!!!!!!!!!!
	}
	
	
	

}
