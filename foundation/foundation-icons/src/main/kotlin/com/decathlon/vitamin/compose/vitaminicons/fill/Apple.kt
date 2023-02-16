package com.decathlon.vitamin.compose.vitaminicons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.vitaminicons.FillGroup

public val FillGroup.Apple: ImageVector
    get() {
        if (_apple != null) {
            return _apple!!
        }
        _apple = Builder(name = "Apple", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(10.5973f, 0.5667f)
                curveTo(10.6933f, 1.4307f, 10.3493f, 2.3027f, 9.8293f, 2.9267f)
                curveTo(9.3093f, 3.5507f, 8.4613f, 4.0387f, 7.6373f, 3.9747f)
                curveTo(7.5253f, 3.1267f, 7.9413f, 2.2387f, 8.4213f, 1.6867f)
                curveTo(8.9573f, 1.0627f, 9.8533f, 0.5987f, 10.5973f, 0.5667f)
                close()
                moveTo(6.836f, 4.5523f)
                curveTo(7.1855f, 4.691f, 7.4972f, 4.8147f, 7.7492f, 4.8147f)
                curveTo(7.9707f, 4.8147f, 8.2596f, 4.7011f, 8.6013f, 4.5668f)
                curveTo(9.1484f, 4.3518f, 9.8309f, 4.0836f, 10.5893f, 4.1427f)
                curveTo(11.0613f, 4.1747f, 12.4133f, 4.3187f, 13.2933f, 5.6067f)
                curveTo(13.2213f, 5.6467f, 11.6773f, 6.5427f, 11.6933f, 8.4147f)
                curveTo(11.7173f, 10.6547f, 13.6533f, 11.3987f, 13.6773f, 11.4067f)
                curveTo(13.6613f, 11.4627f, 13.3653f, 12.4707f, 12.6533f, 13.5107f)
                curveTo(12.0373f, 14.4147f, 11.3973f, 15.3107f, 10.3893f, 15.3267f)
                curveTo(9.9024f, 15.3385f, 9.5774f, 15.198f, 9.2394f, 15.0519f)
                curveTo(8.8886f, 14.9004f, 8.5237f, 14.7427f, 7.9493f, 14.7427f)
                curveTo(7.3389f, 14.7427f, 6.9548f, 14.9067f, 6.5849f, 15.0646f)
                curveTo(6.2664f, 15.2006f, 5.9583f, 15.3322f, 5.5252f, 15.3507f)
                curveTo(4.5493f, 15.3827f, 3.8133f, 14.3747f, 3.1892f, 13.4787f)
                curveTo(1.9173f, 11.6387f, 0.9493f, 8.2947f, 2.2532f, 6.0307f)
                curveTo(2.9012f, 4.9027f, 4.0532f, 4.1907f, 5.3092f, 4.1747f)
                curveTo(5.8503f, 4.161f, 6.3759f, 4.3696f, 6.836f, 4.5523f)
                close()
            }
        }
        .build()
        return _apple!!
    }

private var _apple: ImageVector? = null
