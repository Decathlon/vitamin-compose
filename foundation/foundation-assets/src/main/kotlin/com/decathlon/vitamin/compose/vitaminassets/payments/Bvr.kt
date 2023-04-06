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

public val PaymentsGroup.Bvr: ImageVector
    get() {
        if (_bvr != null) {
            return _bvr!!
        }
        _bvr = Builder(name = "Bvr", defaultWidth = 58.0.dp, defaultHeight = 40.0.dp, viewportWidth
                = 58.0f, viewportHeight = 40.0f).apply {
            path(fill = SolidColor(Color(0xFFFAD6D7)), stroke = SolidColor(Color(0xFFF3F3F3)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.0f, 0.5f)
                lineTo(54.0f, 0.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 57.5f, 4.0f)
                lineTo(57.5f, 36.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 54.0f, 39.5f)
                lineTo(4.0f, 39.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 0.5f, 36.0f)
                lineTo(0.5f, 4.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 4.0f, 0.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFFD17272)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(24.192f, 17.8f)
                horizontalLineTo(38.304f)
                verticalLineTo(18.8f)
                horizontalLineTo(24.192f)
                verticalLineTo(17.8f)
                close()
                moveTo(24.192f, 20.8f)
                horizontalLineTo(53.76f)
                verticalLineTo(21.8f)
                horizontalLineTo(24.192f)
                verticalLineTo(20.8f)
                close()
                moveTo(53.76f, 23.8f)
                horizontalLineTo(24.192f)
                verticalLineTo(24.8f)
                horizontalLineTo(53.76f)
                verticalLineTo(23.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFF666666)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(21.504f, 2.344f)
                horizontalLineTo(22.504f)
                verticalLineTo(3.0f)
                horizontalLineTo(30.912f)
                verticalLineTo(4.0f)
                horizontalLineTo(22.504f)
                verticalLineTo(5.0f)
                horizontalLineTo(34.272f)
                verticalLineTo(6.0f)
                horizontalLineTo(22.504f)
                verticalLineTo(7.0f)
                horizontalLineTo(28.896f)
                verticalLineTo(8.0f)
                horizontalLineTo(22.504f)
                verticalLineTo(9.0f)
                horizontalLineTo(28.896f)
                verticalLineTo(10.0f)
                horizontalLineTo(22.504f)
                verticalLineTo(11.752f)
                horizontalLineTo(44.352f)
                verticalLineTo(10.0f)
                horizontalLineTo(43.504f)
                verticalLineTo(9.0f)
                horizontalLineTo(44.352f)
                verticalLineTo(7.0f)
                horizontalLineTo(43.504f)
                verticalLineTo(6.0f)
                horizontalLineTo(44.352f)
                verticalLineTo(4.0f)
                horizontalLineTo(43.504f)
                verticalLineTo(3.0f)
                horizontalLineTo(44.352f)
                verticalLineTo(2.344f)
                horizontalLineTo(45.352f)
                verticalLineTo(3.0f)
                horizontalLineTo(57.616f)
                verticalLineTo(4.0f)
                horizontalLineTo(45.352f)
                verticalLineTo(6.0f)
                horizontalLineTo(52.24f)
                verticalLineTo(7.0f)
                horizontalLineTo(45.352f)
                verticalLineTo(9.0f)
                horizontalLineTo(49.552f)
                verticalLineTo(10.0f)
                horizontalLineTo(45.352f)
                verticalLineTo(11.752f)
                horizontalLineTo(55.776f)
                verticalLineTo(12.752f)
                horizontalLineTo(22.504f)
                verticalLineTo(17.0f)
                horizontalLineTo(38.504f)
                verticalLineTo(18.0f)
                horizontalLineTo(22.504f)
                verticalLineTo(30.0f)
                horizontalLineTo(24.504f)
                verticalLineTo(31.0f)
                horizontalLineTo(22.504f)
                verticalLineTo(32.584f)
                horizontalLineTo(21.504f)
                verticalLineTo(31.0f)
                verticalLineTo(30.0f)
                verticalLineTo(18.0f)
                verticalLineTo(17.0f)
                verticalLineTo(12.752f)
                verticalLineTo(11.752f)
                verticalLineTo(10.0f)
                verticalLineTo(9.0f)
                verticalLineTo(8.0f)
                verticalLineTo(7.0f)
                verticalLineTo(6.0f)
                verticalLineTo(5.0f)
                verticalLineTo(4.0f)
                verticalLineTo(3.0f)
                verticalLineTo(2.344f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 21.0f)
                horizontalLineToRelative(17.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-17.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFD17272)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(55.0f, 7.0f)
                curveTo(55.0f, 4.7909f, 53.2091f, 3.0f, 51.0f, 3.0f)
                curveTo(48.7909f, 3.0f, 47.0f, 4.7909f, 47.0f, 7.0f)
                curveTo(47.0f, 9.2091f, 48.7909f, 11.0f, 51.0f, 11.0f)
                curveTo(53.2091f, 11.0f, 55.0f, 9.2091f, 55.0f, 7.0f)
                close()
                moveTo(47.6667f, 7.0f)
                curveTo(47.6667f, 5.159f, 49.1591f, 3.6667f, 51.0f, 3.6667f)
                curveTo(52.8409f, 3.6667f, 54.3333f, 5.159f, 54.3333f, 7.0f)
                curveTo(54.3333f, 8.841f, 52.8409f, 10.3333f, 51.0f, 10.3333f)
                curveTo(49.1591f, 10.3333f, 47.6667f, 8.841f, 47.6667f, 7.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.0f, 34.0f)
                horizontalLineTo(57.0f)
                verticalLineTo(36.0f)
                curveTo(57.0f, 37.6569f, 55.6569f, 39.0f, 54.0f, 39.0f)
                horizontalLineTo(4.0f)
                curveTo(2.3431f, 39.0f, 1.0f, 37.6569f, 1.0f, 36.0f)
                verticalLineTo(34.0f)
                close()
            }
        }
        .build()
        return _bvr!!
    }

private var _bvr: ImageVector? = null
