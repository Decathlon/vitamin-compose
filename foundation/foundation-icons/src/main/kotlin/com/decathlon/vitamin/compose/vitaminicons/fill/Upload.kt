package com.decathlon.vitamin.compose.vitaminicons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.vitaminicons.FillGroup

public val FillGroup.Upload: ImageVector
    get() {
        if (_upload != null) {
            return _upload!!
        }
        _upload = Builder(name = "Upload", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.6668f, 12.6667f)
                horizontalLineTo(13.3335f)
                verticalLineTo(8.0f)
                horizontalLineTo(14.6668f)
                verticalLineTo(13.3333f)
                curveTo(14.6668f, 13.5101f, 14.5966f, 13.6797f, 14.4716f, 13.8047f)
                curveTo(14.3465f, 13.9298f, 14.177f, 14.0f, 14.0002f, 14.0f)
                horizontalLineTo(2.0002f)
                curveTo(1.8233f, 14.0f, 1.6538f, 13.9298f, 1.5288f, 13.8047f)
                curveTo(1.4037f, 13.6797f, 1.3335f, 13.5101f, 1.3335f, 13.3333f)
                verticalLineTo(8.0f)
                horizontalLineTo(2.6668f)
                verticalLineTo(12.6667f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.9497f, 5.9749f)
                lineTo(8.0f, 1.0251f)
                lineTo(3.0503f, 5.9749f)
                lineTo(7.3331f, 5.9749f)
                lineTo(7.3334f, 10.2832f)
                lineTo(8.6666f, 10.2832f)
                lineTo(8.6662f, 5.9749f)
                lineTo(12.9497f, 5.9749f)
                close()
            }
        }
        .build()
        return _upload!!
    }

private var _upload: ImageVector? = null
