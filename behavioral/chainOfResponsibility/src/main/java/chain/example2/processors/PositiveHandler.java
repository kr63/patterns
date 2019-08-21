package chain.example2.processors;

import chain.example2.Request;

public class PositiveHandler implements Handler {

    private Handler nextInChain;

    @Override
    public void setNext(Handler nextHandler) {
        this.nextInChain = nextHandler;
    }

    @Override
    public void process(Request request) {

        if (request.getNumber() < 0) nextInChain.process(request);

        System.out.println("PositiveHandler: " + request.getNumber());
    }
}
