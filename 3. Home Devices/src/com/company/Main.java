package com.company;

class Main {
    public static void main(String[] args) {

        Lamp bedroomLamp = new Lamp();
        System.out.println("The bedroom lamp is currently set to " + bedroomLamp.getPower());
        bedroomLamp.switchOn();
        System.out.println("The bedroom lamp is currently set to " + bedroomLamp.getPower());
        bedroomLamp.brighten();
        bedroomLamp.brighten();
        bedroomLamp.brighten();
        System.out.println("The bedroom lamp is currently set to a brighteness of " + bedroomLamp.getBrightness());

        TV frontRoom = new TV();
        System.out.println("The TV in the front room is currently set to " + frontRoom.getPower());
        frontRoom.turnUp();
        System.out.println("The TV in the front room volume is currently set to " + frontRoom.getVolume());

        Radio landingRadio = new Radio();
        System.out.println("The Radio in the Landing is currently set to " + landingRadio.getPower());
        System.out.println("The Radio in the Landing volume is currently set to " + landingRadio.getVolume());
        System.out.println("The Radio in the Landing frequancy is currently set to " + landingRadio.getFrequency());
    }
}
class Device{
    int power;
    Device() {
        power = 0;
    }
    int getPower() {
        return power;
    }
    void switchOn() {
        power = 1;
    }
    void switchOff() {
        power = 0;
    }
}

class Lamp extends Device{
    int brightness;
    Lamp() {
        super();
        brightness = 0;
    }

    int getBrightness(){
        return brightness;
    }

    void brighten() {
        brightness = brightness + 10;
    }

    void dim() {
        brightness = brightness - 10;
    }
}

class TV extends Device{
    int channel = 0;
    int volume = 0;
    TV(){
        super();
        channel = 0;
        volume = 0;
    }
    int getChannel() {
        return channel;
    }
    int getVolume() {
        return volume;
    }
    void turnUp() {
        volume = volume + 5;
    }
    void turnDown() {
        volume = volume - 5;
    }
    void channelUp() {
        channel = channel + 1;
    }
    void channelDown() {
        channel = channel - 1;
    }
}
class Radio extends Device{
    int frequency = 0;
    int volume = 0;

    Radio(){
        super();
        frequency = 1;
        volume = 5;
    }
    int getFrequency() {
        return frequency;
    }
    int getVolume() {
        return volume;
    }
    void upFrequency() {
        frequency = frequency + 1;
    }
    void downFrequency() {
        frequency = frequency - 1;
    }
    void upVolume() {
        volume = volume + 1;
    }
    void downVolume() {
        volume = volume - 1;
    }
}