package com.decathlon.vitamin.compose.vitaminicons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.vitaminicons.FillGroup

public val FillGroup.BodyScan: ImageVector
    get() {
        if (_bodyScan != null) {
            return _bodyScan!!
        }
        _bodyScan = Builder(name = "BodyScan", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.6668f, 10.6667f)
                verticalLineTo(13.3334f)
                horizontalLineTo(5.3335f)
                verticalLineTo(14.6667f)
                horizontalLineTo(1.3335f)
                verticalLineTo(10.6667f)
                horizontalLineTo(2.6668f)
                close()
                moveTo(14.6668f, 10.6667f)
                verticalLineTo(14.6667f)
                horizontalLineTo(10.6668f)
                verticalLineTo(13.3334f)
                horizontalLineTo(13.3335f)
                verticalLineTo(10.6667f)
                horizontalLineTo(14.6668f)
                close()
                moveTo(5.0002f, 4.6667f)
                curveTo(5.0002f, 5.4624f, 5.3162f, 6.2254f, 5.8788f, 6.788f)
                curveTo(6.4415f, 7.3506f, 7.2045f, 7.6667f, 8.0002f, 7.6667f)
                curveTo(8.7958f, 7.6667f, 9.5589f, 7.3506f, 10.1215f, 6.788f)
                curveTo(10.6841f, 6.2254f, 11.0002f, 5.4624f, 11.0002f, 4.6667f)
                horizontalLineTo(12.3335f)
                curveTo(12.3336f, 5.4596f, 12.1162f, 6.2374f, 11.7049f, 6.9153f)
                curveTo(11.2936f, 7.5932f, 10.7042f, 8.1453f, 10.0008f, 8.5114f)
                lineTo(10.0002f, 12.6667f)
                horizontalLineTo(6.0002f)
                verticalLineTo(8.512f)
                curveTo(5.2966f, 8.146f, 4.707f, 7.5939f, 4.2955f, 6.9158f)
                curveTo(3.8841f, 6.2378f, 3.6666f, 5.4598f, 3.6668f, 4.6667f)
                horizontalLineTo(5.0002f)
                close()
                moveTo(8.0002f, 3.3334f)
                curveTo(8.4422f, 3.3334f, 8.8661f, 3.509f, 9.1787f, 3.8215f)
                curveTo(9.4912f, 4.1341f, 9.6668f, 4.558f, 9.6668f, 5.0f)
                curveTo(9.6668f, 5.4421f, 9.4912f, 5.866f, 9.1787f, 6.1785f)
                curveTo(8.8661f, 6.4911f, 8.4422f, 6.6667f, 8.0002f, 6.6667f)
                curveTo(7.5581f, 6.6667f, 7.1342f, 6.4911f, 6.8217f, 6.1785f)
                curveTo(6.5091f, 5.866f, 6.3335f, 5.4421f, 6.3335f, 5.0f)
                curveTo(6.3335f, 4.558f, 6.5091f, 4.1341f, 6.8217f, 3.8215f)
                curveTo(7.1342f, 3.509f, 7.5581f, 3.3334f, 8.0002f, 3.3334f)
                close()
                moveTo(5.3335f, 1.3334f)
                verticalLineTo(2.6667f)
                lineTo(2.6668f, 2.666f)
                verticalLineTo(5.3334f)
                horizontalLineTo(1.3335f)
                verticalLineTo(1.3334f)
                horizontalLineTo(5.3335f)
                close()
                moveTo(14.6668f, 1.3334f)
                verticalLineTo(5.3334f)
                horizontalLineTo(13.3335f)
                verticalLineTo(2.6667f)
                horizontalLineTo(10.6668f)
                verticalLineTo(1.3334f)
                horizontalLineTo(14.6668f)
                close()
            }
        }
        .build()
        return _bodyScan!!
    }

private var _bodyScan: ImageVector? = null
