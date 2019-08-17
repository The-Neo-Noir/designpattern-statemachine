
package  com.bullraider.oops.designpatterns.statemachine;
public interface StateTransitions {
    void whenZero(FiniteAutomata transitions);
    void whenOne(FiniteAutomata transitions);
     boolean accepted();

}
