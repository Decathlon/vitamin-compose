package com.decathlon.vitamin.compose.vitaminicons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.vitaminicons.FillGroup

public val FillGroup.Fullscreen: ImageVector
    get() {
        if (_fullscreen != null) {
            return _fullscreen!!
        }
        _fullscreen = Builder(name = "Fullscreen", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(5.3334f, 2.0f)
                horizontalLineTo(1.3334f)
                verticalLineTo(6.0f)
                horizontalLineTo(2.6667f)
                verticalLineTo(3.3333f)
                horizontalLineTo(5.3334f)
                verticalLineTo(2.0f)
                close()
                moveTo(14.6667f, 2.0f)
                horizontalLineTo(10.6667f)
                verticalLineTo(3.3333f)
                horizontalLineTo(13.3334f)
                verticalLineTo(6.0f)
                horizontalLineTo(14.6667f)
                verticalLineTo(2.0f)
                close()
                moveTo(13.3334f, 12.6667f)
                verticalLineTo(10.0f)
                horizontalLineTo(14.6667f)
                verticalLineTo(14.0f)
                horizontalLineTo(10.6667f)
                verticalLineTo(12.6667f)
                horizontalLineTo(13.3334f)
                close()
                moveTo(5.3334f, 12.6667f)
                horizontalLineTo(2.6667f)
                verticalLineTo(10.0f)
                horizontalLineTo(1.3334f)
                verticalLineTo(14.0f)
                horizontalLineTo(5.3334f)
                verticalLineTo(12.6667f)
                close()
            }
        }
        .build()
        return _fullscreen!!
    }

private var _fullscreen: ImageVector? = null
