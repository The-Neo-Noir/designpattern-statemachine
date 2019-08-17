import com.bullraider.oops.designpatterns.statemachine.FiniteAutomata;
import com.bullraider.oops.designpatterns.statemachine.StateTransitions;
import com.bullraider.oops.designpatterns.statemachine.states.Q1;

public class Client {
    public static void main(String[] args) {
        String[] strings = {"1", "0", "0", "1"};
        StateTransitions Q1 = new Q1();
        FiniteAutomata finiteAutomata = new FiniteAutomata();

        for (int i = 0; i < strings.length; i++) {
            if (strings[i].equalsIgnoreCase("1")) {
                finiteAutomata.whenOne();
            } else {
                finiteAutomata.whenZero();
            }
        }
        boolean accepted = finiteAutomata.accepted();
        System.out.println(accepted);

    }
}
