package br.com.andersonfariasdev.designpatterns.bridge;

import br.com.andersonfariasdev.designpatterns.bridge.platforms.*;
import br.com.andersonfariasdev.designpatterns.bridge.transmissions.AdvancedLive;
import br.com.andersonfariasdev.designpatterns.bridge.transmissions.Live;
import br.com.andersonfariasdev.designpatterns.bridge.transmissions.RecordLive;

public class Main {

    public static void main(String[] args) {
        startLiveAdvanced(new YouTube());
        startLive(new TwitchTV());
        startLive(new Facebook());
        startLiveRecord(new DisneyPlus());
    }

    public static void startLive(IPlatform platform) {
        System.out.println("...Aguarde!");
        Live live = new Live(platform);
        live.broadcasting();
        live.result();
    }

    public static void startLiveAdvanced(IPlatform platform) {
        System.out.println("...Aguarde!");
        AdvancedLive live = new AdvancedLive(platform);
        live.broadcasting();
        live.comments();
        live.subtitles();
        live.result();
    }

    public static void startLiveRecord(IPlatform platform) {
        System.out.println("...Aguarde!");
        RecordLive live = new RecordLive(platform);
        live.broadcasting();
        live.record();
        live.result();
    }
}
