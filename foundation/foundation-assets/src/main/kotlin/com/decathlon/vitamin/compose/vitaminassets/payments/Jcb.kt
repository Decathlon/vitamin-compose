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

public val PaymentsGroup.Jcb: ImageVector
    get() {
        if (_jcb != null) {
            return _jcb!!
        }
        _jcb = Builder(name = "Jcb", defaultWidth = 58.0.dp, defaultHeight = 40.0.dp, viewportWidth
                = 58.0f, viewportHeight = 40.0f).apply {
            path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 4.0f)
                curveTo(0.0f, 1.8f, 1.8f, 0.0f, 4.0f, 0.0f)
                horizontalLineTo(54.0f)
                curveTo(56.2f, 0.0f, 58.0f, 1.8f, 58.0f, 4.0f)
                verticalLineTo(36.0f)
                curveTo(58.0f, 38.2f, 56.2f, 40.0f, 54.0f, 40.0f)
                horizontalLineTo(4.0f)
                curveTo(1.8f, 40.0f, 0.0f, 38.2f, 0.0f, 36.0f)
                verticalLineTo(4.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFF3F3F3)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(54.0f, 1.0f)
                horizontalLineTo(4.0f)
                curveTo(2.3f, 1.0f, 1.0f, 2.3f, 1.0f, 4.0f)
                verticalLineTo(36.0f)
                curveTo(1.0f, 37.7f, 2.3f, 39.0f, 4.0f, 39.0f)
                horizontalLineTo(54.0f)
                curveTo(55.7f, 39.0f, 57.0f, 37.7f, 57.0f, 36.0f)
                verticalLineTo(4.0f)
                curveTo(57.0f, 2.3f, 55.7f, 1.0f, 54.0f, 1.0f)
                close()
                moveTo(4.0f, 0.0f)
                curveTo(1.8f, 0.0f, 0.0f, 1.8f, 0.0f, 4.0f)
                verticalLineTo(36.0f)
                curveTo(0.0f, 38.2f, 1.8f, 40.0f, 4.0f, 40.0f)
                horizontalLineTo(54.0f)
                curveTo(56.2f, 40.0f, 58.0f, 38.2f, 58.0f, 36.0f)
                verticalLineTo(4.0f)
                curveTo(58.0f, 1.8f, 56.2f, 0.0f, 54.0f, 0.0f)
                horizontalLineTo(4.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF54B230)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(38.4f, 20.0999f)
                curveTo(39.5f, 20.2999f, 42.6f, 19.4999f, 42.6f, 21.3999f)
                curveTo(42.7f, 23.2999f, 39.5f, 22.4999f, 38.4f, 22.6999f)
                verticalLineTo(20.0999f)
                close()
                moveTo(42.2f, 17.1999f)
                curveTo(42.6f, 19.1999f, 39.5f, 18.4999f, 38.4f, 18.6999f)
                verticalLineTo(16.2999f)
                curveTo(39.3f, 16.4999f, 41.9f, 15.7999f, 42.2f, 17.1999f)
                close()
                moveTo(48.0f, 4.9999f)
                verticalLineTo(29.1999f)
                curveTo(48.0f, 30.8999f, 47.1f, 32.4999f, 45.6f, 33.3999f)
                curveTo(45.1f, 33.6999f, 44.4f, 33.8999f, 43.8f, 33.9999f)
                curveTo(43.7f, 34.0999f, 36.3f, 33.9999f, 35.9f, 34.0999f)
                verticalLineTo(24.1999f)
                curveTo(36.5f, 24.1999f, 44.1f, 24.2999f, 44.4f, 24.0999f)
                curveTo(47.7f, 23.3999f, 46.9f, 19.3999f, 43.7f, 19.3999f)
                verticalLineTo(19.2999f)
                curveTo(46.7f, 18.9999f, 46.6f, 14.9999f, 43.6f, 14.8999f)
                curveTo(43.5f, 14.7999f, 36.3f, 14.8999f, 35.9f, 14.8999f)
                curveTo(36.0f, 11.5999f, 35.0f, 6.6999f, 39.1f, 5.2999f)
                curveTo(40.3f, 4.6999f, 46.8f, 5.0999f, 48.0f, 4.9999f)
                close()
            }
            path(fill = SolidColor(Color(0xFF006CB9)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(9.0f, 21.8f)
                verticalLineTo(9.8f)
                curveTo(9.0f, 7.7f, 10.4f, 5.8f, 12.3f, 5.2f)
                curveTo(13.3f, 4.7f, 19.8f, 5.0f, 21.0f, 5.0f)
                verticalLineTo(29.2f)
                curveTo(21.0f, 30.9f, 20.1f, 32.5f, 18.7f, 33.3f)
                curveTo(18.1f, 33.7f, 17.4f, 33.9f, 16.6f, 34.0f)
                curveTo(16.5f, 34.0f, 16.3f, 34.0f, 16.2f, 34.0f)
                curveTo(16.1f, 34.0f, 9.1f, 34.0f, 9.0f, 34.0f)
                verticalLineTo(23.8f)
                curveTo(11.0f, 24.3f, 13.0f, 24.5f, 15.0f, 24.4f)
                curveTo(21.7f, 24.1f, 19.7f, 19.5f, 20.0f, 14.9f)
                horizontalLineTo(15.8f)
                curveTo(15.4f, 18.5f, 17.5f, 24.1f, 11.4f, 22.7f)
                curveTo(10.6f, 22.5f, 9.8f, 22.2f, 9.0f, 21.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFFE10238)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(22.6f, 16.1f)
                lineTo(22.5f, 16.2f)
                curveTo(22.7f, 12.6f, 21.3f, 6.3f, 26.1f, 5.2f)
                curveTo(26.8f, 4.9f, 33.6f, 5.1f, 34.5f, 5.0f)
                verticalLineTo(29.2f)
                curveTo(34.5f, 30.9f, 33.5f, 32.6f, 32.0f, 33.4f)
                curveTo(31.4f, 33.7f, 30.8f, 33.9f, 30.1f, 34.0f)
                curveTo(30.0f, 34.0f, 29.8f, 34.0f, 29.7f, 34.0f)
                curveTo(29.6f, 34.0f, 22.6f, 34.0f, 22.5f, 34.0f)
                verticalLineTo(22.9f)
                curveTo(25.1f, 25.0f, 30.1f, 24.6f, 33.2f, 23.9f)
                verticalLineTo(21.9f)
                curveTo(30.1f, 23.6f, 24.7f, 23.8f, 25.3f, 18.9f)
                curveTo(26.0f, 15.3f, 30.7f, 16.1f, 33.2f, 17.4f)
                verticalLineTo(15.4f)
                curveTo(30.1f, 14.5f, 25.2f, 14.0f, 22.6f, 16.1f)
                close()
            }
        }
        .build()
        return _jcb!!
    }

private var _jcb: ImageVector? = null
