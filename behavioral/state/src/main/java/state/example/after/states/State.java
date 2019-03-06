package state.example.after.states;


import state.example.after.CeilingFanPullChain;

public interface State {
    void pull(CeilingFanPullChain wrapper);
}
