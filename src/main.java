public class main {
    public static void main(String[] args) {
        LaptopService service = new LaptopService();
        service.fillSet();
        ConsoleUI ui = new ConsoleUI(service);
        ui.run();
    }
}