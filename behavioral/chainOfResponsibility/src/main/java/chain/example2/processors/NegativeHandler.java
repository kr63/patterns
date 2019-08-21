package chain.example2.processors;

import chain.example2.Request;

public class NegativeHandler implements Handler {

    private Handler nextInChain;

    @Override
    public Handler linkWith(Handler handler) {
        this.nextInChain = handler;
        return handler;
    }

    @Override
    public void process(Request request) {

        if (request.getNumber() < 0) {
            System.out.println("NegativeHandler: " + request.getNumber());
        } else {
            nextInChain.process(request);
        }
    }
}
