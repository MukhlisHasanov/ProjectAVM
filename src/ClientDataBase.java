import java.util.ArrayList;
import java.util.List;

public class ClientDataBase {
    private List<ClientAndCount> clients;

    public ClientDataBase() {
        clients = new ArrayList<>();
    }

    public void addAll(List<ClientAndCount> clients) {
        for (ClientAndCount pac : clients) {
            Client client = pac.getClient();
            int count = pac.getCount();
            boolean found = false;
            for (ClientAndCount whpac : this.clients) {
                if (whpac.getClient().equals(client)) {
                    whpac.setCount(whpac.getCount() + count);
                    found = true;
                    break;
                }
            }
            if (!found) {
                this.clients.add(pac);
            }
        }
    }

    public void deleteAll(List<ClientAndCount> products) {
        for (ClientAndCount pac : products) {
            Client client = pac.getClient();
            int count = pac.getCount();
            boolean found = false;
            for (ClientAndCount whpac : this.clients) {
                if (whpac.getClient().equals(client)) {
                    // check if we can decrease count of product
                    if (whpac.getCount() >= count) {
                        whpac.setCount(whpac.getCount() - count);
                        found = true;
                        break;
                    } else {
                        // TODO exception: not enought of product
                    }
                }
            }
            if (!found) {
                // TODO exception: product not found
            }
        }
    }

    @Override
    public String toString() {
        return "Warehouse{" + clients + '}';
    }
}

