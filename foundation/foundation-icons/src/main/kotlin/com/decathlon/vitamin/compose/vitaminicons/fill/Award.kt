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

public val FillGroup.Award: ImageVector
    get() {
        if (_award != null) {
            return _award!!
        }
        _award = Builder(name = "Award", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(17.0f, 15.246f)
                verticalLineTo(22.117f)
                curveTo(17.0f, 22.2971f, 16.9032f, 22.4633f, 16.7465f, 22.5521f)
                curveTo(16.5898f, 22.6409f, 16.3975f, 22.6386f, 16.243f, 22.546f)
                lineTo(12.0f, 20.0f)
                lineTo(7.757f, 22.546f)
                curveTo(7.6023f, 22.6387f, 7.4098f, 22.6409f, 7.253f, 22.5519f)
                curveTo(7.0963f, 22.4628f, 6.9996f, 22.2963f, 7.0f, 22.116f)
                verticalLineTo(15.246f)
                curveTo(4.3482f, 13.1229f, 3.3264f, 9.5567f, 4.4514f, 6.3515f)
                curveTo(5.5765f, 3.1463f, 8.603f, 1.001f, 12.0f, 1.001f)
                curveTo(15.3969f, 1.001f, 18.4234f, 3.1463f, 19.5485f, 6.3515f)
                curveTo(20.6735f, 9.5567f, 19.6517f, 13.1229f, 17.0f, 15.246f)
                close()
                moveTo(12.0f, 15.0f)
                curveTo(15.3137f, 15.0f, 18.0f, 12.3137f, 18.0f, 9.0f)
                curveTo(18.0f, 5.6863f, 15.3137f, 3.0f, 12.0f, 3.0f)
                curveTo(8.6862f, 3.0f, 6.0f, 5.6863f, 6.0f, 9.0f)
                curveTo(6.0f, 12.3137f, 8.6862f, 15.0f, 12.0f, 15.0f)
                close()
                moveTo(8.0f, 9.0f)
                curveTo(8.0f, 11.2091f, 9.7908f, 13.0f, 12.0f, 13.0f)
                curveTo(14.2091f, 13.0f, 16.0f, 11.2091f, 16.0f, 9.0f)
                curveTo(16.0f, 6.7909f, 14.2091f, 5.0f, 12.0f, 5.0f)
                curveTo(9.7908f, 5.0f, 8.0f, 6.7909f, 8.0f, 9.0f)
                close()
            }
        }
        .build()
        return _award!!
    }

private var _award: ImageVector? = null
