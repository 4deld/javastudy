package com.example;
/*
기능 정리
1. ball을 넣음
2. 섞음
3. 꺼냄
*/
public interface LottoMachine {
    //모두 public static이고 생략됨
    int max_ball_cnt=45;
    int return_ball_cnt=6;
    //모두 abstract이고 생략됨
    public void setBalls(Ball[] balls);
    public void mix();
    public Ball[] getBalls();
}
