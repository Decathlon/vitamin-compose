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

public val FillGroup.Mic: ImageVector
    get() {
        if (_mic != null) {
            return _mic!!
        }
        _mic = Builder(name = "Mic", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.9999f, 0.6667f)
                curveTo(8.4377f, 0.6667f, 8.8712f, 0.7529f, 9.2756f, 0.9204f)
                curveTo(9.68f, 1.0879f, 10.0474f, 1.3335f, 10.357f, 1.643f)
                curveTo(10.6665f, 1.9525f, 10.912f, 2.32f, 11.0796f, 2.7244f)
                curveTo(11.2471f, 3.1288f, 11.3333f, 3.5623f, 11.3333f, 4.0f)
                verticalLineTo(6.6667f)
                curveTo(11.3333f, 7.5507f, 10.9821f, 8.3986f, 10.357f, 9.0237f)
                curveTo(9.7318f, 9.6488f, 8.884f, 10.0f, 7.9999f, 10.0f)
                curveTo(7.1159f, 10.0f, 6.2681f, 9.6488f, 5.6429f, 9.0237f)
                curveTo(5.0178f, 8.3986f, 4.6666f, 7.5507f, 4.6666f, 6.6667f)
                verticalLineTo(4.0f)
                curveTo(4.6666f, 3.116f, 5.0178f, 2.2681f, 5.6429f, 1.643f)
                curveTo(6.2681f, 1.0179f, 7.1159f, 0.6667f, 7.9999f, 0.6667f)
                close()
                moveTo(2.0366f, 7.3334f)
                horizontalLineTo(3.38f)
                curveTo(3.5415f, 8.4432f, 4.0972f, 9.4578f, 4.9454f, 10.1915f)
                curveTo(5.7937f, 10.9253f, 6.8777f, 11.3291f, 7.9993f, 11.3291f)
                curveTo(9.1208f, 11.3291f, 10.2049f, 10.9253f, 11.0531f, 10.1915f)
                curveTo(11.9014f, 9.4578f, 12.4571f, 8.4432f, 12.6186f, 7.3334f)
                horizontalLineTo(13.9626f)
                curveTo(13.811f, 8.6858f, 13.2044f, 9.9466f, 12.2421f, 10.909f)
                curveTo(11.2798f, 11.8714f, 10.0191f, 12.4783f, 8.6666f, 12.63f)
                verticalLineTo(15.3334f)
                horizontalLineTo(7.3333f)
                verticalLineTo(12.63f)
                curveTo(5.9807f, 12.4784f, 4.7198f, 11.8716f, 3.7574f, 10.9092f)
                curveTo(2.795f, 9.9468f, 2.1882f, 8.6859f, 2.0366f, 7.3334f)
                close()
            }
        }
        .build()
        return _mic!!
    }

private var _mic: ImageVector? = null
