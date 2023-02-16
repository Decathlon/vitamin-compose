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

public val LineGroup.Slack: ImageVector
    get() {
        if (_slack != null) {
            return _slack!!
        }
        _slack = Builder(name = "Slack", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(10.6667f, 3.0f)
                curveTo(10.6667f, 2.4477f, 10.219f, 2.0f, 9.6667f, 2.0f)
                curveTo(9.1144f, 2.0f, 8.6667f, 2.4477f, 8.6667f, 3.0f)
                verticalLineTo(6.3333f)
                curveTo(8.6667f, 6.8856f, 9.1144f, 7.3333f, 9.6667f, 7.3333f)
                curveTo(10.219f, 7.3333f, 10.6667f, 6.8856f, 10.6667f, 6.3333f)
                verticalLineTo(3.0f)
                close()
                moveTo(4.0f, 8.6667f)
                horizontalLineTo(3.0f)
                curveTo(2.4477f, 8.6667f, 2.0f, 9.1144f, 2.0f, 9.6667f)
                curveTo(2.0f, 10.219f, 2.4477f, 10.6667f, 3.0f, 10.6667f)
                curveTo(3.5523f, 10.6667f, 4.0f, 10.219f, 4.0f, 9.6667f)
                verticalLineTo(8.6667f)
                close()
                moveTo(8.6667f, 12.0f)
                horizontalLineTo(9.6667f)
                curveTo(10.219f, 12.0f, 10.6667f, 12.4477f, 10.6667f, 13.0f)
                curveTo(10.6667f, 13.5523f, 10.219f, 14.0f, 9.6667f, 14.0f)
                curveTo(9.1144f, 14.0f, 8.6667f, 13.5523f, 8.6667f, 13.0f)
                verticalLineTo(12.0f)
                close()
                moveTo(13.0f, 8.6667f)
                horizontalLineTo(9.6667f)
                curveTo(9.1144f, 8.6667f, 8.6667f, 9.1144f, 8.6667f, 9.6667f)
                curveTo(8.6667f, 10.219f, 9.1144f, 10.6667f, 9.6667f, 10.6667f)
                horizontalLineTo(13.0f)
                curveTo(13.5523f, 10.6667f, 14.0f, 10.219f, 14.0f, 9.6667f)
                curveTo(14.0f, 9.1144f, 13.5523f, 8.6667f, 13.0f, 8.6667f)
                close()
                moveTo(13.0f, 5.3333f)
                curveTo(13.5523f, 5.3333f, 14.0f, 5.7811f, 14.0f, 6.3333f)
                curveTo(14.0f, 6.8856f, 13.5523f, 7.3333f, 13.0f, 7.3333f)
                horizontalLineTo(12.0f)
                verticalLineTo(6.3333f)
                curveTo(12.0f, 5.7811f, 12.4477f, 5.3333f, 13.0f, 5.3333f)
                close()
                moveTo(6.3333f, 5.3333f)
                horizontalLineTo(3.0f)
                curveTo(2.4477f, 5.3333f, 2.0f, 5.7811f, 2.0f, 6.3333f)
                curveTo(2.0f, 6.8856f, 2.4477f, 7.3333f, 3.0f, 7.3333f)
                horizontalLineTo(6.3333f)
                curveTo(6.8856f, 7.3333f, 7.3333f, 6.8856f, 7.3333f, 6.3333f)
                curveTo(7.3333f, 5.7811f, 6.8856f, 5.3333f, 6.3333f, 5.3333f)
                close()
                moveTo(6.3333f, 2.0f)
                curveTo(6.8856f, 2.0f, 7.3333f, 2.4477f, 7.3333f, 3.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(6.3333f)
                curveTo(5.7811f, 4.0f, 5.3333f, 3.5523f, 5.3333f, 3.0f)
                curveTo(5.3333f, 2.4477f, 5.7811f, 2.0f, 6.3333f, 2.0f)
                close()
                moveTo(7.3333f, 9.6667f)
                curveTo(7.3333f, 9.1144f, 6.8856f, 8.6667f, 6.3333f, 8.6667f)
                curveTo(5.7811f, 8.6667f, 5.3333f, 9.1144f, 5.3333f, 9.6667f)
                verticalLineTo(13.0f)
                curveTo(5.3333f, 13.5523f, 5.7811f, 14.0f, 6.3333f, 14.0f)
                curveTo(6.8856f, 14.0f, 7.3333f, 13.5523f, 7.3333f, 13.0f)
                verticalLineTo(9.6667f)
                close()
            }
        }
        .build()
        return _slack!!
    }

private var _slack: ImageVector? = null
