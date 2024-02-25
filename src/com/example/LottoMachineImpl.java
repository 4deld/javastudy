package com.example;

public class LottoMachineImpl implements LottoMachine{
    private Ball[] balls;
    @Override
    public void setBalls(Ball[] balls) {
        this.balls=balls;
    }

    @Override
    public void mix() {
        for(int i=0; i<100; i++){
            int x1=(int)(Math.random()*max_ball_cnt);
            int x2=(int)(Math.random()*max_ball_cnt);
            if(x1!=x2){
                Ball tmp=balls[x1];
                balls[x1]=balls[x2];
                balls[x2]=tmp;
            }
        }
    }

    @Override
    public Ball[] getBalls() {
        Ball[] r=new Ball[return_ball_cnt];
        for(int i=0; i<LottoMachine.return_ball_cnt; i++){
            r[i]=balls[i];
        }
        return r;
    }
}
