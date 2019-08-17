package com.bullraider.oops.designpatterns.statemachine.states;

import com.bullraider.oops.designpatterns.statemachine.FiniteAutomata;
import com.bullraider.oops.designpatterns.statemachine.StateTransitions;

public class Q3 implements StateTransitions {

    public void whenZero(FiniteAutomata transitions) {
        transitions.changeState(1);
    }

    public void whenOne(FiniteAutomata transitions) {
        transitions.changeState(1);
    }

    public boolean accepted() {
        return false;
    }

    @Override
    public String toString() {
        return "Q3{}";
    }
}
