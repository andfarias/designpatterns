package br.com.andersonfariasdev.designpatterns.bridge.transmissions;

import br.com.andersonfariasdev.designpatterns.bridge.platforms.IPlatform;

public class RecordLive extends Live {
    public RecordLive(IPlatform platform) {
        super.platform = platform;
    }

    public void record() {
        System.out.println("Live sendo gravada");
    }
}
