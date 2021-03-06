package frc.robot.Util;

import edu.wpi.first.wpilibj.Preferences;

/**
 * All of our methods that don't have a home so we
 * just shoved them into an extra file.
 */
public class Util {

    static Preferences pref = Preferences.getInstance();

    /**
     * Retrieves a value from the SmartDash preference table.
     * If there is no set value, it sets the value in the preference
     * table to the backup.
     * 
     * @param key    the preference key
     * @param backup the value to set if there isn't a retrievable value
     * @return       the user-set value (or backup if there is none)
     */
	public static double getAndSetDouble(String key, double backup) {
		if(!pref.containsKey(key)) pref.putDouble(key, backup);
        return pref.getDouble(key, backup);
    }
}