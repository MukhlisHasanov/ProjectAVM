public class ToClientDataBase extends BaseDocument {

    public ToClientDataBase(int id) {
        super(id);
    }

    public void toClientDataBase(ClientDataBase clientDataBase) {
        clientDataBase.addAll(clients);
    }
}