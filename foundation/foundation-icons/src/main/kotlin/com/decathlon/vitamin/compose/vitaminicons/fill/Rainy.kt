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

public val FillGroup.Rainy: ImageVector
    get() {
        if (_rainy != null) {
            return _rainy!!
        }
        _rainy = Builder(name = "Rainy", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.5733f, 11.9999f)
                lineTo(8.4713f, 9.898f)
                curveTo(8.3463f, 9.773f, 8.1768f, 9.7028f, 8.0f, 9.7028f)
                curveTo(7.8232f, 9.7028f, 7.6537f, 9.773f, 7.5286f, 9.898f)
                lineTo(5.4533f, 11.9733f)
                curveTo(4.5423f, 11.8792f, 3.6709f, 11.5521f, 2.9229f, 11.0236f)
                curveTo(2.175f, 10.495f, 1.5757f, 9.7828f, 1.1829f, 8.9555f)
                curveTo(0.79f, 8.1282f, 0.6168f, 7.2136f, 0.6799f, 6.2999f)
                curveTo(0.743f, 5.3863f, 1.0403f, 4.5042f, 1.5432f, 3.7388f)
                curveTo(2.0461f, 2.9733f, 2.7376f, 2.3502f, 3.5511f, 1.9295f)
                curveTo(4.3646f, 1.5088f, 5.2727f, 1.3047f, 6.188f, 1.3368f)
                curveTo(7.1033f, 1.3688f, 7.9949f, 1.636f, 8.777f, 2.1126f)
                curveTo(9.5591f, 2.5892f, 10.2052f, 3.2592f, 10.6533f, 4.058f)
                curveTo(11.1992f, 3.964f, 11.7587f, 3.9844f, 12.2963f, 4.1179f)
                curveTo(12.8339f, 4.2515f, 13.3379f, 4.4952f, 13.7764f, 4.8337f)
                curveTo(14.2149f, 5.1722f, 14.5783f, 5.5981f, 14.8435f, 6.0844f)
                curveTo(15.1088f, 6.5707f, 15.2702f, 7.1068f, 15.3174f, 7.6587f)
                curveTo(15.3647f, 8.2106f, 15.2968f, 8.7663f, 15.118f, 9.2907f)
                curveTo(14.9393f, 9.815f, 14.6536f, 10.2964f, 14.2791f, 10.7046f)
                curveTo(13.9045f, 11.1127f, 13.4493f, 11.4386f, 12.9422f, 11.6615f)
                curveTo(12.4351f, 11.8845f, 11.8873f, 11.9998f, 11.3333f, 11.9999f)
                horizontalLineTo(10.574f)
                horizontalLineTo(10.5733f)
                close()
                moveTo(6.8213f, 12.4879f)
                lineTo(8.0f, 11.3093f)
                lineTo(9.1786f, 12.4879f)
                curveTo(9.4117f, 12.7211f, 9.5704f, 13.018f, 9.6347f, 13.3413f)
                curveTo(9.6989f, 13.6646f, 9.6659f, 13.9997f, 9.5397f, 14.3042f)
                curveTo(9.4136f, 14.6087f, 9.2f, 14.869f, 8.9259f, 15.0521f)
                curveTo(8.6518f, 15.2352f, 8.3296f, 15.333f, 8.0f, 15.333f)
                curveTo(7.6704f, 15.333f, 7.3481f, 15.2352f, 7.0741f, 15.0521f)
                curveTo(6.8f, 14.869f, 6.5864f, 14.6087f, 6.4602f, 14.3042f)
                curveTo(6.3341f, 13.9997f, 6.301f, 13.6646f, 6.3653f, 13.3413f)
                curveTo(6.4296f, 13.018f, 6.5883f, 12.7211f, 6.8213f, 12.4879f)
                close()
            }
        }
        .build()
        return _rainy!!
    }

private var _rainy: ImageVector? = null
