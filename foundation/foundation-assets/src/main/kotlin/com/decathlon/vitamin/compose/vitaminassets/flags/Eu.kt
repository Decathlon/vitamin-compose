package com.decathlon.vitamin.compose.vitaminassets.flags

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.vitaminassets.FlagsGroup

public val FlagsGroup.Eu: ImageVector
    get() {
        if (_eu != null) {
            return _eu!!
        }
        _eu = Builder(name = "Eu", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
                28.0f, viewportHeight = 20.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(2.0f, 0.0f)
                    lineTo(26.0f, 0.0f)
                    arcTo(2.0f, 2.0f, 0.0f, false, true, 28.0f, 2.0f)
                    lineTo(28.0f, 18.0f)
                    arcTo(2.0f, 2.0f, 0.0f, false, true, 26.0f, 20.0f)
                    lineTo(2.0f, 20.0f)
                    arcTo(2.0f, 2.0f, 0.0f, false, true, 0.0f, 18.0f)
                    lineTo(0.0f, 2.0f)
                    arcTo(2.0f, 2.0f, 0.0f, false, true, 2.0f, 0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF043CAE)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(0.0f, 0.0f)
                    horizontalLineToRelative(28.0f)
                    verticalLineToRelative(20.0f)
                    horizontalLineToRelative(-28.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFD429)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(13.0572f, 4.2762f)
                    lineTo(14.0f, 4.0f)
                    lineTo(14.9428f, 4.2762f)
                    lineTo(14.6666f, 3.3333f)
                    lineTo(14.9428f, 2.3905f)
                    lineTo(14.0f, 2.6667f)
                    lineTo(13.0572f, 2.3905f)
                    lineTo(13.3333f, 3.3333f)
                    lineTo(13.0572f, 4.2762f)
                    close()
                    moveTo(13.0572f, 17.6095f)
                    lineTo(14.0f, 17.3333f)
                    lineTo(14.9428f, 17.6095f)
                    lineTo(14.6666f, 16.6667f)
                    lineTo(14.9428f, 15.7239f)
                    lineTo(14.0f, 16.0f)
                    lineTo(13.0572f, 15.7239f)
                    lineTo(13.3333f, 16.6667f)
                    lineTo(13.0572f, 17.6095f)
                    close()
                    moveTo(20.6666f, 10.6667f)
                    lineTo(19.7238f, 10.9428f)
                    lineTo(20.0f, 10.0f)
                    lineTo(19.7238f, 9.0572f)
                    lineTo(20.6666f, 9.3333f)
                    lineTo(21.6095f, 9.0572f)
                    lineTo(21.3333f, 10.0f)
                    lineTo(21.6095f, 10.9428f)
                    lineTo(20.6666f, 10.6667f)
                    close()
                    moveTo(6.3905f, 10.9428f)
                    lineTo(7.3333f, 10.6667f)
                    lineTo(8.2761f, 10.9428f)
                    lineTo(8.0f, 10.0f)
                    lineTo(8.2761f, 9.0572f)
                    lineTo(7.3333f, 9.3333f)
                    lineTo(6.3905f, 9.0572f)
                    lineTo(6.6666f, 10.0f)
                    lineTo(6.3905f, 10.9428f)
                    close()
                    moveTo(19.7735f, 7.3333f)
                    lineTo(18.8307f, 7.6095f)
                    lineTo(19.1068f, 6.6667f)
                    lineTo(18.8307f, 5.7239f)
                    lineTo(19.7735f, 6.0f)
                    lineTo(20.7163f, 5.7239f)
                    lineTo(20.4401f, 6.6667f)
                    lineTo(20.7163f, 7.6095f)
                    lineTo(19.7735f, 7.3333f)
                    close()
                    moveTo(7.2837f, 14.2762f)
                    lineTo(8.2265f, 14.0f)
                    lineTo(9.1693f, 14.2762f)
                    lineTo(8.8931f, 13.3333f)
                    lineTo(9.1693f, 12.3905f)
                    lineTo(8.2265f, 12.6667f)
                    lineTo(7.2837f, 12.3905f)
                    lineTo(7.5598f, 13.3333f)
                    lineTo(7.2837f, 14.2762f)
                    close()
                    moveTo(17.3333f, 4.8932f)
                    lineTo(16.3905f, 5.1693f)
                    lineTo(16.6666f, 4.2265f)
                    lineTo(16.3905f, 3.2837f)
                    lineTo(17.3333f, 3.5598f)
                    lineTo(18.2761f, 3.2837f)
                    lineTo(18.0f, 4.2265f)
                    lineTo(18.2761f, 5.1693f)
                    lineTo(17.3333f, 4.8932f)
                    close()
                    moveTo(9.7238f, 16.7163f)
                    lineTo(10.6666f, 16.4402f)
                    lineTo(11.6095f, 16.7163f)
                    lineTo(11.3333f, 15.7735f)
                    lineTo(11.6095f, 14.8307f)
                    lineTo(10.6666f, 15.1068f)
                    lineTo(9.7238f, 14.8307f)
                    lineTo(10.0f, 15.7735f)
                    lineTo(9.7238f, 16.7163f)
                    close()
                    moveTo(19.7735f, 14.0f)
                    lineTo(18.8307f, 14.2762f)
                    lineTo(19.1068f, 13.3333f)
                    lineTo(18.8307f, 12.3905f)
                    lineTo(19.7735f, 12.6667f)
                    lineTo(20.7163f, 12.3905f)
                    lineTo(20.4401f, 13.3333f)
                    lineTo(20.7163f, 14.2762f)
                    lineTo(19.7735f, 14.0f)
                    close()
                    moveTo(7.2837f, 7.6095f)
                    lineTo(8.2265f, 7.3333f)
                    lineTo(9.1693f, 7.6095f)
                    lineTo(8.8931f, 6.6667f)
                    lineTo(9.1693f, 5.7239f)
                    lineTo(8.2265f, 6.0f)
                    lineTo(7.2837f, 5.7239f)
                    lineTo(7.5598f, 6.6667f)
                    lineTo(7.2837f, 7.6095f)
                    close()
                    moveTo(17.3333f, 16.4402f)
                    lineTo(16.3905f, 16.7163f)
                    lineTo(16.6666f, 15.7735f)
                    lineTo(16.3905f, 14.8307f)
                    lineTo(17.3333f, 15.1068f)
                    lineTo(18.2761f, 14.8307f)
                    lineTo(18.0f, 15.7735f)
                    lineTo(18.2761f, 16.7163f)
                    lineTo(17.3333f, 16.4402f)
                    close()
                    moveTo(9.7238f, 5.1693f)
                    lineTo(10.6666f, 4.8932f)
                    lineTo(11.6095f, 5.1693f)
                    lineTo(11.3333f, 4.2265f)
                    lineTo(11.6095f, 3.2837f)
                    lineTo(10.6666f, 3.5598f)
                    lineTo(9.7238f, 3.2837f)
                    lineTo(10.0f, 4.2265f)
                    lineTo(9.7238f, 5.1693f)
                    close()
                }
            }
        }
        .build()
        return _eu!!
    }

private var _eu: ImageVector? = null
