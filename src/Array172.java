import java.util.Arrays;
import java.util.Comparator;

public class Array172 {
    public static void main(String[] args) {
        Item[] items = new Item[4];
        items[0]= new Item("a",10);
        items[1]= new Item("b",10240);
        items[2]= new Item("c",1010);
        items[3]= new Item("d",110);
        Arrays.sort(items,(i1,i2)->i1.getName().compareTo(i2.getName()));
        for(Item i : items){
            System.out.println(i);
        }
    }
}
class Item implements Comparable{
    private String name;
    private int price;

    public Item(String a, int i) {
        this.name=a;
        this.price=i;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        return this.name.compareTo(((Item)o).name);
    }


//        @Override
//    public int compareTo(Object o) {
//        return this.price - ((Item)o).price;
//    }
}