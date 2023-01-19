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

public val FillGroup.Question: ImageVector
    get() {
        if (_question != null) {
            return _question!!
        }
        _question = Builder(name = "Question", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.9951f, 14.66f)
                curveTo(4.314f, 14.66f, 1.3301f, 11.6761f, 1.3301f, 7.995f)
                curveTo(1.3301f, 4.3139f, 4.314f, 1.33f, 7.9951f, 1.33f)
                curveTo(11.6762f, 1.33f, 14.6601f, 4.3139f, 14.6601f, 7.995f)
                curveTo(14.6601f, 11.6761f, 11.6762f, 14.66f, 7.9951f, 14.66f)
                close()
                moveTo(7.3286f, 9.9945f)
                verticalLineTo(11.3275f)
                horizontalLineTo(8.6616f)
                verticalLineTo(9.9945f)
                horizontalLineTo(7.3286f)
                close()
                moveTo(8.6616f, 8.8981f)
                curveTo(9.1972f, 8.7367f, 9.6571f, 8.3882f, 9.9574f, 7.9162f)
                curveTo(10.2577f, 7.4442f, 10.3784f, 6.88f, 10.2977f, 6.3264f)
                curveTo(10.2169f, 5.7728f, 9.94f, 5.2667f, 9.5174f, 4.9001f)
                curveTo(9.0948f, 4.5335f, 8.5545f, 4.331f, 7.9951f, 4.3293f)
                curveTo(7.4558f, 4.3292f, 6.9331f, 4.516f, 6.516f, 4.8578f)
                curveTo(6.0988f, 5.1996f, 5.813f, 5.6754f, 5.707f, 6.2041f)
                lineTo(7.0147f, 6.4661f)
                curveTo(7.0518f, 6.2804f, 7.1408f, 6.1091f, 7.2715f, 5.9721f)
                curveTo(7.4022f, 5.835f, 7.5691f, 5.7379f, 7.7528f, 5.6921f)
                curveTo(7.9365f, 5.6462f, 8.1294f, 5.6534f, 8.3091f, 5.7129f)
                curveTo(8.4889f, 5.7724f, 8.6481f, 5.8817f, 8.7681f, 6.0281f)
                curveTo(8.8882f, 6.1745f, 8.9642f, 6.352f, 8.9873f, 6.5399f)
                curveTo(9.0104f, 6.7279f, 8.9797f, 6.9185f, 8.8987f, 7.0896f)
                curveTo(8.8177f, 7.2608f, 8.6898f, 7.4054f, 8.5298f, 7.5067f)
                curveTo(8.3699f, 7.608f, 8.1844f, 7.6618f, 7.9951f, 7.6618f)
                curveTo(7.8183f, 7.6618f, 7.6488f, 7.732f, 7.5238f, 7.857f)
                curveTo(7.3988f, 7.982f, 7.3286f, 8.1515f, 7.3286f, 8.3283f)
                verticalLineTo(9.328f)
                horizontalLineTo(8.6616f)
                verticalLineTo(8.8981f)
                close()
            }
        }
        .build()
        return _question!!
    }

private var _question: ImageVector? = null
