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

public val LineGroup.ThumbUp: ImageVector
    get() {
        if (_thumbUp != null) {
            return _thumbUp!!
        }
        _thumbUp = Builder(name = "ThumbUp", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.6f, 8.0017f)
                horizontalLineTo(21.0f)
                curveTo(21.5304f, 8.0017f, 22.0391f, 8.2125f, 22.4142f, 8.5875f)
                curveTo(22.7893f, 8.9626f, 23.0f, 9.4713f, 23.0f, 10.0017f)
                verticalLineTo(12.1057f)
                curveTo(23.0003f, 12.3671f, 22.9493f, 12.626f, 22.85f, 12.8677f)
                lineTo(19.755f, 20.3827f)
                curveTo(19.6795f, 20.566f, 19.5513f, 20.7226f, 19.3866f, 20.8328f)
                curveTo(19.2219f, 20.943f, 19.0282f, 21.0018f, 18.83f, 21.0017f)
                horizontalLineTo(2.0f)
                curveTo(1.7348f, 21.0017f, 1.4804f, 20.8964f, 1.2929f, 20.7088f)
                curveTo(1.1054f, 20.5213f, 1.0f, 20.267f, 1.0f, 20.0017f)
                verticalLineTo(10.0017f)
                curveTo(1.0f, 9.7365f, 1.1054f, 9.4822f, 1.2929f, 9.2946f)
                curveTo(1.4804f, 9.1071f, 1.7348f, 9.0017f, 2.0f, 9.0017f)
                horizontalLineTo(5.482f)
                curveTo(5.6421f, 9.0018f, 5.7999f, 8.9634f, 5.942f, 8.8898f)
                curveTo(6.0842f, 8.8162f, 6.2066f, 8.7095f, 6.299f, 8.5787f)
                lineTo(11.752f, 0.8517f)
                curveTo(11.8209f, 0.754f, 11.9226f, 0.6843f, 12.0385f, 0.6551f)
                curveTo(12.1545f, 0.626f, 12.277f, 0.6393f, 12.384f, 0.6927f)
                lineTo(14.198f, 1.5997f)
                curveTo(14.7085f, 1.8549f, 15.1163f, 2.2771f, 15.3537f, 2.7961f)
                curveTo(15.5911f, 3.315f, 15.6438f, 3.8997f, 15.503f, 4.4527f)
                lineTo(14.6f, 8.0017f)
                close()
                moveTo(7.0f, 10.5897f)
                verticalLineTo(19.0017f)
                horizontalLineTo(18.16f)
                lineTo(21.0f, 12.1057f)
                verticalLineTo(10.0017f)
                horizontalLineTo(14.6f)
                curveTo(14.2954f, 10.0017f, 13.9948f, 9.9321f, 13.7212f, 9.7982f)
                curveTo(13.4476f, 9.6643f, 13.2082f, 9.4697f, 13.0213f, 9.2292f)
                curveTo(12.8343f, 8.9887f, 12.7048f, 8.7087f, 12.6425f, 8.4106f)
                curveTo(12.5803f, 8.1124f, 12.5869f, 7.8039f, 12.662f, 7.5087f)
                lineTo(13.565f, 3.9607f)
                curveTo(13.5933f, 3.8501f, 13.5828f, 3.7331f, 13.5353f, 3.6292f)
                curveTo(13.4878f, 3.5253f, 13.4062f, 3.4408f, 13.304f, 3.3897f)
                lineTo(12.643f, 3.0597f)
                lineTo(7.933f, 9.7317f)
                curveTo(7.683f, 10.0857f, 7.363f, 10.3757f, 7.0f, 10.5897f)
                close()
                moveTo(5.0f, 11.0017f)
                horizontalLineTo(3.0f)
                verticalLineTo(19.0017f)
                horizontalLineTo(5.0f)
                verticalLineTo(11.0017f)
                close()
            }
        }
        .build()
        return _thumbUp!!
    }

private var _thumbUp: ImageVector? = null
