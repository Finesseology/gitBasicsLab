package csc131;

import java.util.ArrayList;

public class GiftCardApplication {
	
	public static void main(String[] args) {
		GiftCard gc1 = new GiftCard(25, 125.0);
		GiftCard gc2 = new GiftCard(50, 150.0);
		ArrayList<GiftCard> giftCards = new ArrayList<GiftCard>();
		giftCards.add(gc1);
		giftCards.add(gc2);
		
		int gcLength = giftCards.size();
		for (int i = 0; i < gcLength; i++) {
			GiftCard gc = giftCards.get(i);
			System.out.println("GiftCard " + gc.getId() + " from store# " + gc.getIssuingStore() 
							   + " has a balance of " + gc.getBalance());
		}
	}
}
