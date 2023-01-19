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

public val LineGroup.Naver: ImageVector
    get() {
        if (_naver != null) {
            return _naver!!
        }
        _naver = Builder(name = "Naver", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(1.3334f, 2.0f)
                horizontalLineTo(6.4837f)
                lineTo(9.227f, 6.0945f)
                verticalLineTo(2.0f)
                horizontalLineTo(14.6667f)
                verticalLineTo(14.1824f)
                horizontalLineTo(9.5094f)
                lineTo(6.7663f, 10.0832f)
                verticalLineTo(14.1824f)
                horizontalLineTo(1.3334f)
                verticalLineTo(2.0f)
                close()
                moveTo(2.5455f, 3.2121f)
                verticalLineTo(12.9703f)
                horizontalLineTo(5.5542f)
                verticalLineTo(6.0924f)
                lineTo(10.1568f, 12.9703f)
                horizontalLineTo(13.4546f)
                verticalLineTo(3.2121f)
                horizontalLineTo(10.4392f)
                verticalLineTo(10.0812f)
                lineTo(5.8368f, 3.2121f)
                horizontalLineTo(2.5455f)
                close()
            }
        }
        .build()
        return _naver!!
    }

private var _naver: ImageVector? = null
