package state.example.after;

import state.example.after.states.Off;
import state.example.after.states.State;

public class CeilingFanPullChain {
    private State currentState;

    CeilingFanPullChain() {
        currentState = new Off();
    }

    public void set_state(State s) {
        currentState = s;
    }

    void pull() {
        currentState.pull(this);
    }
}
