package com.mobilebytes.andlog;

import android.util.Config;
import android.util.Log;

/**
 * CustomLogger designed so that can use other objects to send as
 * messages for example in ORM classes, etc. Class coded to
 * Android Version 1.5 and up, hence the Config.LOGTAG if statement
 * parameters for debug and verbose for Android 1.5.
 *
 * Usage:
 * Define String TAG at beginning of class to use the methods later
 * in the class.
 *
 * @author fredgrott
 *
 */
public class CustomLogger {

    /**
     * d.
     *
     * @param myClass
     *            the my class
     * @param tag
     *            the tag
     * @param msg
     *            the msg
     */
    public static void d(Class<?> myClass, String tag,
            String msg) {
        if (Config.DEBUG || Log.isLoggable(tag, Log.DEBUG)) {
            Log.d(tag, myClass.getSimpleName() + ":" + msg);
        }
    }

    /**
     * d.
     *
     * @param myClass
     *            the my class
     * @param tag
     *            the tag
     * @param msg
     *            the msg
     * @param tr
     *            the tr
     */
    public static void d(Class<?> myClass, String tag,
            String msg, Throwable tr) {
        if (Config.DEBUG || Log.isLoggable(tag, Log.DEBUG)) {
            Log.d(tag, myClass.getSimpleName() + ":" + msg, tr);
        }
    }

    /**
     * d.
     *
     * @param obj
     *            the obj
     * @param tag
     *            the tag
     * @param msg
     *            the msg
     */
    public static void d(Object obj, String tag, String msg) {
        if (Log.isLoggable(tag, Log.DEBUG)) {
            Log.d(tag, obj.getClass().getSimpleName() + ":" + msg);
        }
    }

    /**
     * d.
     *
     * @param obj
     *            the obj
     * @param tag
     *            the tag
     * @param msg
     *            the msg
     * @param tr
     *            the tr
     */
    public static void d(Object obj, String tag, String msg,
            Throwable tr) {
        if (Config.DEBUG || Log.isLoggable(tag, Log.DEBUG)) {
            Log.d(tag, obj.getClass().getSimpleName() + ":" + msg, tr);
        }
    }

    /**
     * d.
     *
     * @param tag
     *            the tag
     * @param msg
     *            the msg
     */
    public static void d(String tag, String msg) {
        if (Config.DEBUG || Log.isLoggable(tag, Log.DEBUG)) {
            Log.d(tag, msg);
        }
    }

    /**
     * d.
     *
     * @param tag
     *            the tag
     * @param msg
     *            the msg
     * @param tr
     *            the tr
     */
    public static void d(String tag, String msg, Throwable tr) {
        if (Config.DEBUG || Log.isLoggable(tag, Log.DEBUG)) {
            Log.d(tag, msg, tr);
        }
    }

    /**
     * e.
     *
     * @param myClass
     *            the my class
     * @param tag
     *            the tag
     * @param msg
     *            the msg
     */
    public static void e(Class<?> myClass, String tag,
            String msg) {
        if (Log.isLoggable(tag, Log.ERROR)) {
            Log.e(tag, myClass.getSimpleName() + ":" + msg);
        }
    }

    /**
     * e.
     *
     * @param obj
     *            the obj
     * @param tag
     *            the tag
     * @param msg
     *            the msg
     */
    public static void e(Object obj, String tag, String msg) {
        if (Log.isLoggable(tag, Log.ERROR)) {
            Log.e(tag, obj.getClass().getSimpleName() + ":" + msg);
        }
    }

    /**
     * e.
     *
     * @param obj
     *            the obj
     * @param tag
     *            the tag
     * @param msg
     *            the msg
     * @param tr
     *            the tr
     */
    public static void e(Object obj, String tag, String msg,
            Throwable tr) {
        if (Log.isLoggable(tag, Log.ERROR)) {
            Log.e(tag, obj.getClass().getSimpleName() + ":" + msg, tr);
        }
    }

    /**
     * e.
     *
     * @param tag
     *            the tag
     * @param msg
     *            the msg
     */
    public static void e(String tag, String msg) {
        if (Log.isLoggable(tag, Log.ERROR)) {
            Log.e(tag, msg);
        }
    }

    /**
     * e.
     *
     * @param tag
     *            the tag
     * @param msg
     *            the msg
     * @param tr
     *            the tr
     */
    public static void e(String tag, String msg, Throwable tr) {
        if (Log.isLoggable(tag, Log.ERROR)) {
            Log.e(tag, msg, tr);
        }
    }

    /**
     * i.
     *
     * @param myClass
     *            the my class
     * @param tag
     *            the tag
     * @param msg
     *            the msg
     */
    public static void i(Class<?> myClass, String tag,
            String msg) {
        if (Log.isLoggable(tag, Log.INFO)) {
            Log.i(tag, myClass.getSimpleName() + ":" + msg);
        }
    }

    /**
     * i.
     *
     * @param myClass
     *            the my class
     * @param tag
     *            the tag
     * @param msg
     *            the msg
     * @param tr
     *            the tr
     */
    public static void i(Class<?> myClass, String tag,
            String msg, Throwable tr) {
        if (Log.isLoggable(tag, Log.INFO)) {
            Log.i(tag, myClass.getSimpleName() + ":" + msg, tr);
        }
    }

    /**
     * i.
     *
     * @param obj
     *            the obj
     * @param tag
     *            the tag
     * @param msg
     *            the msg
     */
    public static void i(Object obj, String tag, String msg) {
        if (Log.isLoggable(tag, Log.INFO)) {
            Log.i(tag, obj.getClass().getSimpleName() + ":" + msg);
        }
    }

