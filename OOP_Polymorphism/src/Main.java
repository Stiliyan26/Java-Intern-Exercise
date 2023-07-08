public class Main {
    public static void main(String[] args) {
        ComputerCase theCase = new ComputerCase("2208",
                "Dell", "240");

        Monitor theMonitor = new Monitor("27inch Beast", "Acer",
                27, "2500 x 1440");

        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus",
                4, 6, "v2.44");

        PersonalComputer thePc = new PersonalComputer("2208", "Dell",
                theCase, theMonitor, theMotherboard);

//        thePc.getMonitor().drawPixelAt(10, 10, "red");
//        thePc.getMotherBoard().loadProgram("Windows OS");
//        thePc.getComputerCase().pressPowerButton();

        thePc.powerUp();
    }
}