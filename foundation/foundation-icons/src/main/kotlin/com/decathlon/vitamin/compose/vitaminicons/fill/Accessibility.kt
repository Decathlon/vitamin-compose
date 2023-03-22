package com.decathlon.vitamin.compose.vitaminicons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.vitaminicons.FillGroup

public val FillGroup.Accessibility: ImageVector
    get() {
        if (_accessibility != null) {
            return _accessibility!!
        }
        _accessibility = Builder(name = "Accessibility", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 22.0f)
                curveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f)
                curveTo(2.0f, 6.477f, 6.477f, 2.0f, 12.0f, 2.0f)
                curveTo(17.523f, 2.0f, 22.0f, 6.477f, 22.0f, 12.0f)
                curveTo(22.0f, 17.523f, 17.523f, 22.0f, 12.0f, 22.0f)
                close()
                moveTo(12.0f, 6.0f)
                curveTo(10.8954f, 6.0f, 10.0f, 6.8954f, 10.0f, 8.0f)
                curveTo(10.0f, 9.1046f, 10.8954f, 10.0f, 12.0f, 10.0f)
                curveTo(13.1046f, 10.0f, 14.0f, 9.1046f, 14.0f, 8.0f)
                curveTo(14.0f, 6.8954f, 13.1046f, 6.0f, 12.0f, 6.0f)
                close()
                moveTo(7.0299f, 10.7575f)
                curveTo(7.1638f, 10.2217f, 7.7067f, 9.8959f, 8.2425f, 10.0299f)
                lineTo(12.0f, 10.9692f)
                lineTo(15.7575f, 10.0299f)
                curveTo(16.2933f, 9.8959f, 16.8362f, 10.2217f, 16.9701f, 10.7575f)
                curveTo(17.1041f, 11.2933f, 16.7783f, 11.8362f, 16.2425f, 11.9701f)
                lineTo(13.0721f, 12.7628f)
                lineTo(15.8f, 16.4f)
                curveTo(16.1314f, 16.8418f, 16.0418f, 17.4686f, 15.6f, 17.8f)
                curveTo(15.1582f, 18.1314f, 14.5314f, 18.0418f, 14.2f, 17.6f)
                lineTo(12.0f, 14.6667f)
                lineTo(9.8f, 17.6f)
                curveTo(9.4686f, 18.0418f, 8.8418f, 18.1314f, 8.4f, 17.8f)
                curveTo(7.9582f, 17.4686f, 7.8686f, 16.8418f, 8.2f, 16.4f)
                lineTo(10.9279f, 12.7628f)
                lineTo(7.7575f, 11.9701f)
                curveTo(7.2217f, 11.8362f, 6.8959f, 11.2933f, 7.0299f, 10.7575f)
                close()
            }
        }
        .build()
        return _accessibility!!
    }

private var _accessibility: ImageVector? = null
