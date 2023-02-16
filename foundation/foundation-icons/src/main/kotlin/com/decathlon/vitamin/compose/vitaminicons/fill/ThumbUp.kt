package com.decathlon.vitamin.compose.vitaminicons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.vitaminicons.FillGroup

public val FillGroup.ThumbUp: ImageVector
    get() {
        if (_thumbUp != null) {
            return _thumbUp!!
        }
        _thumbUp = Builder(name = "ThumbUp", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(9.1286f, 0.8713f)
                lineTo(4.862f, 5.138f)
                curveTo(4.7369f, 5.2629f, 4.6667f, 5.4325f, 4.6666f, 5.6093f)
                verticalLineTo(13.3333f)
                curveTo(4.6666f, 13.7015f, 4.9651f, 14.0f, 5.3333f, 14.0f)
                horizontalLineTo(12.5533f)
                curveTo(12.8235f, 14.0001f, 13.067f, 13.8371f, 13.17f, 13.5873f)
                lineTo(15.2333f, 8.5773f)
                curveTo(15.2995f, 8.4161f, 15.3335f, 8.2435f, 15.3333f, 8.0693f)
                verticalLineTo(6.6666f)
                curveTo(15.3333f, 5.9302f, 14.7363f, 5.3333f, 14.0f, 5.3333f)
                horizontalLineTo(9.7333f)
                lineTo(10.502f, 2.3133f)
                curveTo(10.6017f, 1.922f, 10.4562f, 1.5091f, 10.1333f, 1.2666f)
                lineTo(9.5646f, 0.84f)
                curveTo(9.4318f, 0.7403f, 9.2459f, 0.7537f, 9.1286f, 0.8713f)
                close()
                moveTo(3.3333f, 6.0f)
                horizontalLineTo(1.3333f)
                curveTo(0.9651f, 6.0f, 0.6666f, 6.2985f, 0.6666f, 6.6667f)
                verticalLineTo(13.3333f)
                curveTo(0.6666f, 13.7015f, 0.9651f, 14.0f, 1.3333f, 14.0f)
                horizontalLineTo(3.3333f)
                verticalLineTo(6.0f)
                close()
            }
        }
        .build()
        return _thumbUp!!
    }

private var _thumbUp: ImageVector? = null
