public class Bus extends Car {
    public void a(){
        System.out.println("안내방송");
    }
    public void run(){//overriding
        System.out.println("후륜구동으로 달리다");
    }
}
