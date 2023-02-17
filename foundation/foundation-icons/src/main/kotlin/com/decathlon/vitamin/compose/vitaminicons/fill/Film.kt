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

public val FillGroup.Film: ImageVector
    get() {
        if (_film != null) {
            return _film!!
        }
        _film = Builder(name = "Film", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 3.993f)
                curveTo(2.0018f, 3.7304f, 2.1069f, 3.479f, 2.2925f, 3.2932f)
                curveTo(2.4781f, 3.1074f, 2.7294f, 3.0021f, 2.992f, 3.0f)
                horizontalLineTo(21.008f)
                curveTo(21.556f, 3.0f, 22.0f, 3.445f, 22.0f, 3.993f)
                verticalLineTo(20.007f)
                curveTo(21.9982f, 20.2696f, 21.8931f, 20.521f, 21.7075f, 20.7068f)
                curveTo(21.5219f, 20.8926f, 21.2706f, 20.9979f, 21.008f, 21.0f)
                horizontalLineTo(2.992f)
                curveTo(2.7288f, 20.9997f, 2.4765f, 20.895f, 2.2905f, 20.7088f)
                curveTo(2.1045f, 20.5226f, 2.0f, 20.2702f, 2.0f, 20.007f)
                verticalLineTo(3.993f)
                close()
                moveTo(4.0f, 5.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(4.0f)
                close()
                moveTo(18.0f, 5.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(18.0f)
                close()
                moveTo(4.0f, 9.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(4.0f)
                close()
                moveTo(18.0f, 9.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(18.0f)
                close()
                moveTo(4.0f, 13.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(4.0f)
                close()
                moveTo(18.0f, 13.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(18.0f)
                close()
                moveTo(4.0f, 17.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(4.0f)
                close()
                moveTo(18.0f, 17.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(18.0f)
                close()
            }
        }
        .build()
        return _film!!
    }

private var _film: ImageVector? = null