    /**
     * i.
     *
     * @param obj
     *            the obj
     * @param tag
     *            the tag
     * @param msg
     *            the msg
     * @param tr
     *            the tr
     */
    public static void i(Object obj, String tag, String msg,
            final Throwable tr) {
        if (Log.isLoggable(tag, Log.INFO)) {
            Log.i(tag, obj.getClass().getSimpleName() + ":" + msg, tr);
        }
    }

    /**
     * i.
     *
     * @param tag
     *            the tag
     * @param msg
     *            the msg
     */
    public static void i(String tag, String msg) {
        if (Log.isLoggable(tag, Log.INFO)) {
            Log.i(tag, msg);
        }
    }

    /**
     * i.
     *
     * @param tag
     *            the tag
     * @param msg
     *            the msg
     * @param tr
     *            the tr
     */
    public static void i(String tag, String msg, Throwable tr) {
        if (Log.isLoggable(tag, Log.INFO)) {
            Log.i(tag, msg, tr);
        }
    }

    /**
     * v.
     *
     * @param myClass
     *            the my class
     * @param tag
     *            the tag
     * @param msg
     *            the msg
     */
    public static void v(Class<?> myClass, String tag,
            String msg) {
        if (Config.LOGV || Log.isLoggable(tag, Log.VERBOSE)) {
            Log.v(tag, myClass.getSimpleName() + ":" + msg);
        	}
    }

    /**
     * v.
     *
     * @param myClass
     *            the my class
     * @param tag
     *            the tag
     * @param msg
     *            the msg
     * @param tr
     *            the tr
     */
    public static void v(Class<?> myClass, String tag,
            String msg, Throwable tr) {
        if (Config.LOGV || Log.isLoggable(tag, Log.VERBOSE)) {
            Log.v(tag, myClass.getSimpleName() + ":" + msg, tr);
        }
    }

    /**
     * v.
     *
     * @param obj
     *            the obj
     * @param tag
     *            the tag
     * @param msg
     *            the msg
     */
    public static void v(Object obj, String tag, String msg) {
        if (Config.LOGV || Log.isLoggable(tag, Log.VERBOSE)) {
            Log.v(tag, obj.getClass().getSimpleName() + ":" + msg);
        }
    }

    /**
     * v.
     *
     * @param obj
     *            the obj
     * @param tag
     *            the tag
     * @param msg
     *            the msg
     * @param tr
     *            the tr
     */
    public static void v(Object obj, String tag, String msg,
            final Throwable tr) {
        if (Config.LOGV || Log.isLoggable(tag, Log.VERBOSE)) {
            Log.v(tag, obj.getClass().getSimpleName() + ":" + msg, tr);
        }
    }

    /**
     * v.
     *
     * @param tag
     *            the tag
     * @param msg
     *            the msg
     */
    public static void v(String tag, String msg) {
        if (Config.LOGV || Log.isLoggable(tag, Log.VERBOSE)) {

            Log.v(tag, msg);

        }

    }

    /**
     * v.
     *
     * @param tag
     *            the tag
     * @param msg
     *            the msg
     * @param tr
     *            the tr
     */
    public static void v(String tag, String msg, Throwable tr) {
        if (Config.LOGV || Log.isLoggable(tag, Log.VERBOSE)) {
            Log.v(tag, msg, tr);
        }
    }

    /**
     * w.
     *
     * @param myClass
     *            the my class
     * @param tag
     *            the tag
     * @param msg
     *            the msg
     */
    public static void w(Class<?> myClass, String tag,
            String msg) {
        if (Log.isLoggable(tag, Log.WARN)) {
            Log.w(tag, myClass.getSimpleName() + ":" + msg);
        }
    }

    /**
     * w.
     *
     * @param myClass
     *            the my class
     * @param tag
     *            the tag
     * @param msg
     *            the msg
     * @param tr
     *            the tr
     */
    public static void w(Class<?> myClass, String tag,
            String msg, Throwable tr) {
        if (Log.isLoggable(tag, Log.WARN)) {
            Log.w(tag, myClass.getSimpleName() + ":" + msg, tr);
        }
    }

    /**
     * w.
     *
     * @param obj
     *            the obj
     * @param tag
     *            the tag
     * @param msg
     *            the msg
     */
    public static void w(Object obj, String tag, String msg) {
        if (Log.isLoggable(tag, Log.WARN)) {
            Log.w(tag, obj.getClass().getSimpleName() + ":" + msg);
        }
    }

    /**
     * w.
     *
     * @param obj
     *            the obj
     * @param tag
     *            the tag
     * @param msg
     *            the msg
     * @param tr
     *            the tr
     */
    public static void w(Object obj, String tag, String msg,
            final Throwable tr) {
        if (Log.isLoggable(tag, Log.WARN)) {
            Log.w(tag, obj.getClass().getSimpleName() + ":" + msg, tr);
        }
    }

    /**
     * w.
     *
     * @param tag
     *            the tag
     * @param msg
     *            the msg
     */
    public static void w(String tag, String msg) {
        if (Log.isLoggable(tag, Log.WARN)) {
            Log.w(tag, msg);
        }
    }

    /**
     * w.
     *
     * @param tag
     *            the tag
     * @param msg
     *            the msg
     * @param tr
     *            the tr
     *
     *
     */
    public static void w(String tag, String msg, Throwable tr) {
        if (Log.isLoggable(tag, Log.WARN)) {
            Log.w(tag, msg, tr);
        }
    }

    /**
     * w.
     *
     * @param tag
     *            the tag
     * @param tr
     *            the tr
     */
    public static void w(String tag, Throwable tr) {
        if (Log.isLoggable(tag, Log.WARN)) {
            Log.w(tag, tr);
        }
    }
}