package com.decathlon.vitamin.compose.vitaminassets.payments

import androidx.compose.ui.graphics.Color
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
import com.decathlon.vitamin.compose.vitaminassets.PaymentsGroup

public val PaymentsGroup.PointsPay: ImageVector
    get() {
        if (_pointsPay != null) {
            return _pointsPay!!
        }
        _pointsPay = Builder(name = "PointsPay", defaultWidth = 58.0.dp, defaultHeight = 40.0.dp,
                viewportWidth = 58.0f, viewportHeight = 40.0f).apply {
            path(fill = SolidColor(Color(0xFFffffff)), stroke = SolidColor(Color(0xFFF3F3F3)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.0f, 0.5f)
                lineTo(54.0f, 0.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 57.5f, 4.0f)
                lineTo(57.5f, 36.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 54.0f, 39.5f)
                lineTo(4.0f, 39.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 0.5f, 36.0f)
                lineTo(0.5f, 4.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 4.0f, 0.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF223066)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(29.5023f, 12.4993f)
                curveTo(27.9574f, 10.3278f, 25.4005f, 9.0f, 22.5223f, 9.0f)
                curveTo(17.8351f, 9.0f, 14.0f, 12.6316f, 14.0f, 17.4737f)
                curveTo(14.0f, 17.5109f, 14.0002f, 17.5481f, 14.0006f, 17.5852f)
                lineTo(14.0f, 17.5837f)
                verticalLineTo(30.5694f)
                curveTo(14.0f, 31.3397f, 14.6392f, 32.0f, 15.4914f, 32.0f)
                curveTo(16.3436f, 32.0f, 16.9828f, 31.3397f, 16.9828f, 30.5694f)
                verticalLineTo(24.1866f)
                lineTo(16.89f, 23.9812f)
                curveTo(18.3946f, 25.2906f, 20.3685f, 26.0574f, 22.5223f, 26.0574f)
                curveTo(24.5823f, 26.0574f, 26.4777f, 25.356f, 27.9553f, 24.1493f)
                verticalLineTo(30.5694f)
                curveTo(27.9553f, 31.3397f, 28.5945f, 32.0f, 29.4467f, 32.0f)
                curveTo(30.299f, 32.0f, 30.9381f, 31.3397f, 30.9381f, 30.5694f)
                verticalLineTo(24.1866f)
                lineTo(30.8454f, 23.9812f)
                curveTo(32.3499f, 25.2906f, 34.3238f, 26.0574f, 36.4777f, 26.0574f)
                curveTo(41.1649f, 26.0574f, 45.0f, 22.4258f, 45.0f, 17.4737f)
                curveTo(45.0f, 12.5215f, 41.1649f, 9.0f, 36.4777f, 9.0f)
                curveTo(33.5558f, 9.0f, 31.0296f, 10.3492f, 29.5023f, 12.4993f)
                close()
                moveTo(22.5223f, 11.7512f)
                curveTo(25.5052f, 11.7512f, 27.9553f, 14.1722f, 27.9553f, 17.5837f)
                curveTo(27.9553f, 20.9952f, 25.5052f, 23.4163f, 22.5223f, 23.4163f)
                curveTo(19.5395f, 23.4163f, 17.0893f, 20.8852f, 17.0893f, 17.5837f)
                curveTo(17.0893f, 14.1722f, 19.5395f, 11.7512f, 22.5223f, 11.7512f)
                close()
                moveTo(36.4777f, 23.4163f)
                curveTo(39.4605f, 23.4163f, 41.9107f, 20.9952f, 41.9107f, 17.5837f)
                curveTo(41.9107f, 14.1722f, 39.4605f, 11.7512f, 36.4777f, 11.7512f)
                curveTo(33.4948f, 11.7512f, 31.0447f, 14.1722f, 31.0447f, 17.5837f)
                curveTo(31.0447f, 20.8852f, 33.4948f, 23.4163f, 36.4777f, 23.4163f)
                close()
            }
        }
        .build()
        return _pointsPay!!
    }

private var _pointsPay: ImageVector? = null
