package com.decathlon.vitamin.compose.vitaminicons.line

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.vitaminicons.LineGroup

public val LineGroup.Barcode: ImageVector
    get() {
        if (_barcode != null) {
            return _barcode!!
        }
        _barcode = Builder(name = "Barcode", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 4.6667f)
                horizontalLineTo(4.0f)
                verticalLineTo(11.3333f)
                horizontalLineTo(6.0f)
                verticalLineTo(4.6667f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 4.6667f)
                horizontalLineTo(6.6667f)
                verticalLineTo(11.3333f)
                horizontalLineTo(8.0f)
                verticalLineTo(4.6667f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.3333f, 4.6667f)
                horizontalLineTo(8.6667f)
                verticalLineTo(11.3333f)
                horizontalLineTo(9.3333f)
                verticalLineTo(4.6667f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 4.6667f)
                horizontalLineTo(10.0f)
                verticalLineTo(11.3333f)
                horizontalLineTo(12.0f)
                verticalLineTo(4.6667f)
                close()
            }
        }
        .build()
        return _barcode!!
    }

private var _barcode: ImageVector? = null
