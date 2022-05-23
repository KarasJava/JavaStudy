package pl.jacobitedge.java.klasyIObiekty.car;

public class CarShop {

    int doors ;
    String carColor;
    String wheelsColor;
    String tiresColor;
    String brand = "audi";
    String model;


    @Override
    public String toString() {
        return "CarShop{" +
                "doors=" + doors +
                ", carColor='" + carColor + '\'' +
                ", wheelsColor='" + wheelsColor + '\'' +
                ", tiresColor='" + tiresColor + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

    public static void main(String[] args) {
        String number = null;
        System.out.println(number);



    }

}
