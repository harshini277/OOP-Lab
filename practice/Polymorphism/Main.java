class InvoiceProcessor{
	int cId;
	String cName;
	double billAmount;
	double discount = 30;
	
	InvoiceProcessor(int cId, String cName, double billAmount){
		this.cId = cId;
		this.cName = cName;
		this.billAmount = billAmount;
		this.discount = discount;
	}
	
	private double calcBill(double billAmount){
		billAmount -= discount*billAmount/100;
		return billAmount;
	}
	public void genInvoice(){
		System.out.println("-------INVOICE-------");
		System.out.println("Customer ID: "+cId);
		System.out.println("Customer Name: "+cName);
		System.out.println("Discount: "+discount+"%");
		System.out.println("Total Amount: "+calcBill(billAmount));
		
	}
	public double getAmount(double billAmount){
		return calcBill(billAmount);
	}
}

class RetailInvoice extends InvoiceProcessor{
	double discount = 15;
	
	RetailInvoice(int cId, String cName, double billAmount){
		super(cId,cName,billAmount);
	}
	@Override
	public void genInvoice(){
		billAmount -= discount*billAmount/100;

		System.out.println("-------RETAIL INVOICE-------");
		System.out.println("Customer ID: "+cId);
		System.out.println("Customer Name: "+cName);
		System.out.println("Discount: "+discount+"%");
		System.out.println("Total Amount: "+getAmount(billAmount));
		
	}
}

public class Main{
	public static void main(String[] args){
		InvoiceProcessor ip = new InvoiceProcessor(12,"Alex",1234);
		RetailInvoice ri = new RetailInvoice(1,"Alexa",2234);

		ip.genInvoice();
		System.out.println(ip.getAmount(1234));
	
		ri.genInvoice();
		System.out.println(ri.getAmount(2234));
	}
}