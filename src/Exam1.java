public class Exam1 {
    public static void main(String[] args){
        Child a1=new Child();
        System.out.println(a1.i);
        a1.printI();

        Child c1=new Child();
        System.out.println(c1.i);
        c1.printI();

        Parent p1=new Child();
        System.out.println(p1.i);
        p1.printI();
        

    }
}
