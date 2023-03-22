package com.decathlon.vitamin.compose.vitaminicons.line

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.vitaminicons.LineGroup

public val LineGroup.BodyScan: ImageVector
    get() {
        if (_bodyScan != null) {
            return _bodyScan!!
        }
        _bodyScan = Builder(name = "BodyScan", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 16.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(4.0f)
                close()
                moveTo(22.0f, 16.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(22.0f)
                close()
                moveTo(7.5f, 7.0f)
                curveTo(7.5f, 8.0198f, 7.8463f, 9.0095f, 8.4822f, 9.8068f)
                curveTo(9.118f, 10.6042f, 10.0057f, 11.162f, 11.0f, 11.389f)
                verticalLineTo(17.0f)
                horizontalLineTo(13.0f)
                lineTo(13.001f, 11.388f)
                curveTo(13.9949f, 11.1609f, 14.8823f, 10.6031f, 15.5179f, 9.806f)
                curveTo(16.1536f, 9.0088f, 16.4998f, 8.0195f, 16.5f, 7.0f)
                horizontalLineTo(18.5f)
                curveTo(18.5002f, 8.1894f, 18.1741f, 9.356f, 17.5571f, 10.3729f)
                curveTo(16.9402f, 11.3898f, 16.056f, 12.2179f, 15.001f, 12.767f)
                lineTo(15.0f, 19.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(12.768f)
                curveTo(7.9446f, 12.2189f, 7.0602f, 11.3907f, 6.443f, 10.3737f)
                curveTo(5.8259f, 9.3566f, 5.4997f, 8.1897f, 5.5f, 7.0f)
                horizontalLineTo(7.5f)
                close()
                moveTo(12.0f, 5.0f)
                curveTo(12.663f, 5.0f, 13.2989f, 5.2634f, 13.7678f, 5.7322f)
                curveTo(14.2366f, 6.2011f, 14.5f, 6.837f, 14.5f, 7.5f)
                curveTo(14.5f, 8.163f, 14.2366f, 8.7989f, 13.7678f, 9.2678f)
                curveTo(13.2989f, 9.7366f, 12.663f, 10.0f, 12.0f, 10.0f)
                curveTo(11.337f, 10.0f, 10.7011f, 9.7366f, 10.2322f, 9.2678f)
                curveTo(9.7634f, 8.7989f, 9.5f, 8.163f, 9.5f, 7.5f)
                curveTo(9.5f, 6.837f, 9.7634f, 6.2011f, 10.2322f, 5.7322f)
                curveTo(10.7011f, 5.2634f, 11.337f, 5.0f, 12.0f, 5.0f)
                close()
                moveTo(8.0f, 2.0f)
                verticalLineTo(4.0f)
                lineTo(4.0f, 3.999f)
                verticalLineTo(8.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(8.0f)
                close()
                moveTo(22.0f, 2.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(22.0f)
                close()
            }
        }
        .build()
        return _bodyScan!!
    }

private var _bodyScan: ImageVector? = null
