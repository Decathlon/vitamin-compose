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

public val LineGroup.CheckboxBlank: ImageVector
    get() {
        if (_checkboxBlank != null) {
            return _checkboxBlank!!
        }
        _checkboxBlank = Builder(name = "CheckboxBlank", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(13.3333f, 2.0f)
                horizontalLineTo(2.6667f)
                curveTo(2.2985f, 2.0f, 2.0f, 2.2985f, 2.0f, 2.6667f)
                verticalLineTo(13.3333f)
                curveTo(2.0f, 13.7015f, 2.2985f, 14.0f, 2.6667f, 14.0f)
                horizontalLineTo(13.3333f)
                curveTo(13.7015f, 14.0f, 14.0f, 13.7015f, 14.0f, 13.3333f)
                verticalLineTo(2.6667f)
                curveTo(14.0f, 2.2985f, 13.7015f, 2.0f, 13.3333f, 2.0f)
                close()
                moveTo(3.3333f, 12.6667f)
                verticalLineTo(3.3333f)
                horizontalLineTo(12.6667f)
                verticalLineTo(12.6667f)
                horizontalLineTo(3.3333f)
                close()
            }
        }
        .build()
        return _checkboxBlank!!
    }

private var _checkboxBlank: ImageVector? = null
