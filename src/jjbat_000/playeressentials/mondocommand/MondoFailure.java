package jjbat_000.playeressentials.mondocommand;

import jjbat_000.playeressentials.mondocommand.ChatMagic;

/**
 * Convenience class for dealing with failure scenarios.
 * <p/>
 * <p>Using MondoFailure is not required in order to use the MondoCommand
 * library, but smart use of the exception can allow you to design clean
 * API's that can gracefully handle failure scenarios in commands
 * (such as permissions, incorrect world state, etc) by stopping the command
 * execution and also propagating a message outwards along with the failure.
 * <p/>
 * <p>See the MondoCommand home page for more information on how this exception
 * can be used.
 *
 * @author James Crasta
 */
public class MondoFailure extends Exception {
    private static final long serialVersionUID = 8065592348213485173L;

    public MondoFailure(String template, Object... args) {
        super(ChatMagic.colorize(template, args));
    }
}