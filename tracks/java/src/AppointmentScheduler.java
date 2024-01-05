import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

/**
 * The {@code AppointmentScheduler} class is used for managing and interacting
 * with appointments.
 * It provides functionalities such as scheduling appointments, checking if an
 * appointment has passed,
 * determining if an appointment is in the afternoon, getting a descriptive
 * string for an appointment,
 * and determining the anniversary date of the current year.
 */
public class AppointmentScheduler {

    /**
     * Default constructor for AppointmentScheduler.
     * This constructor doesn't perform any special operations and is provided
     * to create instances of this class if needed.
     */
    public AppointmentScheduler() {

    }

    /**
     * Schedules an appointment based on the given date and time description.
     *
     * @param appointmentDateDescription a String representing the date and time of
     *                                   the appointment
     *                                   in the format "MM/dd/yyyy HH:mm:ss".
     * @return the scheduled {@code LocalDateTime} object.
     * @throws DateTimeParseException if the appointmentDateDescription does not
     *                                match the expected format.
     */
    public LocalDateTime schedule(String appointmentDateDescription) {
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");
        return LocalDateTime.parse(appointmentDateDescription, dateFormatter);
    }

    /**
     * Checks if a given appointment date and time has already passed.
     *
     * @param appointmentDate the {@code LocalDateTime} of the appointment to check.
     * @return {@code true} if the appointment date and time is before the current
     *         date and time,
     *         {@code false} otherwise.
     */
    public boolean hasPassed(LocalDateTime appointmentDate) {
        return appointmentDate.isBefore(LocalDateTime.now());
    }

    /**
     * Determines if the appointment is scheduled for the afternoon.
     *
     * @param appointmentDate the {@code LocalDateTime} of the appointment to check.
     * @return {@code true} if the appointment is between 12:00 PM and 6:00 PM,
     *         {@code false} otherwise.
     */
    public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {
        return appointmentDate.getHour() >= 12 && appointmentDate.getHour() < 18;
    }

    /**
     * Provides a descriptive String for a given appointment date and time.
     *
     * @param appointmentDate the {@code LocalDateTime} of the appointment.
     * @return a String describing the appointment date and time in a human-readable
     *         format.
     */
    public String getDescription(LocalDateTime appointmentDate) {
        return "You have an appointment on "
                + appointmentDate.format(DateTimeFormatter.ofPattern("EEEE, LLLL d, yyyy, ")) + "at "
                + appointmentDate.format(DateTimeFormatter.ofPattern("h:mm a."));
    }

    /**
     * Determines the anniversary date for the current year.
     *
     * @return the {@code LocalDate} representing September 15th of the current
     *         year.
     */
    public LocalDate getAnniversaryDate() {
        return LocalDate.of(LocalDate.now().getYear(), 9, 15);
    }
}
