package chain.example2.processors;

import chain.example2.Request;

public interface Handler {
    void setNext(Handler handler);

    void process(Request request);
}
