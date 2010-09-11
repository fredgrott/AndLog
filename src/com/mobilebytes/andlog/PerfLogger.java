package com.mobilebytes.andlog;

//TODO: Auto-generated Javadoc
/**
 * The Class PerfLogger.
 *
 * @author fredgrott
 */
public class PerfLogger {
    /** The Constant MILLISECONDSPERSECOND. */
    private static final int MILLISECONDSPERSECOND = 1000;
    /** The start time. */
    private static long      startTime             = 0;

    /**
     * Start.
     *
     * @param tagName
     *            the tag name
     */
    public static void start(String tagName) {
        startTime = System.currentTimeMillis();
        CustomLogger.d(tagName, "started PerfLogger");
    }

    /**
     * Stop.
     *
     * @param tagName
     *            the tag name
     */
    public static void stop(String tagName) {
        double d = (System.currentTimeMillis() - startTime)
                / MILLISECONDSPERSECOND;
        CustomLogger.d(tagName, "Fine PerfTrace\nTag: " + tagName
                + "\nTime spent: " + d + " s.");
    }

}
