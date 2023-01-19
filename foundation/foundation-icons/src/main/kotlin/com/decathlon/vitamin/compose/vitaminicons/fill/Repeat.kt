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

public val FillGroup.Repeat: ImageVector
    get() {
        if (_repeat != null) {
            return _repeat!!
        }
        _repeat = Builder(name = "Repeat", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(14.0001f, 2.6667f)
                horizontalLineTo(4.0001f)
                verticalLineTo(0.6667f)
                lineTo(0.6667f, 3.3333f)
                lineTo(4.0001f, 6.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(13.3334f)
                verticalLineTo(8.0f)
                horizontalLineTo(14.6667f)
                verticalLineTo(3.3333f)
                curveTo(14.6667f, 2.9652f, 14.3683f, 2.6667f, 14.0001f, 2.6667f)
                close()
                moveTo(2.0001f, 13.3334f)
                horizontalLineTo(12.0001f)
                verticalLineTo(15.3334f)
                lineTo(15.3334f, 12.6667f)
                lineTo(12.0001f, 10.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(2.6667f)
                verticalLineTo(8.0f)
                horizontalLineTo(1.3334f)
                verticalLineTo(12.6667f)
                curveTo(1.3334f, 13.0349f, 1.6319f, 13.3334f, 2.0001f, 13.3334f)
                close()
            }
        }
        .build()
        return _repeat!!
    }

private var _repeat: ImageVector? = null
