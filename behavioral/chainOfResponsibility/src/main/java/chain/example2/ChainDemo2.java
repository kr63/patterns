package chain.example2;

import chain.example2.processors.Handler;
import chain.example2.processors.NegativeHandler;
import chain.example2.processors.PositiveHandler;
import chain.example2.processors.ZeroHandler;

public class ChainDemo2 {
    public static void main(String[] args) {
        Handler chain = new NegativeHandler();
        Handler zeroHandler = new ZeroHandler();
        Handler positiveHandler = new PositiveHandler();

        chain
            .linkWith(zeroHandler)
            .linkWith(positiveHandler);

        chain.process(new Request(-1));
        chain.process(new Request(0));
        chain.process(new Request(1));
    }
}
