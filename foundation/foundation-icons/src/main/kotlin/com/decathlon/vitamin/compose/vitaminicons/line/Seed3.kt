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
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(4.4f, 2.4663f)
                    curveTo(6.494f, 2.4663f, 8.2298f, 4.0271f, 8.5478f, 6.0688f)
                    curveTo(9.2528f, 5.3532f, 10.226f, 4.9107f, 11.3f, 4.9107f)
                    horizontalLineTo(14.0f)
                    verticalLineTo(6.4385f)
                    curveTo(14.0f, 8.6324f, 12.254f, 10.4107f, 10.1f, 10.4107f)
                    horizontalLineTo(8.6f)
                    verticalLineTo(13.4663f)
                    horizontalLineTo(7.4f)
                    verticalLineTo(8.5774f)
                    horizontalLineTo(6.2f)
                    curveTo(3.8804f, 8.5774f, 2.0f, 6.6622f, 2.0f, 4.2996f)
                    verticalLineTo(2.4663f)
                    horizontalLineTo(4.4f)
                    close()
                    moveTo(12.8f, 6.1329f)
                    horizontalLineTo(11.3f)
                    curveTo(9.809f, 6.1329f, 8.6f, 7.3643f, 8.6f, 8.8829f)
                    verticalLineTo(9.1885f)
                    horizontalLineTo(10.1f)
                    curveTo(11.591f, 9.1885f, 12.8f, 7.9571f, 12.8f, 6.4385f)
                    verticalLineTo(6.1329f)
                    close()
                    moveTo(4.4f, 3.6885f)
                    horizontalLineTo(3.2f)
                    verticalLineTo(4.2996f)
                    curveTo(3.2f, 5.9869f, 4.5434f, 7.3552f, 6.2f, 7.3552f)
                    horizontalLineTo(7.4f)
                    verticalLineTo(6.7441f)
                    curveTo(7.4f, 5.0568f, 6.0566f, 3.6885f, 4.4f, 3.6885f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(10.0193f, 3.7717f)
                    curveTo(9.7246f, 4.1819f, 9.1531f, 4.2755f, 8.7429f, 3.9807f)
                    curveTo(8.3326f, 3.6859f, 8.239f, 3.1144f, 8.5338f, 2.7042f)
                    curveTo(8.8286f, 2.294f, 9.4307f, 2.0835f, 10.1661f, 2.0f)
                    curveTo(10.2919f, 2.5169f, 10.3141f, 3.3614f, 10.0193f, 3.7717f)
                    close()
                }
            }
        }
        .build()
        return _seed3!!
    }

private var _seed3: ImageVector? = null
