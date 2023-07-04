package com.decathlon.vitamin.compose.vitaminicons.line

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.vitaminicons.LineGroup

public val LineGroup.Italic: ImageVector
    get() {
        if (_italic != null) {
            return _italic!!
        }
        _italic = Builder(name = "Italic", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(15.0f, 20.0f)
                    horizontalLineTo(7.0f)
                    verticalLineTo(18.0f)
                    horizontalLineTo(9.9266f)
                    lineTo(12.0425f, 6.0f)
                    horizontalLineTo(9.0f)
                    verticalLineTo(4.0f)
                    horizontalLineTo(17.0f)
                    verticalLineTo(6.0f)
                    horizontalLineTo(14.0734f)
                    lineTo(11.9575f, 18.0f)
                    horizontalLineTo(15.0f)
                    verticalLineTo(20.0f)
                    close()
                }
            }
        }
        .build()
        return _italic!!
    }

private var _italic: ImageVector? = null
