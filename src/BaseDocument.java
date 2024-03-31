import java.util.ArrayList;
import java.util.List;

public abstract class BaseDocument {
    protected int id;
    protected List<ClientAndCount> clients;

    public BaseDocument(int id) {
        this.id = id;
        this.clients = new ArrayList<>();
    }

    public List<ClientAndCount> getClients() {
        return clients;
    }

    public void add(Client client, int count) {
        clients.add(new ClientAndCount(client, count));
    }
}