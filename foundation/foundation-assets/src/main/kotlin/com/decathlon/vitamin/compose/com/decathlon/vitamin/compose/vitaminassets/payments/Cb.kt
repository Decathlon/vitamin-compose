package com.decathlon.vitamin.compose.vitaminassets.payments

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
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.vitaminassets.PaymentsGroup

public val PaymentsGroup.Cb: ImageVector
    get() {
        if (_cb != null) {
            return _cb!!
        }
        _cb = Builder(name = "Cb", defaultWidth = 58.0.dp, defaultHeight = 40.0.dp, viewportWidth =
                58.0f, viewportHeight = 40.0f).apply {
            path(fill = SolidColor(Color(0xFF2F3093)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 4.0f)
                curveTo(0.0f, 1.7909f, 1.7909f, 0.0f, 4.0f, 0.0f)
                horizontalLineTo(54.0f)
                curveTo(56.2091f, 0.0f, 58.0f, 1.7909f, 58.0f, 4.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(0.0f)
                verticalLineTo(4.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF006618)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 26.0f)
                horizontalLineTo(58.0f)
                verticalLineTo(36.0f)
                curveTo(58.0f, 37.6569f, 56.6569f, 39.0f, 55.0f, 39.0f)
                horizontalLineTo(3.0f)
                curveTo(1.3432f, 39.0f, 0.0f, 37.6569f, 0.0f, 36.0f)
                verticalLineTo(26.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF20A2E4)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 10.0f)
                horizontalLineToRelative(58.0f)
                verticalLineToRelative(20.0f)
                horizontalLineToRelative(-58.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.825f, 19.4075f)
                horizontalLineTo(29.6782f)
                curveTo(29.6082f, 17.71f, 29.2127f, 15.9599f, 28.0131f, 14.8358f)
                curveTo(26.5842f, 13.4967f, 24.0813f, 13.0f, 21.8449f, 13.0f)
                curveTo(19.5172f, 13.0f, 16.943f, 13.5448f, 15.5065f, 14.9815f)
                curveTo(14.2678f, 16.2192f, 14.0f, 18.2105f, 14.0f, 19.9996f)
                curveTo(14.0f, 21.8737f, 14.5239f, 24.0536f, 15.8677f, 25.3093f)
                curveTo(17.2966f, 26.6453f, 19.612f, 27.0f, 21.8449f, 27.0f)
                curveTo(24.0141f, 27.0f, 26.3638f, 26.5995f, 27.7844f, 25.3311f)
                curveTo(29.201f, 24.0641f, 29.6906f, 21.9301f, 29.6906f, 19.9996f)
                verticalLineTo(19.9906f)
                horizontalLineTo(21.825f)
                verticalLineTo(19.4075f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(30.2053f, 19.9909f)
                verticalLineTo(26.687f)
                horizontalLineTo(41.1298f)
                verticalLineTo(26.6779f)
                curveTo(42.7283f, 26.5908f, 44.0f, 25.1495f, 44.0f, 23.3799f)
                curveTo(44.0f, 21.6095f, 42.7283f, 20.0758f, 41.1298f, 19.9879f)
                verticalLineTo(19.9909f)
                horizontalLineTo(30.2053f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(41.0054f, 13.2804f)
                curveTo(42.5634f, 13.2804f, 43.8f, 14.6322f, 43.8f, 16.338f)
                curveTo(43.8f, 17.9528f, 42.6643f, 19.2716f, 41.2196f, 19.4076f)
                horizontalLineTo(30.2051f)
                verticalLineTo(13.2706f)
                horizontalLineTo(40.6607f)
                curveTo(40.725f, 13.2627f, 40.8f, 13.2683f, 40.8733f, 13.2737f)
                curveTo(40.919f, 13.277f, 40.964f, 13.2804f, 41.0054f, 13.2804f)
                close()
            }
            path(fill = SolidColor(Color(0xFFF3F3F3)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(54.0f, 1.0f)
                horizontalLineTo(4.0f)
                curveTo(2.3431f, 1.0f, 1.0f, 2.3431f, 1.0f, 4.0f)
                verticalLineTo(36.0f)
                curveTo(1.0f, 37.6569f, 2.3431f, 39.0f, 4.0f, 39.0f)
                horizontalLineTo(54.0f)
                curveTo(55.6569f, 39.0f, 57.0f, 37.6569f, 57.0f, 36.0f)
                verticalLineTo(4.0f)
                curveTo(57.0f, 2.3431f, 55.6569f, 1.0f, 54.0f, 1.0f)
                close()
                moveTo(4.0f, 0.0f)
                curveTo(1.7909f, 0.0f, 0.0f, 1.7909f, 0.0f, 4.0f)
                verticalLineTo(36.0f)
                curveTo(0.0f, 38.2091f, 1.7909f, 40.0f, 4.0f, 40.0f)
                horizontalLineTo(54.0f)
                curveTo(56.2091f, 40.0f, 58.0f, 38.2091f, 58.0f, 36.0f)
                verticalLineTo(4.0f)
                curveTo(58.0f, 1.7909f, 56.2091f, 0.0f, 54.0f, 0.0f)
                horizontalLineTo(4.0f)
                close()
            }
        }
        .build()
        return _cb!!
    }

private var _cb: ImageVector? = null
