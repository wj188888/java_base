package com.wangjie.chat;

public class TalkStudent {

    public static void main(String[] args) {
        // 开启两个线程
        new Thread(new TalkSend(7777,"localhost",9899)).start();
        new Thread(new TalkReceive(8890,"老师")).start();


    }
}
