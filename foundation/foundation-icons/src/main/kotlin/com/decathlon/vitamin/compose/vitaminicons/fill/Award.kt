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
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(11.3335f, 10.164f)
                verticalLineTo(14.7447f)
                curveTo(11.3335f, 14.8648f, 11.2689f, 14.9756f, 11.1645f, 15.0348f)
                curveTo(11.06f, 15.094f, 10.9318f, 15.0924f, 10.8288f, 15.0307f)
                lineTo(8.0001f, 13.3334f)
                lineTo(5.1715f, 15.0307f)
                curveTo(5.0684f, 15.0925f, 4.94f, 15.094f, 4.8355f, 15.0346f)
                curveTo(4.731f, 14.9752f, 4.6665f, 14.8642f, 4.6668f, 14.744f)
                verticalLineTo(10.164f)
                curveTo(2.899f, 8.7486f, 2.2178f, 6.3712f, 2.9678f, 4.2343f)
                curveTo(3.7178f, 2.0975f, 5.7355f, 0.6674f, 8.0001f, 0.6674f)
                curveTo(10.2648f, 0.6674f, 12.2825f, 2.0975f, 13.0325f, 4.2343f)
                curveTo(13.7825f, 6.3712f, 13.1013f, 8.7486f, 11.3335f, 10.164f)
                close()
                moveTo(8.0f, 10.0f)
                curveTo(10.2091f, 10.0f, 12.0f, 8.2091f, 12.0f, 6.0f)
                curveTo(12.0f, 3.7909f, 10.2091f, 2.0f, 8.0f, 2.0f)
                curveTo(5.7909f, 2.0f, 4.0f, 3.7909f, 4.0f, 6.0f)
                curveTo(4.0f, 8.2091f, 5.7909f, 10.0f, 8.0f, 10.0f)
                close()
                moveTo(5.3335f, 6.0f)
                curveTo(5.3335f, 7.4728f, 6.5274f, 8.6667f, 8.0001f, 8.6667f)
                curveTo(9.4729f, 8.6667f, 10.6668f, 7.4728f, 10.6668f, 6.0f)
                curveTo(10.6668f, 4.5273f, 9.4729f, 3.3333f, 8.0001f, 3.3333f)
                curveTo(6.5274f, 3.3333f, 5.3335f, 4.5273f, 5.3335f, 6.0f)
                close()
            }
        }
        .build()
        return _award!!
    }

private var _award: ImageVector? = null
