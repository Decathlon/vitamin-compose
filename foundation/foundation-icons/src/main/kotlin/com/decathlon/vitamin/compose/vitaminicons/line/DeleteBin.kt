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

public val LineGroup.DeleteBin: ImageVector
    get() {
        if (_deleteBin != null) {
            return _deleteBin!!
        }
        _deleteBin = Builder(name = "DeleteBin", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.3333f, 4.0f)
                horizontalLineTo(14.6666f)
                verticalLineTo(5.3334f)
                horizontalLineTo(13.3333f)
                verticalLineTo(14.0f)
                curveTo(13.3333f, 14.1769f, 13.2631f, 14.3464f, 13.1381f, 14.4714f)
                curveTo(13.013f, 14.5965f, 12.8435f, 14.6667f, 12.6666f, 14.6667f)
                horizontalLineTo(3.3333f)
                curveTo(3.1565f, 14.6667f, 2.9869f, 14.5965f, 2.8619f, 14.4714f)
                curveTo(2.7369f, 14.3464f, 2.6667f, 14.1769f, 2.6667f, 14.0f)
                verticalLineTo(5.3334f)
                horizontalLineTo(1.3333f)
                verticalLineTo(4.0f)
                horizontalLineTo(4.6666f)
                verticalLineTo(2.0f)
                curveTo(4.6666f, 1.8232f, 4.7369f, 1.6537f, 4.8619f, 1.5286f)
                curveTo(4.9869f, 1.4036f, 5.1565f, 1.3334f, 5.3333f, 1.3334f)
                horizontalLineTo(10.6666f)
                curveTo(10.8435f, 1.3334f, 11.013f, 1.4036f, 11.1381f, 1.5286f)
                curveTo(11.2631f, 1.6537f, 11.3333f, 1.8232f, 11.3333f, 2.0f)
                verticalLineTo(4.0f)
                close()
                moveTo(12.0f, 5.3334f)
                horizontalLineTo(4.0f)
                verticalLineTo(13.3334f)
                horizontalLineTo(12.0f)
                verticalLineTo(5.3334f)
                close()
                moveTo(6.0f, 2.6667f)
                verticalLineTo(4.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(2.6667f)
                horizontalLineTo(6.0f)
                close()
            }
        }
        .build()
        return _deleteBin!!
    }

private var _deleteBin: ImageVector? = null
