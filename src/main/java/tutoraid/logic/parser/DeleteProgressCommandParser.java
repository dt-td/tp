package tutoraid.logic.parser;

import tutoraid.commons.core.Messages;
import tutoraid.commons.core.index.Index;
import tutoraid.logic.commands.DeleteProgressCommand;
import tutoraid.logic.parser.exceptions.ParseException;

/**
 * Parses input arguments and creates a new DeleteProgressCommand object
 */
public class DeleteProgressCommandParser implements Parser<DeleteProgressCommand> {

    /**
     * Parses the given {@code String} of arguments in the context of the DeleteProgressCommand
     * and returns a DeleteProgressCommand object for execution.
     * @throws ParseException if the user input does not conform the expected format
     */
    public DeleteProgressCommand parse(String args) throws ParseException {
        try {
            Index index = ParserUtil.parseIndex(args);
            return new DeleteProgressCommand(index);
        } catch (ParseException pe) {
            throw new ParseException(
                    String.format(Messages.MESSAGE_INVALID_COMMAND_FORMAT, DeleteProgressCommand.MESSAGE_USAGE), pe);
        }
    }

}
