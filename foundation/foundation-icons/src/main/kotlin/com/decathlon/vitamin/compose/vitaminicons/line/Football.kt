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

public val LineGroup.Football: ImageVector
    get() {
        if (_football != null) {
            return _football!!
        }
        _football = Builder(name = "Football", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 1.3333f)
                curveTo(11.682f, 1.3333f, 14.6666f, 4.318f, 14.6666f, 8.0f)
                curveTo(14.6666f, 11.682f, 11.682f, 14.6666f, 8.0f, 14.6666f)
                curveTo(4.318f, 14.6666f, 1.3333f, 11.682f, 1.3333f, 8.0f)
                curveTo(1.3333f, 4.318f, 4.318f, 1.3333f, 8.0f, 1.3333f)
                close()
                moveTo(9.1133f, 10.6666f)
                horizontalLineTo(6.8867f)
                lineTo(5.9667f, 11.9313f)
                lineTo(6.336f, 13.0686f)
                curveTo(6.8731f, 13.2446f, 7.4348f, 13.3339f, 8.0f, 13.3333f)
                curveTo(8.5807f, 13.3333f, 9.14f, 13.24f, 9.664f, 13.0686f)
                lineTo(10.0326f, 11.9313f)
                lineTo(9.1126f, 10.6666f)
                horizontalLineTo(9.1133f)
                close()
                moveTo(3.5293f, 7.248f)
                lineTo(2.668f, 7.8727f)
                lineTo(2.6667f, 8.0f)
                curveTo(2.6667f, 9.1533f, 3.0326f, 10.2206f, 3.6546f, 11.0933f)
                horizontalLineTo(4.928f)
                lineTo(5.81f, 9.88f)
                lineTo(5.1247f, 7.7667f)
                lineTo(3.5293f, 7.248f)
                close()
                moveTo(12.4706f, 7.248f)
                lineTo(10.8753f, 7.7667f)
                lineTo(10.19f, 9.88f)
                lineTo(11.0713f, 11.0933f)
                horizontalLineTo(12.3446f)
                curveTo(12.9892f, 10.1908f, 13.3349f, 9.109f, 13.3333f, 8.0f)
                lineTo(13.3313f, 7.8733f)
                lineTo(12.4706f, 7.248f)
                close()
                moveTo(8.0f, 6.3573f)
                lineTo(6.4373f, 7.492f)
                lineTo(7.0346f, 9.3333f)
                horizontalLineTo(8.9647f)
                lineTo(9.562f, 7.492f)
                lineTo(8.0f, 6.3573f)
                close()
                moveTo(9.5273f, 2.8886f)
                lineTo(8.6666f, 3.5153f)
                verticalLineTo(5.1933f)
                lineTo(10.4626f, 6.498f)
                lineTo(11.9553f, 6.0133f)
                lineTo(12.3246f, 4.878f)
                curveTo(11.6364f, 3.9252f, 10.6532f, 3.226f, 9.5273f, 2.8886f)
                close()
                moveTo(6.472f, 2.8886f)
                curveTo(5.3463f, 3.2263f, 4.3633f, 3.9258f, 3.6753f, 4.8787f)
                lineTo(4.0447f, 6.0133f)
                lineTo(5.5373f, 6.498f)
                lineTo(7.3333f, 5.1933f)
                verticalLineTo(3.5153f)
                lineTo(6.472f, 2.8886f)
                close()
            }
        }
        .build()
        return _football!!
    }

private var _football: ImageVector? = null
