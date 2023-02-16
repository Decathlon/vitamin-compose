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

public val FillGroup.Task: ImageVector
    get() {
        if (_task != null) {
            return _task!!
        }
        _task = Builder(name = "Task", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(14.0f, 14.0053f)
                verticalLineTo(1.9947f)
                curveTo(14.0f, 1.6293f, 13.7033f, 1.3333f, 13.338f, 1.3333f)
                horizontalLineTo(2.662f)
                curveTo(2.2977f, 1.3359f, 2.0029f, 1.6303f, 2.0f, 1.9947f)
                verticalLineTo(14.0053f)
                curveTo(2.0004f, 14.3707f, 2.2966f, 14.6666f, 2.662f, 14.6666f)
                horizontalLineTo(13.338f)
                curveTo(13.7023f, 14.6641f, 13.9971f, 14.3696f, 14.0f, 14.0053f)
                close()
                moveTo(5.8787f, 7.0973f)
                lineTo(7.5287f, 8.748f)
                lineTo(10.3574f, 5.9193f)
                lineTo(11.3001f, 6.862f)
                lineTo(7.5287f, 10.6333f)
                lineTo(4.9361f, 8.0407f)
                lineTo(5.8787f, 7.0973f)
                close()
            }
        }
        .build()
        return _task!!
    }

private var _task: ImageVector? = null
