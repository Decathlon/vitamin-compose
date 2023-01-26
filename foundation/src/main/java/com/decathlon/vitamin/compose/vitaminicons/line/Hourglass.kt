package com.decathlon.vitamin.compose.vitaminicons.line

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.vitaminicons.LineGroup

public val LineGroup.Hourglass: ImageVector
    get() {
        if (_hourglass != null) {
            return _hourglass!!
        }
        _hourglass = Builder(name = "Hourglass", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(12.0f, 10.0f)
                    curveTo(13.1046f, 10.0f, 14.0f, 9.1046f, 14.0f, 8.0f)
                    horizontalLineTo(10.0f)
                    curveTo(10.0f, 9.1046f, 10.8954f, 10.0f, 12.0f, 10.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(12.0f, 16.0f)
                    curveTo(10.8954f, 16.0f, 10.0f, 16.8954f, 10.0f, 18.0f)
                    verticalLineTo(19.0f)
                    horizontalLineTo(14.0f)
                    verticalLineTo(18.0f)
                    curveTo(14.0f, 16.8954f, 13.1046f, 16.0f, 12.0f, 16.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(18.0f, 2.0f)
                    horizontalLineTo(6.0f)
                    verticalLineTo(4.0f)
                    horizontalLineTo(7.0f)
                    verticalLineTo(8.0f)
                    curveTo(7.0f, 9.6356f, 7.7853f, 11.0878f, 8.9995f, 12.0f)
                    curveTo(7.7853f, 12.9122f, 7.0f, 14.3644f, 7.0f, 16.0f)
                    verticalLineTo(20.0f)
                    horizontalLineTo(6.0f)
                    verticalLineTo(22.0f)
                    horizontalLineTo(18.0f)
                    verticalLineTo(20.0f)
                    horizontalLineTo(17.0f)
                    verticalLineTo(16.0f)
                    curveTo(17.0f, 14.3644f, 16.2147f, 12.9122f, 15.0005f, 12.0f)
                    curveTo(16.2147f, 11.0878f, 17.0f, 9.6356f, 17.0f, 8.0f)
                    verticalLineTo(4.0f)
                    horizontalLineTo(18.0f)
                    verticalLineTo(2.0f)
                    close()
                    moveTo(12.0f, 11.0f)
                    curveTo(13.6569f, 11.0f, 15.0f, 9.6568f, 15.0f, 8.0f)
                    verticalLineTo(4.0f)
                    horizontalLineTo(9.0f)
                    verticalLineTo(8.0f)
                    curveTo(9.0f, 9.6568f, 10.3431f, 11.0f, 12.0f, 11.0f)
                    close()
                    moveTo(15.0f, 16.0f)
                    curveTo(15.0f, 14.3431f, 13.6569f, 13.0f, 12.0f, 13.0f)
                    curveTo(10.3431f, 13.0f, 9.0f, 14.3431f, 9.0f, 16.0f)
                    verticalLineTo(20.0f)
                    horizontalLineTo(15.0f)
                    verticalLineTo(16.0f)
                    close()
                }
            }
        }
        .build()
        return _hourglass!!
    }

private var _hourglass: ImageVector? = null
