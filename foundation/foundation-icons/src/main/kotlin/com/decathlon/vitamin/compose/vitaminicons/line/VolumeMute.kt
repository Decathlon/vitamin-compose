package com.decathlon.vitamin.compose.vitaminicons.line

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.vitaminicons.LineGroup

public val LineGroup.VolumeMute: ImageVector
    get() {
        if (_volumeMute != null) {
            return _volumeMute!!
        }
        _volumeMute = Builder(name = "VolumeMute", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.926f, 10.6666f)
                horizontalLineTo(1.3333f)
                curveTo(0.9651f, 10.6666f, 0.6666f, 10.3682f, 0.6666f, 10.0f)
                verticalLineTo(6.0f)
                curveTo(0.6666f, 5.6318f, 0.9651f, 5.3333f, 1.3333f, 5.3333f)
                horizontalLineTo(3.926f)
                lineTo(7.4553f, 2.4453f)
                curveTo(7.555f, 2.3636f, 7.6928f, 2.3467f, 7.8093f, 2.4018f)
                curveTo(7.9258f, 2.457f, 8.0f, 2.5744f, 8.0f, 2.7033f)
                verticalLineTo(13.2966f)
                curveTo(8.0f, 13.4255f, 7.9258f, 13.5429f, 7.8093f, 13.5981f)
                curveTo(7.6928f, 13.6533f, 7.555f, 13.6364f, 7.4553f, 13.5546f)
                lineTo(3.926f, 10.6666f)
                close()
                moveTo(6.6666f, 4.8133f)
                lineTo(4.402f, 6.6667f)
                horizontalLineTo(2.0f)
                verticalLineTo(9.3333f)
                horizontalLineTo(4.402f)
                lineTo(6.6666f, 11.1867f)
                verticalLineTo(4.8133f)
                close()
                moveTo(15.9666f, 10.3573f)
                lineTo(13.6093f, 8.0f)
                lineTo(15.9666f, 5.6426f)
                lineTo(15.0239f, 4.7f)
                lineTo(12.6666f, 7.0573f)
                lineTo(10.3093f, 4.7f)
                lineTo(9.3666f, 5.6426f)
                lineTo(11.7239f, 8.0f)
                lineTo(9.3666f, 10.3573f)
                lineTo(10.3093f, 11.3f)
                lineTo(12.6666f, 8.9426f)
                lineTo(15.0239f, 11.3f)
                lineTo(15.9666f, 10.3573f)
                close()
            }
        }
        .build()
        return _volumeMute!!
    }

private var _volumeMute: ImageVector? = null
