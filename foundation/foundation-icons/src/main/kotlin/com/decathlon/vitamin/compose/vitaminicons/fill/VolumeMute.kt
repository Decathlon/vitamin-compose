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

public val FillGroup.VolumeMute: ImageVector
    get() {
        if (_volumeMute != null) {
            return _volumeMute!!
        }
        _volumeMute = Builder(name = "VolumeMute", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(1.3334f, 10.6666f)
                horizontalLineTo(3.9261f)
                lineTo(7.4554f, 13.5546f)
                curveTo(7.5551f, 13.6364f, 7.693f, 13.6533f, 7.8094f, 13.5981f)
                curveTo(7.9259f, 13.5429f, 8.0002f, 13.4255f, 8.0001f, 13.2966f)
                verticalLineTo(2.7033f)
                curveTo(8.0002f, 2.5744f, 7.9259f, 2.457f, 7.8094f, 2.4018f)
                curveTo(7.693f, 2.3467f, 7.5551f, 2.3636f, 7.4554f, 2.4453f)
                lineTo(3.9261f, 5.3333f)
                horizontalLineTo(1.3334f)
                curveTo(0.9652f, 5.3333f, 0.6667f, 5.6318f, 0.6667f, 6.0f)
                verticalLineTo(10.0f)
                curveTo(0.6667f, 10.3682f, 0.9652f, 10.6666f, 1.3334f, 10.6666f)
                close()
                moveTo(15.9667f, 10.3573f)
                lineTo(13.6094f, 8.0f)
                lineTo(15.9667f, 5.6426f)
                lineTo(15.0241f, 4.7f)
                lineTo(12.6667f, 7.0573f)
                lineTo(10.3094f, 4.7f)
                lineTo(9.3667f, 5.6426f)
                lineTo(11.7241f, 8.0f)
                lineTo(9.3667f, 10.3573f)
                lineTo(10.3094f, 11.3f)
                lineTo(12.6667f, 8.9426f)
                lineTo(15.0241f, 11.3f)
                lineTo(15.9667f, 10.3573f)
                close()
            }
        }
        .build()
        return _volumeMute!!
    }

private var _volumeMute: ImageVector? = null
