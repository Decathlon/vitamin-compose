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

public val LineGroup.Wallet: ImageVector
    get() {
        if (_wallet != null) {
            return _wallet!!
        }
        _wallet = Builder(name = "Wallet", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0002f, 4.6667f)
                horizontalLineTo(14.0002f)
                curveTo(14.177f, 4.6667f, 14.3465f, 4.7369f, 14.4716f, 4.8619f)
                curveTo(14.5966f, 4.9869f, 14.6668f, 5.1565f, 14.6668f, 5.3333f)
                verticalLineTo(13.3333f)
                curveTo(14.6668f, 13.5101f, 14.5966f, 13.6797f, 14.4716f, 13.8047f)
                curveTo(14.3465f, 13.9298f, 14.177f, 14.0f, 14.0002f, 14.0f)
                horizontalLineTo(2.0002f)
                curveTo(1.8233f, 14.0f, 1.6538f, 13.9298f, 1.5288f, 13.8047f)
                curveTo(1.4037f, 13.6797f, 1.3335f, 13.5101f, 1.3335f, 13.3333f)
                verticalLineTo(2.6667f)
                curveTo(1.3335f, 2.4899f, 1.4037f, 2.3203f, 1.5288f, 2.1953f)
                curveTo(1.6538f, 2.0702f, 1.8233f, 2.0f, 2.0002f, 2.0f)
                horizontalLineTo(12.0002f)
                verticalLineTo(4.6667f)
                close()
                moveTo(2.6668f, 6.0f)
                verticalLineTo(12.6667f)
                horizontalLineTo(13.3335f)
                verticalLineTo(6.0f)
                horizontalLineTo(2.6668f)
                close()
                moveTo(2.6668f, 3.3333f)
                verticalLineTo(4.6667f)
                horizontalLineTo(10.6668f)
                verticalLineTo(3.3333f)
                horizontalLineTo(2.6668f)
                close()
                moveTo(10.0002f, 8.6667f)
                horizontalLineTo(12.0002f)
                verticalLineTo(10.0f)
                horizontalLineTo(10.0002f)
                verticalLineTo(8.6667f)
                close()
            }
        }
        .build()
        return _wallet!!
    }

private var _wallet: ImageVector? = null
