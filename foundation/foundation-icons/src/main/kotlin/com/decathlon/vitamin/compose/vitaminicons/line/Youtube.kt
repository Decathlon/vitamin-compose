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

public val LineGroup.Youtube: ImageVector
    get() {
        if (_youtube != null) {
            return _youtube!!
        }
        _youtube = Builder(name = "Youtube", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(21.543f, 6.498f)
                curveTo(22.0f, 8.28f, 22.0f, 12.0f, 22.0f, 12.0f)
                curveTo(22.0f, 12.0f, 22.0f, 15.72f, 21.543f, 17.502f)
                curveTo(21.289f, 18.487f, 20.546f, 19.262f, 19.605f, 19.524f)
                curveTo(17.896f, 20.0f, 12.0f, 20.0f, 12.0f, 20.0f)
                curveTo(12.0f, 20.0f, 6.107f, 20.0f, 4.395f, 19.524f)
                curveTo(3.45f, 19.258f, 2.708f, 18.484f, 2.457f, 17.502f)
                curveTo(2.0f, 15.72f, 2.0f, 12.0f, 2.0f, 12.0f)
                curveTo(2.0f, 12.0f, 2.0f, 8.28f, 2.457f, 6.498f)
                curveTo(2.711f, 5.513f, 3.454f, 4.738f, 4.395f, 4.476f)
                curveTo(6.107f, 4.0f, 12.0f, 4.0f, 12.0f, 4.0f)
                curveTo(12.0f, 4.0f, 17.896f, 4.0f, 19.605f, 4.476f)
                curveTo(20.55f, 4.742f, 21.292f, 5.516f, 21.543f, 6.498f)
                close()
                moveTo(19.606f, 6.995f)
                curveTo(19.53f, 6.697f, 19.314f, 6.472f, 19.067f, 6.403f)
                curveTo(18.63f, 6.28f, 16.5f, 6.0f, 12.0f, 6.0f)
                curveTo(7.5f, 6.0f, 5.372f, 6.28f, 4.931f, 6.403f)
                curveTo(4.687f, 6.471f, 4.471f, 6.696f, 4.394f, 6.995f)
                curveTo(4.285f, 7.419f, 4.0f, 9.196f, 4.0f, 12.0f)
                curveTo(4.0f, 14.804f, 4.285f, 16.58f, 4.394f, 17.006f)
                curveTo(4.47f, 17.303f, 4.686f, 17.528f, 4.932f, 17.596f)
                curveTo(5.372f, 17.72f, 7.5f, 18.0f, 12.0f, 18.0f)
                curveTo(16.5f, 18.0f, 18.629f, 17.72f, 19.069f, 17.597f)
                curveTo(19.313f, 17.529f, 19.529f, 17.304f, 19.606f, 17.005f)
                curveTo(19.715f, 16.581f, 20.0f, 14.8f, 20.0f, 12.0f)
                curveTo(20.0f, 9.2f, 19.715f, 7.42f, 19.606f, 6.995f)
                close()
                moveTo(10.0f, 8.5f)
                verticalLineTo(15.5f)
                lineTo(16.0f, 12.0f)
                lineTo(10.0f, 8.5f)
                close()
            }
        }
        .build()
        return _youtube!!
    }

private var _youtube: ImageVector? = null
