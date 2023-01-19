package com.decathlon.vitamin.compose.vitaminicons.line

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.vitaminicons.LineGroup

public val LineGroup.Sparkles: ImageVector
    get() {
        if (_sparkles != null) {
            return _sparkles!!
        }
        _sparkles = Builder(name = "Sparkles", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(12.6665f, 1.3333f)
                    lineTo(12.1263f, 2.7931f)
                    lineTo(10.6665f, 3.3333f)
                    lineTo(12.1263f, 3.8735f)
                    lineTo(12.6665f, 5.3333f)
                    lineTo(13.2067f, 3.8735f)
                    lineTo(14.6665f, 3.3333f)
                    lineTo(13.2067f, 2.7931f)
                    lineTo(12.6665f, 1.3333f)
                    close()
                    moveTo(8.5302f, 6.1361f)
                    lineTo(6.9997f, 2.0f)
                    lineTo(5.4692f, 6.1361f)
                    lineTo(1.333f, 7.6667f)
                    lineTo(5.4692f, 9.1972f)
                    lineTo(6.9997f, 13.3333f)
                    lineTo(8.5302f, 9.1972f)
                    lineTo(12.6663f, 7.6667f)
                    lineTo(8.5302f, 6.1361f)
                    close()
                    moveTo(8.8243f, 7.6667f)
                    lineTo(7.4925f, 7.1739f)
                    lineTo(6.9997f, 5.8421f)
                    lineTo(6.5069f, 7.1739f)
                    lineTo(5.1751f, 7.6667f)
                    lineTo(6.5069f, 8.1595f)
                    lineTo(6.9997f, 9.4913f)
                    lineTo(7.4925f, 8.1595f)
                    lineTo(8.8243f, 7.6667f)
                    close()
                    moveTo(11.9997f, 9.3333f)
                    lineTo(12.7199f, 11.2797f)
                    lineTo(14.6663f, 12.0f)
                    lineTo(12.7199f, 12.7202f)
                    lineTo(11.9997f, 14.6666f)
                    lineTo(11.2794f, 12.7202f)
                    lineTo(9.333f, 12.0f)
                    lineTo(11.2794f, 11.2797f)
                    lineTo(11.9997f, 9.3333f)
                    close()
                }
            }
        }
        .build()
        return _sparkles!!
    }

private var _sparkles: ImageVector? = null
