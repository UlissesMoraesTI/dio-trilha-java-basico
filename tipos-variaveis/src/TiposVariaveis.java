public class TiposVariaveis {
    public static void main(String[] args) {

        boolean tvLigada = false;
        int volume = 0;
        int canal = 0;
        int novoCanal = 0;

        ligarTv();

        desligarTv();
        aumentaVolumeTv();
        diminuiVolumeTv();
        aumentaCanalTv();
        diminuiCanalTv();
        mudaCanalTv();

    }

    public ligarTv(){
        tvLigada = true;
        System.out.println("Ligada");        
    }

    public desligarTv(){
        tvLigada = false;        
        System.out.println("Deligada");        
    }

    public aumentaVolumeTv(){
        volume++;
        System.out.println("Volume " + volume);
    }

    public diminuiVolumeTv(){
        if (volume > 0){
            volume--;
            System.out.println("Volume " + volume);
        }        
    }

    public aumentaCanalTv(){
        canal++;
        System.out.println("Canal " + canal);
    }

    public diminuiCanalTv(){
        if (canal > 0){
            canal--;        
            System.out.println("Canal " + canal);
        }        
    }

    public mudaCanalTv(novoCanal);
        if (novoCanal > 0) {
            canal = novoCanal;
            System.out.println("Canal " + canal);
        }    
}
