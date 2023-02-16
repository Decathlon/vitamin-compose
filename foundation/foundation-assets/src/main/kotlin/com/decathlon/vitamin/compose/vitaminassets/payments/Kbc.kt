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

public val PaymentsGroup.Kbc: ImageVector
    get() {
        if (_kbc != null) {
            return _kbc!!
        }
        _kbc = Builder(name = "Kbc", defaultWidth = 58.0.dp, defaultHeight = 40.0.dp, viewportWidth
                = 58.0f, viewportHeight = 40.0f).apply {
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
            path(fill = SolidColor(Color(0xFF00AEEF)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(35.4189f, 11.5172f)
                curveTo(35.4189f, 15.111f, 32.5165f, 18.0345f, 28.9486f, 18.0345f)
                curveTo(25.3808f, 18.0345f, 22.4784f, 15.111f, 22.4784f, 11.5172f)
                curveTo(22.4784f, 7.9234f, 25.3808f, 5.0f, 28.9486f, 5.0f)
                curveTo(32.5165f, 5.0f, 35.4189f, 7.9234f, 35.4189f, 11.5172f)
                close()
                moveTo(27.5252f, 19.4869f)
                curveTo(30.3166f, 19.4869f, 32.4796f, 18.1276f, 33.7182f, 16.7869f)
                curveTo(41.0573f, 16.3959f, 47.4721f, 16.4331f, 47.4721f, 16.4331f)
                verticalLineTo(22.3731f)
                horizontalLineTo(10.0f)
                verticalLineTo(19.4869f)
                curveTo(10.0f, 19.4869f, 15.2502f, 18.4441f, 22.312f, 17.6993f)
                curveTo(23.4951f, 18.649f, 25.3623f, 19.4869f, 27.5252f, 19.4869f)
                close()
            }
            path(fill = SolidColor(Color(0xFF003665)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(43.8118f, 34.4394f)
                curveTo(45.0319f, 34.4394f, 46.4184f, 34.2345f, 47.4721f, 33.918f)
                verticalLineTo(30.7338f)
                curveTo(46.5848f, 31.2552f, 45.6974f, 31.5904f, 44.4588f, 31.5904f)
                curveTo(42.8135f, 31.5904f, 41.1867f, 30.7711f, 41.1867f, 29.598f)
                curveTo(41.1867f, 28.4249f, 42.832f, 27.6056f, 44.4588f, 27.6056f)
                curveTo(45.7159f, 27.6056f, 46.6032f, 27.9407f, 47.4721f, 28.4807f)
                verticalLineTo(25.278f)
                curveTo(46.289f, 24.8869f, 44.7731f, 24.7566f, 43.5899f, 24.7566f)
                curveTo(39.3196f, 24.7566f, 36.1769f, 26.1904f, 36.1769f, 29.5049f)
                curveTo(36.1769f, 33.1731f, 39.412f, 34.4394f, 43.8118f, 34.4394f)
                close()
                moveTo(14.4552f, 30.8083f)
                verticalLineTo(34.309f)
                horizontalLineTo(10.0f)
                verticalLineTo(24.98f)
                horizontalLineTo(14.4552f)
                verticalLineTo(29.1697f)
                horizontalLineTo(14.4737f)
                lineTo(17.0988f, 24.98f)
                horizontalLineTo(22.4414f)
                lineTo(18.5223f, 29.8028f)
                lineTo(22.2196f, 34.309f)
                horizontalLineTo(17.1173f)
                lineTo(14.4737f, 30.8083f)
                horizontalLineTo(14.4552f)
                close()
                moveTo(23.1624f, 24.98f)
                horizontalLineTo(32.1653f)
                curveTo(34.4946f, 24.98f, 35.271f, 25.8925f, 35.271f, 27.3262f)
                curveTo(35.271f, 28.9276f, 33.8476f, 29.6166f, 32.4056f, 29.6911f)
                verticalLineTo(29.7097f)
                curveTo(33.903f, 29.8214f, 35.345f, 29.989f, 35.345f, 31.8883f)
                curveTo(35.345f, 33.1173f, 34.587f, 34.3276f, 31.9989f, 34.3276f)
                horizontalLineTo(23.1624f)
                verticalLineTo(24.98f)
                close()
                moveTo(27.6176f, 32.4097f)
                horizontalLineTo(29.9469f)
                curveTo(30.8158f, 32.4097f, 31.1116f, 32.0559f, 31.1116f, 31.5159f)
                curveTo(31.1116f, 30.9759f, 30.8158f, 30.6035f, 29.9469f, 30.6035f)
                horizontalLineTo(27.6176f)
                verticalLineTo(32.4097f)
                close()
                moveTo(29.836f, 28.9276f)
                horizontalLineTo(27.6176f)
                verticalLineTo(27.1214f)
                horizontalLineTo(29.9099f)
                curveTo(30.7049f, 27.1214f, 31.0376f, 27.4194f, 31.0376f, 28.0338f)
                curveTo(31.0376f, 28.5738f, 30.6864f, 28.9276f, 29.836f, 28.9276f)
                close()
            }
        }
        .build()
        return _kbc!!
    }

private var _kbc: ImageVector? = null
