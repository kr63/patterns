package state.example.after.states;

import state.example.after.CeilingFanPullChain;

public class Low implements State {
    @Override
    public void pull(CeilingFanPullChain wrapper) {
        wrapper.set_state(new Medium());
        System.out.println("medium speed");
    }
}
