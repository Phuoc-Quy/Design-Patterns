class Client {
    private Handler handler;

    public Client(Handler handler) {
        this.handler = handler;
    }

    public void makeRequest(String request) {
        handler.handleRequest(request);
    }
}