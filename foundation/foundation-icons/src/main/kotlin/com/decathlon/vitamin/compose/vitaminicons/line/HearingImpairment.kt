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

public val LineGroup.HearingImpairment: ImageVector
    get() {
        if (_hearingImpairment != null) {
            return _hearingImpairment!!
        }
        _hearingImpairment = Builder(name = "HearingImpairment", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.4499f, 3.9086f)
                curveTo(15.0677f, 2.6921f, 13.2674f, 2.0f, 11.4639f, 2.0f)
                curveTo(7.6812f, 2.0f, 3.9853f, 4.9888f, 3.9853f, 9.4546f)
                horizontalLineTo(5.9853f)
                curveTo(5.9853f, 6.2139f, 8.6612f, 4.0f, 11.4639f, 4.0f)
                curveTo(12.7573f, 4.0f, 14.0361f, 4.4825f, 15.0325f, 5.3259f)
                lineTo(16.4499f, 3.9086f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.6404f, 6.718f)
                curveTo(13.0463f, 6.2531f, 12.2982f, 5.976f, 11.4853f, 5.976f)
                curveTo(9.5523f, 5.976f, 7.9853f, 7.543f, 7.9853f, 9.476f)
                horizontalLineTo(9.9853f)
                curveTo(9.9853f, 8.6476f, 10.6569f, 7.976f, 11.4853f, 7.976f)
                curveTo(11.7445f, 7.976f, 11.9883f, 8.0417f, 12.201f, 8.1574f)
                lineTo(13.6404f, 6.718f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.6519f, 7.3628f)
                lineTo(22.0f, 4.0147f)
                lineTo(20.5858f, 2.6005f)
                lineTo(2.6005f, 20.5858f)
                lineTo(4.0147f, 22.0f)
                lineTo(16.9303f, 9.0845f)
                curveTo(16.9382f, 9.2063f, 16.9422f, 9.3297f, 16.9422f, 9.4546f)
                curveTo(16.9422f, 9.9747f, 16.7746f, 10.4612f, 16.4585f, 10.9958f)
                curveTo(16.1751f, 11.4751f, 15.8104f, 11.9351f, 15.3815f, 12.476f)
                curveTo(15.3106f, 12.5655f, 15.2379f, 12.6572f, 15.1635f, 12.7515f)
                curveTo(14.1573f, 14.028f, 12.9555f, 15.6529f, 12.9555f, 18.0249f)
                curveTo(12.9555f, 18.5548f, 12.9365f, 19.0177f, 12.7274f, 19.366f)
                curveTo(12.5853f, 19.6029f, 12.2296f, 20.0f, 10.9725f, 20.0f)
                verticalLineTo(22.0f)
                curveTo(12.7139f, 22.0f, 13.8391f, 21.4004f, 14.4423f, 20.3952f)
                curveTo(14.9583f, 19.5354f, 14.9564f, 18.5546f, 14.9556f, 18.079f)
                lineTo(14.9555f, 18.0249f)
                curveTo(14.9555f, 16.3919f, 15.7471f, 15.2419f, 16.7342f, 13.9896f)
                curveTo(16.8f, 13.9061f, 16.8674f, 13.8213f, 16.9359f, 13.7351f)
                curveTo(17.359f, 13.2026f, 17.8209f, 12.6212f, 18.1801f, 12.0137f)
                curveTo(18.6115f, 11.284f, 18.9422f, 10.4447f, 18.9422f, 9.4546f)
                curveTo(18.9422f, 8.7144f, 18.8398f, 8.0148f, 18.6519f, 7.3628f)
                close()
            }
        }
        .build()
        return _hearingImpairment!!
    }

private var _hearingImpairment: ImageVector? = null
