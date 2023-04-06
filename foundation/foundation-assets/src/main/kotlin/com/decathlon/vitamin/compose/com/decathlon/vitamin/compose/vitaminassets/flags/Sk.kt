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

public val FlagsGroup.Sk: ImageVector
    get() {
        if (_sk != null) {
            return _sk!!
        }
        _sk = Builder(name = "Sk", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
                28.0f, viewportHeight = 20.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(0.0f, 0.0f)
                    horizontalLineTo(28.0f)
                    curveTo(28.0f, 6.6667f, 28.0f, 13.3333f, 28.0f, 20.0f)
                    curveTo(18.6667f, 20.0f, 9.3333f, 20.0f, 0.0f, 20.0f)
                    curveTo(0.0f, 13.3333f, -1.0E-4f, 6.6667f, 0.0f, 0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF0C47B7)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(0.0f, 13.3333f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(6.6667f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(13.3333f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFE53B35)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(0.0f, 20.0f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(13.3333f)
                    horizontalLineTo(0.0f)
                    lineTo(0.0f, 20.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFF73744)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(5.6174f, 5.2821f)
                    curveTo(5.6449f, 4.5662f, 6.2333f, 4.0f, 6.9497f, 4.0f)
                    horizontalLineTo(13.0503f)
                    curveTo(13.7667f, 4.0f, 14.3551f, 4.5662f, 14.3827f, 5.2821f)
                    lineTo(14.6419f, 12.0226f)
                    curveTo(14.6576f, 12.4294f, 14.4864f, 12.8212f, 14.1773f, 13.0861f)
                    lineTo(11.3016f, 15.551f)
                    curveTo(10.5526f, 16.193f, 9.4474f, 16.193f, 8.6984f, 15.551f)
                    lineTo(5.8227f, 13.0861f)
                    curveTo(5.5136f, 12.8212f, 5.3425f, 12.4294f, 5.3581f, 12.0226f)
                    lineTo(5.6174f, 5.2821f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(6.9497f, 2.6667f)
                    horizontalLineTo(13.0503f)
                    curveTo(14.4832f, 2.6667f, 15.6599f, 3.799f, 15.715f, 5.2308f)
                    lineTo(15.9743f, 11.9713f)
                    curveTo(16.0056f, 12.7851f, 15.6633f, 13.5685f, 15.045f, 14.0985f)
                    lineTo(12.1693f, 16.5634f)
                    curveTo(10.921f, 17.6333f, 9.079f, 17.6333f, 7.8307f, 16.5634f)
                    lineTo(4.955f, 14.0985f)
                    curveTo(4.3367f, 13.5685f, 3.9945f, 12.7851f, 4.0258f, 11.9713f)
                    lineTo(4.285f, 5.2308f)
                    curveTo(4.3401f, 3.799f, 5.5168f, 2.6667f, 6.9497f, 2.6667f)
                    close()
                    moveTo(6.9497f, 4.0f)
                    curveTo(6.2333f, 4.0f, 5.6449f, 4.5662f, 5.6174f, 5.2821f)
                    lineTo(5.3581f, 12.0226f)
                    curveTo(5.3425f, 12.4294f, 5.5136f, 12.8212f, 5.8227f, 13.0861f)
                    lineTo(8.6984f, 15.551f)
                    curveTo(9.4474f, 16.193f, 10.5526f, 16.193f, 11.3016f, 15.551f)
                    lineTo(14.1773f, 13.0861f)
                    curveTo(14.4864f, 12.8212f, 14.6576f, 12.4294f, 14.6419f, 12.0226f)
                    lineTo(14.3827f, 5.2821f)
                    curveTo(14.3551f, 4.5662f, 13.7667f, 4.0f, 13.0503f, 4.0f)
                    horizontalLineTo(6.9497f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(9.3336f, 11.0f)
                    curveTo(9.3336f, 10.8159f, 9.1843f, 10.6666f, 9.0002f, 10.6666f)
                    horizontalLineTo(7.6669f)
                    curveTo(7.4828f, 10.6666f, 7.3336f, 10.5174f, 7.3336f, 10.3333f)
                    verticalLineTo(9.6666f)
                    curveTo(7.3336f, 9.4825f, 7.4828f, 9.3333f, 7.6669f, 9.3333f)
                    horizontalLineTo(9.0002f)
                    curveTo(9.1843f, 9.3333f, 9.3336f, 9.1841f, 9.3336f, 9.0f)
                    verticalLineTo(8.3333f)
                    curveTo(9.3336f, 8.1492f, 9.1843f, 8.0f, 9.0002f, 8.0f)
                    horizontalLineTo(8.3336f)
                    curveTo(8.1495f, 8.0f, 8.0002f, 7.8507f, 8.0002f, 7.6666f)
                    verticalLineTo(7.0f)
                    curveTo(8.0002f, 6.8159f, 8.1495f, 6.6666f, 8.3336f, 6.6666f)
                    horizontalLineTo(9.0002f)
                    curveTo(9.1843f, 6.6666f, 9.3336f, 6.5174f, 9.3336f, 6.3333f)
                    verticalLineTo(5.6666f)
                    curveTo(9.3336f, 5.4826f, 9.4828f, 5.3333f, 9.6669f, 5.3333f)
                    horizontalLineTo(10.3336f)
                    curveTo(10.5177f, 5.3333f, 10.6669f, 5.4826f, 10.6669f, 5.6666f)
                    verticalLineTo(6.3333f)
                    curveTo(10.6669f, 6.5174f, 10.8161f, 6.6666f, 11.0002f, 6.6666f)
                    horizontalLineTo(11.6669f)
                    curveTo(11.851f, 6.6666f, 12.0002f, 6.8159f, 12.0002f, 7.0f)
                    verticalLineTo(7.6666f)
                    curveTo(12.0002f, 7.8507f, 11.851f, 8.0f, 11.6669f, 8.0f)
                    horizontalLineTo(11.0002f)
                    curveTo(10.8161f, 8.0f, 10.6669f, 8.1492f, 10.6669f, 8.3333f)
                    verticalLineTo(9.0f)
                    curveTo(10.6669f, 9.1841f, 10.8161f, 9.3333f, 11.0002f, 9.3333f)
                    horizontalLineTo(12.3336f)
                    curveTo(12.5177f, 9.3333f, 12.6669f, 9.4825f, 12.6669f, 9.6666f)
                    verticalLineTo(10.3333f)
                    curveTo(12.6669f, 10.5174f, 12.5177f, 10.6666f, 12.3336f, 10.6666f)
                    horizontalLineTo(11.0002f)
                    curveTo(10.8161f, 10.6666f, 10.6669f, 10.8159f, 10.6669f, 11.0f)
                    verticalLineTo(13.0f)
                    curveTo(10.6669f, 13.1841f, 10.5177f, 13.3333f, 10.3336f, 13.3333f)
                    horizontalLineTo(9.6669f)
                    curveTo(9.4828f, 13.3333f, 9.3336f, 13.1841f, 9.3336f, 13.0f)
                    verticalLineTo(11.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF1251A1)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(11.2034f, 13.4254f)
                    curveTo(10.9887f, 12.9766f, 10.5305f, 12.6667f, 9.9999f, 12.6667f)
                    curveTo(9.4692f, 12.6667f, 9.0109f, 12.9767f, 8.7963f, 13.4255f)
                    curveTo(7.1754f, 13.6809f, 6.0f, 14.4385f, 6.0f, 15.3333f)
                    curveTo(6.0f, 16.4379f, 7.7909f, 17.3333f, 10.0f, 17.3333f)
                    curveTo(12.2091f, 17.3333f, 14.0f, 16.4379f, 14.0f, 15.3333f)
                    curveTo(14.0f, 14.4384f, 12.8245f, 13.6808f, 11.2034f, 13.4254f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF8996A2)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(28.0f, 0.0f)
                    verticalLineTo(6.6683f)
                    horizontalLineTo(27.5f)
                    verticalLineTo(0.5f)
                    horizontalLineTo(0.5f)
                    lineTo(0.5f, 6.6683f)
                    horizontalLineTo(0.0f)
                    lineTo(0.0f, 0.0f)
                    horizontalLineTo(28.0f)
                    close()
                }
            }
        }
        .build()
        return _sk!!
    }

private var _sk: ImageVector? = null
