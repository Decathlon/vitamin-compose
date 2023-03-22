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

public val FlagsGroup.Hk: ImageVector
    get() {
        if (_hk != null) {
            return _hk!!
        }
        _hk = Builder(name = "Hk", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
                28.0f, viewportHeight = 20.0f).apply {
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
                path(fill = SolidColor(Color(0xFFF0371D)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(0.0f, 20.0f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(20.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(13.984f, 8.1457f)
                    curveTo(14.9468f, 7.3398f, 15.0054f, 7.1596f, 15.2361f, 6.4496f)
                    curveTo(15.3131f, 6.2126f, 15.2588f, 6.018f, 15.1946f, 5.7881f)
                    curveTo(15.1022f, 5.4567f, 14.9892f, 5.052f, 15.2201f, 4.3415f)
                    curveTo(14.1696f, 4.0002f, 12.949f, 4.8589f, 12.4939f, 6.2596f)
                    curveTo(12.0388f, 7.6603f, 12.5215f, 9.0725f, 13.572f, 9.4138f)
                    curveTo(13.7601f, 9.4749f, 13.739f, 9.4307f, 13.6819f, 9.3111f)
                    curveTo(13.5817f, 9.1012f, 13.3707f, 8.659f, 13.984f, 8.1457f)
                    close()
                    moveTo(11.9901f, 9.6176f)
                    curveTo(11.5212f, 8.4529f, 11.3679f, 8.3415f, 10.764f, 7.9027f)
                    curveTo(10.5624f, 7.7562f, 10.3605f, 7.7477f, 10.122f, 7.7377f)
                    curveTo(9.7782f, 7.7232f, 9.3584f, 7.7056f, 8.7541f, 7.2665f)
                    curveTo(8.1048f, 8.1601f, 8.5444f, 9.5863f, 9.7359f, 10.4519f)
                    curveTo(10.9274f, 11.3176f, 12.4196f, 11.2949f, 13.0688f, 10.4013f)
                    curveTo(13.1851f, 10.2414f, 13.1365f, 10.2477f, 13.0051f, 10.2651f)
                    curveTo(12.7745f, 10.2955f, 12.2888f, 10.3595f, 11.9901f, 9.6176f)
                    close()
                    moveTo(18.0f, 10.2538f)
                    curveTo(17.2535f, 10.2538f, 17.064f, 10.2538f, 16.0f, 9.5872f)
                    curveTo(15.3223f, 9.1625f, 14.967f, 9.4998f, 14.7983f, 9.66f)
                    curveTo(14.7022f, 9.7512f, 14.6667f, 9.7849f, 14.6667f, 9.5872f)
                    curveTo(14.6667f, 8.4826f, 15.8606f, 7.5872f, 17.3334f, 7.5872f)
                    curveTo(18.8061f, 7.5872f, 20.0f, 8.4826f, 20.0f, 9.5872f)
                    curveTo(19.253f, 9.5872f, 18.903f, 9.8196f, 18.6163f, 10.01f)
                    curveTo(18.4175f, 10.142f, 18.2492f, 10.2538f, 18.0f, 10.2538f)
                    close()
                    moveTo(18.0f, 9.0f)
                    curveTo(18.0f, 9.1841f, 17.8508f, 9.3333f, 17.6667f, 9.3333f)
                    curveTo(17.4826f, 9.3333f, 17.3334f, 9.1841f, 17.3334f, 9.0f)
                    curveTo(17.3334f, 8.8159f, 17.4826f, 8.6667f, 17.6667f, 8.6667f)
                    curveTo(17.8508f, 8.6667f, 18.0f, 8.8159f, 18.0f, 9.0f)
                    close()
                    moveTo(15.2521f, 11.9499f)
                    curveTo(14.9468f, 13.1678f, 15.0054f, 13.3481f, 15.2361f, 14.0581f)
                    curveTo(15.3131f, 14.295f, 15.4714f, 14.4206f, 15.6584f, 14.5689f)
                    curveTo(15.9281f, 14.7826f, 16.2573f, 15.0437f, 16.4882f, 15.7542f)
                    curveTo(17.5387f, 15.4128f, 18.0213f, 14.0007f, 17.5662f, 12.6f)
                    curveTo(17.1111f, 11.1993f, 15.8906f, 10.3405f, 14.8401f, 10.6819f)
                    curveTo(14.652f, 10.743f, 14.695f, 10.7663f, 14.8115f, 10.8295f)
                    curveTo(15.0159f, 10.9405f, 15.4465f, 11.1742f, 15.2521f, 11.9499f)
                    close()
                    moveTo(16.4286f, 13.6706f)
                    curveTo(16.2535f, 13.7275f, 16.0654f, 13.6317f, 16.0085f, 13.4566f)
                    curveTo(15.9517f, 13.2815f, 16.0475f, 13.0935f, 16.2226f, 13.0366f)
                    curveTo(16.3976f, 12.9797f, 16.5857f, 13.0755f, 16.6426f, 13.2506f)
                    curveTo(16.6995f, 13.4257f, 16.6037f, 13.6137f, 16.4286f, 13.6706f)
                    close()
                    moveTo(12.7738f, 11.9688f)
                    curveTo(11.5212f, 12.0548f, 11.3679f, 12.1662f, 10.764f, 12.605f)
                    curveTo(10.5624f, 12.7514f, 10.4919f, 12.9408f, 10.4087f, 13.1645f)
                    curveTo(10.2887f, 13.487f, 10.1422f, 13.8808f, 9.5378f, 14.3199f)
                    curveTo(10.187f, 15.2135f, 11.6792f, 15.2362f, 12.8707f, 14.3705f)
                    curveTo(14.0622f, 13.5048f, 14.5018f, 12.0787f, 13.8525f, 11.185f)
                    curveTo(13.7363f, 11.0251f, 13.7274f, 11.0732f, 13.7033f, 11.2035f)
                    curveTo(13.6609f, 11.4322f, 13.5717f, 11.9139f, 12.7738f, 11.9688f)
                    close()
                    moveTo(11.5009f, 13.6194f)
                    curveTo(11.3927f, 13.4704f, 11.4258f, 13.262f, 11.5747f, 13.1538f)
                    curveTo(11.7236f, 13.0455f, 11.9321f, 13.0786f, 12.0403f, 13.2275f)
                    curveTo(12.1485f, 13.3764f, 12.1155f, 13.5849f, 11.9665f, 13.6931f)
                    curveTo(11.8176f, 13.8013f, 11.6092f, 13.7683f, 11.5009f, 13.6194f)
                    close()
                    moveTo(10.027f, 8.9171f)
                    curveTo(10.1352f, 8.7681f, 10.3436f, 8.7351f, 10.4926f, 8.8433f)
                    curveTo(10.6415f, 8.9515f, 10.6745f, 9.16f, 10.5663f, 9.3089f)
                    curveTo(10.4581f, 9.4579f, 10.2496f, 9.4909f, 10.1007f, 9.3827f)
                    curveTo(9.9518f, 9.2745f, 9.9188f, 9.066f, 10.027f, 8.9171f)
                    close()
                    moveTo(14.0436f, 6.0622f)
                    curveTo(14.2187f, 6.119f, 14.3145f, 6.3071f, 14.2576f, 6.4822f)
                    curveTo(14.2007f, 6.6573f, 14.0127f, 6.7531f, 13.8376f, 6.6962f)
                    curveTo(13.6625f, 6.6393f, 13.5667f, 6.4513f, 13.6236f, 6.2762f)
                    curveTo(13.6805f, 6.1011f, 13.8685f, 6.0053f, 14.0436f, 6.0622f)
                    close()
                }
            }
        }
        .build()
        return _hk!!
    }

private var _hk: ImageVector? = null
