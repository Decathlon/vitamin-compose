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

public val FillGroup.Train: ImageVector
    get() {
        if (_train != null) {
            return _train!!
        }
        _train = Builder(name = "Train", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.2f, 20.0f)
                lineTo(19.0f, 21.5f)
                verticalLineTo(22.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(21.5f)
                lineTo(6.8f, 20.0f)
                horizontalLineTo(5.0f)
                curveTo(4.4696f, 20.0f, 3.9609f, 19.7893f, 3.5858f, 19.4142f)
                curveTo(3.2107f, 19.0391f, 3.0f, 18.5304f, 3.0f, 18.0f)
                verticalLineTo(7.0f)
                curveTo(3.0f, 5.9391f, 3.4214f, 4.9217f, 4.1716f, 4.1716f)
                curveTo(4.9217f, 3.4214f, 5.9391f, 3.0f, 7.0f, 3.0f)
                horizontalLineTo(17.0f)
                curveTo(18.0609f, 3.0f, 19.0783f, 3.4214f, 19.8284f, 4.1716f)
                curveTo(20.5786f, 4.9217f, 21.0f, 5.9391f, 21.0f, 7.0f)
                verticalLineTo(18.0f)
                curveTo(21.0f, 18.5304f, 20.7893f, 19.0391f, 20.4142f, 19.4142f)
                curveTo(20.0391f, 19.7893f, 19.5304f, 20.0f, 19.0f, 20.0f)
                horizontalLineTo(17.2f)
                close()
                moveTo(5.0f, 7.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(5.0f)
                close()
                moveTo(12.0f, 18.0f)
                curveTo(12.5304f, 18.0f, 13.0391f, 17.7893f, 13.4142f, 17.4142f)
                curveTo(13.7893f, 17.0391f, 14.0f, 16.5304f, 14.0f, 16.0f)
                curveTo(14.0f, 15.4696f, 13.7893f, 14.9609f, 13.4142f, 14.5858f)
                curveTo(13.0391f, 14.2107f, 12.5304f, 14.0f, 12.0f, 14.0f)
                curveTo(11.4696f, 14.0f, 10.9609f, 14.2107f, 10.5858f, 14.5858f)
                curveTo(10.2107f, 14.9609f, 10.0f, 15.4696f, 10.0f, 16.0f)
                curveTo(10.0f, 16.5304f, 10.2107f, 17.0391f, 10.5858f, 17.4142f)
                curveTo(10.9609f, 17.7893f, 11.4696f, 18.0f, 12.0f, 18.0f)
                close()
            }
        }
        .build()
        return _train!!
    }

private var _train: ImageVector? = null
