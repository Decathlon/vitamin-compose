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

public val PaymentsGroup.Ideal: ImageVector
    get() {
        if (_ideal != null) {
            return _ideal!!
        }
        _ideal = Builder(name = "Ideal", defaultWidth = 58.0.dp, defaultHeight = 40.0.dp,
                viewportWidth = 58.0f, viewportHeight = 40.0f).apply {
            path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = SolidColor(Color(0xFFF3F3F3)),
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
            path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.7f, 3.6999f)
                verticalLineTo(36.15f)
                horizontalLineTo(29.6f)
                curveTo(42.1f, 36.15f, 47.5f, 29.15f, 47.5f, 19.9f)
                curveTo(47.5f, 10.65f, 42.0f, 3.6999f, 29.6f, 3.6999f)
                horizontalLineTo(10.7f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(29.6f, 5.75f)
                horizontalLineTo(12.75f)
                verticalLineTo(34.1f)
                horizontalLineTo(29.6f)
                curveTo(39.3f, 34.1f, 45.45f, 29.35f, 45.45f, 19.9f)
                curveTo(45.45f, 12.0f, 41.05f, 5.75f, 29.6f, 5.75f)
                close()
                moveTo(14.35f, 32.5f)
                verticalLineTo(7.45f)
                horizontalLineTo(29.6f)
                curveTo(38.4f, 7.45f, 43.8f, 11.45f, 43.8f, 19.95f)
                curveTo(43.8f, 28.2f, 38.8f, 32.5f, 29.6f, 32.5f)
                horizontalLineTo(14.35f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.4f, 21.7f)
                horizontalLineTo(21.3f)
                verticalLineTo(30.4f)
                horizontalLineTo(16.4f)
                verticalLineTo(21.7f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.85f, 20.4f)
                curveTo(20.5345f, 20.4f, 21.9f, 19.0345f, 21.9f, 17.35f)
                curveTo(21.9f, 15.6656f, 20.5345f, 14.3f, 18.85f, 14.3f)
                curveTo(17.1655f, 14.3f, 15.8f, 15.6656f, 15.8f, 17.35f)
                curveTo(15.8f, 19.0345f, 17.1655f, 20.4f, 18.85f, 20.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFFD50072)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(38.25f, 14.55f)
                horizontalLineTo(39.65f)
                verticalLineTo(18.75f)
                horizontalLineTo(41.7f)
                curveTo(41.15f, 11.1f, 35.1f, 9.4f, 29.6f, 9.4f)
                horizontalLineTo(23.75f)
                verticalLineTo(14.55f)
                horizontalLineTo(24.6f)
                curveTo(26.2f, 14.55f, 27.15f, 15.6f, 27.15f, 17.35f)
                curveTo(27.15f, 19.1f, 26.2f, 20.15f, 24.65f, 20.15f)
                horizontalLineTo(23.75f)
                verticalLineTo(30.4f)
                horizontalLineTo(29.6f)
                curveTo(38.55f, 30.4f, 41.6f, 26.25f, 41.75f, 20.15f)
                horizontalLineTo(38.25f)
                verticalLineTo(14.55f)
                close()
                moveTo(31.5f, 18.75f)
                verticalLineTo(20.15f)
                horizontalLineTo(28.0f)
                verticalLineTo(14.55f)
                horizontalLineTo(31.4f)
                verticalLineTo(15.95f)
                horizontalLineTo(29.4f)
                verticalLineTo(16.6f)
                horizontalLineTo(31.3f)
                verticalLineTo(18.0f)
                horizontalLineTo(29.45f)
                verticalLineTo(18.75f)
                horizontalLineTo(31.5f)
                close()
                moveTo(33.8f, 14.55f)
                horizontalLineTo(35.8f)
                lineTo(37.5f, 20.15f)
                horizontalLineTo(36.05f)
                lineTo(35.75f, 19.1f)
                horizontalLineTo(33.9f)
                lineTo(33.6f, 20.15f)
                horizontalLineTo(32.1f)
                lineTo(33.8f, 14.55f)
                close()
                moveTo(34.3156f, 17.65f)
                horizontalLineTo(34.3f)
                verticalLineTo(17.7f)
                lineTo(34.3156f, 17.65f)
                close()
                moveTo(34.3156f, 17.65f)
                horizontalLineTo(35.3f)
                lineTo(34.85f, 16.1f)
                horizontalLineTo(34.8f)
                lineTo(34.3156f, 17.65f)
                close()
                moveTo(23.75f, 18.75f)
                verticalLineTo(15.95f)
                horizontalLineTo(24.6f)
                curveTo(25.15f, 15.95f, 25.75f, 16.1f, 25.75f, 17.35f)
                curveTo(25.75f, 18.6f, 25.2f, 18.75f, 24.6f, 18.75f)
                horizontalLineTo(23.75f)
                close()
            }
        }
        .build()
        return _ideal!!
    }

private var _ideal: ImageVector? = null
