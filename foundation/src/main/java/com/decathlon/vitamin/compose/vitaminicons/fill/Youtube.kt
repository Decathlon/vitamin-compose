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

public val FillGroup.Youtube: ImageVector
    get() {
        if (_youtube != null) {
            return _youtube!!
        }
        _youtube = Builder(name = "Youtube", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(22.0f, 12.0f)
                curveTo(22.0f, 12.0f, 22.0f, 8.28f, 21.543f, 6.498f)
                curveTo(21.292f, 5.516f, 20.55f, 4.742f, 19.605f, 4.476f)
                curveTo(17.896f, 4.0f, 12.0f, 4.0f, 12.0f, 4.0f)
                curveTo(12.0f, 4.0f, 6.107f, 4.0f, 4.395f, 4.476f)
                curveTo(3.454f, 4.738f, 2.711f, 5.513f, 2.457f, 6.498f)
                curveTo(2.0f, 8.28f, 2.0f, 12.0f, 2.0f, 12.0f)
                curveTo(2.0f, 12.0f, 2.0f, 15.72f, 2.457f, 17.502f)
                curveTo(2.708f, 18.484f, 3.45f, 19.258f, 4.395f, 19.524f)
                curveTo(6.107f, 20.0f, 12.0f, 20.0f, 12.0f, 20.0f)
                curveTo(12.0f, 20.0f, 17.896f, 20.0f, 19.605f, 19.524f)
                curveTo(20.546f, 19.262f, 21.289f, 18.487f, 21.543f, 17.502f)
                curveTo(22.0f, 15.72f, 22.0f, 12.0f, 22.0f, 12.0f)
                close()
                moveTo(16.0f, 12.0f)
                lineTo(10.0f, 15.5f)
                verticalLineTo(8.5f)
                lineTo(16.0f, 12.0f)
                close()
            }
        }
        .build()
        return _youtube!!
    }

private var _youtube: ImageVector? = null
