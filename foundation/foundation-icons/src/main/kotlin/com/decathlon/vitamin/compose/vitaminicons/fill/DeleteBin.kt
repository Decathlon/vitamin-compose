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

public val FillGroup.DeleteBin: ImageVector
    get() {
        if (_deleteBin != null) {
            return _deleteBin!!
        }
        _deleteBin = Builder(name = "DeleteBin", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(4.6667f, 2.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(1.3334f)
                verticalLineTo(5.3333f)
                horizontalLineTo(2.6667f)
                verticalLineTo(14.0f)
                curveTo(2.6667f, 14.3682f, 2.9652f, 14.6666f, 3.3334f, 14.6666f)
                horizontalLineTo(12.6667f)
                curveTo(13.0349f, 14.6666f, 13.3334f, 14.3682f, 13.3334f, 14.0f)
                verticalLineTo(5.3333f)
                horizontalLineTo(14.6667f)
                verticalLineTo(4.0f)
                horizontalLineTo(11.3334f)
                verticalLineTo(2.0f)
                curveTo(11.3334f, 1.6318f, 11.0349f, 1.3333f, 10.6667f, 1.3333f)
                horizontalLineTo(5.3334f)
                curveTo(4.9652f, 1.3333f, 4.6667f, 1.6318f, 4.6667f, 2.0f)
                close()
                moveTo(6.0f, 4.0f)
                verticalLineTo(2.6667f)
                horizontalLineTo(10.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(6.0f)
                close()
            }
        }
        .build()
        return _deleteBin!!
    }

private var _deleteBin: ImageVector? = null
