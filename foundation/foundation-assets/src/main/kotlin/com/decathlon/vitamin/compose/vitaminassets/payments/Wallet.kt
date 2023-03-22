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
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.vitaminassets.PaymentsGroup

public val PaymentsGroup.Wallet: ImageVector
    get() {
        if (_wallet != null) {
            return _wallet!!
        }
        _wallet = Builder(name = "Wallet", defaultWidth = 58.0.dp, defaultHeight = 40.0.dp,
                viewportWidth = 58.0f, viewportHeight = 40.0f).apply {
            group {
            }
            group {
                path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(0.0f, 0.0f)
                    horizontalLineToRelative(58.0f)
                    verticalLineToRelative(40.0f)
                    horizontalLineToRelative(-58.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFffffff)), stroke = SolidColor(Color(0xFFF3F3F3)),
                        strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(3.5614f, 0.5f)
                    horizontalLineTo(54.4386f)
                    curveTo(56.1256f, 0.5f, 57.5f, 1.8796f, 57.5f, 3.5897f)
                    verticalLineTo(36.4103f)
                    curveTo(57.5f, 38.1204f, 56.1256f, 39.5f, 54.4386f, 39.5f)
                    horizontalLineTo(3.5614f)
                    curveTo(1.8744f, 39.5f, 0.5f, 38.1204f, 0.5f, 36.4103f)
                    verticalLineTo(3.5897f)
                    curveTo(0.5f, 1.8796f, 1.8744f, 0.5f, 3.5614f, 0.5f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF9A4B21)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(47.0f, 8.0f)
                    horizontalLineTo(11.0f)
                    verticalLineTo(32.0f)
                    horizontalLineTo(47.0f)
                    verticalLineTo(8.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF673216)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(14.0f, 11.0f)
                    horizontalLineTo(15.0f)
                    verticalLineTo(11.9f)
                    horizontalLineTo(14.9375f)
                    verticalLineTo(12.0f)
                    horizontalLineTo(14.0f)
                    verticalLineTo(11.0f)
                    close()
                    moveTo(14.0f, 28.0f)
                    verticalLineTo(29.0f)
                    horizontalLineTo(15.0f)
                    verticalLineTo(28.1f)
                    horizontalLineTo(14.9375f)
                    verticalLineTo(28.0f)
                    horizontalLineTo(14.0f)
                    close()
                    moveTo(43.0f, 29.0f)
                    horizontalLineTo(44.0f)
                    verticalLineTo(28.0f)
                    horizontalLineTo(43.0625f)
                    verticalLineTo(28.1f)
                    horizontalLineTo(43.0f)
                    verticalLineTo(29.0f)
                    close()
                    moveTo(44.0f, 12.0f)
                    verticalLineTo(11.0f)
                    horizontalLineTo(43.0f)
                    verticalLineTo(11.9f)
                    horizontalLineTo(43.0625f)
                    verticalLineTo(12.0f)
                    horizontalLineTo(44.0f)
                    close()
                    moveTo(16.8125f, 11.0f)
                    verticalLineTo(12.0f)
                    horizontalLineTo(18.6875f)
                    verticalLineTo(11.0f)
                    horizontalLineTo(16.8125f)
                    close()
                    moveTo(20.5625f, 11.0f)
                    verticalLineTo(12.0f)
                    horizontalLineTo(22.4375f)
                    verticalLineTo(11.0f)
                    horizontalLineTo(20.5625f)
                    close()
                    moveTo(24.3125f, 11.0f)
                    verticalLineTo(12.0f)
                    horizontalLineTo(26.1875f)
                    verticalLineTo(11.0f)
                    horizontalLineTo(24.3125f)
                    close()
                    moveTo(28.0625f, 11.0f)
                    verticalLineTo(12.0f)
                    horizontalLineTo(29.9375f)
                    verticalLineTo(11.0f)
                    horizontalLineTo(28.0625f)
                    close()
                    moveTo(31.8125f, 11.0f)
                    verticalLineTo(12.0f)
                    horizontalLineTo(33.6875f)
                    verticalLineTo(11.0f)
                    horizontalLineTo(31.8125f)
                    close()
                    moveTo(35.5625f, 11.0f)
                    verticalLineTo(12.0f)
                    horizontalLineTo(37.4375f)
                    verticalLineTo(11.0f)
                    horizontalLineTo(35.5625f)
                    close()
                    moveTo(39.3125f, 11.0f)
                    verticalLineTo(12.0f)
                    horizontalLineTo(41.1875f)
                    verticalLineTo(11.0f)
                    horizontalLineTo(39.3125f)
                    close()
                    moveTo(44.0f, 13.7f)
                    horizontalLineTo(43.0f)
                    verticalLineTo(15.5f)
                    horizontalLineTo(44.0f)
                    verticalLineTo(13.7f)
                    close()
                    moveTo(44.0f, 17.3f)
                    horizontalLineTo(43.0f)
                    verticalLineTo(19.1f)
                    horizontalLineTo(44.0f)
                    verticalLineTo(17.3f)
                    close()
                    moveTo(44.0f, 20.9f)
                    horizontalLineTo(43.0f)
                    verticalLineTo(22.7f)
                    horizontalLineTo(44.0f)
                    verticalLineTo(20.9f)
                    close()
                    moveTo(44.0f, 24.5f)
                    horizontalLineTo(43.0f)
                    verticalLineTo(26.3f)
                    horizontalLineTo(44.0f)
                    verticalLineTo(24.5f)
                    close()
                    moveTo(41.1875f, 29.0f)
                    verticalLineTo(28.0f)
                    horizontalLineTo(39.3125f)
                    verticalLineTo(29.0f)
                    horizontalLineTo(41.1875f)
                    close()
                    moveTo(37.4375f, 29.0f)
                    verticalLineTo(28.0f)
                    horizontalLineTo(35.5625f)
                    verticalLineTo(29.0f)
                    horizontalLineTo(37.4375f)
                    close()
                    moveTo(33.6875f, 29.0f)
                    verticalLineTo(28.0f)
                    horizontalLineTo(31.8125f)
                    verticalLineTo(29.0f)
                    horizontalLineTo(33.6875f)
                    close()
                    moveTo(29.9375f, 29.0f)
                    verticalLineTo(28.0f)
                    horizontalLineTo(28.0625f)
                    verticalLineTo(29.0f)
                    horizontalLineTo(29.9375f)
                    close()
                    moveTo(26.1875f, 29.0f)
                    verticalLineTo(28.0f)
                    horizontalLineTo(24.3125f)
                    verticalLineTo(29.0f)
                    horizontalLineTo(26.1875f)
                    close()
                    moveTo(22.4375f, 29.0f)
                    verticalLineTo(28.0f)
                    horizontalLineTo(20.5625f)
                    verticalLineTo(29.0f)
                    horizontalLineTo(22.4375f)
                    close()
                    moveTo(18.6875f, 29.0f)
                    verticalLineTo(28.0f)
                    horizontalLineTo(16.8125f)
                    verticalLineTo(29.0f)
                    horizontalLineTo(18.6875f)
                    close()
                    moveTo(14.0f, 26.3f)
                    horizontalLineTo(15.0f)
                    verticalLineTo(24.5f)
                    horizontalLineTo(14.0f)
                    verticalLineTo(26.3f)
                    close()
                    moveTo(14.0f, 22.7f)
                    horizontalLineTo(15.0f)
                    verticalLineTo(20.9f)
                    horizontalLineTo(14.0f)
                    verticalLineTo(22.7f)
                    close()
                    moveTo(14.0f, 19.1f)
                    horizontalLineTo(15.0f)
                    verticalLineTo(17.3f)
                    horizontalLineTo(14.0f)
                    verticalLineTo(19.1f)
                    close()
                    moveTo(14.0f, 15.5f)
                    horizontalLineTo(15.0f)
                    verticalLineTo(13.7f)
                    horizontalLineTo(14.0f)
                    verticalLineTo(15.5f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF673216)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(22.0f, 16.0f)
                    horizontalLineTo(8.0f)
                    verticalLineTo(24.0f)
                    horizontalLineTo(22.0f)
                    verticalLineTo(16.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFEA28)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(18.0f, 22.0f)
                    curveTo(19.1046f, 22.0f, 20.0f, 21.1046f, 20.0f, 20.0f)
                    curveTo(20.0f, 18.8954f, 19.1046f, 18.0f, 18.0f, 18.0f)
                    curveTo(16.8954f, 18.0f, 16.0f, 18.8954f, 16.0f, 20.0f)
                    curveTo(16.0f, 21.1046f, 16.8954f, 22.0f, 18.0f, 22.0f)
                    close()
                }
            }
        }
        .build()
        return _wallet!!
    }

private var _wallet: ImageVector? = null
