package chain.example2;

import chain.example2.processors.Handler;
import chain.example2.processors.NegativeHandler;
import chain.example2.processors.PositiveHandler;
import chain.example2.processors.ZeroHandler;

public class ChainDemo2 {
    public static void main(String[] args) {
        Handler handler1 = new NegativeHandler();
        Handler handler2 = new ZeroHandler();
        Handler handler3 = new PositiveHandler();

        handler1.setNext(handler2);
        handler2.setNext(handler3);

        handler1.process(new Request(0));
    }
}
