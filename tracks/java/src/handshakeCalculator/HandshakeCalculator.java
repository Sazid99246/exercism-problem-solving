package handshakeCalculator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The HandshakeCalculator class provides a method to calculate a series of
 * handshake signals
 * based on a given integer. Each bit of the integer corresponds to a specific
 * signal.
 */
public class HandshakeCalculator {

    /**
     * Default constructor for HandshakeCalculator.
     * This constructor doesn't perform any special operations and is provided
     * to create instances of this class if needed.
     */
    public HandshakeCalculator() {

    }

    /**
     * Calculates and returns a list of signals corresponding to the binary
     * representation of the given number.
     * Each bit in the number corresponds to a specific signal, and the presence of
     * a bit (when set to 1)
     * indicates that the corresponding signal should be included in the handshake.
     *
     * @param number The integer number used to calculate the handshake signals.
     * @return A list of signals representing the handshake.
     */
    List<Signal> calculateHandshake(int number) {
        List<Signal> signals = new ArrayList<Signal>();

        if ((number & 1) > 0) {
            signals.add(Signal.WINK);
        }
        if ((number & 2) > 0) {
            signals.add(Signal.DOUBLE_BLINK);
        }
        if ((number & 4) > 0) {
            signals.add(Signal.CLOSE_YOUR_EYES);
        }
        if ((number & 8) > 0) {
            signals.add(Signal.JUMP);
        }
        if ((number & 16) > 0) {
            Collections.reverse(signals);
        }

        return signals;
    }

}
