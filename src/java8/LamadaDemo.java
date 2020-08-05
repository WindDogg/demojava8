package java8;

public class LamadaDemo {
    interface Printer{
        void printer(String val);
    }

    public void printSomething(String something,Printer printer){
        printer.printer(something);
    }

    public static void main(String[] args) {
        LamadaDemo lamadaDemo = new LamadaDemo();
        String some = "lamada";
        /*Printer printer = new Printer() {
            @Override
            public void printer(String val) {
                System.out.println(val);
            }
        };*/
        Printer printer = (String val) -> {
            System.out.println(val);
        };
        lamadaDemo.printSomething(some,printer);
    }
}
