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

public val LineGroup.Download: ImageVector
    get() {
        if (_download != null) {
            return _download!!
        }
        _download = Builder(name = "Download", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.714f, 4.7333f)
                lineTo(8.6667f, 8.7813f)
                verticalLineTo(1.3333f)
                horizontalLineTo(7.3333f)
                verticalLineTo(8.78f)
                lineTo(3.286f, 4.7333f)
                lineTo(2.3433f, 5.6767f)
                lineTo(8.0f, 11.3333f)
                lineTo(13.6567f, 5.676f)
                lineTo(12.714f, 4.7333f)
                close()
                moveTo(14.0f, 12.6666f)
                horizontalLineTo(2.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(12.6666f)
                close()
            }
        }
        .build()
        return _download!!
    }

private var _download: ImageVector? = null
