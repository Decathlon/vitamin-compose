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

public val LineGroup.Upload: ImageVector
    get() {
        if (_upload != null) {
            return _upload!!
        }
        _upload = Builder(name = "Upload", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.6571f, 7.7323f)
                lineTo(12.0002f, 2.0754f)
                lineTo(6.3434f, 7.7323f)
                lineTo(7.7576f, 9.1465f)
                lineTo(10.9997f, 5.9044f)
                lineTo(11.0004f, 15.9247f)
                horizontalLineTo(13.0001f)
                lineTo(12.9994f, 5.903f)
                lineTo(16.2429f, 9.1465f)
                lineTo(17.6571f, 7.7323f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 19.0002f)
                horizontalLineTo(4.0f)
                verticalLineTo(12.0002f)
                horizontalLineTo(2.0f)
                verticalLineTo(20.0002f)
                curveTo(2.0f, 20.2654f, 2.1054f, 20.5198f, 2.2929f, 20.7073f)
                curveTo(2.4804f, 20.8949f, 2.7348f, 21.0002f, 3.0f, 21.0002f)
                horizontalLineTo(21.0f)
                curveTo(21.2652f, 21.0002f, 21.5196f, 20.8949f, 21.7071f, 20.7073f)
                curveTo(21.8946f, 20.5198f, 22.0f, 20.2654f, 22.0f, 20.0002f)
                verticalLineTo(12.0002f)
                horizontalLineTo(20.0f)
                verticalLineTo(19.0002f)
                close()
            }
        }
        .build()
        return _upload!!
    }

private var _upload: ImageVector? = null
