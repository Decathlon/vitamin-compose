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

public val LineGroup.QrScan: ImageVector
    get() {
        if (_qrScan != null) {
            return _qrScan!!
        }
        _qrScan = Builder(name = "QrScan", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 2.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(5.3333f)
                horizontalLineTo(12.6667f)
                verticalLineTo(3.3333f)
                horizontalLineTo(10.0f)
                verticalLineTo(2.0f)
                close()
                moveTo(6.0f, 2.0f)
                verticalLineTo(3.3333f)
                horizontalLineTo(3.3333f)
                verticalLineTo(5.3333f)
                horizontalLineTo(2.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(6.0f)
                close()
                moveTo(10.0f, 14.0f)
                verticalLineTo(12.6667f)
                horizontalLineTo(12.6667f)
                verticalLineTo(10.6667f)
                horizontalLineTo(14.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(10.0f)
                close()
                moveTo(6.0f, 14.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(10.6667f)
                horizontalLineTo(3.3333f)
                verticalLineTo(12.6667f)
                horizontalLineTo(6.0f)
                verticalLineTo(14.0f)
                close()
                moveTo(2.0f, 7.3333f)
                horizontalLineTo(14.0f)
                verticalLineTo(8.6667f)
                horizontalLineTo(2.0f)
                verticalLineTo(7.3333f)
                close()
            }
        }
        .build()
        return _qrScan!!
    }

private var _qrScan: ImageVector? = null
