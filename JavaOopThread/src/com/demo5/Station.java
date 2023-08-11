package com.demo5;

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
            solidTicket();
        }
    }

    public synchronized void solidTicket(){
            if(ticket>0){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(this.getName()+"卖了一张票，此时票数为"+(ticket));
                ticket--;
            }

    }
}
