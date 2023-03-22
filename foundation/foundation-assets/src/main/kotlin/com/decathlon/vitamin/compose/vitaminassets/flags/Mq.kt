package com.decathlon.vitamin.compose.vitaminassets.flags

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Brush.Companion.linearGradient
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.vitaminassets.FlagsGroup

public val FlagsGroup.Mq: ImageVector
    get() {
        if (_mq != null) {
            return _mq!!
        }
        _mq = Builder(name = "Mq", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
                28.0f, viewportHeight = 20.0f).apply {
            group {
                path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0),
                        start = Offset(14.0f,0.0f), end = Offset(14.0f,20.0f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(28.0f, 0.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(20.0f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(0.0f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFF345CB3), 1.0f to Color(0xFF23448D),
                        start = Offset(14.0f,0.0f), end = Offset(14.0f,20.0f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(28.0f, 0.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(20.0f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(0.0f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0),
                        start = Offset(21.7376f,1.46664f), end = Offset(21.7376f,6.63004f)), stroke
                        = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin =
                        Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(21.2232f, 2.1372f)
                    curveTo(21.4256f, 2.1304f, 21.6463f, 2.1319f, 21.8503f, 2.1475f)
                    curveTo(22.1252f, 2.1686f, 22.3194f, 2.2293f, 22.3046f, 2.1725f)
                    curveTo(22.2814f, 2.0832f, 22.2968f, 2.0604f, 22.266f, 2.0829f)
                    curveTo(22.1978f, 2.1327f, 22.2992f, 2.0734f, 21.8942f, 2.3052f)
                    curveTo(21.305f, 2.6423f, 21.0499f, 2.8985f, 21.1791f, 3.3602f)
                    curveTo(21.2923f, 3.7647f, 21.5924f, 3.8766f, 22.297f, 3.9871f)
                    curveTo(22.344f, 3.9944f, 22.344f, 3.9944f, 22.3901f, 4.0015f)
                    curveTo(22.6721f, 4.0452f, 22.7981f, 4.0718f, 22.8827f, 4.1093f)
                    curveTo(22.9017f, 4.1177f, 22.8652f, 4.0595f, 22.8759f, 4.0234f)
                    curveTo(22.8665f, 4.0548f, 22.6794f, 4.1281f, 22.2086f, 4.2208f)
                    curveTo(22.0941f, 4.2432f, 22.0941f, 4.2432f, 21.9752f, 4.267f)
                    curveTo(21.068f, 4.4521f, 20.6159f, 4.6938f, 20.5483f, 5.3208f)
                    curveTo(20.4742f, 6.0084f, 21.1868f, 6.4868f, 22.0816f, 6.6045f)
                    curveTo(22.9948f, 6.7245f, 23.7885f, 6.4229f, 23.8697f, 5.6812f)
                    curveTo(23.9213f, 5.2098f, 23.5938f, 4.9274f, 23.075f, 4.8236f)
                    curveTo(22.7232f, 4.7533f, 22.2599f, 4.7541f, 21.7044f, 4.8093f)
                    curveTo(21.3931f, 4.8402f, 21.0634f, 4.8874f, 20.7261f, 4.9465f)
                    curveTo(20.3501f, 5.0124f, 20.0414f, 5.0782f, 19.8558f, 5.1227f)
                    curveTo(19.6768f, 5.1657f, 19.5664f, 5.3456f, 19.6094f, 5.5246f)
                    curveTo(19.6523f, 5.7036f, 19.8322f, 5.814f, 20.0112f, 5.771f)
                    curveTo(20.1844f, 5.7295f, 20.4802f, 5.6664f, 20.8411f, 5.6032f)
                    curveTo(21.1632f, 5.5468f, 21.4769f, 5.5019f, 21.7703f, 5.4727f)
                    curveTo(22.2656f, 5.4235f, 22.6712f, 5.4227f, 22.9443f, 5.4774f)
                    curveTo(23.1665f, 5.5218f, 23.2122f, 5.5612f, 23.207f, 5.6087f)
                    curveTo(23.1792f, 5.8622f, 22.7606f, 6.0213f, 22.1685f, 5.9435f)
                    curveTo(21.587f, 5.867f, 21.1888f, 5.5997f, 21.2111f, 5.3923f)
                    curveTo(21.2341f, 5.1795f, 21.4788f, 5.0486f, 22.1084f, 4.9202f)
                    curveTo(22.2222f, 4.8974f, 22.2222f, 4.8974f, 22.3374f, 4.8749f)
                    curveTo(23.113f, 4.7222f, 23.3966f, 4.6112f, 23.5149f, 4.2134f)
                    curveTo(23.6116f, 3.8881f, 23.4508f, 3.6318f, 23.1527f, 3.4997f)
                    curveTo(22.9929f, 3.4289f, 22.8389f, 3.3964f, 22.4922f, 3.3427f)
                    curveTo(22.4459f, 3.3356f, 22.4459f, 3.3356f, 22.4003f, 3.3284f)
                    curveTo(21.9987f, 3.2655f, 21.8269f, 3.2014f, 21.8211f, 3.1804f)
                    curveTo(21.8154f, 3.1601f, 21.912f, 3.0631f, 22.2253f, 2.8838f)
                    curveTo(22.3336f, 2.8225f, 22.3962f, 2.787f, 22.444f, 2.7591f)
                    curveTo(22.5313f, 2.7081f, 22.5991f, 2.6651f, 22.6593f, 2.6212f)
                    curveTo(22.8895f, 2.453f, 23.0173f, 2.264f, 22.9498f, 2.0046f)
                    curveTo(22.855f, 1.6403f, 22.497f, 1.5285f, 21.9013f, 1.4828f)
                    curveTo(21.669f, 1.465f, 21.4254f, 1.4633f, 21.2005f, 1.471f)
                    curveTo(21.1209f, 1.4741f, 21.1209f, 1.4741f, 21.1003f, 1.4753f)
                    curveTo(20.9165f, 1.4859f, 20.7761f, 1.6435f, 20.7868f, 1.8273f)
                    curveTo(20.7974f, 2.0111f, 20.955f, 2.1515f, 21.1388f, 2.1408f)
                    curveTo(21.1524f, 2.14f, 21.1524f, 2.14f, 21.2232f, 2.1372f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0),
                        start = Offset(6.27075f,1.46664f), end = Offset(6.27075f,6.63004f)), stroke
                        = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin =
                        Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(5.7564f, 2.1372f)
                    curveTo(5.9588f, 2.1304f, 6.1795f, 2.1319f, 6.3835f, 2.1475f)
                    curveTo(6.6584f, 2.1686f, 6.8526f, 2.2293f, 6.8378f, 2.1725f)
                    curveTo(6.8146f, 2.0832f, 6.83f, 2.0604f, 6.7992f, 2.0829f)
                    curveTo(6.731f, 2.1327f, 6.8324f, 2.0734f, 6.4274f, 2.3052f)
                    curveTo(5.8382f, 2.6423f, 5.5831f, 2.8985f, 5.7123f, 3.3602f)
                    curveTo(5.8255f, 3.7647f, 6.1256f, 3.8766f, 6.8302f, 3.9871f)
                    curveTo(6.8772f, 3.9944f, 6.8772f, 3.9944f, 6.9233f, 4.0015f)
                    curveTo(7.2053f, 4.0452f, 7.3313f, 4.0718f, 7.4159f, 4.1093f)
                    curveTo(7.4349f, 4.1177f, 7.3984f, 4.0595f, 7.4091f, 4.0234f)
                    curveTo(7.3998f, 4.0548f, 7.2126f, 4.1281f, 6.7418f, 4.2208f)
                    curveTo(6.6273f, 4.2432f, 6.6273f, 4.2432f, 6.5084f, 4.267f)
                    curveTo(5.6012f, 4.4521f, 5.1491f, 4.6938f, 5.0815f, 5.3208f)
                    curveTo(5.0074f, 6.0084f, 5.72f, 6.4868f, 6.6148f, 6.6045f)
                    curveTo(7.528f, 6.7245f, 8.3217f, 6.4229f, 8.4029f, 5.6812f)
                    curveTo(8.4545f, 5.2098f, 8.127f, 4.9274f, 7.6082f, 4.8236f)
                    curveTo(7.2564f, 4.7533f, 6.7931f, 4.7541f, 6.2376f, 4.8093f)
                    curveTo(5.9263f, 4.8402f, 5.5966f, 4.8874f, 5.2593f, 4.9465f)
                    curveTo(4.8833f, 5.0124f, 4.5746f, 5.0782f, 4.389f, 5.1227f)
                    curveTo(4.21f, 5.1657f, 4.0996f, 5.3456f, 4.1426f, 5.5246f)
                    curveTo(4.1855f, 5.7036f, 4.3654f, 5.814f, 4.5444f, 5.771f)
                    curveTo(4.7176f, 5.7295f, 5.0134f, 5.6664f, 5.3743f, 5.6032f)
                    curveTo(5.6964f, 5.5468f, 6.0101f, 5.5019f, 6.3035f, 5.4727f)
                    curveTo(6.7989f, 5.4235f, 7.2044f, 5.4227f, 7.4774f, 5.4774f)
                    curveTo(7.6997f, 5.5218f, 7.7454f, 5.5612f, 7.7402f, 5.6087f)
                    curveTo(7.7124f, 5.8622f, 7.2938f, 6.0213f, 6.7017f, 5.9435f)
                    curveTo(6.1202f, 5.867f, 5.722f, 5.5997f, 5.7443f, 5.3923f)
                    curveTo(5.7673f, 5.1795f, 6.012f, 5.0486f, 6.6416f, 4.9202f)
                    curveTo(6.7554f, 4.8974f, 6.7554f, 4.8974f, 6.8706f, 4.8749f)
                    curveTo(7.6462f, 4.7222f, 7.9298f, 4.6112f, 8.0481f, 4.2134f)
                    curveTo(8.1448f, 3.8881f, 7.984f, 3.6318f, 7.6859f, 3.4997f)
                    curveTo(7.5261f, 3.4289f, 7.3721f, 3.3964f, 7.0254f, 3.3427f)
                    curveTo(6.9791f, 3.3356f, 6.9791f, 3.3356f, 6.9335f, 3.3284f)
                    curveTo(6.5319f, 3.2655f, 6.3601f, 3.2014f, 6.3543f, 3.1804f)
                    curveTo(6.3486f, 3.1601f, 6.4452f, 3.0631f, 6.7585f, 2.8838f)
                    curveTo(6.8668f, 2.8225f, 6.9294f, 2.787f, 6.9772f, 2.7591f)
                    curveTo(7.0645f, 2.7081f, 7.1323f, 2.6651f, 7.1925f, 2.6212f)
                    curveTo(7.4227f, 2.453f, 7.5505f, 2.264f, 7.483f, 2.0046f)
                    curveTo(7.3882f, 1.6403f, 7.0302f, 1.5285f, 6.4345f, 1.4828f)
                    curveTo(6.2022f, 1.465f, 5.9586f, 1.4633f, 5.7337f, 1.471f)
                    curveTo(5.6541f, 1.4741f, 5.6541f, 1.4741f, 5.6335f, 1.4753f)
                    curveTo(5.4497f, 1.4859f, 5.3093f, 1.6435f, 5.32f, 1.8273f)
                    curveTo(5.3306f, 2.0111f, 5.4882f, 2.1515f, 5.672f, 2.1408f)
                    curveTo(5.6856f, 2.14f, 5.6856f, 2.14f, 5.7564f, 2.1372f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0),
                        start = Offset(21.7376f,13.4666f), end = Offset(21.7376f,18.63f)), stroke =
                        null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(21.2232f, 14.1372f)
                    curveTo(21.4256f, 14.1303f, 21.6463f, 14.1319f, 21.8503f, 14.1475f)
                    curveTo(22.1252f, 14.1686f, 22.3194f, 14.2293f, 22.3046f, 14.1725f)
                    curveTo(22.2814f, 14.0832f, 22.2968f, 14.0604f, 22.266f, 14.0829f)
                    curveTo(22.1978f, 14.1327f, 22.2992f, 14.0734f, 21.8942f, 14.3052f)
                    curveTo(21.305f, 14.6423f, 21.0499f, 14.8985f, 21.1791f, 15.3602f)
                    curveTo(21.2923f, 15.7647f, 21.5924f, 15.8766f, 22.297f, 15.9871f)
                    curveTo(22.344f, 15.9944f, 22.344f, 15.9944f, 22.3901f, 16.0015f)
                    curveTo(22.6721f, 16.0452f, 22.7981f, 16.0718f, 22.8827f, 16.1093f)
                    curveTo(22.9017f, 16.1177f, 22.8652f, 16.0595f, 22.8759f, 16.0234f)
                    curveTo(22.8665f, 16.0548f, 22.6794f, 16.1281f, 22.2086f, 16.2208f)
                    curveTo(22.0941f, 16.2432f, 22.0941f, 16.2432f, 21.9752f, 16.267f)
                    curveTo(21.068f, 16.452f, 20.6159f, 16.6938f, 20.5483f, 17.3208f)
                    curveTo(20.4742f, 18.0084f, 21.1868f, 18.4868f, 22.0816f, 18.6045f)
                    curveTo(22.9948f, 18.7245f, 23.7885f, 18.4229f, 23.8697f, 17.6812f)
                    curveTo(23.9213f, 17.2098f, 23.5938f, 16.9274f, 23.075f, 16.8236f)
                    curveTo(22.7232f, 16.7533f, 22.2599f, 16.7541f, 21.7044f, 16.8093f)
                    curveTo(21.3931f, 16.8402f, 21.0634f, 16.8874f, 20.7261f, 16.9465f)
                    curveTo(20.3501f, 17.0123f, 20.0414f, 17.0782f, 19.8558f, 17.1228f)
                    curveTo(19.6768f, 17.1657f, 19.5664f, 17.3456f, 19.6094f, 17.5246f)
                    curveTo(19.6523f, 17.7036f, 19.8322f, 17.814f, 20.0112f, 17.771f)
                    curveTo(20.1844f, 17.7295f, 20.4802f, 17.6664f, 20.8411f, 17.6032f)
                    curveTo(21.1632f, 17.5468f, 21.4769f, 17.5019f, 21.7703f, 17.4727f)
                    curveTo(22.2656f, 17.4235f, 22.6712f, 17.4228f, 22.9443f, 17.4774f)
                    curveTo(23.1665f, 17.5218f, 23.2122f, 17.5612f, 23.207f, 17.6087f)
                    curveTo(23.1792f, 17.8622f, 22.7606f, 18.0213f, 22.1685f, 17.9435f)
                    curveTo(21.587f, 17.867f, 21.1888f, 17.5997f, 21.2111f, 17.3923f)
                    curveTo(21.2341f, 17.1795f, 21.4788f, 17.0487f, 22.1084f, 16.9202f)
                    curveTo(22.2222f, 16.8974f, 22.2222f, 16.8974f, 22.3374f, 16.8749f)
                    curveTo(23.113f, 16.7222f, 23.3966f, 16.6112f, 23.5149f, 16.2135f)
                    curveTo(23.6116f, 15.8881f, 23.4508f, 15.6318f, 23.1527f, 15.4997f)
                    curveTo(22.9929f, 15.4289f, 22.8389f, 15.3964f, 22.4922f, 15.3427f)
                    curveTo(22.4459f, 15.3356f, 22.4459f, 15.3356f, 22.4003f, 15.3284f)
                    curveTo(21.9987f, 15.2655f, 21.8269f, 15.2014f, 21.8211f, 15.1804f)
                    curveTo(21.8154f, 15.1601f, 21.912f, 15.0631f, 22.2253f, 14.8838f)
                    curveTo(22.3336f, 14.8225f, 22.3962f, 14.787f, 22.444f, 14.7591f)
                    curveTo(22.5313f, 14.7081f, 22.5991f, 14.6651f, 22.6593f, 14.6212f)
                    curveTo(22.8895f, 14.453f, 23.0173f, 14.264f, 22.9498f, 14.0046f)
                    curveTo(22.855f, 13.6403f, 22.497f, 13.5285f, 21.9013f, 13.4828f)
                    curveTo(21.669f, 13.465f, 21.4254f, 13.4633f, 21.2005f, 13.471f)
                    curveTo(21.1209f, 13.4741f, 21.1209f, 13.4741f, 21.1003f, 13.4753f)
                    curveTo(20.9165f, 13.4859f, 20.7761f, 13.6435f, 20.7868f, 13.8273f)
                    curveTo(20.7974f, 14.0111f, 20.955f, 14.1515f, 21.1388f, 14.1408f)
                    curveTo(21.1524f, 14.14f, 21.1524f, 14.14f, 21.2232f, 14.1372f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0),
                        start = Offset(6.27075f,13.4666f), end = Offset(6.27075f,18.63f)), stroke =
                        null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(5.7564f, 14.1372f)
                    curveTo(5.9588f, 14.1303f, 6.1795f, 14.1319f, 6.3835f, 14.1475f)
                    curveTo(6.6584f, 14.1686f, 6.8526f, 14.2293f, 6.8378f, 14.1725f)
                    curveTo(6.8146f, 14.0832f, 6.83f, 14.0604f, 6.7992f, 14.0829f)
                    curveTo(6.731f, 14.1327f, 6.8324f, 14.0734f, 6.4274f, 14.3052f)
                    curveTo(5.8382f, 14.6423f, 5.5831f, 14.8985f, 5.7123f, 15.3602f)
                    curveTo(5.8255f, 15.7647f, 6.1256f, 15.8766f, 6.8302f, 15.9871f)
                    curveTo(6.8772f, 15.9944f, 6.8772f, 15.9944f, 6.9233f, 16.0015f)
                    curveTo(7.2053f, 16.0452f, 7.3313f, 16.0718f, 7.4159f, 16.1093f)
                    curveTo(7.4349f, 16.1177f, 7.3984f, 16.0595f, 7.4091f, 16.0234f)
                    curveTo(7.3998f, 16.0548f, 7.2126f, 16.1281f, 6.7418f, 16.2208f)
                    curveTo(6.6273f, 16.2432f, 6.6273f, 16.2432f, 6.5084f, 16.267f)
                    curveTo(5.6012f, 16.452f, 5.1491f, 16.6938f, 5.0815f, 17.3208f)
                    curveTo(5.0074f, 18.0084f, 5.72f, 18.4868f, 6.6148f, 18.6045f)
                    curveTo(7.528f, 18.7245f, 8.3217f, 18.4229f, 8.4029f, 17.6812f)
                    curveTo(8.4545f, 17.2098f, 8.127f, 16.9274f, 7.6082f, 16.8236f)
                    curveTo(7.2564f, 16.7533f, 6.7931f, 16.7541f, 6.2376f, 16.8093f)
                    curveTo(5.9263f, 16.8402f, 5.5966f, 16.8874f, 5.2593f, 16.9465f)
                    curveTo(4.8833f, 17.0123f, 4.5746f, 17.0782f, 4.389f, 17.1228f)
                    curveTo(4.21f, 17.1657f, 4.0996f, 17.3456f, 4.1426f, 17.5246f)
                    curveTo(4.1855f, 17.7036f, 4.3654f, 17.814f, 4.5444f, 17.771f)
                    curveTo(4.7176f, 17.7295f, 5.0134f, 17.6664f, 5.3743f, 17.6032f)
                    curveTo(5.6964f, 17.5468f, 6.0101f, 17.5019f, 6.3035f, 17.4727f)
                    curveTo(6.7989f, 17.4235f, 7.2044f, 17.4228f, 7.4774f, 17.4774f)
                    curveTo(7.6997f, 17.5218f, 7.7454f, 17.5612f, 7.7402f, 17.6087f)
                    curveTo(7.7124f, 17.8622f, 7.2938f, 18.0213f, 6.7017f, 17.9435f)
                    curveTo(6.1202f, 17.867f, 5.722f, 17.5997f, 5.7443f, 17.3923f)
                    curveTo(5.7673f, 17.1795f, 6.012f, 17.0487f, 6.6416f, 16.9202f)
                    curveTo(6.7554f, 16.8974f, 6.7554f, 16.8974f, 6.8706f, 16.8749f)
                    curveTo(7.6462f, 16.7222f, 7.9298f, 16.6112f, 8.0481f, 16.2135f)
                    curveTo(8.1448f, 15.8881f, 7.984f, 15.6318f, 7.6859f, 15.4997f)
                    curveTo(7.5261f, 15.4289f, 7.3721f, 15.3964f, 7.0254f, 15.3427f)
                    curveTo(6.9791f, 15.3356f, 6.9791f, 15.3356f, 6.9335f, 15.3284f)
                    curveTo(6.5319f, 15.2655f, 6.3601f, 15.2014f, 6.3543f, 15.1804f)
                    curveTo(6.3486f, 15.1601f, 6.4452f, 15.0631f, 6.7585f, 14.8838f)
                    curveTo(6.8668f, 14.8225f, 6.9294f, 14.787f, 6.9772f, 14.7591f)
                    curveTo(7.0645f, 14.7081f, 7.1323f, 14.6651f, 7.1925f, 14.6212f)
                    curveTo(7.4227f, 14.453f, 7.5505f, 14.264f, 7.483f, 14.0046f)
                    curveTo(7.3882f, 13.6403f, 7.0302f, 13.5285f, 6.4345f, 13.4828f)
                    curveTo(6.2022f, 13.465f, 5.9586f, 13.4633f, 5.7337f, 13.471f)
                    curveTo(5.6541f, 13.4741f, 5.6541f, 13.4741f, 5.6335f, 13.4753f)
                    curveTo(5.4497f, 13.4859f, 5.3093f, 13.6435f, 5.32f, 13.8273f)
                    curveTo(5.3306f, 14.0111f, 5.4882f, 14.1515f, 5.672f, 14.1408f)
                    curveTo(5.6856f, 14.14f, 5.6856f, 14.14f, 5.7564f, 14.1372f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0),
                        start = Offset(14.0f,0.0f), end = Offset(14.0f,20.0f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(12.0f, 8.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(12.0f)
                    horizontalLineTo(12.0f)
                    verticalLineTo(20.0f)
                    horizontalLineTo(16.0f)
                    verticalLineTo(12.0f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(8.0f)
                    horizontalLineTo(16.0f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(12.0f)
                    verticalLineTo(8.0f)
                    close()
                }
            }
        }
        .build()
        return _mq!!
    }

private var _mq: ImageVector? = null
