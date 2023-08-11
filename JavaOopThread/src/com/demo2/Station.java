package com.demo2;

public class Station extends  Thread{
    private static int ticket = 10;
    private String name;

    public Station(String name) {
        this.setName(name);
    }
    public Station(){}

    @Override
    public void run() {
        for (int i = 1; i < 11; i++) {
            if(ticket>0){
                System.out.println(this.getName()+"卖了一张票，此时票数为"+(ticket--));
            }else {
               break;
            }

        }
    }
}
