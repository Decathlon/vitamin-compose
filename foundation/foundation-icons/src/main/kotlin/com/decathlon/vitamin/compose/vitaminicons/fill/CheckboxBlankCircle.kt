package com.decathlon.vitamin.compose.vitaminicons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.vitaminicons.FillGroup

public val FillGroup.CheckboxBlankCircle: ImageVector
    get() {
        if (_checkboxBlankCircle != null) {
            return _checkboxBlankCircle!!
        }
        _checkboxBlankCircle = Builder(name = "CheckboxBlankCircle", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.9999f, 8.0f)
                moveToRelative(-6.6667f, 0.0f)
                arcToRelative(6.6667f, 6.6667f, 0.0f, true, true, 13.3333f, 0.0f)
                arcToRelative(6.6667f, 6.6667f, 0.0f, true, true, -13.3333f, 0.0f)
            }
        }
        .build()
        return _checkboxBlankCircle!!
    }

private var _checkboxBlankCircle: ImageVector? = null
