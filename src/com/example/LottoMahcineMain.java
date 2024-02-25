package com.example;

public class LottoMahcineMain {
    public static void main(String[] args) {
        Ball[] balls=new Ball[45];
        for(int i=0; i<45; i++){
            balls[i]=new Ball(i+1);
        }
        LottoMachine lottoMachine = new LottoMachineImpl();
        lottoMachine.setBalls(balls);
        lottoMachine.mix();
        Ball[] rst = lottoMachine.getBalls();

        for (int i=0; i<rst.length; i++){
            System.out.println(rst[i].getNumber());
        }
    }
}
