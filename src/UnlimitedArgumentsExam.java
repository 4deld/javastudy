public class UnlimitedArgumentsExam {
    public static void main(String[] args) {
        System.out.println(sum(1,2));
        System.out.println(sum(1,2,3,4,6));
    }
    public static int sum(int... args){
        return args.length;
    }
}
