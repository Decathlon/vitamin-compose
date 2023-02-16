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

public val FlagsGroup.Lgbt: ImageVector
    get() {
        if (_lgbt != null) {
            return _lgbt!!
        }
        _lgbt = Builder(name = "Lgbt", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp,
                viewportWidth = 28.0f, viewportHeight = 20.0f).apply {
            group {
                path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0),
                        start = Offset(14.0f,0.0f), end = Offset(14.0f,20.0f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(28.0f, 0.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(20.0f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(0.0f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFF71E24), 1.0f to Color(0xFFFB141B),
                        start = Offset(14.0f,0.0f), end = Offset(14.0f,4.0f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(28.0f, 0.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(4.0f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(0.0f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFFB6C2C), 1.0f to Color(0xFFFC6420),
                        start = Offset(14.0f,4.0f), end = Offset(14.0f,8.0f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(28.0f, 4.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(8.0f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(4.0f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFFDFC42), 1.0f to Color(0xFFFFFD38),
                        start = Offset(14.0f,8.0f), end = Offset(14.0f,12.0f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(28.0f, 8.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(12.0f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(8.0f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFF238F35), 1.0f to Color(0xFF1C7E2C),
                        start = Offset(14.0f,12.0f), end = Offset(14.0f,16.0f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(28.0f, 12.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(16.0f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(12.0f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFF0F62FA), 1.0f to Color(0xFF0059FC),
                        start = Offset(14.0f,16.0f), end = Offset(14.0f,20.0f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(28.0f, 16.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(20.0f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(16.0f)
                    close()
                }
            }
        }
        .build()
        return _lgbt!!
    }

private var _lgbt: ImageVector? = null
