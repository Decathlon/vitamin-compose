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
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(16.0f, 4.5f)
                curveTo(16.0f, 3.6716f, 15.3284f, 3.0f, 14.5f, 3.0f)
                curveTo(13.6716f, 3.0f, 13.0f, 3.6716f, 13.0f, 4.5f)
                verticalLineTo(9.5f)
                curveTo(13.0f, 10.3284f, 13.6716f, 11.0f, 14.5f, 11.0f)
                curveTo(15.3284f, 11.0f, 16.0f, 10.3284f, 16.0f, 9.5f)
                verticalLineTo(4.5f)
                close()
                moveTo(6.0f, 13.0f)
                horizontalLineTo(4.5f)
                curveTo(3.6716f, 13.0f, 3.0f, 13.6716f, 3.0f, 14.5f)
                curveTo(3.0f, 15.3284f, 3.6716f, 16.0f, 4.5f, 16.0f)
                curveTo(5.3284f, 16.0f, 6.0f, 15.3284f, 6.0f, 14.5f)
                verticalLineTo(13.0f)
                close()
                moveTo(13.0f, 18.0f)
                horizontalLineTo(14.5f)
                curveTo(15.3284f, 18.0f, 16.0f, 18.6716f, 16.0f, 19.5f)
                curveTo(16.0f, 20.3284f, 15.3284f, 21.0f, 14.5f, 21.0f)
                curveTo(13.6716f, 21.0f, 13.0f, 20.3284f, 13.0f, 19.5f)
                verticalLineTo(18.0f)
                close()
                moveTo(19.5f, 13.0f)
                horizontalLineTo(14.5f)
                curveTo(13.6716f, 13.0f, 13.0f, 13.6716f, 13.0f, 14.5f)
                curveTo(13.0f, 15.3284f, 13.6716f, 16.0f, 14.5f, 16.0f)
                horizontalLineTo(19.5f)
                curveTo(20.3284f, 16.0f, 21.0f, 15.3284f, 21.0f, 14.5f)
                curveTo(21.0f, 13.6716f, 20.3284f, 13.0f, 19.5f, 13.0f)
                close()
                moveTo(19.5f, 8.0f)
                curveTo(20.3284f, 8.0f, 21.0f, 8.6716f, 21.0f, 9.5f)
                curveTo(21.0f, 10.3284f, 20.3284f, 11.0f, 19.5f, 11.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(9.5f)
                curveTo(18.0f, 8.6716f, 18.6716f, 8.0f, 19.5f, 8.0f)
                close()
                moveTo(9.5f, 8.0f)
                horizontalLineTo(4.5f)
                curveTo(3.6716f, 8.0f, 3.0f, 8.6716f, 3.0f, 9.5f)
                curveTo(3.0f, 10.3284f, 3.6716f, 11.0f, 4.5f, 11.0f)
                horizontalLineTo(9.5f)
                curveTo(10.3284f, 11.0f, 11.0f, 10.3284f, 11.0f, 9.5f)
                curveTo(11.0f, 8.6716f, 10.3284f, 8.0f, 9.5f, 8.0f)
                close()
                moveTo(9.5f, 3.0f)
                curveTo(10.3284f, 3.0f, 11.0f, 3.6716f, 11.0f, 4.5f)
                verticalLineTo(6.0f)
                horizontalLineTo(9.5f)
                curveTo(8.6716f, 6.0f, 8.0f, 5.3284f, 8.0f, 4.5f)
                curveTo(8.0f, 3.6716f, 8.6716f, 3.0f, 9.5f, 3.0f)
                close()
                moveTo(11.0f, 14.5f)
                curveTo(11.0f, 13.6716f, 10.3284f, 13.0f, 9.5f, 13.0f)
                curveTo(8.6716f, 13.0f, 8.0f, 13.6716f, 8.0f, 14.5f)
                verticalLineTo(19.5f)
                curveTo(8.0f, 20.3284f, 8.6716f, 21.0f, 9.5f, 21.0f)
                curveTo(10.3284f, 21.0f, 11.0f, 20.3284f, 11.0f, 19.5f)
                verticalLineTo(14.5f)
                close()
            }
        }
        .build()
        return _slack!!
    }

private var _slack: ImageVector? = null
