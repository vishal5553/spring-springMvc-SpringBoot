package BillCollectorMethods;

public class BillCollector {
	
	private IPayment payment;


	/* this work with property tag in spring beans.xml
	 * 
	 * when we perform both setter and constructor injection for same variable,
	 * then setter injection will Override constructor injection because constructor will execute
	 * first to initialize the variable then setter will execute and it will Re-initialize the variable.
	 * 
	 * public void setPayment(IPayment payment) { this.payment = payment; }
	 * 
	 * 
	 * 
	 * public BillCollector() { super(); }
	 */

	/* this work with Constructor-arg tag in spring beans.xml*/
	public BillCollector(IPayment payment) {
		super();
		this.payment = payment;
	}
	
	public void CollectPayment(double amount) {
		System.out.println(payment.getClass().getName());
		String status = payment.pay(amount);
		System.out.println(status);
	}

}
