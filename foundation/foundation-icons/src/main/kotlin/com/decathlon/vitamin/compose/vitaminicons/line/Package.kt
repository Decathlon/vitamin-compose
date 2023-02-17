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

public val LineGroup.Package: ImageVector
    get() {
        if (_package != null) {
            return _package!!
        }
        _package = Builder(name = "Package", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 2.0f)
                curveTo(2.45f, 2.0f, 2.0f, 2.45f, 2.0f, 3.0f)
                verticalLineTo(21.0f)
                curveTo(2.0f, 21.55f, 2.45f, 22.0f, 3.0f, 22.0f)
                horizontalLineTo(21.0f)
                curveTo(21.55f, 22.0f, 22.0f, 21.55f, 22.0f, 21.0f)
                verticalLineTo(3.0f)
                curveTo(22.0f, 2.45f, 21.55f, 2.0f, 21.0f, 2.0f)
                horizontalLineTo(3.0f)
                close()
                moveTo(8.0f, 4.0f)
                verticalLineTo(11.0f)
                curveTo(8.0f, 11.55f, 8.45f, 12.0f, 9.0f, 12.0f)
                horizontalLineTo(15.0f)
                curveTo(15.55f, 12.0f, 16.0f, 11.55f, 16.0f, 11.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(8.0f)
                close()
                moveTo(14.0f, 4.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(14.0f)
                close()
            }
        }
        .build()
        return _package!!
    }

private var _package: ImageVector? = null
