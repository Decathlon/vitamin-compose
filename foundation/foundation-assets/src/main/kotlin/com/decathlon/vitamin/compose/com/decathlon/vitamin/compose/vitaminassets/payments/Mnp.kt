package com.decathlon.vitamin.compose.vitaminassets.payments

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
import com.decathlon.vitamin.compose.vitaminassets.PaymentsGroup

public val PaymentsGroup.Mnp: ImageVector
    get() {
        if (_mnp != null) {
            return _mnp!!
        }
        _mnp = Builder(name = "Mnp", defaultWidth = 58.0.dp, defaultHeight = 40.0.dp, viewportWidth
                = 58.0f, viewportHeight = 40.0f).apply {
            path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = SolidColor(Color(0xFFF3F3F3)),
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
            path(fill = SolidColor(Color(0xFF40A548)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(9.382f, 14.0022f)
                curveTo(9.4025f, 14.0021f, 9.425f, 14.0017f, 9.4492f, 14.0013f)
                curveTo(9.9254f, 13.9932f, 11.0894f, 13.9734f, 11.5965f, 15.685f)
                curveTo(11.9555f, 16.8966f, 12.5274f, 18.8813f, 13.3121f, 21.639f)
                horizontalLineTo(13.6317f)
                curveTo(14.4732f, 18.7316f, 15.0513f, 16.747f, 15.366f, 15.685f)
                curveTo(15.8722f, 13.9764f, 17.0925f, 13.9931f, 17.6842f, 14.0012f)
                curveTo(17.7218f, 14.0018f, 17.7569f, 14.0022f, 17.7892f, 14.0022f)
                lineTo(21.9438f, 14.0022f)
                verticalLineTo(26.926f)
                horizontalLineTo(17.7093f)
                verticalLineTo(19.3098f)
                horizontalLineTo(17.4253f)
                lineTo(15.0648f, 26.926f)
                horizontalLineTo(11.8789f)
                lineTo(9.5184f, 19.3042f)
                horizontalLineTo(9.2345f)
                verticalLineTo(26.926f)
                horizontalLineTo(5.0f)
                verticalLineTo(14.0022f)
                lineTo(9.382f, 14.0022f)
                close()
                moveTo(28.0244f, 14.0022f)
                verticalLineTo(21.6241f)
                horizontalLineTo(28.3622f)
                lineTo(31.2335f, 15.3567f)
                curveTo(31.7909f, 14.1095f, 32.9788f, 14.0022f, 32.9788f, 14.0022f)
                horizontalLineTo(37.0765f)
                verticalLineTo(26.926f)
                horizontalLineTo(32.7536f)
                verticalLineTo(19.3042f)
                horizontalLineTo(32.4158f)
                lineTo(29.6008f, 25.5716f)
                curveTo(29.0434f, 26.8132f, 27.7992f, 26.926f, 27.7992f, 26.926f)
                horizontalLineTo(23.7015f)
                verticalLineTo(14.0022f)
                horizontalLineTo(28.0244f)
                close()
                moveTo(47.4252f, 23.0762f)
                curveTo(49.5218f, 23.0762f, 51.4154f, 21.8525f, 52.0184f, 20.1437f)
                horizontalLineTo(38.781f)
                verticalLineTo(26.926f)
                horizontalLineTo(42.8918f)
                verticalLineTo(23.0762f)
                horizontalLineTo(47.4252f)
                close()
            }
            path(fill = SolidColor(Color(0xFF1291D0)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(47.6235f, 14.0022f)
                horizontalLineTo(38.5654f)
                curveTo(38.781f, 16.8795f, 41.2588f, 19.3426f, 43.8239f, 19.3426f)
                horizontalLineTo(52.3041f)
                curveTo(52.7934f, 16.9513f, 51.1088f, 14.0022f, 47.6235f, 14.0022f)
                close()
            }
        }
        .build()
        return _mnp!!
    }

private var _mnp: ImageVector? = null
