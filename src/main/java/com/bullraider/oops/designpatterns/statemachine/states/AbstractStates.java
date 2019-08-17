package com.bullraider.oops.designpatterns.statemachine.states;

import com.bullraider.oops.designpatterns.statemachine.StateTransitions;

public abstract class AbstractStates implements StateTransitions {


    private final StateTransitions q1;
    private final StateTransitions q2;
    private final StateTransitions q3;

    private final StateTransitions currentState;

    public AbstractStates(StateTransitions q1, StateTransitions q2, StateTransitions q3) {
        this.q1=q1;
        this.q2=q2;
        this.q3=q3;
        currentState=this.q1;
    }
}
