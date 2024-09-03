import java.util.HashSet;
import java.util.Set;

public class LaptopService {
    private Set<Laptop> laptops = new HashSet<>();
    public void fillSet(){
        laptops.add(new Laptop("Windows", "Black"));
        laptops.add(new Laptop("Windows", "Grey"));
        laptops.add(new Laptop("Linux", "Black"));
        laptops.add(new Laptop("Linux", "Red"));
        laptops.add(new Laptop("Linux", "Grey"));
        laptops.add(new Laptop("MacOS", "Black"));
        laptops.add(new Laptop("MacOS", "Grey"));
        laptops.add(new Laptop("Fedora", "Black"));
        laptops.add(new Laptop("Fedora", "Red"));
    }
    public Set<Laptop> searchLaptop(String searchParam){
        Set<Laptop> resultSet= new HashSet<>();
        for(Laptop laptop:laptops){
            if (laptop.getOS().equals(searchParam) || laptop.getColour().equals(searchParam)){
                resultSet.add(laptop);
            }
        }
        return resultSet;
    }
}
