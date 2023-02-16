package com.decathlon.vitamin.compose.vitaminassets.payments

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
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.vitaminassets.PaymentsGroup

public val PaymentsGroup.Mastercard: ImageVector
    get() {
        if (_mastercard != null) {
            return _mastercard!!
        }
        _mastercard = Builder(name = "Mastercard", defaultWidth = 58.0.dp, defaultHeight = 40.0.dp,
                viewportWidth = 58.0f, viewportHeight = 40.0f).apply {
            path(fill = SolidColor(Color(0xFFffffff)), stroke = SolidColor(Color(0xFFF3F3F3)),
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
            path(fill = SolidColor(Color(0xFFFF5F00)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(34.3102f, 28.9765f)
                horizontalLineTo(23.9591f)
                verticalLineTo(10.5122f)
                horizontalLineTo(34.3102f)
                verticalLineTo(28.9765f)
                close()
            }
            path(fill = SolidColor(Color(0xFFEB001B)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.6223f, 19.7429f)
                curveTo(24.6223f, 15.9973f, 26.3891f, 12.6608f, 29.1406f, 10.5107f)
                curveTo(27.1285f, 8.9384f, 24.5892f, 8.0f, 21.8294f, 8.0f)
                curveTo(15.2961f, 8.0f, 10.0f, 13.2574f, 10.0f, 19.7429f)
                curveTo(10.0f, 26.2283f, 15.2961f, 31.4857f, 21.8294f, 31.4857f)
                curveTo(24.5892f, 31.4857f, 27.1285f, 30.5473f, 29.1406f, 28.975f)
                curveTo(26.3891f, 26.8249f, 24.6223f, 23.4884f, 24.6223f, 19.7429f)
                close()
            }
            path(fill = SolidColor(Color(0xFFF79E1B)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(48.2706f, 19.7429f)
                curveTo(48.2706f, 26.2283f, 42.9745f, 31.4857f, 36.4412f, 31.4857f)
                curveTo(33.6814f, 31.4857f, 31.1421f, 30.5473f, 29.1293f, 28.975f)
                curveTo(31.8815f, 26.8249f, 33.6483f, 23.4884f, 33.6483f, 19.7429f)
                curveTo(33.6483f, 15.9973f, 31.8815f, 12.6608f, 29.1293f, 10.5107f)
                curveTo(31.1421f, 8.9384f, 33.6814f, 8.0f, 36.4412f, 8.0f)
                curveTo(42.9745f, 8.0f, 48.2706f, 13.2574f, 48.2706f, 19.7429f)
                close()
            }
        }
        .build()
        return _mastercard!!
    }

private var _mastercard: ImageVector? = null
