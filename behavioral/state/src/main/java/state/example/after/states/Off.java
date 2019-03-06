package state.example.after.states;

import state.example.after.CeilingFanPullChain;

public class Off implements State {
    @Override
    public void pull(CeilingFanPullChain wrapper) {
        wrapper.set_state(new Low());
        System.out.println("low speed");
    }
}
