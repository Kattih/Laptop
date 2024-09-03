import java.util.Scanner;
import java.util.Set;

public class ConsoleUI {
    private LaptopService service;
    private Scanner scanner = new Scanner(System.in);
    public ConsoleUI(LaptopService service){
        this.service = service;
    }
    public void run() {
        while (true) {
            System.out.print("> Введите параметр поиска (ОС или цвет): ");
            String param = scanner.nextLine();
            find(param);
            System.out.println("Искать еще? (y/n)");
            String continueSearch = scanner.nextLine();
            if (continueSearch.equals("n"))
                break;
        }
    }
     private void find(String searchParam) {
        Set<Laptop> result = service.searchLaptop(searchParam);
        if (result.isEmpty()){
            System.out.println("Ноутбуки с такими параметрами не найдены.");
        }
        else{
            for (Laptop laptop:result) {
            }
            System.out.println(service.searchLaptop(searchParam));
        }
    }
}
