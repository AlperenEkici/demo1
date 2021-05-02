package hafta4Odev;

public class GameSellManager {
	public void buyGame(GameStore game,User user) {
		System.out.println(game.getName()+" "+user.getFirstName()+" "+user.getLastName()+" kullanıcısına eklenmiştir");
	}
	public void buySecondProductCampaign(GameStore game, User user, SecondProductCampaign secondProductCampaign) {
		System.out.println(secondProductCampaign.getCampaignName()+" Kampanyası kullanıldı ve " + game.getName() + " "+user.getFirstName() + " "+user.getLastName() + " kullanıcısına eklenmiştir");
	}
	public void buyDiscountCampaign(GameStore game, User user, DiscountCampaign discountCampaign) {
		System.out.println(discountCampaign.getCampaignName()+" isimli kampanyadan "+discountCampaign.getDiscountAmount()+" Tl hediye çeki kullanıldı ve "+game.getName()+" "+user.getFirstName()+" "+user.getLastName()+" kullanıcısına eklenmiştir");
	}
}
