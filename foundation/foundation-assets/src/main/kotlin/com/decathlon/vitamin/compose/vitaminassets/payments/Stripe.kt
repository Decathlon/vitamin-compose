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

public val PaymentsGroup.Stripe: ImageVector
    get() {
        if (_stripe != null) {
            return _stripe!!
        }
        _stripe = Builder(name = "Stripe", defaultWidth = 58.0.dp, defaultHeight = 40.0.dp,
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
            path(fill = SolidColor(Color(0xFF6772E5)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(30.6556f, 14.3007f)
                lineTo(27.8667f, 14.9127f)
                verticalLineTo(12.6007f)
                lineTo(30.6556f, 12.0f)
                verticalLineTo(14.3007f)
                close()
                moveTo(36.4556f, 15.5813f)
                curveTo(35.3667f, 15.5813f, 34.6667f, 16.1027f, 34.2778f, 16.4653f)
                lineTo(34.1333f, 15.7627f)
                horizontalLineTo(31.6889f)
                verticalLineTo(28.9773f)
                lineTo(34.4667f, 28.3767f)
                lineTo(34.4778f, 25.1693f)
                curveTo(34.8778f, 25.464f, 35.4667f, 25.8833f, 36.4444f, 25.8833f)
                curveTo(38.4333f, 25.8833f, 40.2444f, 24.2513f, 40.2444f, 20.6587f)
                curveTo(40.2333f, 17.372f, 38.4f, 15.5813f, 36.4556f, 15.5813f)
                close()
                moveTo(35.7889f, 23.39f)
                curveTo(35.1333f, 23.39f, 34.7444f, 23.152f, 34.4778f, 22.8573f)
                lineTo(34.4667f, 18.6527f)
                curveTo(34.7556f, 18.324f, 35.1556f, 18.0973f, 35.7889f, 18.0973f)
                curveTo(36.8f, 18.0973f, 37.5f, 19.2533f, 37.5f, 20.738f)
                curveTo(37.5f, 22.2567f, 36.8111f, 23.39f, 35.7889f, 23.39f)
                close()
                moveTo(49.0f, 20.772f)
                curveTo(49.0f, 17.8707f, 47.6222f, 15.5813f, 44.9889f, 15.5813f)
                curveTo(42.3444f, 15.5813f, 40.7444f, 17.8707f, 40.7444f, 20.7493f)
                curveTo(40.7444f, 24.1607f, 42.6333f, 25.8833f, 45.3444f, 25.8833f)
                curveTo(46.6667f, 25.8833f, 47.6667f, 25.5773f, 48.4222f, 25.1467f)
                verticalLineTo(22.88f)
                curveTo(47.6667f, 23.2653f, 46.8f, 23.5033f, 45.7f, 23.5033f)
                curveTo(44.6222f, 23.5033f, 43.6667f, 23.118f, 43.5444f, 21.7807f)
                horizontalLineTo(48.9778f)
                curveTo(48.9778f, 21.7183f, 48.9818f, 21.5765f, 48.9864f, 21.4132f)
                lineTo(48.9864f, 21.4129f)
                lineTo(48.9864f, 21.4125f)
                lineTo(48.9864f, 21.412f)
                lineTo(48.9864f, 21.4114f)
                lineTo(48.9864f, 21.4108f)
                curveTo(48.9927f, 21.1891f, 49.0f, 20.9282f, 49.0f, 20.772f)
                close()
                moveTo(43.5111f, 19.6953f)
                curveTo(43.5111f, 18.4147f, 44.2778f, 17.882f, 44.9778f, 17.882f)
                curveTo(45.6556f, 17.882f, 46.3778f, 18.4147f, 46.3778f, 19.6953f)
                horizontalLineTo(43.5111f)
                close()
                moveTo(27.8667f, 15.774f)
                horizontalLineTo(30.6556f)
                verticalLineTo(25.6907f)
                horizontalLineTo(27.8667f)
                verticalLineTo(15.774f)
                close()
                moveTo(24.7f, 15.774f)
                lineTo(24.8778f, 16.6127f)
                curveTo(25.5333f, 15.3887f, 26.8333f, 15.638f, 27.1889f, 15.774f)
                verticalLineTo(18.3807f)
                curveTo(26.8444f, 18.256f, 25.7333f, 18.0973f, 25.0778f, 18.97f)
                verticalLineTo(25.6907f)
                horizontalLineTo(22.3f)
                verticalLineTo(15.774f)
                horizontalLineTo(24.7f)
                close()
                moveTo(19.3222f, 13.3147f)
                lineTo(16.6111f, 13.904f)
                lineTo(16.6f, 22.982f)
                curveTo(16.6f, 24.6593f, 17.8333f, 25.8947f, 19.4778f, 25.8947f)
                curveTo(20.3889f, 25.8947f, 21.0556f, 25.7247f, 21.4222f, 25.5207f)
                verticalLineTo(23.22f)
                curveTo(21.0667f, 23.3673f, 19.3111f, 23.8887f, 19.3111f, 22.2113f)
                verticalLineTo(18.188f)
                horizontalLineTo(21.4222f)
                verticalLineTo(15.774f)
                horizontalLineTo(19.3111f)
                lineTo(19.3222f, 13.3147f)
                close()
                moveTo(12.7556f, 18.0407f)
                curveTo(12.1667f, 18.0407f, 11.8111f, 18.2107f, 11.8111f, 18.6527f)
                curveTo(11.8111f, 19.1353f, 12.423f, 19.3475f, 13.1822f, 19.6109f)
                curveTo(14.4198f, 20.0403f, 16.0487f, 20.6054f, 16.0556f, 22.6987f)
                curveTo(16.0556f, 24.7273f, 14.4667f, 25.8947f, 12.1556f, 25.8947f)
                curveTo(11.2f, 25.8947f, 10.1556f, 25.702f, 9.1222f, 25.2487f)
                verticalLineTo(22.5513f)
                curveTo(10.0556f, 23.0727f, 11.2333f, 23.458f, 12.1556f, 23.458f)
                curveTo(12.7778f, 23.458f, 13.2222f, 23.288f, 13.2222f, 22.7667f)
                curveTo(13.2222f, 22.2321f, 12.5589f, 21.9878f, 11.7581f, 21.6928f)
                curveTo(10.5385f, 21.2435f, 9.0f, 20.6768f, 9.0f, 18.7887f)
                curveTo(9.0f, 16.7827f, 10.5f, 15.5813f, 12.7556f, 15.5813f)
                curveTo(13.6778f, 15.5813f, 14.5889f, 15.7287f, 15.5111f, 16.1027f)
                verticalLineTo(18.766f)
                curveTo(14.6667f, 18.3013f, 13.6f, 18.0407f, 12.7556f, 18.0407f)
                close()
            }
        }
        .build()
        return _stripe!!
    }

private var _stripe: ImageVector? = null
