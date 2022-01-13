package br.com.andersonfariasdev.designpatterns.bridge.transmissions;

import br.com.andersonfariasdev.designpatterns.bridge.platforms.IPlatform;

public class AdvancedLive extends Live {
    public AdvancedLive(IPlatform platform) {
        super.platform = platform;
    }

    public void subtitles() {
        System.out.println("Legendas ativadas na transmissão");
    }

    public void comments() {
        System.out.println("Comentários ativados na live");
    }
}
