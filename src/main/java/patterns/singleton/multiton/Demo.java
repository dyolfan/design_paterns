package patterns.singleton.multiton;

class Demo {
    public static void main(String[] args) {
        Printer main = Printer.get(Subsystem.PRIMARY);
        Printer aux = Printer.get(Subsystem.AUXILARY);
        Printer aux2 = Printer.get(Subsystem.AUXILARY);
    }
}
