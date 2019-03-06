package state.example.after.states;

import state.example.after.CeilingFanPullChain;

public class High implements State {
    @Override
    public void pull(CeilingFanPullChain wrapper) {
        wrapper.set_state(new Off());
        System.out.println("turning off");
    }
}
