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

public val PaymentsGroup.GiroPay: ImageVector
    get() {
        if (_giroPay != null) {
            return _giroPay!!
        }
        _giroPay = Builder(name = "GiroPay", defaultWidth = 58.0.dp, defaultHeight = 40.0.dp,
                viewportWidth = 58.0f, viewportHeight = 40.0f).apply {
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
            path(fill = SolidColor(Color(0xFF0F3365)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(7.8313f, 25.8497f)
                verticalLineTo(14.4462f)
                curveTo(7.8334f, 13.4977f, 8.7013f, 12.7303f, 9.7739f, 12.7286f)
                horizontalLineTo(29.9861f)
                verticalLineTo(27.5673f)
                horizontalLineTo(9.7739f)
                curveTo(8.7013f, 27.5655f, 7.8334f, 26.7979f, 7.8313f, 25.8497f)
                close()
                moveTo(48.4571f, 11.4462f)
                horizontalLineTo(9.7739f)
                curveTo(7.8998f, 11.4465f, 6.3818f, 12.7887f, 6.3811f, 14.4462f)
                verticalLineTo(25.8497f)
                curveTo(6.3818f, 27.5067f, 7.8998f, 28.849f, 9.7739f, 28.8496f)
                horizontalLineTo(48.4571f)
                curveTo(50.331f, 28.849f, 51.8493f, 27.5067f, 51.8499f, 25.8497f)
                verticalLineTo(14.4462f)
                curveTo(51.8493f, 12.7887f, 50.331f, 11.4465f, 48.4571f, 11.4462f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFFFFFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(29.9861f, 12.7285f)
                horizontalLineTo(9.7739f)
                curveTo(8.7013f, 12.7302f, 7.8334f, 13.4977f, 7.8313f, 14.4461f)
                verticalLineTo(25.8497f)
                curveTo(7.8334f, 26.7978f, 8.7013f, 27.5654f, 9.7739f, 27.5673f)
                horizontalLineTo(29.9861f)
                verticalLineTo(12.7285f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFFFFFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(43.6152f, 23.9843f)
                curveTo(43.9643f, 24.0512f, 44.3129f, 24.0846f, 44.6713f, 24.0846f)
                curveTo(46.2275f, 24.0846f, 46.5949f, 23.0252f, 47.0754f, 21.9337f)
                lineTo(48.8766f, 17.8895f)
                horizontalLineTo(47.1794f)
                lineTo(46.1703f, 20.7242f)
                horizontalLineTo(46.1515f)
                lineTo(45.0954f, 17.8895f)
                horizontalLineTo(43.2669f)
                lineTo(45.2554f, 22.3335f)
                curveTo(45.1336f, 22.717f, 44.8129f, 22.9339f, 44.3986f, 22.9339f)
                curveTo(44.1622f, 22.9339f, 43.9547f, 22.9093f, 43.7288f, 22.842f)
                lineTo(43.6152f, 23.9843f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFFFFFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(42.853f, 22.2332f)
                curveTo(42.7777f, 21.8914f, 42.7584f, 21.5498f, 42.7584f, 21.2078f)
                verticalLineTo(19.5903f)
                curveTo(42.7584f, 18.2646f, 41.6743f, 17.7896f, 40.4203f, 17.7896f)
                curveTo(39.694f, 17.7896f, 39.0624f, 17.8809f, 38.459f, 18.0981f)
                lineTo(38.487f, 19.1151f)
                curveTo(38.9589f, 18.8819f, 39.5055f, 18.79f, 40.0521f, 18.79f)
                curveTo(40.6652f, 18.79f, 41.1652f, 18.9484f, 41.1745f, 19.5406f)
                curveTo(40.9577f, 19.5069f, 40.6562f, 19.4816f, 40.3827f, 19.4816f)
                curveTo(39.4775f, 19.4816f, 37.8464f, 19.6406f, 37.8464f, 20.9661f)
                curveTo(37.8464f, 21.9086f, 38.7138f, 22.3338f, 39.685f, 22.3338f)
                curveTo(40.3827f, 22.3338f, 40.8541f, 22.0916f, 41.2405f, 21.5498f)
                horizontalLineTo(41.2589f)
                curveTo(41.2589f, 21.775f, 41.2878f, 22.0004f, 41.297f, 22.2332f)
                horizontalLineTo(42.853f)
                close()
                moveTo(39.4301f, 20.8579f)
                curveTo(39.4301f, 20.441f, 39.8826f, 20.2826f, 40.4578f, 20.2826f)
                curveTo(40.7126f, 20.2826f, 40.9577f, 20.2992f, 41.1745f, 20.3075f)
                curveTo(41.1745f, 20.8159f, 40.7694f, 21.3335f, 40.1277f, 21.3335f)
                curveTo(39.7319f, 21.3335f, 39.4301f, 21.1576f, 39.4301f, 20.8579f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFFFFFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(31.597f, 23.9844f)
                horizontalLineTo(33.2938f)
                verticalLineTo(21.6251f)
                horizontalLineTo(33.3128f)
                curveTo(33.6335f, 22.142f, 34.2747f, 22.3335f, 34.8686f, 22.3335f)
                curveTo(36.33f, 22.3335f, 37.1125f, 21.2663f, 37.1125f, 19.9822f)
                curveTo(37.1125f, 18.9319f, 36.3682f, 17.7896f, 35.0103f, 17.7896f)
                curveTo(34.2372f, 17.7896f, 33.5203f, 18.0647f, 33.181f, 18.6734f)
                horizontalLineTo(33.1621f)
                verticalLineTo(17.8896f)
                horizontalLineTo(31.597f)
                verticalLineTo(23.9844f)
                close()
                moveTo(35.3591f, 20.0157f)
                curveTo(35.3591f, 20.7079f, 34.9724f, 21.1829f, 34.3317f, 21.1829f)
                curveTo(33.7657f, 21.1829f, 33.2938f, 20.7079f, 33.2938f, 20.0739f)
                curveTo(33.2938f, 19.4238f, 33.7091f, 18.9401f, 34.3317f, 18.9401f)
                curveTo(34.9914f, 18.9401f, 35.3591f, 19.4401f, 35.3591f, 20.0157f)
                close()
            }
            path(fill = SolidColor(Color(0xFFD8232A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(26.1925f, 22.3335f)
                curveTo(27.8138f, 22.3335f, 29.0491f, 21.5f, 29.0491f, 20.0659f)
                curveTo(29.0491f, 18.6231f, 27.8138f, 17.7896f, 26.1925f, 17.7896f)
                curveTo(24.5709f, 17.7896f, 23.3356f, 18.6231f, 23.3356f, 20.0659f)
                curveTo(23.3356f, 21.5f, 24.5709f, 22.3335f, 26.1925f, 22.3335f)
                close()
                moveTo(26.1925f, 21.2829f)
                curveTo(25.4099f, 21.2829f, 25.0893f, 20.7079f, 25.0893f, 20.0659f)
                curveTo(25.0893f, 19.4154f, 25.4099f, 18.8401f, 26.1925f, 18.8401f)
                curveTo(26.975f, 18.8401f, 27.2957f, 19.4154f, 27.2957f, 20.0659f)
                curveTo(27.2957f, 20.7079f, 26.975f, 21.2829f, 26.1925f, 21.2829f)
                close()
            }
            path(fill = SolidColor(Color(0xFFD8232A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(23.2703f, 17.8391f)
                curveTo(23.1005f, 17.8146f, 22.8931f, 17.7896f, 22.6953f, 17.7896f)
                curveTo(21.9599f, 17.7896f, 21.5355f, 18.1397f, 21.2431f, 18.6897f)
                horizontalLineTo(21.2244f)
                verticalLineTo(17.8896f)
                horizontalLineTo(19.6781f)
                verticalLineTo(22.2332f)
                horizontalLineTo(21.3752f)
                verticalLineTo(20.3994f)
                curveTo(21.3752f, 19.5487f, 21.8185f, 19.04f, 22.6104f, 19.04f)
                curveTo(22.8082f, 19.04f, 22.9969f, 19.04f, 23.1852f, 19.0898f)
                lineTo(23.2703f, 17.8391f)
                close()
            }
            path(fill = SolidColor(Color(0xFFD8232A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(16.8477f, 22.2331f)
                horizontalLineTo(18.5447f)
                verticalLineTo(17.8895f)
                horizontalLineTo(16.8477f)
                verticalLineTo(22.2331f)
                close()
                moveTo(16.8477f, 17.1807f)
                horizontalLineTo(18.5447f)
                verticalLineTo(16.0801f)
                horizontalLineTo(16.8477f)
                verticalLineTo(17.1807f)
                close()
            }
            path(fill = SolidColor(Color(0xFFD8232A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(15.6766f, 17.8896f)
                horizontalLineTo(14.1394f)
                verticalLineTo(18.6731f)
                horizontalLineTo(14.121f)
                curveTo(13.7626f, 18.1397f, 13.1778f, 17.7896f, 12.452f, 17.7896f)
                curveTo(10.9248f, 17.7896f, 10.2364f, 18.7565f, 10.2364f, 20.0489f)
                curveTo(10.2364f, 21.3335f, 11.0755f, 22.2332f, 12.4239f, 22.2332f)
                curveTo(13.1027f, 22.2332f, 13.6683f, 22.0004f, 14.0735f, 21.4911f)
                horizontalLineTo(14.0926f)
                verticalLineTo(21.7251f)
                curveTo(14.0926f, 22.5755f, 13.5648f, 22.9839f, 12.5841f, 22.9839f)
                curveTo(11.8769f, 22.9839f, 11.4432f, 22.8507f, 10.9248f, 22.6255f)
                lineTo(10.8397f, 23.8096f)
                curveTo(11.2358f, 23.9342f, 11.9053f, 24.0846f, 12.7161f, 24.0846f)
                curveTo(14.6961f, 24.0846f, 15.6766f, 23.5091f, 15.6766f, 21.7251f)
                verticalLineTo(17.8896f)
                close()
                moveTo(11.9901f, 20.0238f)
                curveTo(11.9901f, 19.432f, 12.3201f, 18.9401f, 12.9518f, 18.9401f)
                curveTo(13.7154f, 18.9401f, 14.0361f, 19.4816f, 14.0361f, 19.9654f)
                curveTo(14.0361f, 20.6328f, 13.555f, 21.0829f, 12.9518f, 21.0829f)
                curveTo(12.4427f, 21.0829f, 11.9901f, 20.699f, 11.9901f, 20.0238f)
                close()
            }
        }
        .build()
        return _giroPay!!
    }

private var _giroPay: ImageVector? = null
