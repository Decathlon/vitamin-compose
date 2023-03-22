package com.decathlon.vitamin.compose.vitaminicons.line

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.vitaminicons.LineGroup

public val LineGroup.Accessibility: ImageVector
    get() {
        if (_accessibility != null) {
            return _accessibility!!
        }
        _accessibility = Builder(name = "Accessibility", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(2.0f, 12.0f)
                curveTo(2.0f, 17.523f, 6.477f, 22.0f, 12.0f, 22.0f)
                curveTo(17.523f, 22.0f, 22.0f, 17.523f, 22.0f, 12.0f)
                curveTo(22.0f, 6.477f, 17.523f, 2.0f, 12.0f, 2.0f)
                curveTo(6.477f, 2.0f, 2.0f, 6.477f, 2.0f, 12.0f)
                close()
                moveTo(20.0f, 12.0f)
                curveTo(20.0f, 16.4183f, 16.4183f, 20.0f, 12.0f, 20.0f)
                curveTo(7.5817f, 20.0f, 4.0f, 16.4183f, 4.0f, 12.0f)
                curveTo(4.0f, 7.5817f, 7.5817f, 4.0f, 12.0f, 4.0f)
                curveTo(16.4183f, 4.0f, 20.0f, 7.5817f, 20.0f, 12.0f)
                close()
                moveTo(10.0f, 8.0f)
                curveTo(10.0f, 6.8954f, 10.8954f, 6.0f, 12.0f, 6.0f)
                curveTo(13.1046f, 6.0f, 14.0f, 6.8954f, 14.0f, 8.0f)
                curveTo(14.0f, 9.1046f, 13.1046f, 10.0f, 12.0f, 10.0f)
                curveTo(10.8954f, 10.0f, 10.0f, 9.1046f, 10.0f, 8.0f)
                close()
                moveTo(8.2425f, 10.0299f)
                curveTo(7.7067f, 9.8959f, 7.1638f, 10.2217f, 7.0299f, 10.7575f)
                curveTo(6.8959f, 11.2933f, 7.2217f, 11.8362f, 7.7575f, 11.9701f)
                lineTo(10.9279f, 12.7628f)
                lineTo(8.2f, 16.4f)
                curveTo(7.8686f, 16.8418f, 7.9582f, 17.4686f, 8.4f, 17.8f)
                curveTo(8.8418f, 18.1314f, 9.4686f, 18.0418f, 9.8f, 17.6f)
                lineTo(12.0f, 14.6667f)
                lineTo(14.2f, 17.6f)
                curveTo(14.5314f, 18.0418f, 15.1582f, 18.1314f, 15.6f, 17.8f)
                curveTo(16.0418f, 17.4686f, 16.1314f, 16.8418f, 15.8f, 16.4f)
                lineTo(13.0721f, 12.7628f)
                lineTo(16.2425f, 11.9701f)
                curveTo(16.7783f, 11.8362f, 17.1041f, 11.2933f, 16.9701f, 10.7575f)
                curveTo(16.8362f, 10.2217f, 16.2933f, 9.8959f, 15.7575f, 10.0299f)
                lineTo(12.0f, 10.9692f)
                lineTo(8.2425f, 10.0299f)
                close()
            }
        }
        .build()
        return _accessibility!!
    }

private var _accessibility: ImageVector? = null
