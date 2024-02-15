public class VendingMachine {
    public String pushProductBtn(int menuId){
        System.out.println(menuId+"가 호출");
        return "콜라";
    }
    public static void printVersion(){
        System.out.println("v1.0");
    }
}
