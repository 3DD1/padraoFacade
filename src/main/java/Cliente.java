public class Cliente {
    public boolean formar(){
        return ClienteFacade.verificaPendencias(this);
    }
}
