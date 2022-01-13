package br.com.andersonfariasdev.designpatterns.bridge;

import br.com.andersonfariasdev.designpatterns.bridge.platforms.Facebook;
import br.com.andersonfariasdev.designpatterns.bridge.platforms.IPlatform;
import br.com.andersonfariasdev.designpatterns.bridge.platforms.TwitchTV;
import br.com.andersonfariasdev.designpatterns.bridge.platforms.YouTube;
import br.com.andersonfariasdev.designpatterns.bridge.transmissions.AdvancedLive;
import br.com.andersonfariasdev.designpatterns.bridge.transmissions.Live;

public class Main {

    public static void main(String[] args) {
        startLiveAdvanced(new YouTube());
        startLive(new TwitchTV());
        startLive(new Facebook());
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
}
