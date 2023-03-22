package com.decathlon.vitamin.compose.vitaminicons.line

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
import com.decathlon.vitamin.compose.vitaminicons.LineGroup

public val LineGroup.Trophy: ImageVector
    get() {
        if (_trophy != null) {
            return _trophy!!
        }
        _trophy = Builder(name = "Trophy", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.875f, 16.938f)
                verticalLineTo(19.0f)
                horizontalLineTo(17.25f)
                verticalLineTo(21.0f)
                horizontalLineTo(6.75f)
                verticalLineTo(19.0f)
                horizontalLineTo(11.125f)
                verticalLineTo(16.938f)
                curveTo(9.4334f, 16.6942f, 7.8777f, 15.7533f, 6.75f, 14.2917f)
                curveTo(5.6223f, 12.8302f, 5.0f, 10.9486f, 5.0f, 9.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(9.0f)
                curveTo(19.0f, 10.9486f, 18.3777f, 12.8302f, 17.25f, 14.2917f)
                curveTo(16.1223f, 15.7533f, 14.5666f, 16.6942f, 12.875f, 16.938f)
                close()
                moveTo(6.75f, 5.0f)
                verticalLineTo(9.0f)
                curveTo(6.75f, 10.5913f, 7.3031f, 12.1174f, 8.2877f, 13.2426f)
                curveTo(9.2723f, 14.3679f, 10.6076f, 15.0f, 12.0f, 15.0f)
                curveTo(13.3924f, 15.0f, 14.7277f, 14.3679f, 15.7123f, 13.2426f)
                curveTo(16.6969f, 12.1174f, 17.25f, 10.5913f, 17.25f, 9.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(6.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(1.25f, 5.25f)
                horizontalLineTo(3.9992f)
                lineTo(4.0f, 6.75f)
                horizontalLineTo(2.775f)
                curveTo(2.8558f, 7.8987f, 3.1186f, 8.5407f, 3.3599f, 8.8778f)
                curveTo(3.6375f, 9.2658f, 3.8761f, 9.2516f, 3.8942f, 9.249f)
                lineTo(4.1059f, 10.734f)
                curveTo(3.4572f, 10.8265f, 2.6958f, 10.5272f, 2.1401f, 9.7509f)
                curveTo(1.5963f, 8.9911f, 1.25f, 7.7911f, 1.25f, 6.0f)
                verticalLineTo(5.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(22.75f, 5.25f)
                horizontalLineTo(20.0008f)
                lineTo(20.0f, 6.75f)
                horizontalLineTo(21.225f)
                curveTo(21.1442f, 7.8987f, 20.8814f, 8.5407f, 20.6401f, 8.8778f)
                curveTo(20.3625f, 9.2658f, 20.1239f, 9.2516f, 20.1058f, 9.249f)
                lineTo(19.8942f, 10.734f)
                curveTo(20.5428f, 10.8265f, 21.3042f, 10.5272f, 21.8599f, 9.7509f)
                curveTo(22.4037f, 8.9911f, 22.75f, 7.7911f, 22.75f, 6.0f)
                verticalLineTo(5.25f)
                close()
            }
        }
        .build()
        return _trophy!!
    }

private var _trophy: ImageVector? = null
