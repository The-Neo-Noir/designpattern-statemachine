package com.bullraider.oops.designpatterns.statemachine;

import com.bullraider.oops.designpatterns.statemachine.StateTransitions;
import com.bullraider.oops.designpatterns.statemachine.states.Q1;
import com.bullraider.oops.designpatterns.statemachine.states.Q2;
import com.bullraider.oops.designpatterns.statemachine.states.Q3;

public class FiniteAutomata {

    private StateTransitions[] stateTransitions = new StateTransitions[]{new Q1(), new Q2(), new Q3()};

    private StateTransitions currentState = stateTransitions[0];
    public void whenZero() {
        currentState.whenZero(this);

    }
    public void whenOne() {
        currentState.whenOne(this);
    }

    public void changeState( int index ) {
        currentState = stateTransitions[index];
    }

    public StateTransitions getCurrentState() {
        return this.currentState;
    }

    public boolean accepted() {

        return currentState.accepted();
    }
}
