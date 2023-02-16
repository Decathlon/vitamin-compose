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

public val FillGroup.Download: ImageVector
    get() {
        if (_download != null) {
            return _download!!
        }
        _download = Builder(name = "Download", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(13.3333f, 6.0f)
                horizontalLineTo(8.6667f)
                verticalLineTo(0.6667f)
                horizontalLineTo(7.3333f)
                verticalLineTo(6.0f)
                horizontalLineTo(2.6667f)
                lineTo(8.0f, 11.3334f)
                lineTo(13.3333f, 6.0f)
                close()
                moveTo(14.0f, 14.0f)
                verticalLineTo(12.6667f)
                horizontalLineTo(2.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(14.0f)
                close()
            }
        }
        .build()
        return _download!!
    }

private var _download: ImageVector? = null
