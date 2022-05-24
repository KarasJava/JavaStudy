package pl.jacobitedge.java.metodyIKontruktory.computer;

class Computer {
    String processor;
    int memory;

    public Computer() {
    }

    public Computer(String processor, int memory) {
        this.processor = processor;
        this.memory = memory;
    }

    void printInfo() {
        System.out.println(processor + ", " + memory);
    }


}