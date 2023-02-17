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

public val FillGroup.ThumbUp: ImageVector
    get() {
        if (_thumbUp != null) {
            return _thumbUp!!
        }
        _thumbUp = Builder(name = "ThumbUp", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(13.693f, 1.307f)
                lineTo(7.293f, 7.707f)
                curveTo(7.1055f, 7.8945f, 7.0001f, 8.1488f, 7.0f, 8.414f)
                verticalLineTo(20.0f)
                curveTo(7.0f, 20.5523f, 7.4477f, 21.0f, 8.0f, 21.0f)
                horizontalLineTo(18.83f)
                curveTo(19.2353f, 21.0002f, 19.6006f, 20.7557f, 19.755f, 20.381f)
                lineTo(22.85f, 12.866f)
                curveTo(22.9493f, 12.6242f, 23.0003f, 12.3654f, 23.0f, 12.104f)
                verticalLineTo(10.0f)
                curveTo(23.0f, 8.8954f, 22.1046f, 8.0f, 21.0f, 8.0f)
                horizontalLineTo(14.6f)
                lineTo(15.753f, 3.47f)
                curveTo(15.9026f, 2.883f, 15.6844f, 2.2637f, 15.2f, 1.9f)
                lineTo(14.347f, 1.26f)
                curveTo(14.1477f, 1.1106f, 13.8689f, 1.1306f, 13.693f, 1.307f)
                close()
                moveTo(5.0f, 9.0f)
                horizontalLineTo(2.0f)
                curveTo(1.4477f, 9.0f, 1.0f, 9.4477f, 1.0f, 10.0f)
                verticalLineTo(20.0f)
                curveTo(1.0f, 20.5523f, 1.4477f, 21.0f, 2.0f, 21.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(9.0f)
                close()
            }
        }
        .build()
        return _thumbUp!!
    }

private var _thumbUp: ImageVector? = null
