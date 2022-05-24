package pl.jacobitedge.java.metodyIKontruktory.computer;

class ComputerStore {
    public static void main(String[] args) {
        ComputerFactory factory = new ComputerFactory();
        Computer comp1 = factory.create("intel i5",6192);


        Computer comp2 = new Computer();
        comp2.processor = "AMD Ryzen 1700";
        comp2.memory = 16384;

        String comp1Info = comp1.getInfo();
        System.out.println(comp1Info); //"Intel i5 8192"
        System.out.println(comp2.getInfo()); //"AMD Ryzen 1700 16384"

        ComputerUpgrade computerUpgrade = new ComputerUpgrade();
        computerUpgrade.addMemory(comp1,1024);
        String info = comp1.getInfo();
        System.out.println(info);
    }
}