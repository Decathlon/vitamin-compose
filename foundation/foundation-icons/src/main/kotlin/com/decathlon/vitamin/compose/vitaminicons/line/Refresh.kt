package com.decathlon.vitamin.compose.vitaminicons.line

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.vitaminicons.LineGroup

public val LineGroup.Refresh: ImageVector
    get() {
        if (_refresh != null) {
            return _refresh!!
        }
        _refresh = Builder(name = "Refresh", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.6313f, 7.5081f)
                curveTo(7.9153f, 5.975f, 9.8439f, 5.0f, 12.0002f, 5.0f)
                curveTo(15.8662f, 5.0f, 19.0002f, 8.134f, 19.0002f, 12.0f)
                curveTo(19.0002f, 12.3119f, 18.9798f, 12.619f, 18.9403f, 12.9201f)
                lineTo(17.8002f, 11.4f)
                lineTo(16.2002f, 12.6f)
                lineTo(20.0002f, 17.6667f)
                lineTo(23.8002f, 12.6f)
                lineTo(22.2002f, 11.4f)
                lineTo(20.9353f, 13.0866f)
                curveTo(20.9781f, 12.7304f, 21.0002f, 12.3678f, 21.0002f, 12.0f)
                curveTo(21.0002f, 7.0294f, 16.9708f, 3.0f, 12.0002f, 3.0f)
                curveTo(9.3957f, 3.0f, 7.0496f, 4.1063f, 5.4062f, 5.8747f)
                lineTo(6.6313f, 7.5081f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0002f, 19.0f)
                curveTo(14.1565f, 19.0f, 16.0851f, 18.025f, 17.3691f, 16.4919f)
                lineTo(18.5942f, 18.1253f)
                curveTo(16.9508f, 19.8937f, 14.6047f, 21.0f, 12.0002f, 21.0f)
                curveTo(7.0296f, 21.0f, 3.0002f, 16.9706f, 3.0002f, 12.0f)
                curveTo(3.0002f, 11.6322f, 3.0223f, 11.2696f, 3.0651f, 10.9134f)
                lineTo(1.8002f, 12.6f)
                lineTo(0.2002f, 11.4f)
                lineTo(4.0002f, 6.3333f)
                lineTo(7.8002f, 11.4f)
                lineTo(6.2002f, 12.6f)
                lineTo(5.0601f, 11.0799f)
                curveTo(5.0206f, 11.381f, 5.0002f, 11.6881f, 5.0002f, 12.0f)
                curveTo(5.0002f, 15.866f, 8.1342f, 19.0f, 12.0002f, 19.0f)
                close()
            }
        }
        .build()
        return _refresh!!
    }

private var _refresh: ImageVector? = null
