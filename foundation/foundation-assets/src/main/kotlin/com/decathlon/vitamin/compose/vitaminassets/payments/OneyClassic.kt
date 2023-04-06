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

public val PaymentsGroup.OneyClassic: ImageVector
    get() {
        if (_oneyClassic != null) {
            return _oneyClassic!!
        }
        _oneyClassic = Builder(name = "OneyClassic", defaultWidth = 58.0.dp, defaultHeight =
                40.0.dp, viewportWidth = 58.0f, viewportHeight = 40.0f).apply {
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
            path(fill = SolidColor(Color(0xFF87BC2B)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(23.2602f, 14.0581f)
                curveTo(21.0688f, 14.0581f, 19.9548f, 15.2309f, 19.9548f, 17.5529f)
                verticalLineTo(24.4268f)
                horizontalLineTo(17.704f)
                verticalLineTo(17.3909f)
                curveTo(17.7257f, 16.158f, 17.9446f, 15.2856f, 18.4486f, 14.4669f)
                curveTo(19.0449f, 13.5473f, 20.461f, 12.0f, 23.2602f, 12.0f)
                curveTo(26.0526f, 12.0f, 27.4733f, 13.5473f, 28.0684f, 14.4669f)
                curveTo(28.5678f, 15.2856f, 28.7936f, 16.158f, 28.8073f, 17.3909f)
                verticalLineTo(24.4268f)
                horizontalLineTo(26.5588f)
                verticalLineTo(17.5529f)
                curveTo(26.5588f, 15.2309f, 25.4517f, 14.0581f, 23.2602f, 14.0581f)
                close()
                moveTo(4.0f, 18.2236f)
                curveTo(4.0f, 14.733f, 6.7262f, 12.0032f, 10.2084f, 12.0032f)
                curveTo(13.6814f, 12.0032f, 16.4076f, 14.733f, 16.4076f, 18.2236f)
                curveTo(16.4076f, 21.7099f, 13.6814f, 24.444f, 10.2084f, 24.444f)
                curveTo(6.7262f, 24.444f, 4.0f, 21.7099f, 4.0f, 18.2236f)
                close()
                moveTo(6.1937f, 18.2236f)
                curveTo(6.1937f, 20.5167f, 7.9953f, 22.314f, 10.2084f, 22.314f)
                curveTo(12.4067f, 22.314f, 14.2173f, 20.5167f, 14.2173f, 18.2236f)
                curveTo(14.2173f, 15.9305f, 12.4067f, 14.1289f, 10.2084f, 14.1289f)
                curveTo(7.9953f, 14.1289f, 6.1937f, 15.9305f, 6.1937f, 18.2236f)
                close()
                moveTo(42.143f, 18.0594f)
                curveTo(42.1225f, 14.7277f, 39.4282f, 12.0172f, 36.1319f, 12.0172f)
                curveTo(32.7398f, 12.0172f, 30.0809f, 14.7373f, 30.0809f, 18.2086f)
                curveTo(30.0809f, 19.8385f, 30.7057f, 21.3858f, 31.8299f, 22.5672f)
                curveTo(32.9747f, 23.7626f, 34.4843f, 24.4214f, 36.0909f, 24.4214f)
                curveTo(37.9243f, 24.4214f, 40.4932f, 23.5426f, 41.7143f, 21.0489f)
                lineTo(41.7463f, 20.9684f)
                horizontalLineTo(39.288f)
                lineTo(39.2732f, 20.9867f)
                curveTo(38.613f, 21.7753f, 37.3668f, 22.3076f, 36.1798f, 22.3076f)
                curveTo(34.6725f, 22.3076f, 32.8641f, 21.315f, 32.3693f, 19.0745f)
                horizontalLineTo(42.0951f)
                curveTo(42.1168f, 18.8427f, 42.143f, 18.3792f, 42.143f, 18.0594f)
                close()
                moveTo(36.1137f, 14.1289f)
                curveTo(34.1788f, 14.1289f, 32.7398f, 15.5947f, 32.4411f, 17.0958f)
                horizontalLineTo(39.7783f)
                curveTo(39.483f, 15.5947f, 38.0452f, 14.1289f, 36.1137f, 14.1289f)
                close()
                moveTo(49.0994f, 23.5598f)
                lineTo(53.8426f, 12.0032f)
                horizontalLineTo(51.4847f)
                lineTo(47.9284f, 20.6926f)
                lineTo(44.379f, 12.0032f)
                horizontalLineTo(41.907f)
                lineTo(46.7551f, 23.5619f)
                lineTo(44.9399f, 28.0f)
                horizontalLineTo(47.2796f)
                lineTo(47.9273f, 26.4194f)
                lineTo(49.0994f, 23.5598f)
                close()
            }
        }
        .build()
        return _oneyClassic!!
    }

private var _oneyClassic: ImageVector? = null
