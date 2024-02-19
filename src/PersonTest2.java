public class PersonTest2 {
    public static void main(String[] args){
        Person p1 = new Person();
        Person p2 = new Person();
        p1.name="qq"; //문자열은 new를 사용하지 않고 인스턴스를 사용할 수 있다.
        p2.name="ww";
        System.out.println(p1.name);
        System.out.println(p2.name);
        System.out.println(Person.count);
        System.out.println(Person.count);
        Person.count++;
        System.out.println(Person.count);
    }

}
