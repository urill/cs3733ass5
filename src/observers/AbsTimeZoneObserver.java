package observers;

import javafx.scene.control.Label;
import models.Time;

/**
 * An abstract class to encompass any kind of time zone observer
 */
public abstract class AbsTimeZoneObserver {

    final Time time;
    final Label label;

    /**
     * Constructor
     *
     * @param time  Time object we are listening to
     * @param label Label to display this observers information
     */
    public AbsTimeZoneObserver(Time time, Label label) {
        this.time = time;
        this.label = label;
    }

    /**
     * Updates this Observers Calendar object with the new calculated Date and Time. Should be implemented by
     * each child class.
     */
    public abstract void update();
}
