package com.decathlon.vitamin.compose.vitaminassets.flags

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
import com.decathlon.vitamin.compose.vitaminassets.FlagsGroup

public val FlagsGroup.Aw: ImageVector
    get() {
        if (_aw != null) {
            return _aw!!
        }
        _aw = Builder(name = "Aw", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
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
                path(fill = SolidColor(Color(0xFF4189DD)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(0.0f, 0.0f)
                    horizontalLineToRelative(28.0f)
                    verticalLineToRelative(20.0f)
                    horizontalLineToRelative(-28.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFD21034)), stroke = SolidColor(Color(0xFFffffff)),
                        strokeLineWidth = 0.666667f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(5.6307f, 2.5124f)
                    lineTo(5.3351f, 1.9461f)
                    lineTo(5.0396f, 2.5124f)
                    lineTo(4.4023f, 3.7338f)
                    lineTo(3.1809f, 4.3711f)
                    lineTo(2.6146f, 4.6667f)
                    lineTo(3.1809f, 4.9622f)
                    lineTo(4.4023f, 5.5995f)
                    lineTo(5.0396f, 6.8209f)
                    lineTo(5.3351f, 7.3872f)
                    lineTo(5.6307f, 6.8209f)
                    lineTo(6.268f, 5.5995f)
                    lineTo(7.4893f, 4.9622f)
                    lineTo(8.0557f, 4.6667f)
                    lineTo(7.4893f, 4.3711f)
                    lineTo(6.268f, 3.7338f)
                    lineTo(5.6307f, 2.5124f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFF9D616)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(0.0f, 14.6667f)
                    horizontalLineToRelative(28.0f)
                    verticalLineToRelative(1.3333f)
                    horizontalLineToRelative(-28.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFF9D616)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(0.0f, 12.0f)
                    horizontalLineToRelative(28.0f)
                    verticalLineToRelative(1.3333f)
                    horizontalLineToRelative(-28.0f)
                    close()
                }
            }
        }
        .build()
        return _aw!!
    }

private var _aw: ImageVector? = null
