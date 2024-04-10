package org.example;

public class SmartRemote extends BasicRemote {
    public SmartRemote(Device device) {
        super(device);
    }

    public void voiceControl(String command) {
        System.out.println("Voice command: " + command);
        switch (command.toLowerCase()) {
            case "volume up":
                volumeUp();
                break;
            case "volume down":
                volumeDown();
                break;
            case "channel up":
                channelUp();
                break;
            case "channel down":
                channelDown();
                break;
            default:
                System.out.println("Command not recognized");
        }
    }
}