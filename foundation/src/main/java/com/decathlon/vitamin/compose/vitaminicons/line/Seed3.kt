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
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.vitaminicons.LineGroup

public val LineGroup.Seed3: ImageVector
    get() {
        if (_seed3 != null) {
            return _seed3!!
        }
        _seed3 = Builder(name = "Seed3", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(6.0f, 4.0f)
                    curveTo(9.49f, 4.0f, 12.383f, 6.554f, 12.913f, 9.895f)
                    curveTo(14.088f, 8.724f, 15.71f, 8.0f, 17.5f, 8.0f)
                    horizontalLineTo(22.0f)
                    verticalLineTo(10.5f)
                    curveTo(22.0f, 14.09f, 19.09f, 17.0f, 15.5f, 17.0f)
                    horizontalLineTo(13.0f)
                    verticalLineTo(22.0f)
                    horizontalLineTo(11.0f)
                    verticalLineTo(14.0f)
                    horizontalLineTo(9.0f)
                    curveTo(5.134f, 14.0f, 2.0f, 10.866f, 2.0f, 7.0f)
                    verticalLineTo(4.0f)
                    horizontalLineTo(6.0f)
                    close()
                    moveTo(20.0f, 10.0f)
                    horizontalLineTo(17.5f)
                    curveTo(15.015f, 10.0f, 13.0f, 12.015f, 13.0f, 14.5f)
                    verticalLineTo(15.0f)
                    horizontalLineTo(15.5f)
                    curveTo(17.985f, 15.0f, 20.0f, 12.985f, 20.0f, 10.5f)
                    verticalLineTo(10.0f)
                    close()
                    moveTo(6.0f, 6.0f)
                    horizontalLineTo(4.0f)
                    verticalLineTo(7.0f)
                    curveTo(4.0f, 9.761f, 6.239f, 12.0f, 9.0f, 12.0f)
                    horizontalLineTo(11.0f)
                    verticalLineTo(11.0f)
                    curveTo(11.0f, 8.239f, 8.761f, 6.0f, 6.0f, 6.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(15.6729f, 6.2921f)
                    curveTo(15.1252f, 7.0543f, 14.0632f, 7.2282f, 13.301f, 6.6805f)
                    curveTo(12.5387f, 6.1328f, 12.3648f, 5.0708f, 12.9125f, 4.3086f)
                    curveTo(13.4602f, 3.5463f, 14.5791f, 3.1552f, 15.9456f, 3.0f)
                    curveTo(16.1794f, 3.9605f, 16.2206f, 5.5298f, 15.6729f, 6.2921f)
                    close()
                }
            }
        }
        .build()
        return _seed3!!
    }

private var _seed3: ImageVector? = null
