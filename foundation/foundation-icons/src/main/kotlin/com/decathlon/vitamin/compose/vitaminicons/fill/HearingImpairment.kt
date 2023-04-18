package com.decathlon.vitamin.compose.vitaminicons.fill

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
import com.decathlon.vitamin.compose.vitaminicons.FillGroup

public val FillGroup.HearingImpairment: ImageVector
    get() {
        if (_hearingImpairment != null) {
            return _hearingImpairment!!
        }
        _hearingImpairment = Builder(name = "HearingImpairment", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.652f, 7.3628f)
                lineTo(22.0001f, 4.0147f)
                lineTo(20.5859f, 2.6005f)
                lineTo(2.6006f, 20.5858f)
                lineTo(4.0148f, 22.0f)
                lineTo(16.9304f, 9.0845f)
                curveTo(16.9383f, 9.2063f, 16.9423f, 9.3297f, 16.9423f, 9.4546f)
                curveTo(16.9423f, 9.9747f, 16.7747f, 10.4612f, 16.4586f, 10.9958f)
                curveTo(16.1752f, 11.4751f, 15.8104f, 11.9351f, 15.3816f, 12.476f)
                curveTo(15.3106f, 12.5655f, 15.2379f, 12.6572f, 15.1636f, 12.7515f)
                curveTo(14.1573f, 14.028f, 12.9555f, 15.6529f, 12.9555f, 18.0249f)
                curveTo(12.9555f, 18.5548f, 12.9365f, 19.0177f, 12.7275f, 19.366f)
                curveTo(12.5853f, 19.6029f, 12.2296f, 20.0f, 10.9725f, 20.0f)
                verticalLineTo(22.0f)
                curveTo(12.7139f, 22.0f, 13.8391f, 21.4004f, 14.4424f, 20.3952f)
                curveTo(14.9583f, 19.5354f, 14.9565f, 18.5546f, 14.9556f, 18.079f)
                lineTo(14.9555f, 18.0249f)
                curveTo(14.9555f, 16.3919f, 15.7471f, 15.2419f, 16.7343f, 13.9896f)
                curveTo(16.8001f, 13.9061f, 16.8675f, 13.8213f, 16.9359f, 13.7351f)
                curveTo(17.3591f, 13.2026f, 17.821f, 12.6212f, 18.1802f, 12.0137f)
                curveTo(18.6116f, 11.284f, 18.9423f, 10.4447f, 18.9423f, 9.4546f)
                curveTo(18.9423f, 8.7144f, 18.8399f, 8.0148f, 18.652f, 7.3628f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.464f, 2.0f)
                curveTo(13.2674f, 2.0f, 15.0678f, 2.6921f, 16.45f, 3.9086f)
                lineTo(15.0326f, 5.3259f)
                lineTo(13.64f, 6.7179f)
                curveTo(13.0459f, 6.253f, 12.2977f, 5.9759f, 11.4848f, 5.9759f)
                curveTo(9.5518f, 5.9759f, 7.9848f, 7.5429f, 7.9848f, 9.4759f)
                lineTo(5.4856f, 9.4546f)
                horizontalLineTo(3.9853f)
                curveTo(3.9853f, 4.9888f, 7.6812f, 2.0f, 11.464f, 2.0f)
                close()
            }
        }
        .build()
        return _hearingImpairment!!
    }

private var _hearingImpairment: ImageVector? = null
