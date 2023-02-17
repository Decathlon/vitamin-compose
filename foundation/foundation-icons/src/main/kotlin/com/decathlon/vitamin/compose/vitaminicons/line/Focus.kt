package com.decathlon.vitamin.compose.vitaminicons.line

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.vitaminicons.LineGroup

public val LineGroup.Focus: ImageVector
    get() {
        if (_focus != null) {
            return _focus!!
        }
        _focus = Builder(name = "Focus", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(13.0f, 1.0f)
                lineTo(13.001f, 4.062f)
                curveTo(16.6258f, 4.5203f, 19.4802f, 7.3751f, 19.938f, 11.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(13.0f)
                lineTo(19.938f, 13.001f)
                curveTo(19.4798f, 16.6255f, 16.6255f, 19.4798f, 13.001f, 19.938f)
                lineTo(13.0f, 23.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(19.938f)
                curveTo(7.3751f, 19.4802f, 4.5203f, 16.6258f, 4.062f, 13.001f)
                lineTo(1.0f, 13.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(4.062f)
                curveTo(4.5199f, 7.3748f, 7.3748f, 4.5199f, 11.0f, 4.062f)
                verticalLineTo(1.0f)
                horizontalLineTo(13.0f)
                close()
                moveTo(12.0f, 6.0f)
                curveTo(8.6863f, 6.0f, 6.0f, 8.6863f, 6.0f, 12.0f)
                curveTo(6.0f, 15.3137f, 8.6863f, 18.0f, 12.0f, 18.0f)
                curveTo(15.3137f, 18.0f, 18.0f, 15.3137f, 18.0f, 12.0f)
                curveTo(18.0f, 8.6863f, 15.3137f, 6.0f, 12.0f, 6.0f)
                close()
                moveTo(14.0f, 12.0f)
                curveTo(14.0f, 10.8954f, 13.1046f, 10.0f, 12.0f, 10.0f)
                curveTo(10.8954f, 10.0f, 10.0f, 10.8954f, 10.0f, 12.0f)
                curveTo(10.0f, 13.1046f, 10.8954f, 14.0f, 12.0f, 14.0f)
                curveTo(13.1046f, 14.0f, 14.0f, 13.1046f, 14.0f, 12.0f)
                close()
            }
        }
        .build()
        return _focus!!
    }

private var _focus: ImageVector? = null
