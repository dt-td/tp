package tutoraid.commons.core;

/**
 * Container for user visible messages.
 */
public class Messages {

    public static final String MESSAGE_UNKNOWN_COMMAND = "Unknown command";
    public static final String MESSAGE_INVALID_ADD_COMMAND = "Invalid add command format! "
            + "Must start with 'add -s' or 'add -p'";
    public static final String MESSAGE_INVALID_COMMAND_FORMAT = "Invalid command format! \n%1$s";
    public static final String MESSAGE_INVALID_DELETE_COMMAND = "Invalid delete command format! "
            + "Must start with 'del -s' or 'del -p'";
    public static final String MESSAGE_INVALID_VIEW_COMMAND = "Invalid view command format! "
            + "Must start with 'view -s' or 'view -l'";
    public static final String MESSAGE_INVALID_STUDENT_DISPLAYED_INDEX = "The student index provided is invalid";
    public static final String MESSAGE_INVALID_LESSON_DISPLAYED_INDEX = "The lesson index provided is invalid";
    public static final String MESSAGE_STUDENTS_LISTED_OVERVIEW = "%1$d students listed!";
}
