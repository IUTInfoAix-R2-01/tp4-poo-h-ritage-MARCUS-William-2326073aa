package Cycles;

public class VeloElec extends Velo{
	private static double DEFAUT_fACTEUR_PUISSANCE_MOTEUR= 15.0;
	double facteurPuissancePoteur;
	
	public VeloElec(double braquet, double diamRoue, double facteurPuissanceMoteur) {
		this.braquet=braquet;
		this.diamRoue=diamRoue;
		this.facteurPuissancePoteur = facteurPuissanceMoteur;
	}
	public VeloElec(double diamRoue, double facteurPuissanceMoteur) {
		this.braquet=super.getDEFAUT_BRAQUET();
		this.diamRoue=diamRoue;
		this.facteurPuissancePoteur = facteurPuissanceMoteur;
	}
	public VeloElec() {
		this.braquet=super.getBraquet();
		this.diamRoue=super.getDiamRoue();
		this.facteurPuissancePoteur = DEFAUT_fACTEUR_PUISSANCE_MOTEUR;
	}
	
	
	
	public static double getDEFAUT_fACTEUR_PUISSANCE_MOTEUR() {
		return DEFAUT_fACTEUR_PUISSANCE_MOTEUR;
	}
	public static void setDEFAUT_fACTEUR_PUISSANCE_MOTEUR(double dEFAUT_fACTEUR_PUISSANCE_MOTEUR) {
		DEFAUT_fACTEUR_PUISSANCE_MOTEUR = dEFAUT_fACTEUR_PUISSANCE_MOTEUR;
	}
	public double facteurPuissancePoteur() {
		return facteurPuissancePoteur;
	}
	public void facteurPuissancePoteur(double facteurPuissancePoteur) {
		this.facteurPuissancePoteur = facteurPuissancePoteur;
	}
	public String toString() {
		return "VeloElec [facteurPuissanceMoteur="+facteurPuissancePoteur+"]";
	}
	public double getPuissance(double FrequenceCoupDePedale) {
		return super.getPuissance(FrequenceCoupDePedale);
	}
	
	public static void main(String[] args) {
		VeloElec m= new VeloElec();
		System.out.println(m.toString());
		System.out.println(m.getPuissance(28));
		Velo m2 = new VeloElec(16.2,82.5);
		System.out.println(m2.toString());
		m.setDiamRoue(2.7);
		System.out.println(m.getPuissance(67));
	}

}
