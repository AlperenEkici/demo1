package hafta4Odev;

public class CampaignManager {
	public Campaign campaign;
	

	public CampaignManager(Campaign campaign) {
		this.campaign = campaign;
	}

	public void add() {
		System.out.println(campaign.getCampaignName() + " isimli kampanya sisteme eklendi");
	}

	public void delete() {
		System.out.println(campaign.getCampaignName() + " isimli kampanya sistemden silindi");
	}

	public void update() {
		System.out.println(campaign.getCampaignName() + " isimli kampanya baþarýyla güncellendi");
	}
	
}
