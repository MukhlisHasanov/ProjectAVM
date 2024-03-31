public class ClientAndCount {
    private Client client;
    private int count;

    public ClientAndCount(Client client, int count) {
        this.client = client;
        this.count = count;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "{" + client + ", " + count + '}';
    }
}
