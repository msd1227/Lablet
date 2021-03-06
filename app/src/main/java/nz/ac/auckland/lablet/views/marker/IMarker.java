/*
 * Copyright 2013-2014.
 * Distributed under the terms of the GPLv3 License.
 *
 * Authors:
 *      Clemens Zeidler <czei002@aucklanduni.ac.nz>
 */
package nz.ac.auckland.lablet.views.marker;

import android.graphics.Canvas;
import android.view.MotionEvent;
import nz.ac.auckland.lablet.views.marker.AbstractMarkerPainter;


/**
 * Interface for a drawable, selectable marker that can handle motion events.
 */
public interface IMarker<P extends AbstractMarkerPainter> {
    void setTo(P painter, int index);

    void onDraw(Canvas canvas, float priority);

    boolean handleActionDown(MotionEvent ev);
    boolean handleActionUp(MotionEvent ev);
    boolean handleActionMove(MotionEvent ev);

    void setSelectedForDrag(boolean selectedForDrag);
    boolean isSelectedForDrag();

    void invalidate();
}
