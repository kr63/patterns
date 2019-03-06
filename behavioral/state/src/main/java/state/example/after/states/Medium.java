package state.example.after.states;

import state.example.after.CeilingFanPullChain;

public class Medium implements State {
    @Override
    public void pull(CeilingFanPullChain wrapper) {
        wrapper.set_state(new High());
        System.out.println("high speed");
    }
}
