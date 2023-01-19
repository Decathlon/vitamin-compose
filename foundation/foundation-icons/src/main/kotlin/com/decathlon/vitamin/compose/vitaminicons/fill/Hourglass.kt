package com.decathlon.vitamin.compose.vitaminicons.fill

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
import com.decathlon.vitamin.compose.vitaminicons.FillGroup

public val FillGroup.Hourglass: ImageVector
    get() {
        if (_hourglass != null) {
            return _hourglass!!
        }
        _hourglass = Builder(name = "Hourglass", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(12.0f, 1.3333f)
                    horizontalLineTo(4.0f)
                    verticalLineTo(2.6667f)
                    horizontalLineTo(4.6667f)
                    verticalLineTo(5.3333f)
                    curveTo(4.6667f, 6.4237f, 5.1902f, 7.3918f, 5.9997f, 8.0f)
                    curveTo(5.1902f, 8.6081f, 4.6667f, 9.5763f, 4.6667f, 10.6666f)
                    verticalLineTo(13.3333f)
                    horizontalLineTo(4.0f)
                    verticalLineTo(14.6666f)
                    horizontalLineTo(12.0f)
                    verticalLineTo(13.3333f)
                    horizontalLineTo(11.3333f)
                    verticalLineTo(10.6666f)
                    curveTo(11.3333f, 9.5763f, 10.8098f, 8.6081f, 10.0003f, 8.0f)
                    curveTo(10.8098f, 7.3918f, 11.3333f, 6.4237f, 11.3333f, 5.3333f)
                    verticalLineTo(2.6667f)
                    horizontalLineTo(12.0f)
                    verticalLineTo(1.3333f)
                    close()
                    moveTo(10.0f, 5.3333f)
                    horizontalLineTo(6.0f)
                    verticalLineTo(2.6667f)
                    horizontalLineTo(10.0f)
                    verticalLineTo(5.3333f)
                    close()
                    moveTo(10.0f, 10.6666f)
                    curveTo(10.0f, 9.5621f, 9.1046f, 8.6666f, 8.0f, 8.6666f)
                    curveTo(6.8954f, 8.6666f, 6.0f, 9.5621f, 6.0f, 10.6666f)
                    horizontalLineTo(10.0f)
                    close()
                }
            }
        }
        .build()
        return _hourglass!!
    }

private var _hourglass: ImageVector? = null
