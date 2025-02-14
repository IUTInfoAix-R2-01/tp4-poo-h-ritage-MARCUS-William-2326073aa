package discountsystem;

public class DiscountRate {
	private static double serviceDiscountPremium=0.2;
	private static double serviceDiscountGold=0.15;
	private static double serviceDiscountSilver=0.1;
	private static double productDiscountPremium=0.1;
	private static double productDiscountGold=0.1;
	private static double productDiscountSilver=0.1;
	
	private static double getServiceDiscountRate(String type) {
		if (type == "serviceDiscountPremium") {
			return serviceDiscountPremium;
		}
		if (type == "serviceDiscountGold") {
			return serviceDiscountGold;
		}
		if (type == "productDiscountPremium") {
			return productDiscountPremium;
		}
		if (type == "productDiscountGold") {
			return productDiscountPremium;
		}
		if (type == "productDiscountGold") {
			return productDiscountGold;
		}
		else {
			return productDiscountSilver;
		}
		
	}
}
