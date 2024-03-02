package designpattern.adapter;

public class ClientWithAdapter {
    public static void main(String[] args) {
        AdapterServiceA serviceA = new AdapterServiceA();
        AdapterServiceB serviceB = new AdapterServiceB();

        serviceA.runService();
        serviceB.runService();

    }
}
