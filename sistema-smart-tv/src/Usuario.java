public class Usuario {

    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        System.out.println("Tv Ligada? " + smartTv.ligada);
        System.out.println("Canal Atual.: " + smartTv.canal);
        System.out.println("Volume Atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Tv Ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Tv Ligada? " + smartTv.ligada);

        smartTv.ligar();
        System.out.println("Tv Ligada? " + smartTv.ligada);

        smartTv.aumentarVolume();
        System.out.println("Volume Atual: " + smartTv.volume);

        smartTv.aumentarVolume();
        System.out.println("Volume Atual: " + smartTv.volume);

        smartTv.aumentarVolume();
        System.out.println("Volume Atual: " + smartTv.volume);

        smartTv.aumentarVolume();
        System.out.println("Volume Atual: " + smartTv.volume);

        smartTv.aumentarVolume();
        System.out.println("Volume Atual: " + smartTv.volume);

        smartTv.diminuirVolume();
        System.out.println("Volume Atual: " + smartTv.volume);

        smartTv.diminuirVolume();
        System.out.println("Volume Atual: " + smartTv.volume);

        smartTv.avancarCanal();
        System.out.println("Canal Atual.: " + smartTv.canal);

        smartTv.avancarCanal();
        System.out.println("Canal Atual.: " + smartTv.canal);

        smartTv.avancarCanal();
        System.out.println("Canal Atual.: " + smartTv.canal);

        smartTv.voltarCanal();
        System.out.println("Canal Atual.: " + smartTv.canal);

        smartTv.mudarCanal(4);
        System.out.println("Canal Atual.: " + smartTv.canal);

        smartTv.desligar();
        System.out.println("Tv Ligada? " + smartTv.ligada);

    }
}
