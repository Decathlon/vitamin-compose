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

public val FlagsGroup.La: ImageVector
    get() {
        if (_la != null) {
            return _la!!
        }
        _la = Builder(name = "La", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
                28.0f, viewportHeight = 20.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFFE2273E)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(0.0f, 0.0f)
                    horizontalLineTo(28.0f)
                    curveTo(28.0f, 6.6667f, 28.0f, 13.3333f, 28.0f, 20.0f)
                    curveTo(18.6667f, 20.0f, 9.3333f, 20.0f, 0.0f, 20.0f)
                    curveTo(0.0f, 13.3333f, -0.0f, 6.6667f, 0.0f, 0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF073A88)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(0.0f, 14.6667f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(5.3333f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(14.6667f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFE2273E)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(0.0f, 20.0f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(14.6667f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(20.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFE2273E)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(14.0f, 13.3333f)
                    curveTo(15.8409f, 13.3333f, 17.3333f, 11.8409f, 17.3333f, 10.0f)
                    curveTo(17.3333f, 8.159f, 15.8409f, 6.6667f, 14.0f, 6.6667f)
                    curveTo(12.1591f, 6.6667f, 10.6667f, 8.159f, 10.6667f, 10.0f)
                    curveTo(10.6667f, 11.8409f, 12.1591f, 13.3333f, 14.0f, 13.3333f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(14.0f, 13.3333f)
                    curveTo(15.841f, 13.3333f, 17.3333f, 11.8409f, 17.3333f, 10.0f)
                    curveTo(17.3333f, 8.159f, 15.841f, 6.6667f, 14.0f, 6.6667f)
                    curveTo(12.1591f, 6.6667f, 10.6667f, 8.159f, 10.6667f, 10.0f)
                    curveTo(10.6667f, 11.8409f, 12.1591f, 13.3333f, 14.0f, 13.3333f)
                    close()
                }
            }
        }
        .build()
        return _la!!
    }

private var _la: ImageVector? = null
