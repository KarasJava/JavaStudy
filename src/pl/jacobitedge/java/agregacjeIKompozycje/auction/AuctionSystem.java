package pl.jacobitedge.java.agregacjeIKompozycje.auction;



public class AuctionSystem {
    public static void main(String[] args) {


        Auction auction1 = new Auction();
        auction1.description = "Game console";
        auction1.price = 400;
        auction1.title = "Xbox";
        auction1.seller = new Seller();
        auction1.seller.firstName = "Jacob";
        auction1.seller.secondName = "Fish";
        auction1.seller.address = new Address();
        auction1.seller.address.city = "Wrocław";
        auction1.seller.address.postalCode = "50-500";
        auction1.seller.address.street = "Kościuszki";
        auction1.seller.address.homeNo = "24A";
        auction1.seller.address.flatNo = 21;
        Auction auction2 = new Auction();
        auction2.description = "Game console";
        auction2.price = 700;
        auction2.title = "PS";
        auction2.seller = auction1.seller;
        System.out.println(auction2.seller.address.city);


    }
}
