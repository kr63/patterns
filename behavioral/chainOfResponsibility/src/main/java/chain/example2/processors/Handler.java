package chain.example2.processors;

import chain.example2.Request;

public interface Handler {
    Handler linkWith(Handler handler);

    void process(Request request);
}
