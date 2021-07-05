package com.example.demo;
class TVControl{
    public static void main(String[] args) {

        TV LGtv = new TV("LG");
        TV Stv = new TV("Samsung");
        TV htv = new TV("HP", 2048);
        System.out.println(htv.current_channel);
        htv.current_channel = 11;
        System.out.println(htv.current_channel);


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
    int current_channel;
    int resolution;
    boolean power;



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

    public TV() {
    }

    //기능


}

