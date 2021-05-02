package hafta4Odev;

public class Campaign {
	private int id;
	private String campaignName;
	
	public Campaign() {
		
	}
	public Campaign(String campaignName) {
		this.campaignName = campaignName;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCampaignName() {
		return campaignName;
	}
	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}
	
}
