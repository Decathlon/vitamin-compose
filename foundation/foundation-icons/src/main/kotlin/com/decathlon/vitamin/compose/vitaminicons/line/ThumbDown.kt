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

public val LineGroup.ThumbDown: ImageVector
    get() {
        if (_thumbDown != null) {
            return _thumbDown!!
        }
        _thumbDown = Builder(name = "ThumbDown", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.2712f, 10.6686f)
                horizontalLineTo(2.0036f)
                curveTo(1.6499f, 10.6686f, 1.3106f, 10.5281f, 1.0605f, 10.278f)
                curveTo(0.8104f, 10.0279f, 0.6699f, 9.6887f, 0.6699f, 9.335f)
                verticalLineTo(7.932f)
                curveTo(0.6697f, 7.7577f, 0.7037f, 7.5851f, 0.7699f, 7.4239f)
                lineTo(2.8344f, 2.4134f)
                curveTo(2.8846f, 2.2912f, 2.97f, 2.1867f, 3.0797f, 2.1131f)
                curveTo(3.1894f, 2.0395f, 3.3184f, 2.0001f, 3.4506f, 2.0f)
                horizontalLineTo(14.6731f)
                curveTo(14.85f, 2.0f, 15.0196f, 2.0703f, 15.1446f, 2.1953f)
                curveTo(15.2697f, 2.3204f, 15.3399f, 2.49f, 15.3399f, 2.6668f)
                verticalLineTo(9.335f)
                curveTo(15.3399f, 9.5119f, 15.2697f, 9.6815f, 15.1446f, 9.8065f)
                curveTo(15.0196f, 9.9316f, 14.85f, 10.0018f, 14.6731f, 10.0018f)
                horizontalLineTo(12.3512f)
                curveTo(12.2445f, 10.0018f, 12.1393f, 10.0274f, 12.0445f, 10.0765f)
                curveTo(11.9497f, 10.1256f, 11.8681f, 10.1967f, 11.8065f, 10.2839f)
                lineTo(8.1703f, 15.4357f)
                curveTo(8.1243f, 15.5009f, 8.0565f, 15.5474f, 7.9792f, 15.5668f)
                curveTo(7.9019f, 15.5863f, 7.8202f, 15.5774f, 7.7489f, 15.5417f)
                lineTo(6.5393f, 14.9363f)
                curveTo(6.1988f, 14.7661f, 5.9269f, 14.4846f, 5.7686f, 14.1385f)
                curveTo(5.6103f, 13.7925f, 5.5752f, 13.4026f, 5.6691f, 13.0338f)
                lineTo(6.2712f, 10.6686f)
                close()
                moveTo(11.339f, 8.9429f)
                verticalLineTo(3.3336f)
                horizontalLineTo(3.8973f)
                lineTo(2.0036f, 7.932f)
                verticalLineTo(9.335f)
                horizontalLineTo(6.2712f)
                curveTo(6.4743f, 9.335f, 6.6747f, 9.3814f, 6.8572f, 9.4707f)
                curveTo(7.0396f, 9.56f, 7.1993f, 9.6898f, 7.3239f, 9.8501f)
                curveTo(7.4486f, 10.0105f, 7.535f, 10.1972f, 7.5765f, 10.396f)
                curveTo(7.618f, 10.5948f, 7.6136f, 10.8005f, 7.5635f, 10.9974f)
                lineTo(6.9613f, 13.3632f)
                curveTo(6.9425f, 13.437f, 6.9495f, 13.5151f, 6.9812f, 13.5843f)
                curveTo(7.0128f, 13.6536f, 7.0672f, 13.71f, 7.1354f, 13.744f)
                lineTo(7.5762f, 13.9641f)
                lineTo(10.7169f, 9.515f)
                curveTo(10.8836f, 9.279f, 11.097f, 9.0856f, 11.339f, 8.9429f)
                close()
                moveTo(12.6726f, 8.6682f)
                horizontalLineTo(14.0063f)
                verticalLineTo(3.3336f)
                horizontalLineTo(12.6726f)
                verticalLineTo(8.6682f)
                close()
            }
        }
        .build()
        return _thumbDown!!
    }

private var _thumbDown: ImageVector? = null
