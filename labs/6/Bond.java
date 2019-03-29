package lab6;

public class Bond {
	public double coupon;		
	public int payments;	
	public double interest;
	public double valueMaturity;
	public Bond() {
	}
		public Bond(double coupon, int payments, double interest, double valueMaturity) {
			this.coupon=coupon;
			this.payments=payments;
			this.interest=interest;
			this.valueMaturity=valueMaturity;
		}
		
		public void setValueMaturity(double valueMaturity) { //Question
			this.valueMaturity = valueMaturity;
		}
				public double getCoupon() {
					return coupon;					
				}
					public double getPayments() {
						return payments;
					}
						public double getInterest() {
							return interest;
						}
							public double getValueMaturity() {
								return valueMaturity;
							}
							
		public double getPrice() {
			double price = 0;
			price= coupon * ( (1 - Math.pow((1 + interest),-payments) / interest )) + valueMaturity * Math.pow((1 + interest),-payments);
			return price;
		}	
}
