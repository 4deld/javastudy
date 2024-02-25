public class GenericBoxMain {
    public static void main(String[] args) {
        GenericBox<String> genericBox = new GenericBox<>();
        genericBox.add("Kim");
        String str= genericBox.get();
        System.out.println(str.toUpperCase());

        GenericBox<Object> objBox= new GenericBox<>();
        objBox.add("hello");
    }
}
