package hafta4Odev;

public class Main {

	public static void main(String[] args) {
		
		Gamer gamer1 = new Gamer();
		gamer1.setId(1);
		gamer1.setTcNo("12345678910");
		gamer1.setFirstName("Alperen");
		gamer1.setLastName("Ekici");
		gamer1.setDateOfBirth("01.01.2001");
		gamer1.setE_posta(".......@gmail.com");
		gamer1.setPassaword("*******");
		
		GamerManager gamerManager = new GamerManager();
		gamerManager.add(gamer1);
	
		GameStore game1 = new GameStore();
		game1.setId(1);
		game1.setCategory("fps");
		game1.setName("Cs Go");
		game1.setPrice(100);
		
		GameStore game2 =new GameStore();
		game2.setId(2);
		game2.setCategory("Sport");		
		game2.setName("Fifa21");
		game2.setPrice(400);
		
		GameStoreManager gameStoreManager1 = new GameStoreManager(game1);
		gameStoreManager1.add();
		
		GameStoreManager gameStoreManager2 = new GameStoreManager(game2);
		gameStoreManager2.add();
		
		GameSellManager gameSellManager = new GameSellManager();
		gameSellManager.buyGame(game1, gamer1);
		
		SecondProductCampaign secondProductCampaign = new SecondProductCampaign();
		secondProductCampaign.setCampaignName("2.üründe %50 indirim");
		secondProductCampaign.setId(1);
		
		CampaignManager campaignManager1 =new CampaignManager(secondProductCampaign);
		campaignManager1.add();
		
		DiscountCampaign discountCampaign = new DiscountCampaign();
		discountCampaign.setCampaignName("50 tl üzeri oyun alýmýnda 20 tl indirim");
		discountCampaign.setId(2);
		discountCampaign.setDiscountAmount(20);
		
		CampaignManager campaignManager2 =new CampaignManager(discountCampaign);
		campaignManager2.add();
		
		gameSellManager.buySecondProductCampaign(game2, gamer1, secondProductCampaign);
		gameSellManager.buyDiscountCampaign(game1, gamer1, discountCampaign);
		
		
		

	}

}
