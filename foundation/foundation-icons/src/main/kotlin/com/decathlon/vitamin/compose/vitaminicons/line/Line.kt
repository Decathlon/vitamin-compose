package com.decathlon.vitamin.compose.vitaminicons.line

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.vitaminicons.LineGroup

public val LineGroup.Line: ImageVector
    get() {
        if (_line != null) {
            return _line!!
        }
        _line = Builder(name = "Line", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.6667f, 7.1267f)
                curveTo(14.6667f, 8.318f, 14.2087f, 9.3933f, 13.2514f, 10.4427f)
                curveTo(11.8514f, 12.052f, 8.726f, 14.018f, 8.0087f, 14.3173f)
                curveTo(7.2927f, 14.618f, 7.4014f, 14.126f, 7.426f, 13.9593f)
                lineTo(7.5174f, 13.3927f)
                curveTo(7.54f, 13.218f, 7.5627f, 12.9593f, 7.496f, 12.7927f)
                curveTo(7.4214f, 12.608f, 7.1254f, 12.51f, 6.9087f, 12.4647f)
                curveTo(3.7054f, 12.0393f, 1.3334f, 9.8f, 1.3334f, 7.1267f)
                curveTo(1.3334f, 4.1433f, 4.3247f, 1.7147f, 8.0f, 1.7147f)
                curveTo(11.6747f, 1.7147f, 14.6667f, 4.1433f, 14.6667f, 7.1267f)
                close()
                moveTo(12.2667f, 9.5433f)
                curveTo(13.0087f, 8.73f, 13.3334f, 7.9693f, 13.3334f, 7.1267f)
                curveTo(13.3334f, 4.948f, 10.9934f, 3.048f, 8.0f, 3.048f)
                curveTo(5.0067f, 3.048f, 2.6667f, 4.948f, 2.6667f, 7.1267f)
                curveTo(2.6667f, 9.0633f, 4.4854f, 10.798f, 7.084f, 11.1427f)
                lineTo(7.182f, 11.16f)
                curveTo(7.9007f, 11.3107f, 8.438f, 11.5693f, 8.7347f, 12.2987f)
                lineTo(8.7587f, 12.3627f)
                curveTo(9.9627f, 11.5787f, 11.5414f, 10.376f, 12.266f, 9.5433f)
                horizontalLineTo(12.2667f)
                close()
                moveTo(12.092f, 6.8767f)
                curveTo(12.1811f, 6.8822f, 12.2648f, 6.9214f, 12.3259f, 6.9865f)
                curveTo(12.3871f, 7.0515f, 12.4211f, 7.1374f, 12.4211f, 7.2267f)
                curveTo(12.4211f, 7.3159f, 12.3871f, 7.4018f, 12.3259f, 7.4669f)
                curveTo(12.2648f, 7.5319f, 12.1811f, 7.5712f, 12.092f, 7.5767f)
                horizontalLineTo(11.1167f)
                verticalLineTo(8.202f)
                horizontalLineTo(12.0914f)
                curveTo(12.1386f, 8.1999f, 12.1857f, 8.2074f, 12.2299f, 8.2241f)
                curveTo(12.2741f, 8.2407f, 12.3145f, 8.2662f, 12.3487f, 8.2988f)
                curveTo(12.3828f, 8.3315f, 12.41f, 8.3708f, 12.4285f, 8.4142f)
                curveTo(12.4471f, 8.4577f, 12.4566f, 8.5044f, 12.4566f, 8.5517f)
                curveTo(12.4566f, 8.5989f, 12.4471f, 8.6457f, 12.4285f, 8.6891f)
                curveTo(12.41f, 8.7326f, 12.3828f, 8.7718f, 12.3487f, 8.8045f)
                curveTo(12.3145f, 8.8372f, 12.2741f, 8.8626f, 12.2299f, 8.8792f)
                curveTo(12.1857f, 8.8959f, 12.1386f, 8.9034f, 12.0914f, 8.9013f)
                horizontalLineTo(10.7667f)
                curveTo(10.6744f, 8.9006f, 10.5861f, 8.8636f, 10.5209f, 8.7982f)
                curveTo(10.4558f, 8.7328f, 10.4191f, 8.6443f, 10.4187f, 8.552f)
                verticalLineTo(5.9013f)
                curveTo(10.4187f, 5.71f, 10.5754f, 5.5513f, 10.7687f, 5.5513f)
                horizontalLineTo(12.094f)
                curveTo(12.1869f, 5.5516f, 12.2758f, 5.5887f, 12.3412f, 5.6546f)
                curveTo(12.4067f, 5.7204f, 12.4433f, 5.8095f, 12.443f, 5.9023f)
                curveTo(12.4428f, 5.9952f, 12.4056f, 6.0841f, 12.3398f, 6.1495f)
                curveTo(12.274f, 6.215f, 12.1849f, 6.2516f, 12.092f, 6.2513f)
                horizontalLineTo(11.1174f)
                verticalLineTo(6.8767f)
                horizontalLineTo(12.092f)
                close()
                moveTo(9.95f, 8.552f)
                curveTo(9.9499f, 8.5979f, 9.9407f, 8.6433f, 9.9229f, 8.6856f)
                curveTo(9.9052f, 8.7279f, 9.8793f, 8.7663f, 9.8468f, 8.7986f)
                curveTo(9.8142f, 8.8309f, 9.7756f, 8.8565f, 9.7332f, 8.8739f)
                curveTo(9.6907f, 8.8913f, 9.6453f, 8.9002f, 9.5994f, 8.9f)
                curveTo(9.5445f, 8.9012f, 9.4901f, 8.8892f, 9.4408f, 8.8651f)
                curveTo(9.3915f, 8.841f, 9.3488f, 8.8054f, 9.316f, 8.7613f)
                lineTo(7.9587f, 6.9187f)
                verticalLineTo(8.552f)
                curveTo(7.952f, 8.64f, 7.9124f, 8.7222f, 7.8477f, 8.7822f)
                curveTo(7.7829f, 8.8422f, 7.698f, 8.8756f, 7.6097f, 8.8756f)
                curveTo(7.5215f, 8.8756f, 7.4365f, 8.8422f, 7.3717f, 8.7822f)
                curveTo(7.307f, 8.7222f, 7.2674f, 8.64f, 7.2607f, 8.552f)
                verticalLineTo(5.9013f)
                curveTo(7.2605f, 5.8092f, 7.2969f, 5.7207f, 7.3619f, 5.6553f)
                curveTo(7.4269f, 5.5899f, 7.5152f, 5.553f, 7.6074f, 5.5527f)
                curveTo(7.7154f, 5.5527f, 7.8154f, 5.61f, 7.882f, 5.6933f)
                lineTo(9.25f, 7.5433f)
                verticalLineTo(5.9013f)
                curveTo(9.25f, 5.71f, 9.4067f, 5.5513f, 9.6f, 5.5513f)
                curveTo(9.7914f, 5.5513f, 9.95f, 5.71f, 9.95f, 5.9013f)
                verticalLineTo(8.552f)
                close()
                moveTo(6.7607f, 8.552f)
                curveTo(6.7602f, 8.6447f, 6.723f, 8.7335f, 6.6573f, 8.7989f)
                curveTo(6.5917f, 8.8643f, 6.5028f, 8.9011f, 6.41f, 8.9013f)
                curveTo(6.3176f, 8.9008f, 6.2291f, 8.8638f, 6.1638f, 8.7984f)
                curveTo(6.0985f, 8.733f, 6.0617f, 8.6444f, 6.0614f, 8.552f)
                verticalLineTo(5.9013f)
                curveTo(6.0614f, 5.71f, 6.2187f, 5.5513f, 6.4114f, 5.5513f)
                curveTo(6.604f, 5.5513f, 6.7607f, 5.71f, 6.7607f, 5.9013f)
                verticalLineTo(8.552f)
                close()
                moveTo(5.3907f, 8.9013f)
                horizontalLineTo(4.0647f)
                curveTo(3.9722f, 8.9008f, 3.8835f, 8.8638f, 3.818f, 8.7985f)
                curveTo(3.7525f, 8.7331f, 3.7154f, 8.6445f, 3.7147f, 8.552f)
                verticalLineTo(5.9013f)
                curveTo(3.7224f, 5.8138f, 3.7625f, 5.7323f, 3.8273f, 5.6729f)
                curveTo(3.8921f, 5.6135f, 3.9768f, 5.5806f, 4.0647f, 5.5806f)
                curveTo(4.1526f, 5.5806f, 4.2373f, 5.6135f, 4.3021f, 5.6729f)
                curveTo(4.3669f, 5.7323f, 4.4071f, 5.8138f, 4.4147f, 5.9013f)
                verticalLineTo(8.2013f)
                horizontalLineTo(5.3907f)
                curveTo(5.4835f, 8.2013f, 5.5726f, 8.2382f, 5.6382f, 8.3038f)
                curveTo(5.7038f, 8.3695f, 5.7407f, 8.4585f, 5.7407f, 8.5513f)
                curveTo(5.7407f, 8.6441f, 5.7038f, 8.7332f, 5.6382f, 8.7988f)
                curveTo(5.5726f, 8.8645f, 5.4835f, 8.9013f, 5.3907f, 8.9013f)
                close()
            }
        }
        .build()
        return _line!!
    }

private var _line: ImageVector? = null
