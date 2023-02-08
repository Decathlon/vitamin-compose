package com.decathlon.vitamin.compose.vitaminicons.line

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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

public val LineGroup.FileCopy: ImageVector
    get() {
        if (_fileCopy != null) {
            return _fileCopy!!
        }
        _fileCopy = Builder(name = "FileCopy", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 5.0f)
                verticalLineTo(3.0f)
                curveTo(7.0f, 2.7347f, 7.1055f, 2.4805f, 7.293f, 2.2929f)
                curveTo(7.3784f, 2.2074f, 7.4775f, 2.139f, 7.5855f, 2.09f)
                curveTo(7.7144f, 2.0313f, 7.8555f, 2.0f, 8.0f, 2.0f)
                horizontalLineTo(20.0f)
                curveTo(20.5523f, 2.0f, 21.0f, 2.4477f, 21.0f, 3.0f)
                verticalLineTo(17.0f)
                curveTo(21.0f, 17.2653f, 20.8945f, 17.5195f, 20.707f, 17.7072f)
                curveTo(20.5195f, 17.8947f, 20.2651f, 18.0f, 20.0f, 18.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(7.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(4.0098f, 6.0f)
                curveTo(3.4531f, 6.0f, 3.0029f, 6.448f, 3.0029f, 7.0f)
                lineTo(3.0f, 21.0f)
                curveTo(3.0f, 21.1318f, 3.0264f, 21.2625f, 3.0772f, 21.3842f)
                curveTo(3.1152f, 21.4749f, 3.166f, 21.5594f, 3.228f, 21.6351f)
                curveTo(3.2495f, 21.6609f, 3.272f, 21.6857f, 3.2959f, 21.7094f)
                curveTo(3.3525f, 21.7659f, 3.416f, 21.8152f, 3.4844f, 21.8564f)
                curveTo(3.5288f, 21.8829f, 3.5747f, 21.9061f, 3.6226f, 21.9257f)
                curveTo(3.7446f, 21.9755f, 3.875f, 22.0007f, 4.0068f, 22.0f)
                horizontalLineTo(15.9932f)
                curveTo(16.5498f, 22.0f, 17.0f, 21.552f, 17.0f, 21.0f)
                verticalLineTo(7.0f)
                curveTo(17.0f, 6.4477f, 16.5523f, 6.0f, 16.0f, 6.0f)
                horizontalLineTo(4.0098f)
                close()
                moveTo(5.0029f, 8.0f)
                lineTo(5.0f, 20.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(5.0029f)
                close()
            }
        }
        .build()
        return _fileCopy!!
    }

private var _fileCopy: ImageVector? = null
