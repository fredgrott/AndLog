package com.mobilebytes.andlog;

import android.opengl.GLSurfaceView;
import android.opengl.GLSurfaceView.GLWrapper;
import android.util.Log;

//TODO: Auto-generated Javadoc
/**
 * The Class GLLogger.
 *
 * @author fredgrott
 */
public class GLLogger {
    /**
     * Gl debug.
     *
     * @param gl
     *            the gl
     * @param glWrapper
     *            the gl wrapper
     * @param debugFlags
     *            the debug flags
     * @param logTag
     *            the lO g_ tag
     */
    public final void glDebug(GLSurfaceView gl,
            GLWrapper glWrapper, int debugFlags, String logTag) {
        if (Log.isLoggable(logTag, Log.DEBUG)) {
            gl.setGLWrapper(glWrapper);
            gl.setDebugFlags(debugFlags);

        } else {
            CustomLogger.i(logTag, "Log.d not enabled");
        }
    }
}