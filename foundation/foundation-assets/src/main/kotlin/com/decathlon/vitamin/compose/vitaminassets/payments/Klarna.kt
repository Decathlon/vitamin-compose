package com.decathlon.vitamin.compose.vitaminassets.payments

import androidx.compose.ui.graphics.Color
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

public val PaymentsGroup.Klarna: ImageVector
    get() {
        if (_klarna != null) {
            return _klarna!!
        }
        _klarna = Builder(name = "Klarna", defaultWidth = 58.0.dp, defaultHeight = 40.0.dp,
                viewportWidth = 58.0f, viewportHeight = 40.0f).apply {
            path(fill = SolidColor(Color(0xFFF4B6C7)), stroke = SolidColor(Color(0xFFF3F3F3)),
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
            path(fill = SolidColor(Color(0xFF17120F)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(7.413f, 25.7963f)
                horizontalLineTo(5.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(7.413f)
                verticalLineTo(25.7963f)
                close()
                moveTo(13.4398f, 15.0f)
                horizontalLineTo(11.0784f)
                curveTo(11.0784f, 16.9868f, 10.1885f, 18.8104f, 8.6371f, 20.0034f)
                lineTo(7.7016f, 20.7226f)
                lineTo(11.3264f, 25.7967f)
                horizontalLineTo(14.3068f)
                lineTo(10.9714f, 21.1277f)
                curveTo(12.5525f, 19.5116f, 13.4398f, 17.3373f, 13.4398f, 15.0f)
                close()
                moveTo(17.289f, 25.7933f)
                horizontalLineTo(15.0102f)
                verticalLineTo(15.0021f)
                horizontalLineTo(17.289f)
                verticalLineTo(25.7933f)
                close()
                moveTo(24.1766f, 18.3286f)
                verticalLineTo(18.8061f)
                curveTo(23.5616f, 18.3754f, 22.8192f, 18.1223f, 22.0185f, 18.1223f)
                curveTo(19.8993f, 18.1223f, 18.1815f, 19.8857f, 18.1815f, 22.0611f)
                curveTo(18.1815f, 24.2365f, 19.8993f, 26.0f, 22.0185f, 26.0f)
                curveTo(22.8192f, 26.0f, 23.5616f, 25.7469f, 24.1766f, 25.3163f)
                verticalLineTo(25.7933f)
                horizontalLineTo(26.3539f)
                verticalLineTo(18.3286f)
                horizontalLineTo(24.1766f)
                close()
                moveTo(24.1694f, 22.0611f)
                curveTo(24.1694f, 23.1218f, 23.2861f, 23.9818f, 22.1966f, 23.9818f)
                curveTo(21.1071f, 23.9818f, 20.2238f, 23.1218f, 20.2238f, 22.0611f)
                curveTo(20.2238f, 21.0004f, 21.1071f, 20.1407f, 22.1966f, 20.1407f)
                curveTo(23.2861f, 20.1407f, 24.1694f, 21.0004f, 24.1694f, 22.0611f)
                close()
                moveTo(47.1454f, 18.8061f)
                verticalLineTo(18.3286f)
                horizontalLineTo(49.3226f)
                verticalLineTo(25.7933f)
                horizontalLineTo(47.1454f)
                verticalLineTo(25.3163f)
                curveTo(46.5304f, 25.7469f, 45.788f, 26.0f, 44.9872f, 26.0f)
                curveTo(42.868f, 26.0f, 41.1502f, 24.2365f, 41.1502f, 22.0611f)
                curveTo(41.1502f, 19.8857f, 42.868f, 18.1223f, 44.9872f, 18.1223f)
                curveTo(45.788f, 18.1223f, 46.5304f, 18.3754f, 47.1454f, 18.8061f)
                close()
                moveTo(45.1654f, 23.9818f)
                curveTo(46.255f, 23.9818f, 47.1381f, 23.1218f, 47.1381f, 22.0611f)
                curveTo(47.1381f, 21.0004f, 46.255f, 20.1407f, 45.1654f, 20.1407f)
                curveTo(44.0758f, 20.1407f, 43.1926f, 21.0004f, 43.1926f, 22.0611f)
                curveTo(43.1926f, 23.1218f, 44.0758f, 23.9818f, 45.1654f, 23.9818f)
                close()
                moveTo(50.2675f, 24.5482f)
                curveTo(50.2675f, 23.7736f, 50.8792f, 23.1457f, 51.6337f, 23.1457f)
                curveTo(52.3882f, 23.1457f, 53.0f, 23.7736f, 53.0f, 24.5482f)
                curveTo(53.0f, 25.3227f, 52.3882f, 25.9507f, 51.6337f, 25.9507f)
                curveTo(50.8792f, 25.9507f, 50.2675f, 25.3227f, 50.2675f, 24.5482f)
                close()
                moveTo(37.2814f, 18.1278f)
                curveTo(36.4117f, 18.1278f, 35.5887f, 18.405f, 35.0384f, 19.1697f)
                verticalLineTo(18.329f)
                horizontalLineTo(32.8706f)
                verticalLineTo(25.7933f)
                horizontalLineTo(35.065f)
                verticalLineTo(21.8706f)
                curveTo(35.065f, 20.7354f, 35.8065f, 20.1796f, 36.6993f, 20.1796f)
                curveTo(37.6562f, 20.1796f, 38.2063f, 20.7663f, 38.2063f, 21.8551f)
                verticalLineTo(25.7933f)
                horizontalLineTo(40.3809f)
                verticalLineTo(21.0463f)
                curveTo(40.3809f, 19.3092f, 39.0354f, 18.1278f, 37.2814f, 18.1278f)
                close()
                moveTo(29.7219f, 18.3287f)
                verticalLineTo(19.3009f)
                curveTo(30.1583f, 18.7177f, 30.9715f, 18.3291f, 31.8557f, 18.3291f)
                verticalLineTo(20.5013f)
                lineTo(31.8487f, 20.501f)
                lineTo(31.8435f, 20.5008f)
                lineTo(31.8379f, 20.5005f)
                lineTo(31.8298f, 20.5003f)
                curveTo(30.9684f, 20.5003f, 29.7269f, 21.1323f, 29.7269f, 22.3082f)
                verticalLineTo(25.7933f)
                horizontalLineTo(27.4928f)
                verticalLineTo(18.3287f)
                horizontalLineTo(29.7219f)
                close()
            }
        }
        .build()
        return _klarna!!
    }

private var _klarna: ImageVector? = null
