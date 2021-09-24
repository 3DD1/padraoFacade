public class EmPreparo extends Setor{
    private static EmPreparo empreparo = new EmPreparo();

    private EmPreparo(){};

    public static EmPreparo getInstancia(){
        return empreparo;
    }
}
