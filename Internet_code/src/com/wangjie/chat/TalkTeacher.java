package com.wangjie.chat;

public class TalkTeacher {

    public static void main(String[] args) {
        new Thread(new TalkSend(5555,"localhost",8890)).start();
        new Thread(new TalkReceive(9899,"学生")).start();




    }



}
