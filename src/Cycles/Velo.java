package Cycles;
import java.util.Random;

public class Velo {
	private static double DEFAUT_BRAQUET=13.0;
	double braquet;
	double diamRoue;
	Random genAlea = new Random();
	
	public static double getDEFAUT_BRAQUET() {
		return DEFAUT_BRAQUET;
	}

	public static void setDEFAUT_BRAQUET(double DEFAUT_BRAQUET2) {
		DEFAUT_BRAQUET = DEFAUT_BRAQUET2;
	}
	
	public Velo(double braquet,double diamRoue) {
		this.braquet = braquet;
		this.diamRoue = diamRoue;
	}
	public Velo(double braquet) {
		this.braquet = braquet;
		diamRoue = 12.5;
	}
	public Velo() {
		braquet = DEFAUT_BRAQUET;
		diamRoue = 12.5;
	}

	public double getBraquet() {
		return braquet;
	}

	public void setBraquet(double braquet) {
		this.braquet = braquet;
	}

	public double getDiamRoue() {
		return diamRoue;
	}

	public void setDiamRoue(double diamRoue) {
		this.diamRoue = diamRoue;
	}

	public java.util.Random getGenAlea() {
		return genAlea;
	}

	public void setGenAlea(java.util.Random genAlea) {
		this.genAlea = genAlea;
	}
	public String toString() {
		return "velo[braquete="+braquet+",diamRoue="+diamRoue+"]";
	}
	public double getPuissance(double FrequenceCoupsDePedale) {
		return FrequenceCoupsDePedale*braquet*diamRoue*genAlea.nextDouble();
	}
	
	public static void main(String[] args) {
		Velo m = new Velo();
		System.out.println(m.toString());
		System.out.println(m.getPuissance(18));
		Velo m2 = new Velo(34.2);
		System.out.println(m2.toString());
		m.setDiamRoue(2.5);
		System.out.println(m.getPuissance(86));
		
	}

	
	

}
