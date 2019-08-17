package com.bullraider.oops.designpatterns.statemachine.states;

import com.bullraider.oops.designpatterns.statemachine.FiniteAutomata;
import com.bullraider.oops.designpatterns.statemachine.StateTransitions;

public class Q2 implements StateTransitions  {


    public void whenZero(FiniteAutomata transitions) {
        transitions.changeState(2);

    }

    public void whenOne(FiniteAutomata transitions) {
        transitions.changeState(1);
    }

    public boolean accepted() {
        return true;
    }

    @Override
    public String toString() {
        return "Q2{}";
    }
}
