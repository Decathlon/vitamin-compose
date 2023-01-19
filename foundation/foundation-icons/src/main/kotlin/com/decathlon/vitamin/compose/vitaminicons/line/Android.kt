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

public val LineGroup.Android: ImageVector
    get() {
        if (_android != null) {
            return _android!!
        }
        _android = Builder(name = "Android", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.6667f, 8.6666f)
                horizontalLineTo(3.3333f)
                verticalLineTo(13.3333f)
                horizontalLineTo(12.6667f)
                verticalLineTo(8.6666f)
                close()
                moveTo(12.6667f, 7.3333f)
                curveTo(12.6667f, 6.0956f, 12.175f, 4.9087f, 11.2998f, 4.0335f)
                curveTo(10.4247f, 3.1583f, 9.2377f, 2.6667f, 8.0f, 2.6667f)
                curveTo(6.7623f, 2.6667f, 5.5753f, 3.1583f, 4.7002f, 4.0335f)
                curveTo(3.825f, 4.9087f, 3.3333f, 6.0956f, 3.3333f, 7.3333f)
                horizontalLineTo(12.6667f)
                close()
                moveTo(4.2547f, 2.6453f)
                curveTo(5.3172f, 1.794f, 6.6385f, 1.3312f, 8.0f, 1.3333f)
                curveTo(9.4167f, 1.3333f, 10.7187f, 1.824f, 11.7453f, 2.6453f)
                lineTo(12.714f, 1.6767f)
                lineTo(13.6567f, 2.6193f)
                lineTo(12.688f, 3.588f)
                curveTo(13.5393f, 4.6505f, 14.0022f, 5.9719f, 14.0f, 7.3333f)
                verticalLineTo(14.0f)
                curveTo(14.0f, 14.1768f, 13.9298f, 14.3464f, 13.8047f, 14.4714f)
                curveTo(13.6797f, 14.5964f, 13.5101f, 14.6667f, 13.3333f, 14.6667f)
                horizontalLineTo(2.6667f)
                curveTo(2.4899f, 14.6667f, 2.3203f, 14.5964f, 2.1953f, 14.4714f)
                curveTo(2.0702f, 14.3464f, 2.0f, 14.1768f, 2.0f, 14.0f)
                verticalLineTo(7.3333f)
                curveTo(2.0f, 5.9166f, 2.4907f, 4.6146f, 3.312f, 3.588f)
                lineTo(2.3433f, 2.62f)
                lineTo(3.286f, 1.6773f)
                lineTo(4.2547f, 2.646f)
                verticalLineTo(2.6453f)
                close()
                moveTo(6.0f, 6.0f)
                curveTo(5.8232f, 6.0f, 5.6536f, 5.9297f, 5.5286f, 5.8047f)
                curveTo(5.4036f, 5.6797f, 5.3333f, 5.5101f, 5.3333f, 5.3333f)
                curveTo(5.3333f, 5.1565f, 5.4036f, 4.9869f, 5.5286f, 4.8619f)
                curveTo(5.6536f, 4.7369f, 5.8232f, 4.6666f, 6.0f, 4.6666f)
                curveTo(6.1768f, 4.6666f, 6.3464f, 4.7369f, 6.4714f, 4.8619f)
                curveTo(6.5964f, 4.9869f, 6.6667f, 5.1565f, 6.6667f, 5.3333f)
                curveTo(6.6667f, 5.5101f, 6.5964f, 5.6797f, 6.4714f, 5.8047f)
                curveTo(6.3464f, 5.9297f, 6.1768f, 6.0f, 6.0f, 6.0f)
                close()
                moveTo(10.0f, 6.0f)
                curveTo(9.8232f, 6.0f, 9.6536f, 5.9297f, 9.5286f, 5.8047f)
                curveTo(9.4036f, 5.6797f, 9.3333f, 5.5101f, 9.3333f, 5.3333f)
                curveTo(9.3333f, 5.1565f, 9.4036f, 4.9869f, 9.5286f, 4.8619f)
                curveTo(9.6536f, 4.7369f, 9.8232f, 4.6666f, 10.0f, 4.6666f)
                curveTo(10.1768f, 4.6666f, 10.3464f, 4.7369f, 10.4714f, 4.8619f)
                curveTo(10.5964f, 4.9869f, 10.6667f, 5.1565f, 10.6667f, 5.3333f)
                curveTo(10.6667f, 5.5101f, 10.5964f, 5.6797f, 10.4714f, 5.8047f)
                curveTo(10.3464f, 5.9297f, 10.1768f, 6.0f, 10.0f, 6.0f)
                close()
            }
        }
        .build()
        return _android!!
    }

private var _android: ImageVector? = null
