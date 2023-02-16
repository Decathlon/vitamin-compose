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

public val PaymentsGroup.Neteller: ImageVector
    get() {
        if (_neteller != null) {
            return _neteller!!
        }
        _neteller = Builder(name = "Neteller", defaultWidth = 58.0.dp, defaultHeight = 40.0.dp,
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
            path(fill = SolidColor(Color(0xFF8DC640)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(51.6213f, 19.9276f)
                curveTo(51.3257f, 20.134f, 50.8965f, 20.236f, 50.3093f, 20.236f)
                horizontalLineTo(50.0545f)
                horizontalLineTo(49.727f)
                lineTo(50.1735f, 17.8206f)
                horizontalLineTo(50.3998f)
                horizontalLineTo(50.6017f)
                curveTo(51.0891f, 17.8206f, 51.4452f, 17.8992f, 51.6905f, 18.0586f)
                curveTo(51.8822f, 18.1837f, 52.1094f, 18.4313f, 52.1094f, 18.9011f)
                curveTo(52.1094f, 19.4671f, 51.8451f, 19.7716f, 51.6213f, 19.9276f)
                close()
                moveTo(16.8827f, 22.959f)
                horizontalLineTo(12.3761f)
                lineTo(12.6674f, 21.3802f)
                horizontalLineTo(15.4941f)
                lineTo(15.8153f, 19.6019f)
                horizontalLineTo(13.0157f)
                lineTo(13.2864f, 18.0393f)
                horizontalLineTo(17.7851f)
                lineTo(16.8827f, 22.959f)
                close()
                moveTo(54.0491f, 16.6841f)
                curveTo(53.3865f, 16.2292f, 52.3838f, 16.0f, 51.0692f, 16.0f)
                horizontalLineTo(47.6262f)
                lineTo(46.3464f, 22.9593f)
                horizontalLineTo(41.8363f)
                lineTo(42.1255f, 21.3804f)
                horizontalLineTo(44.8427f)
                lineTo(45.1658f, 19.607f)
                lineTo(42.4502f, 19.6119f)
                lineTo(42.741f, 18.0398f)
                horizontalLineTo(45.5392f)
                lineTo(45.9115f, 16.0002f)
                horizontalLineTo(40.2274f)
                lineTo(39.0126f, 22.6022f)
                horizontalLineTo(36.9284f)
                lineTo(38.152f, 16.0002f)
                horizontalLineTo(35.1804f)
                lineTo(33.9656f, 22.6022f)
                horizontalLineTo(31.9334f)
                lineTo(33.1582f, 16.0002f)
                horizontalLineTo(30.1896f)
                lineTo(28.9066f, 22.9595f)
                horizontalLineTo(24.3644f)
                lineTo(24.6506f, 21.3807f)
                horizontalLineTo(27.3801f)
                lineTo(27.7015f, 19.6175f)
                lineTo(24.9762f, 19.6149f)
                lineTo(25.2657f, 18.0398f)
                horizontalLineTo(28.0949f)
                lineTo(28.4654f, 16.0002f)
                horizontalLineTo(10.757f)
                lineTo(9.749f, 21.5153f)
                lineTo(7.7408f, 16.0f)
                horizontalLineTo(4.6588f)
                lineTo(3.0f, 25.0f)
                horizontalLineTo(5.9432f)
                lineTo(6.9471f, 19.3334f)
                lineTo(8.896f, 25.0f)
                horizontalLineTo(19.4453f)
                lineTo(20.7277f, 18.0396f)
                horizontalLineTo(22.3784f)
                lineTo(21.0953f, 25.0f)
                horizontalLineTo(48.8538f)
                lineTo(49.6578f, 20.6059f)
                lineTo(50.961f, 25.0f)
                horizontalLineTo(53.9059f)
                lineTo(52.5567f, 21.4097f)
                lineTo(52.8647f, 21.343f)
                curveTo(53.5434f, 21.1975f, 54.0746f, 20.8839f, 54.4432f, 20.4141f)
                curveTo(54.8125f, 19.9399f, 55.0f, 19.3311f, 55.0f, 18.5998f)
                curveTo(55.0002f, 17.7481f, 54.6897f, 17.1218f, 54.0491f, 16.6841f)
                close()
            }
        }
        .build()
        return _neteller!!
    }

private var _neteller: ImageVector? = null
