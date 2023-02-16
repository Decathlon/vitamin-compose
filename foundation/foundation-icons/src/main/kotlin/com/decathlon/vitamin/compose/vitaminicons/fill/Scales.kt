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

public val FillGroup.Scales: ImageVector
    get() {
        if (_scales != null) {
            return _scales!!
        }
        _scales = Builder(name = "Scales", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.6666f, 1.3333f)
                verticalLineTo(2.1853f)
                lineTo(11.9999f, 3.2973f)
                lineTo(14.4212f, 2.4906f)
                lineTo(14.8432f, 3.7547f)
                lineTo(12.8219f, 4.4286f)
                lineTo(14.8859f, 10.1033f)
                curveTo(14.1579f, 10.8613f, 13.1332f, 11.3333f, 11.9999f, 11.3333f)
                curveTo(10.8659f, 11.3333f, 9.8419f, 10.8613f, 9.1139f, 10.1033f)
                lineTo(11.1766f, 4.4286f)
                lineTo(8.6666f, 3.5913f)
                verticalLineTo(12.6666f)
                horizontalLineTo(11.3332f)
                verticalLineTo(14.0f)
                horizontalLineTo(4.6666f)
                verticalLineTo(12.6666f)
                horizontalLineTo(7.3332f)
                verticalLineTo(3.5913f)
                lineTo(4.8212f, 4.4286f)
                lineTo(6.8852f, 10.1033f)
                curveTo(6.1579f, 10.8613f, 5.1332f, 11.3333f, 3.9999f, 11.3333f)
                curveTo(2.8659f, 11.3333f, 1.8419f, 10.8613f, 1.1139f, 10.1033f)
                lineTo(3.1766f, 4.4286f)
                lineTo(1.1566f, 3.7553f)
                lineTo(1.5786f, 2.49f)
                lineTo(3.9999f, 3.2966f)
                lineTo(7.3332f, 2.1853f)
                verticalLineTo(1.3333f)
                horizontalLineTo(8.6666f)
                close()
                moveTo(11.9999f, 6.0686f)
                lineTo(11.0546f, 8.6666f)
                horizontalLineTo(12.9446f)
                lineTo(11.9999f, 6.0686f)
                close()
                moveTo(3.9999f, 6.0686f)
                lineTo(3.0546f, 8.6666f)
                horizontalLineTo(4.9446f)
                lineTo(3.9999f, 6.0686f)
                close()
            }
        }
        .build()
        return _scales!!
    }

private var _scales: ImageVector? = null
