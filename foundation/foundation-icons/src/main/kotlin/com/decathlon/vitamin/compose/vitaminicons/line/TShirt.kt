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

public val LineGroup.TShirt: ImageVector
    get() {
        if (_tShirt != null) {
            return _tShirt!!
        }
        _tShirt = Builder(name = "TShirt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(8.0f, 4.0f)
                curveTo(6.8954f, 4.0f, 6.0f, 3.1046f, 6.0f, 2.0f)
                horizontalLineTo(2.0f)
                curveTo(1.6318f, 2.0f, 1.3333f, 2.2985f, 1.3333f, 2.6667f)
                verticalLineTo(7.3333f)
                curveTo(1.3333f, 7.7015f, 1.6318f, 8.0f, 2.0f, 8.0f)
                lineTo(3.3326f, 7.9993f)
                lineTo(3.3333f, 13.3333f)
                curveTo(3.3333f, 13.7015f, 3.6318f, 14.0f, 4.0f, 14.0f)
                horizontalLineTo(12.0f)
                curveTo(12.3682f, 14.0f, 12.6666f, 13.7015f, 12.6666f, 13.3333f)
                lineTo(12.666f, 8.0f)
                horizontalLineTo(14.0f)
                curveTo(14.3682f, 8.0f, 14.6666f, 7.7015f, 14.6666f, 7.3333f)
                verticalLineTo(2.6667f)
                curveTo(14.6666f, 2.2985f, 14.3682f, 2.0f, 14.0f, 2.0f)
                horizontalLineTo(10.0f)
                curveTo(10.0f, 3.1046f, 9.1046f, 4.0f, 8.0f, 4.0f)
                close()
                moveTo(11.0553f, 3.3327f)
                horizontalLineTo(13.3333f)
                verticalLineTo(6.666f)
                lineTo(11.3326f, 6.6667f)
                lineTo(11.3333f, 12.6667f)
                horizontalLineTo(4.666f)
                verticalLineTo(6.666f)
                lineTo(2.6667f, 6.6667f)
                verticalLineTo(3.3333f)
                horizontalLineTo(4.944f)
                lineTo(4.956f, 3.36f)
                curveTo(5.4927f, 4.5605f, 6.6849f, 5.3334f, 8.0f, 5.3333f)
                lineTo(8.144f, 5.33f)
                curveTo(9.4057f, 5.2754f, 10.5283f, 4.5128f, 11.044f, 3.36f)
                lineTo(11.0553f, 3.3327f)
                close()
            }
        }
        .build()
        return _tShirt!!
    }

private var _tShirt: ImageVector? = null
