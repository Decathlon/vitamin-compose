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

public val PaymentsGroup.GooglePay: ImageVector
    get() {
        if (_googlePay != null) {
            return _googlePay!!
        }
        _googlePay = Builder(name = "GooglePay", defaultWidth = 58.0.dp, defaultHeight = 40.0.dp,
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
            path(fill = SolidColor(Color(0xFF5F6368)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(27.9174f, 24.1182f)
                verticalLineTo(19.6071f)
                verticalLineTo(19.6062f)
                horizontalLineTo(30.3578f)
                curveTo(31.3639f, 19.6068f, 32.2095f, 19.2907f, 32.8945f, 18.6578f)
                curveTo(33.5868f, 18.0571f, 33.9738f, 17.1935f, 33.9541f, 16.2934f)
                curveTo(33.9678f, 15.3982f, 33.5815f, 14.541f, 32.8945f, 13.9422f)
                curveTo(32.2155f, 13.3059f, 31.3023f, 12.9587f, 30.3578f, 12.9778f)
                horizontalLineTo(26.4404f)
                verticalLineTo(24.1182f)
                horizontalLineTo(27.9174f)
                close()
                moveTo(27.9174f, 18.2382f)
                verticalLineTo(14.3494f)
                verticalLineTo(14.3485f)
                horizontalLineTo(30.3945f)
                curveTo(30.9466f, 14.3334f, 31.4788f, 14.5487f, 31.856f, 14.9396f)
                curveTo(32.2355f, 15.2971f, 32.4496f, 15.7881f, 32.4496f, 16.3009f)
                curveTo(32.4496f, 16.8137f, 32.2355f, 17.3048f, 31.856f, 17.6622f)
                curveTo(31.4741f, 18.0449f, 30.9436f, 18.254f, 30.3945f, 18.2382f)
                horizontalLineTo(27.9174f)
                close()
            }
            path(fill = SolidColor(Color(0xFF5F6368)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(39.9431f, 17.0951f)
                curveTo(39.3113f, 16.5297f, 38.4496f, 16.2471f, 37.3578f, 16.2471f)
                curveTo(35.9554f, 16.2471f, 34.8963f, 16.7448f, 34.1807f, 17.7404f)
                lineTo(35.4817f, 18.5342f)
                curveTo(35.9624f, 17.8598f, 36.6153f, 17.5226f, 37.4404f, 17.5226f)
                curveTo(37.9664f, 17.5167f, 38.4755f, 17.703f, 38.8661f, 18.0444f)
                curveTo(39.2555f, 18.3564f, 39.4795f, 18.8215f, 39.4762f, 19.3111f)
                verticalLineTo(19.6382f)
                curveTo(38.9086f, 19.3271f, 38.1863f, 19.1715f, 37.3092f, 19.1715f)
                curveTo(36.2817f, 19.1727f, 35.4603f, 19.4062f, 34.845f, 19.872f)
                curveTo(34.2297f, 20.3377f, 33.922f, 20.965f, 33.922f, 21.7537f)
                curveTo(33.9086f, 22.4719f, 34.2302f, 23.1577f, 34.7973f, 23.6204f)
                curveTo(35.3807f, 24.1182f, 36.1058f, 24.3671f, 36.9725f, 24.3671f)
                curveTo(37.9878f, 24.3671f, 38.8012f, 23.9315f, 39.4129f, 23.0604f)
                horizontalLineTo(39.4771f)
                verticalLineTo(24.1182f)
                horizontalLineTo(40.8899f)
                verticalLineTo(19.4204f)
                curveTo(40.8905f, 18.4355f, 40.5749f, 17.6604f, 39.9431f, 17.0951f)
                close()
                moveTo(35.9367f, 22.7182f)
                curveTo(35.6273f, 22.5021f, 35.4448f, 22.1544f, 35.4468f, 21.7848f)
                curveTo(35.4468f, 21.3697f, 35.6477f, 21.024f, 36.0523f, 20.7395f)
                curveTo(36.4529f, 20.4592f, 36.9532f, 20.3191f, 37.5532f, 20.3191f)
                curveTo(38.3771f, 20.3191f, 39.0193f, 20.4968f, 39.4798f, 20.8524f)
                curveTo(39.4798f, 21.4533f, 39.2352f, 21.9768f, 38.7459f, 22.4231f)
                curveTo(38.3052f, 22.8501f, 37.7077f, 23.0905f, 37.0844f, 23.0915f)
                curveTo(36.6689f, 23.099f, 36.2634f, 22.9672f, 35.9367f, 22.7182f)
                close()
            }
            path(fill = SolidColor(Color(0xFF5F6368)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(49.0f, 16.496f)
                lineTo(44.0679f, 27.4782f)
                horizontalLineTo(42.5431f)
                lineTo(44.3734f, 23.6355f)
                lineTo(41.1303f, 16.496f)
                horizontalLineTo(42.7358f)
                lineTo(45.0798f, 21.9715f)
                horizontalLineTo(45.1119f)
                lineTo(47.3917f, 16.496f)
                horizontalLineTo(49.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF4285F4)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(21.9486f, 18.6347f)
                curveTo(21.9492f, 18.1986f, 21.9111f, 17.7632f, 21.8349f, 17.3334f)
                horizontalLineTo(15.6055f)
                verticalLineTo(19.7983f)
                horizontalLineTo(19.1734f)
                curveTo(19.0259f, 20.5938f, 18.5493f, 21.2964f, 17.8541f, 21.7432f)
                verticalLineTo(23.3432f)
                horizontalLineTo(19.9835f)
                curveTo(21.2303f, 22.2294f, 21.9486f, 20.5823f, 21.9486f, 18.6347f)
                close()
            }
            path(fill = SolidColor(Color(0xFF34A853)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(15.6055f, 24.8889f)
                curveTo(17.3881f, 24.8889f, 18.889f, 24.3217f, 19.9835f, 23.344f)
                lineTo(17.8541f, 21.744f)
                curveTo(17.2615f, 22.1333f, 16.4982f, 22.3555f, 15.6055f, 22.3555f)
                curveTo(13.8826f, 22.3555f, 12.4202f, 21.2302f, 11.8973f, 19.7137f)
                horizontalLineTo(9.7037f)
                verticalLineTo(21.3626f)
                curveTo(10.8249f, 23.5244f, 13.1085f, 24.8887f, 15.6055f, 24.8889f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFBBC04)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(11.8973f, 19.7138f)
                curveTo(11.6208f, 18.9192f, 11.6208f, 18.0586f, 11.8973f, 17.264f)
                verticalLineTo(15.6151f)
                horizontalLineTo(9.7037f)
                curveTo(8.7659f, 17.4232f, 8.7659f, 19.5546f, 9.7037f, 21.3627f)
                lineTo(11.8973f, 19.7138f)
                close()
            }
            path(fill = SolidColor(Color(0xFFEA4335)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(15.6055f, 14.6223f)
                curveTo(16.5475f, 14.6073f, 17.4577f, 14.9522f, 18.1395f, 15.5823f)
                lineTo(20.0248f, 13.7556f)
                curveTo(18.8293f, 12.6677f, 17.2455f, 12.0704f, 15.6055f, 12.0889f)
                curveTo(13.1085f, 12.089f, 10.8249f, 13.4534f, 9.7037f, 15.6151f)
                lineTo(11.8973f, 17.264f)
                curveTo(12.4202f, 15.7476f, 13.8826f, 14.6223f, 15.6055f, 14.6223f)
                close()
            }
        }
        .build()
        return _googlePay!!
    }

private var _googlePay: ImageVector? = null
