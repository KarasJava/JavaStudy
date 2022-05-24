package pl.jacobitedge.java.metodyIKontruktory.homework.constructor;

class Shop {
    public static void main(String[] args) {
        Product product1 = new Product("Milka","chocolate");

        Offer offer1 = new Offer(product1, 4.00, true);

        offer1.printInfo();



    }
}