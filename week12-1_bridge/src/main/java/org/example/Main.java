package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Device tv = new SmartTV();
        SmartRemote remote = new SmartRemote(tv);

        remote.power();
        tv.browseInternet("http://www.youtube.com");
        remote.voiceControl("Volume Up");
        remote.voiceControl("Channel Up");
        tv.printStatus();
    }
}