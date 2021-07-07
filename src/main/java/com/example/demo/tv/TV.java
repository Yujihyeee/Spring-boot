package com.example.demo.tv;
class TVControl{
    public static void main(String[] args) {

        TV LGtv = new TV("LG");
        TV Stv = new TV("Samsung");
        TV htv = new TV("HP", 2048);
        System.out.println(htv.getCurrent_channel());
        htv.setCurrent_channel(11111);
        System.out.println(htv.getCurrent_channel());

        System.out.println(htv.resolution);

        //TV 켜기
        //볼륨 키우기
        //채널 바꾸기
    }


}

public class TV {
    //속성
    String model_name;
    int[] channel;
    private int current_channel;
    int resolution;
    boolean power;

    TV(String tv_name){
        model_name = tv_name;
        resolution = 1024;
        power = false;
        current_channel = 0;
        channel = new int[100];
        for(int i = 0; i < channel.length; i++){
            channel[i] = i + 1;
        }
    }

    TV(String tv_name, int resolution){
        model_name = tv_name;
        this.resolution = resolution;
        power = false;
        current_channel = 0;
        channel = new int[100];
        for(int i = 0; i < channel.length; i++){
            channel[i] = i + 1;
        }
    }
    //generate

    public int getCurrent_channel() {

        return current_channel;
    }

    public void setCurrent_channel(int current_channel){
        if(current_channel > 100){
            this.current_channel = -1;
            System.out.println("입력오류입니다.");
        }
        else this.current_channel = current_channel;
    }

    //기능

}

