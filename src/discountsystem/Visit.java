package discountsystem;

public class Visit {
	public Customer customer = new Customer("william");
	public Date = date;
	public double serviceExpense;
	public double productExpense;
	
	public Visit(String name,Date date ) {
		customer = new Customer(name);
		this.date=date;
		
	}
	public String getName() {
		return customer.name;
	}

	@Override
	public String toString() {
		return "Visit [customer=" + customer + ", serviceExpense=" + serviceExpense + ", productExpense="
				+ productExpense + "]";
	}
	public double getServiceExpense() {
		return serviceExpense;
	}

	public void setServiceExpense(double serviceExpense) {
		this.serviceExpense = serviceExpense;
	}

	public double getProductExpense() {
		return productExpense;
	}

	public void setProductExpense(double productExpense) {
		this.productExpense = productExpense;
	}
	

}
