package hafta4Odev;

public class DiscountCampaign extends Campaign{
	private int discountAmount;

	public DiscountCampaign() {
		
	}
	public DiscountCampaign(int discountAmount) {
		this.discountAmount = discountAmount;
	}

	public int getDiscountAmount() {
		return discountAmount;
	}

	public void setDiscountAmount(int discountAmount) {
		this.discountAmount = discountAmount;
	}
	
	

	
}
