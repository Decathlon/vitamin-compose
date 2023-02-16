package com.decathlon.vitamin.compose.vitaminassets.flags

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Brush.Companion.linearGradient
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
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

public val FlagsGroup.Wf: ImageVector
    get() {
        if (_wf != null) {
            return _wf!!
        }
        _wf = Builder(name = "Wf", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
                28.0f, viewportHeight = 20.0f).apply {
            group {
                path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0),
                        start = Offset(13.999f,0.0f), end = Offset(13.999f,20.0f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(27.999f, 0.0f)
                    horizontalLineTo(-0.001f)
                    verticalLineTo(20.0f)
                    horizontalLineTo(27.999f)
                    verticalLineTo(0.0f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFF44653), 1.0f to Color(0xFFEE2A39),
                        start = Offset(20.6657f,0.0f), end = Offset(20.6657f,20.0f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(27.999f, 0.0f)
                    horizontalLineTo(13.3324f)
                    verticalLineTo(20.0f)
                    horizontalLineTo(27.999f)
                    verticalLineTo(0.0f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFF1035BB), 1.0f to Color(0xFF042396),
                        start = Offset(4.66569f,0.0f), end = Offset(4.66569f,20.0f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(9.3324f, 0.0f)
                    horizontalLineTo(-0.001f)
                    verticalLineTo(20.0f)
                    horizontalLineTo(9.3324f)
                    verticalLineTo(0.0f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0),
                        start = Offset(13.999f,0.0f), end = Offset(13.999f,20.0f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(18.6657f, 0.0f)
                    horizontalLineTo(9.3324f)
                    verticalLineTo(20.0f)
                    horizontalLineTo(18.6657f)
                    verticalLineTo(0.0f)
                    close()
                }
            }
        }
        .build()
        return _wf!!
    }

private var _wf: ImageVector? = null
