package org.example.Session34;

class SistemLumini{
    public void stingeLumina(){
        System.out.println("Luminile s-au stins");
    }
}
class SistemAudio {
    public void pornesteSistemulAudio(){
        System.out.println("Sistemul audio e pornit");
    }
}
class SistemVideo {
    public void pornesteVideoProiector(){
        System.out.println("Videoproiector pornit");
    }
}

class SistemDraperii {
    public void trageDraperii(){
        System.out.println("Draperii trase");
    }
}

class HomeCinemaFacade {
    public SistemLumini sistemLumini;
    public SistemAudio sistemAudio;
    public SistemVideo sistemVideo;
    public SistemDraperii sistemDraperii;

    public HomeCinemaFacade() {
        this.sistemLumini = new SistemLumini();
        this.sistemAudio = new SistemAudio();
        this.sistemVideo = new SistemVideo();
        this.sistemDraperii = new SistemDraperii();
    }

    public void pornesteFilm() {
        sistemLumini.stingeLumina();
        sistemAudio.pornesteSistemulAudio();
        sistemVideo.pornesteVideoProiector();
        sistemDraperii.trageDraperii();
    }
}

public class Facade {
    public static void main(String[] args) {
        HomeCinemaFacade facade=new HomeCinemaFacade();
        facade.pornesteFilm();

    }
}
