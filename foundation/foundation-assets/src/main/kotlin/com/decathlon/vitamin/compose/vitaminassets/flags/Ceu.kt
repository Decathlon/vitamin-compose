package com.decathlon.vitamin.compose.vitaminassets.flags

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
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.vitaminassets.FlagsGroup

public val FlagsGroup.Ceu: ImageVector
    get() {
        if (_ceu != null) {
            return _ceu!!
        }
        _ceu = Builder(name = "Ceu", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth
                = 28.0f, viewportHeight = 20.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(2.0f, 0.0f)
                    lineTo(26.0f, 0.0f)
                    arcTo(2.0f, 2.0f, 0.0f, false, true, 28.0f, 2.0f)
                    lineTo(28.0f, 18.0f)
                    arcTo(2.0f, 2.0f, 0.0f, false, true, 26.0f, 20.0f)
                    lineTo(2.0f, 20.0f)
                    arcTo(2.0f, 2.0f, 0.0f, false, true, 0.0f, 18.0f)
                    lineTo(0.0f, 2.0f)
                    arcTo(2.0f, 2.0f, 0.0f, false, true, 2.0f, 0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF19BFBF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(0.0f, 0.0f)
                    horizontalLineToRelative(28.0f)
                    verticalLineToRelative(20.0f)
                    horizontalLineToRelative(-28.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(17.0977f, 17.7643f)
                    lineTo(16.0557f, 16.7223f)
                    curveTo(16.0191f, 16.6857f, 15.9915f, 16.6411f, 15.9751f, 16.592f)
                    lineTo(15.4093f, 14.8944f)
                    curveTo(15.3639f, 14.7584f, 15.2367f, 14.6667f, 15.0933f, 14.6667f)
                    curveTo(14.8766f, 14.6667f, 14.7176f, 14.8703f, 14.7702f, 15.0805f)
                    lineTo(15.2876f, 17.1502f)
                    curveTo(15.316f, 17.2638f, 15.2827f, 17.384f, 15.1999f, 17.4668f)
                    lineTo(14.9024f, 17.7643f)
                    curveTo(14.7722f, 17.8945f, 14.5612f, 17.8945f, 14.431f, 17.7643f)
                    lineTo(14.0977f, 17.431f)
                    curveTo(14.0351f, 17.3684f, 14.0f, 17.2837f, 14.0f, 17.1953f)
                    verticalLineTo(16.0787f)
                    curveTo(14.0f, 16.0269f, 13.988f, 15.9759f, 13.9648f, 15.9296f)
                    lineTo(13.4255f, 14.8509f)
                    curveTo(13.369f, 14.738f, 13.2536f, 14.6667f, 13.1273f, 14.6667f)
                    horizontalLineTo(11.412f)
                    curveTo(11.3603f, 14.6667f, 11.3093f, 14.6787f, 11.263f, 14.7018f)
                    lineTo(10.1235f, 15.2716f)
                    curveTo(10.0444f, 15.3111f, 9.9843f, 15.3804f, 9.9564f, 15.4643f)
                    lineTo(9.377f, 17.2023f)
                    curveTo(9.3491f, 17.2862f, 9.2889f, 17.3555f, 9.2099f, 17.3951f)
                    lineTo(8.1491f, 17.9255f)
                    curveTo(8.0553f, 17.9724f, 7.9448f, 17.9724f, 7.8509f, 17.9255f)
                    lineTo(6.8509f, 17.4255f)
                    curveTo(6.738f, 17.369f, 6.6667f, 17.2536f, 6.6667f, 17.1273f)
                    verticalLineTo(15.0f)
                    curveTo(6.6667f, 14.8159f, 6.8159f, 14.6667f, 7.0f, 14.6667f)
                    horizontalLineTo(8.3334f)
                    curveTo(8.5175f, 14.6667f, 8.6667f, 14.5174f, 8.6667f, 14.3333f)
                    verticalLineTo(13.3874f)
                    curveTo(8.6667f, 13.3516f, 8.6725f, 13.316f, 8.6838f, 13.282f)
                    lineTo(9.2574f, 11.5612f)
                    curveTo(9.3027f, 11.4251f, 9.4301f, 11.3333f, 9.5736f, 11.3333f)
                    horizontalLineTo(10.588f)
                    curveTo(10.6397f, 11.3333f, 10.6908f, 11.3213f, 10.7371f, 11.2981f)
                    lineTo(11.9296f, 10.7018f)
                    curveTo(11.9759f, 10.6787f, 12.027f, 10.6667f, 12.0787f, 10.6667f)
                    horizontalLineTo(13.0f)
                    curveTo(13.1841f, 10.6667f, 13.3334f, 10.5174f, 13.3334f, 10.3333f)
                    verticalLineTo(10.1381f)
                    curveTo(13.3334f, 10.0497f, 13.3685f, 9.9649f, 13.431f, 9.9024f)
                    lineTo(13.673f, 9.6603f)
                    curveTo(13.8339f, 9.4995f, 14.1051f, 9.5435f, 14.2068f, 9.747f)
                    lineTo(14.5746f, 10.4824f)
                    curveTo(14.631f, 10.5953f, 14.7464f, 10.6667f, 14.8727f, 10.6667f)
                    horizontalLineTo(16.4264f)
                    curveTo(16.5699f, 10.6667f, 16.6973f, 10.5748f, 16.7427f, 10.4387f)
                    lineTo(17.2574f, 8.8946f)
                    curveTo(17.3028f, 8.7585f, 17.4301f, 8.6667f, 17.5736f, 8.6667f)
                    horizontalLineTo(18.3334f)
                    curveTo(18.5174f, 8.6667f, 18.6667f, 8.5174f, 18.6667f, 8.3333f)
                    curveTo(18.6667f, 8.1492f, 18.5174f, 8.0f, 18.3334f, 8.0f)
                    horizontalLineTo(17.6667f)
                    curveTo(17.4826f, 8.0f, 17.3334f, 7.8507f, 17.3334f, 7.6667f)
                    verticalLineTo(6.7453f)
                    curveTo(17.3334f, 6.6936f, 17.3454f, 6.6426f, 17.3685f, 6.5963f)
                    lineTo(17.8926f, 5.5482f)
                    curveTo(17.9567f, 5.4199f, 17.9316f, 5.2649f, 17.8301f, 5.1634f)
                    lineTo(17.5691f, 4.9024f)
                    curveTo(17.4389f, 4.7722f, 17.2278f, 4.7722f, 17.0977f, 4.9024f)
                    lineTo(16.0977f, 5.9024f)
                    curveTo(16.0351f, 5.9649f, 16.0f, 6.0497f, 16.0f, 6.1381f)
                    verticalLineTo(7.2792f)
                    curveTo(16.0f, 7.3151f, 15.9942f, 7.3506f, 15.9829f, 7.3846f)
                    lineTo(15.4093f, 9.1054f)
                    curveTo(15.364f, 9.2415f, 15.2366f, 9.3333f, 15.0931f, 9.3333f)
                    horizontalLineTo(14.8048f)
                    curveTo(14.7164f, 9.3333f, 14.6316f, 9.2982f, 14.5691f, 9.2357f)
                    lineTo(14.0961f, 8.7627f)
                    curveTo(14.0346f, 8.7012f, 14.0f, 8.6178f, 14.0f, 8.5308f)
                    curveTo(14.0f, 8.2869f, 13.7434f, 8.1283f, 13.5253f, 8.2374f)
                    lineTo(12.8816f, 8.5592f)
                    curveTo(12.7532f, 8.6234f, 12.5983f, 8.5982f, 12.4968f, 8.4968f)
                    lineTo(12.0977f, 8.0976f)
                    curveTo(12.0351f, 8.0351f, 12.0f, 7.9503f, 12.0f, 7.8619f)
                    verticalLineTo(6.8047f)
                    curveTo(12.0f, 6.7163f, 12.0351f, 6.6315f, 12.0977f, 6.569f)
                    lineTo(13.3334f, 5.3333f)
                    lineTo(15.2777f, 3.389f)
                    curveTo(15.3143f, 3.3524f, 15.3589f, 3.3248f, 15.408f, 3.3084f)
                    lineTo(17.282f, 2.6838f)
                    curveTo(17.316f, 2.6724f, 17.3516f, 2.6667f, 17.3874f, 2.6667f)
                    horizontalLineTo(18.4607f)
                    curveTo(18.5869f, 2.6667f, 18.7024f, 2.738f, 18.7588f, 2.8509f)
                    lineTo(19.2982f, 3.9296f)
                    curveTo(19.3213f, 3.9759f, 19.3334f, 4.0269f, 19.3334f, 4.0787f)
                    verticalLineTo(5.8619f)
                    curveTo(19.3334f, 5.9503f, 19.3685f, 6.0351f, 19.431f, 6.0976f)
                    lineTo(19.8543f, 6.521f)
                    curveTo(19.9436f, 6.6103f, 19.9748f, 6.7423f, 19.9349f, 6.8621f)
                    lineTo(19.4139f, 8.4251f)
                    curveTo(19.3663f, 8.5677f, 19.4201f, 8.7245f, 19.5452f, 8.8079f)
                    lineTo(21.3334f, 10.0f)
                    lineTo(22.329f, 10.4978f)
                    curveTo(22.5083f, 10.5875f, 22.5685f, 10.814f, 22.4572f, 10.9808f)
                    lineTo(21.3893f, 12.5827f)
                    curveTo(21.3528f, 12.6374f, 21.3334f, 12.7018f, 21.3334f, 12.7676f)
                    verticalLineTo(14.4264f)
                    curveTo(21.3334f, 14.5699f, 21.2415f, 14.6973f, 21.1054f, 14.7426f)
                    lineTo(19.4643f, 15.2897f)
                    curveTo(19.3805f, 15.3176f, 19.3111f, 15.3777f, 19.2716f, 15.4568f)
                    lineTo(18.6909f, 16.6183f)
                    curveTo(18.6749f, 16.6503f, 18.6538f, 16.6796f, 18.6284f, 16.7049f)
                    lineTo(17.5691f, 17.7643f)
                    curveTo(17.4389f, 17.8945f, 17.2278f, 17.8945f, 17.0977f, 17.7643f)
                    close()
                    moveTo(11.3334f, 17.3333f)
                    curveTo(11.7015f, 17.3333f, 12.0f, 17.0348f, 12.0f, 16.6667f)
                    curveTo(12.0f, 16.2985f, 11.7015f, 16.0f, 11.3334f, 16.0f)
                    curveTo(10.9652f, 16.0f, 10.6667f, 16.2985f, 10.6667f, 16.6667f)
                    curveTo(10.6667f, 17.0348f, 10.9652f, 17.3333f, 11.3334f, 17.3333f)
                    close()
                    moveTo(9.3334f, 8.6667f)
                    curveTo(9.3334f, 9.0349f, 9.0349f, 9.3333f, 8.6667f, 9.3333f)
                    curveTo(8.2985f, 9.3333f, 8.0f, 9.0349f, 8.0f, 8.6667f)
                    curveTo(8.0f, 8.2985f, 8.2985f, 8.0f, 8.6667f, 8.0f)
                    curveTo(9.0349f, 8.0f, 9.3334f, 8.2985f, 9.3334f, 8.6667f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(9.9648f, 8.737f)
                    curveTo(9.9879f, 8.6908f, 10.0f, 8.6397f, 10.0f, 8.588f)
                    verticalLineTo(8.0787f)
                    curveTo(10.0f, 8.0269f, 9.9879f, 7.9759f, 9.9648f, 7.9296f)
                    lineTo(9.5745f, 7.1491f)
                    curveTo(9.4637f, 6.9274f, 9.6249f, 6.6667f, 9.8727f, 6.6667f)
                    horizontalLineTo(10.3333f)
                    curveTo(10.5174f, 6.6667f, 10.6666f, 6.8159f, 10.6666f, 7.0f)
                    verticalLineTo(8.588f)
                    curveTo(10.6666f, 8.6397f, 10.6787f, 8.6908f, 10.7018f, 8.737f)
                    lineTo(11.0921f, 9.5176f)
                    curveTo(11.2029f, 9.7392f, 11.0418f, 10.0f, 10.794f, 10.0f)
                    horizontalLineTo(9.8727f)
                    curveTo(9.6249f, 10.0f, 9.4637f, 9.7392f, 9.5745f, 9.5176f)
                    lineTo(9.9648f, 8.737f)
                    close()
                }
            }
        }
        .build()
        return _ceu!!
    }

private var _ceu: ImageVector? = null
