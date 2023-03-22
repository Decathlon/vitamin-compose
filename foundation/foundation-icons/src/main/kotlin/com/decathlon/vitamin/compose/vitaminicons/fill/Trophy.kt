package com.decathlon.vitamin.compose.vitaminicons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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

public val FillGroup.Trophy: ImageVector
    get() {
        if (_trophy != null) {
            return _trophy!!
        }
        _trophy = Builder(name = "Trophy", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.625f, 16.938f)
                verticalLineTo(19.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(6.5f)
                verticalLineTo(19.0f)
                horizontalLineTo(10.875f)
                verticalLineTo(16.938f)
                curveTo(9.1834f, 16.6942f, 7.6277f, 15.7533f, 6.5f, 14.2917f)
                curveTo(5.3723f, 12.8302f, 4.75f, 10.9486f, 4.75f, 9.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(18.75f)
                verticalLineTo(9.0f)
                curveTo(18.75f, 10.9486f, 18.1277f, 12.8302f, 17.0f, 14.2917f)
                curveTo(15.8723f, 15.7533f, 14.3166f, 16.6942f, 12.625f, 16.938f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(1.0f, 5.25f)
                horizontalLineTo(3.7492f)
                lineTo(3.75f, 6.75f)
                horizontalLineTo(2.525f)
                curveTo(2.6058f, 7.8987f, 2.8686f, 8.5407f, 3.1099f, 8.8778f)
                curveTo(3.3875f, 9.2658f, 3.6261f, 9.2516f, 3.6442f, 9.249f)
                lineTo(3.8558f, 10.734f)
                curveTo(3.2072f, 10.8265f, 2.4458f, 10.5272f, 1.8901f, 9.7509f)
                curveTo(1.3463f, 8.9911f, 1.0f, 7.7911f, 1.0f, 6.0f)
                verticalLineTo(5.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(22.5f, 5.25f)
                horizontalLineTo(19.7508f)
                lineTo(19.75f, 6.75f)
                horizontalLineTo(20.975f)
                curveTo(20.8942f, 7.8987f, 20.6314f, 8.5407f, 20.3901f, 8.8778f)
                curveTo(20.1125f, 9.2658f, 19.8739f, 9.2516f, 19.8558f, 9.249f)
                lineTo(19.6442f, 10.734f)
                curveTo(20.2928f, 10.8265f, 21.0542f, 10.5272f, 21.6099f, 9.7509f)
                curveTo(22.1537f, 8.9911f, 22.5f, 7.7911f, 22.5f, 6.0f)
                verticalLineTo(5.25f)
                close()
            }
        }
        .build()
        return _trophy!!
    }

private var _trophy: ImageVector? = null
