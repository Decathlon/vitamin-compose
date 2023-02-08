package com.decathlon.vitamin.compose.vitaminicons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.vitaminicons.FillGroup

public val FillGroup.Run: ImageVector
    get() {
        if (_run != null) {
            return _run!!
        }
        _run = Builder(name = "Run", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.8299f, 8.79f)
                lineTo(7.9999f, 9.456f)
                verticalLineTo(13.0f)
                horizontalLineTo(5.9999f)
                verticalLineTo(8.05f)
                horizontalLineTo(6.0149f)
                lineTo(11.2829f, 6.132f)
                curveTo(11.5269f, 6.039f, 11.7929f, 5.992f, 12.0649f, 6.001f)
                curveTo(12.6084f, 6.0146f, 13.1342f, 6.1971f, 13.5691f, 6.5233f)
                curveTo(14.0041f, 6.8495f, 14.3266f, 7.3031f, 14.4919f, 7.821f)
                curveTo(14.6779f, 8.404f, 14.8479f, 8.798f, 15.0019f, 9.003f)
                curveTo(15.4673f, 9.6236f, 16.071f, 10.1272f, 16.7649f, 10.4739f)
                curveTo(17.4589f, 10.8205f, 18.2241f, 11.0007f, 18.9999f, 11.0f)
                verticalLineTo(13.0f)
                curveTo(17.9672f, 13.0011f, 16.9471f, 12.7733f, 16.013f, 12.3329f)
                curveTo(15.0789f, 11.8925f, 14.2541f, 11.2504f, 13.5979f, 10.453f)
                lineTo(12.9009f, 14.409f)
                lineTo(14.9999f, 16.17f)
                verticalLineTo(23.0f)
                horizontalLineTo(12.9999f)
                verticalLineTo(17.102f)
                lineTo(10.7299f, 15.198f)
                lineTo(10.0029f, 19.325f)
                lineTo(3.1089f, 18.11f)
                lineTo(3.4569f, 16.14f)
                lineTo(8.3809f, 17.008f)
                lineTo(9.8299f, 8.79f)
                close()
                moveTo(13.4999f, 5.5f)
                curveTo(12.9695f, 5.5f, 12.4607f, 5.2893f, 12.0857f, 4.9142f)
                curveTo(11.7106f, 4.5391f, 11.4999f, 4.0304f, 11.4999f, 3.5f)
                curveTo(11.4999f, 2.9696f, 11.7106f, 2.4609f, 12.0857f, 2.0858f)
                curveTo(12.4607f, 1.7107f, 12.9695f, 1.5f, 13.4999f, 1.5f)
                curveTo(14.0303f, 1.5f, 14.539f, 1.7107f, 14.9141f, 2.0858f)
                curveTo(15.2892f, 2.4609f, 15.4999f, 2.9696f, 15.4999f, 3.5f)
                curveTo(15.4999f, 4.0304f, 15.2892f, 4.5391f, 14.9141f, 4.9142f)
                curveTo(14.539f, 5.2893f, 14.0303f, 5.5f, 13.4999f, 5.5f)
                close()
            }
        }
        .build()
        return _run!!
    }

private var _run: ImageVector? = null
