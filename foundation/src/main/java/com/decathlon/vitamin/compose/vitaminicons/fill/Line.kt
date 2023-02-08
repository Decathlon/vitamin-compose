package com.decathlon.vitamin.compose.vitaminicons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.vitaminicons.FillGroup

public val FillGroup.Line: ImageVector
    get() {
        if (_line != null) {
            return _line!!
        }
        _line = Builder(name = "Line", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.663f, 10.268f)
                curveTo(18.6627f, 10.4073f, 18.6072f, 10.5409f, 18.5086f, 10.6393f)
                curveTo(18.41f, 10.7377f, 18.2763f, 10.793f, 18.137f, 10.793f)
                horizontalLineTo(16.675f)
                verticalLineTo(11.731f)
                horizontalLineTo(18.137f)
                curveTo(18.2078f, 11.7279f, 18.2785f, 11.7392f, 18.3448f, 11.7641f)
                curveTo(18.4112f, 11.7891f, 18.4718f, 11.8272f, 18.5229f, 11.8763f)
                curveTo(18.5741f, 11.9253f, 18.6149f, 11.9841f, 18.6427f, 12.0493f)
                curveTo(18.6706f, 12.1145f, 18.6849f, 12.1846f, 18.6849f, 12.2555f)
                curveTo(18.6849f, 12.3264f, 18.6706f, 12.3965f, 18.6427f, 12.4617f)
                curveTo(18.6149f, 12.5269f, 18.5741f, 12.5857f, 18.5229f, 12.6347f)
                curveTo(18.4718f, 12.6838f, 18.4112f, 12.7219f, 18.3448f, 12.7469f)
                curveTo(18.2785f, 12.7718f, 18.2078f, 12.7831f, 18.137f, 12.78f)
                horizontalLineTo(16.15f)
                curveTo(16.0115f, 12.7789f, 15.8791f, 12.7233f, 15.7813f, 12.6252f)
                curveTo(15.6836f, 12.5271f, 15.6285f, 12.3945f, 15.628f, 12.256f)
                verticalLineTo(8.28f)
                curveTo(15.628f, 7.993f, 15.863f, 7.755f, 16.153f, 7.755f)
                horizontalLineTo(18.141f)
                curveTo(18.2802f, 7.7554f, 18.4136f, 7.8111f, 18.5118f, 7.9098f)
                curveTo(18.61f, 8.0086f, 18.6649f, 8.1423f, 18.6645f, 8.2815f)
                curveTo(18.6641f, 8.4207f, 18.6084f, 8.5541f, 18.5097f, 8.6523f)
                curveTo(18.4109f, 8.7505f, 18.2772f, 8.8054f, 18.138f, 8.805f)
                horizontalLineTo(16.676f)
                verticalLineTo(9.743f)
                horizontalLineTo(18.138f)
                curveTo(18.429f, 9.743f, 18.664f, 9.98f, 18.664f, 10.268f)
                horizontalLineTo(18.663f)
                close()
                moveTo(14.565f, 12.753f)
                curveTo(14.5113f, 12.77f, 14.4553f, 12.7784f, 14.399f, 12.778f)
                curveTo(14.3167f, 12.7798f, 14.2351f, 12.7619f, 14.1612f, 12.7257f)
                curveTo(14.0872f, 12.6895f, 14.0231f, 12.6361f, 13.974f, 12.57f)
                lineTo(11.938f, 9.806f)
                verticalLineTo(12.256f)
                curveTo(11.928f, 12.388f, 11.8685f, 12.5113f, 11.7714f, 12.6013f)
                curveTo(11.6744f, 12.6913f, 11.5469f, 12.7413f, 11.4145f, 12.7413f)
                curveTo(11.2821f, 12.7413f, 11.1546f, 12.6913f, 11.0576f, 12.6013f)
                curveTo(10.9605f, 12.5113f, 10.901f, 12.388f, 10.891f, 12.256f)
                verticalLineTo(8.28f)
                curveTo(10.8907f, 8.1417f, 10.9453f, 8.009f, 11.0428f, 7.911f)
                curveTo(11.1403f, 7.8129f, 11.2727f, 7.7575f, 11.411f, 7.757f)
                curveTo(11.573f, 7.757f, 11.723f, 7.843f, 11.823f, 7.968f)
                lineTo(13.875f, 10.743f)
                verticalLineTo(8.28f)
                curveTo(13.875f, 7.993f, 14.11f, 7.755f, 14.4f, 7.755f)
                curveTo(14.687f, 7.755f, 14.925f, 7.993f, 14.925f, 8.28f)
                verticalLineTo(12.256f)
                curveTo(14.9249f, 12.3662f, 14.89f, 12.4735f, 14.8254f, 12.5627f)
                curveTo(14.7607f, 12.6519f, 14.6696f, 12.7185f, 14.565f, 12.753f)
                close()
                moveTo(9.615f, 12.78f)
                curveTo(9.4764f, 12.7792f, 9.3436f, 12.7237f, 9.2457f, 12.6256f)
                curveTo(9.1478f, 12.5275f, 9.0925f, 12.3946f, 9.092f, 12.256f)
                verticalLineTo(8.28f)
                curveTo(9.092f, 7.993f, 9.328f, 7.755f, 9.617f, 7.755f)
                curveTo(9.906f, 7.755f, 10.141f, 7.993f, 10.141f, 8.28f)
                verticalLineTo(12.256f)
                curveTo(10.1402f, 12.3951f, 10.0845f, 12.5282f, 9.9859f, 12.6264f)
                curveTo(9.8874f, 12.7245f, 9.7541f, 12.7797f, 9.615f, 12.78f)
                close()
                moveTo(8.085f, 12.78f)
                horizontalLineTo(6.098f)
                curveTo(5.9592f, 12.7792f, 5.8263f, 12.7238f, 5.728f, 12.6257f)
                curveTo(5.6297f, 12.5276f, 5.574f, 12.3948f, 5.573f, 12.256f)
                verticalLineTo(8.28f)
                curveTo(5.5845f, 8.1487f, 5.6448f, 8.0264f, 5.7419f, 7.9373f)
                curveTo(5.8391f, 7.8483f, 5.9662f, 7.7989f, 6.098f, 7.7989f)
                curveTo(6.2298f, 7.7989f, 6.3569f, 7.8483f, 6.4541f, 7.9373f)
                curveTo(6.5512f, 8.0264f, 6.6115f, 8.1487f, 6.623f, 8.28f)
                verticalLineTo(11.73f)
                horizontalLineTo(8.087f)
                curveTo(8.2262f, 11.73f, 8.3598f, 11.7853f, 8.4582f, 11.8838f)
                curveTo(8.5567f, 11.9822f, 8.612f, 12.1158f, 8.612f, 12.255f)
                curveTo(8.612f, 12.3942f, 8.5567f, 12.5278f, 8.4582f, 12.6262f)
                curveTo(8.3598f, 12.7247f, 8.2262f, 12.78f, 8.087f, 12.78f)
                horizontalLineTo(8.085f)
                close()
                moveTo(12.0f, 2.0f)
                curveTo(6.487f, 2.0f, 2.0f, 5.643f, 2.0f, 10.118f)
                curveTo(2.0f, 14.128f, 5.558f, 17.487f, 10.363f, 18.125f)
                curveTo(10.688f, 18.193f, 11.132f, 18.34f, 11.244f, 18.617f)
                curveTo(11.344f, 18.867f, 11.31f, 19.255f, 11.276f, 19.517f)
                lineTo(11.139f, 20.367f)
                curveTo(11.102f, 20.617f, 10.939f, 21.355f, 12.013f, 20.904f)
                curveTo(13.089f, 20.455f, 17.777f, 17.506f, 19.877f, 15.092f)
                curveTo(21.313f, 13.517f, 22.0f, 11.905f, 22.0f, 10.118f)
                curveTo(22.0f, 5.643f, 17.512f, 2.0f, 12.0f, 2.0f)
                close()
            }
        }
        .build()
        return _line!!
    }

private var _line: ImageVector? = null
