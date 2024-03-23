package org.example.facade;

public class Amplifier {
    public void on() {
        System.out.println("앰프 켜짐");
    }

    public void setStreamingPlayer(StreamingPlayer player) {
        System.out.println(player);
    }

    public void setSurroundSound() {
        System.out.println("setSurroundSound");
    }

    public void setVolume(int i) {
        System.out.println("setVolume : "+i);
    }

    public void off() {
        System.out.println("앰프 꺼짐");
    }
}
