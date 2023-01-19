package com.decathlon.vitamin.compose.vitaminassets.logos

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
import com.decathlon.vitamin.compose.vitaminassets.LogosGroup

public val LogosGroup.DecathlonFaviconBlack: ImageVector
    get() {
        if (_decathlonFaviconBlack != null) {
            return _decathlonFaviconBlack!!
        }
        _decathlonFaviconBlack = Builder(name = "DecathlonFaviconBlack", defaultWidth = 32.0.dp,
                defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(32.0f)
                verticalLineToRelative(32.0f)
                horizontalLineToRelative(-32.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF001018)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(32.0f, 32.0f)
                horizontalLineTo(0.0f)
                verticalLineTo(0.0f)
                horizontalLineTo(32.0f)
                verticalLineTo(32.0f)
                close()
                moveTo(7.7f, 7.716f)
                verticalLineTo(24.167f)
                horizontalLineTo(14.2f)
                curveTo(16.606f, 24.167f, 18.261f, 23.843f, 20.11f, 22.131f)
                curveTo(21.3986f, 20.9292f, 22.2397f, 19.3245f, 22.495f, 17.581f)
                verticalLineTo(24.156f)
                horizontalLineTo(31.9f)
                verticalLineTo(20.548f)
                horizontalLineTo(26.726f)
                verticalLineTo(17.566f)
                horizontalLineTo(31.21f)
                verticalLineTo(14.025f)
                horizontalLineTo(26.726f)
                verticalLineTo(11.339f)
                horizontalLineTo(31.905f)
                verticalLineTo(7.716f)
                horizontalLineTo(22.491f)
                verticalLineTo(14.364f)
                curveTo(22.273f, 12.5663f, 21.4197f, 10.9058f, 20.085f, 9.682f)
                curveTo(18.256f, 8.037f, 16.327f, 7.716f, 13.614f, 7.716f)
                horizontalLineTo(7.7f)
                close()
            }
            path(fill = SolidColor(Color(0xFF001018)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.615f, 11.253f)
                horizontalLineTo(11.936f)
                verticalLineTo(20.553f)
                horizontalLineTo(13.636f)
                curveTo(16.876f, 20.553f, 18.405f, 19.122f, 18.405f, 15.885f)
                curveTo(18.405f, 12.923f, 16.725f, 11.253f, 13.615f, 11.253f)
                close()
            }
        }
        .build()
        return _decathlonFaviconBlack!!
    }

private var _decathlonFaviconBlack: ImageVector? = null
