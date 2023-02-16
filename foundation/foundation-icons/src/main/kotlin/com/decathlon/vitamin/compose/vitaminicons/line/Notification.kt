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

public val LineGroup.Notification: ImageVector
    get() {
        if (_notification != null) {
            return _notification!!
        }
        _notification = Builder(name = "Notification", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(1.3333f, 12.6667f)
                verticalLineTo(11.3334f)
                horizontalLineTo(2.0f)
                verticalLineTo(6.6873f)
                curveTo(2.0f, 3.362f, 4.6866f, 0.6667f, 8.0f, 0.6667f)
                curveTo(11.3133f, 0.6667f, 14.0f, 3.362f, 14.0f, 6.6873f)
                verticalLineTo(11.3334f)
                horizontalLineTo(14.6666f)
                verticalLineTo(12.6667f)
                horizontalLineTo(1.3333f)
                close()
                moveTo(12.6666f, 11.3334f)
                verticalLineTo(6.6873f)
                curveTo(12.6666f, 4.0987f, 10.5773f, 2.0f, 8.0f, 2.0f)
                curveTo(5.4226f, 2.0f, 3.3333f, 4.0987f, 3.3333f, 6.6873f)
                verticalLineTo(11.3334f)
                horizontalLineTo(12.6666f)
                close()
                moveTo(8.0f, 15.0f)
                curveTo(8.9205f, 15.0f, 9.6666f, 14.2538f, 9.6666f, 13.3334f)
                horizontalLineTo(6.3333f)
                curveTo(6.3333f, 14.2538f, 7.0795f, 15.0f, 8.0f, 15.0f)
                close()
            }
        }
        .build()
        return _notification!!
    }

private var _notification: ImageVector? = null
