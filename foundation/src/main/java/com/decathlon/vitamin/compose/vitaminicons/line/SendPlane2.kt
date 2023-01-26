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

public val LineGroup.SendPlane2: ImageVector
    get() {
        if (_sendPlane2 != null) {
            return _sendPlane2!!
        }
        _sendPlane2 = Builder(name = "SendPlane2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.741f, 1.408f)
                lineTo(22.203f, 11.562f)
                curveTo(22.2814f, 11.6052f, 22.3468f, 11.6686f, 22.3923f, 11.7456f)
                curveTo(22.4378f, 11.8227f, 22.4618f, 11.9105f, 22.4618f, 12.0f)
                curveTo(22.4618f, 12.0895f, 22.4378f, 12.1773f, 22.3923f, 12.2544f)
                curveTo(22.3468f, 12.3314f, 22.2814f, 12.3948f, 22.203f, 12.438f)
                lineTo(3.741f, 22.592f)
                curveTo(3.6649f, 22.6339f, 3.5791f, 22.6552f, 3.4923f, 22.6539f)
                curveTo(3.4054f, 22.6525f, 3.3204f, 22.6286f, 3.2456f, 22.5843f)
                curveTo(3.1708f, 22.5401f, 3.1088f, 22.4772f, 3.0657f, 22.4017f)
                curveTo(3.0227f, 22.3263f, 3.0f, 22.2409f, 3.0f, 22.154f)
                verticalLineTo(1.846f)
                curveTo(3.0f, 1.7591f, 3.0227f, 1.6737f, 3.0657f, 1.5983f)
                curveTo(3.1088f, 1.5228f, 3.1708f, 1.4599f, 3.2456f, 1.4157f)
                curveTo(3.3204f, 1.3714f, 3.4054f, 1.3475f, 3.4923f, 1.3461f)
                curveTo(3.5791f, 1.3448f, 3.6649f, 1.3661f, 3.741f, 1.408f)
                close()
                moveTo(5.0f, 13.0f)
                verticalLineTo(19.617f)
                lineTo(18.85f, 12.0f)
                lineTo(5.0f, 4.383f)
                verticalLineTo(11.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(5.0f)
                close()
            }
        }
        .build()
        return _sendPlane2!!
    }

private var _sendPlane2: ImageVector? = null
