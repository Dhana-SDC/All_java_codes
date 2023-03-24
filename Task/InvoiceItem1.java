package Task;

public class InvoiceItem1 {
	
    	private int id;
		private String desc;
		private int qty;
		private float unitPrice;
		
		public void InvoiceItem(int id, String desc, int qty, float unitPrice) {
			
			this.id = id;
			this.desc = desc;
			this.qty = qty;
			this.unitPrice = unitPrice;
		}
		
		public void getTotal(){
			System.out.println(this.unitPrice*this.qty);
		}

	
		public String toString() {
			System.out.println("InvoiceItem [id=" + id + ", desc=" + desc + ", qty=" + qty + ", unitPrice=" + unitPrice + "]");
		      return desc;
		}
		public static void main (String[]args) {
			InvoiceItem1 item1=new InvoiceItem1();
			item1.InvoiceItem(12,null,12,250);
			item1.getTotal();
			item1.toString();
			

	}
}
