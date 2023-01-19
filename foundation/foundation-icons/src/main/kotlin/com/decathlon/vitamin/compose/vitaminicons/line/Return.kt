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

public val LineGroup.Return: ImageVector
    get() {
        if (_return != null) {
            return _return!!
        }
        _return = Builder(name = "Return", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.8572f, 3.5247f)
                lineTo(4.3864f, 5.9955f)
                lineTo(6.8572f, 8.4663f)
                lineTo(7.7997f, 7.5237f)
                lineTo(6.938f, 6.662f)
                horizontalLineTo(8.6615f)
                curveTo(9.1845f, 6.662f, 9.686f, 6.8383f, 10.0487f, 7.1644f)
                curveTo(10.3996f, 7.48f, 10.661f, 7.9708f, 10.661f, 8.6957f)
                curveTo(10.661f, 9.4187f, 10.4014f, 9.8875f, 10.0583f, 10.1842f)
                curveTo(9.7003f, 10.4939f, 9.1976f, 10.661f, 8.6615f, 10.661f)
                horizontalLineTo(5.329f)
                verticalLineTo(11.994f)
                horizontalLineTo(8.6615f)
                curveTo(9.4583f, 11.994f, 10.2886f, 11.7475f, 10.9304f, 11.1924f)
                curveTo(11.587f, 10.6245f, 11.994f, 9.7773f, 11.994f, 8.6957f)
                curveTo(11.994f, 7.6158f, 11.5888f, 6.7566f, 10.94f, 6.1732f)
                curveTo(10.3029f, 5.6004f, 9.4714f, 5.329f, 8.6615f, 5.329f)
                horizontalLineTo(6.938f)
                lineTo(7.7997f, 4.4673f)
                lineTo(6.8572f, 3.5247f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.33f, 1.9965f)
                curveTo(1.33f, 1.6284f, 1.6284f, 1.33f, 1.9965f, 1.33f)
                horizontalLineTo(13.9935f)
                curveTo(14.3616f, 1.33f, 14.66f, 1.6284f, 14.66f, 1.9965f)
                verticalLineTo(13.9935f)
                curveTo(14.66f, 14.3616f, 14.3616f, 14.66f, 13.9935f, 14.66f)
                horizontalLineTo(1.9965f)
                curveTo(1.6284f, 14.66f, 1.33f, 14.3616f, 1.33f, 13.9935f)
                verticalLineTo(1.9965f)
                close()
                moveTo(2.663f, 2.663f)
                verticalLineTo(13.327f)
                horizontalLineTo(13.327f)
                verticalLineTo(2.663f)
                horizontalLineTo(2.663f)
                close()
            }
        }
        .build()
        return _return!!
    }

private var _return: ImageVector? = null
