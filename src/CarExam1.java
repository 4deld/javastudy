public class CarExam1 {
    public static void main(String[] args){
        Bus b1=new Bus();
        b1.run();
        b1.a();

        Car c1=new Bus();
        c1.run();
        //c1.a();
        Bus b2=(Bus)c1; //c1이 참조하는 Bus instance를 b2가 참조하게한다
        b2.a();

        Car c2=new SuperCar();
        c2.run();

        Car d1=new Car();
        d1.run();


    }
}
