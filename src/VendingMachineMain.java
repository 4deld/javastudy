public class VendingMachineMain {
    public static void main(String[] args){
        VendingMachine.printVersion();
        VendingMachine vm1=new VendingMachine();
        VendingMachine vm2=new VendingMachine();
        String v1 = vm1.pushProductBtn(1);
        String v2 = vm2.pushProductBtn(2);
        System.out.println(v1);
        System.out.println(v2);
    }
}
