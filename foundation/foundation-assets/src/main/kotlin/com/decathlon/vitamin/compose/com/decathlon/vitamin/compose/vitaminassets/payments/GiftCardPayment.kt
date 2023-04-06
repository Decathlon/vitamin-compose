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

public val PaymentsGroup.GiftCardPayment: ImageVector
    get() {
        if (_giftCardPayment != null) {
            return _giftCardPayment!!
        }
        _giftCardPayment = Builder(name = "GiftCardPayment", defaultWidth = 58.0.dp, defaultHeight =
                40.0.dp, viewportWidth = 58.0f, viewportHeight = 40.0f).apply {
            group {
            }
            group {
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = SolidColor(Color(0xFFF3F3F3)),
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
                path(fill = SolidColor(Color(0xFFE7F3F9)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(46.0f, 8.0f)
                    horizontalLineTo(12.0f)
                    verticalLineTo(32.0f)
                    horizontalLineTo(46.0f)
                    verticalLineTo(8.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF00689D)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(25.0f, 8.0f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(17.7639f)
                    curveTo(23.4692f, 17.2889f, 22.7684f, 17.0f, 22.0f, 17.0f)
                    curveTo(20.3431f, 17.0f, 19.0f, 18.3431f, 19.0f, 20.0f)
                    curveTo(19.0f, 20.7684f, 19.2889f, 21.4692f, 19.7639f, 22.0f)
                    horizontalLineTo(12.0f)
                    verticalLineTo(23.0f)
                    horizontalLineTo(22.0f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(32.0f)
                    horizontalLineTo(25.0f)
                    verticalLineTo(23.0f)
                    horizontalLineTo(26.5f)
                    horizontalLineTo(46.0f)
                    verticalLineTo(22.0f)
                    horizontalLineTo(28.5002f)
                    curveTo(28.814f, 21.5822f, 29.0f, 21.0628f, 29.0f, 20.5f)
                    curveTo(29.0f, 19.1193f, 27.8807f, 18.0f, 26.5f, 18.0f)
                    curveTo(25.9372f, 18.0f, 25.4178f, 18.186f, 25.0f, 18.4998f)
                    verticalLineTo(8.0f)
                    close()
                    moveTo(25.0f, 20.5f)
                    verticalLineTo(22.0f)
                    horizontalLineTo(26.5f)
                    curveTo(27.3284f, 22.0f, 28.0f, 21.3284f, 28.0f, 20.5f)
                    curveTo(28.0f, 19.6716f, 27.3284f, 19.0f, 26.5f, 19.0f)
                    curveTo(25.6716f, 19.0f, 25.0f, 19.6716f, 25.0f, 20.5f)
                    close()
                    moveTo(24.0f, 20.5f)
                    verticalLineTo(20.0f)
                    curveTo(24.0f, 18.8954f, 23.1046f, 18.0f, 22.0f, 18.0f)
                    curveTo(20.8954f, 18.0f, 20.0f, 18.8954f, 20.0f, 20.0f)
                    curveTo(20.0f, 21.1046f, 20.8954f, 22.0f, 22.0f, 22.0f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(20.5f)
                    close()
                }
            }
        }
        .build()
        return _giftCardPayment!!
    }

private var _giftCardPayment: ImageVector? = null
