public class Padaria extends{
    private static Padaria padaria = new Padaria();

    private Padaria(){};

    public static Padaria getInstancia(){
        return padaria;
    }
}
