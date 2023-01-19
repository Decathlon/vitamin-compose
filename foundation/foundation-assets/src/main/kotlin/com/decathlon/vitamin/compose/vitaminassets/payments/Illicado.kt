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

public val PaymentsGroup.Illicado: ImageVector
    get() {
        if (_illicado != null) {
            return _illicado!!
        }
        _illicado = Builder(name = "Illicado", defaultWidth = 58.0.dp, defaultHeight = 40.0.dp,
                viewportWidth = 58.0f, viewportHeight = 40.0f).apply {
            path(fill = SolidColor(Color(0xFFffffff)), stroke = SolidColor(Color(0xFFF1F1F1)),
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
            path(fill = SolidColor(Color(0xFF0D0E12)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(32.7879f, 20.6816f)
                curveTo(32.4545f, 20.5908f, 32.0909f, 20.5606f, 31.7273f, 20.5908f)
                curveTo(30.4848f, 20.6816f, 29.6667f, 21.7106f, 29.8485f, 22.9211f)
                curveTo(29.9394f, 23.7684f, 30.9394f, 24.4948f, 31.8485f, 24.3737f)
                curveTo(33.0606f, 24.2224f, 33.697f, 23.5869f, 33.697f, 22.4974f)
                curveTo(33.697f, 22.1342f, 33.6667f, 21.8619f, 33.6061f, 21.5592f)
                curveTo(33.4848f, 21.1053f, 33.2424f, 20.8027f, 32.7879f, 20.6816f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0D0E12)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(39.0606f, 20.5606f)
                curveTo(38.7576f, 20.5303f, 38.4546f, 20.5303f, 38.1515f, 20.6211f)
                curveTo(37.697f, 20.7724f, 37.394f, 21.0448f, 37.1818f, 21.4685f)
                curveTo(37.0f, 21.8316f, 36.9697f, 22.2251f, 36.9697f, 22.6487f)
                curveTo(36.9697f, 23.4356f, 37.4849f, 24.1014f, 38.2122f, 24.2224f)
                curveTo(39.0606f, 24.3132f, 39.8485f, 23.829f, 40.0606f, 23.0422f)
                curveTo(40.1212f, 22.8303f, 40.1212f, 22.6185f, 40.1212f, 22.4066f)
                curveTo(40.1212f, 22.0132f, 40.0909f, 21.6501f, 39.9697f, 21.3172f)
                curveTo(39.8182f, 20.8935f, 39.5152f, 20.6211f, 39.0606f, 20.5606f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0D0E12)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(46.2424f, 20.6211f)
                curveTo(44.8788f, 20.1066f, 43.4849f, 21.0145f, 43.4849f, 22.4974f)
                curveTo(43.4849f, 23.5566f, 44.2727f, 24.3737f, 45.303f, 24.3737f)
                curveTo(46.5455f, 24.3737f, 47.3333f, 23.6172f, 47.3333f, 22.4066f)
                curveTo(47.303f, 22.3461f, 47.303f, 22.2251f, 47.303f, 22.1343f)
                curveTo(47.2121f, 21.4685f, 46.9394f, 20.8935f, 46.2424f, 20.6211f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0D0E12)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(53.7273f, 18.8052f)
                curveTo(53.3636f, 16.2934f, 52.2424f, 14.1447f, 50.4243f, 12.3894f)
                curveTo(48.2424f, 10.3315f, 45.6667f, 9.2421f, 42.6667f, 9.2421f)
                curveTo(33.4849f, 9.2421f, 24.2727f, 9.2421f, 15.1212f, 9.2421f)
                curveTo(14.6667f, 9.2421f, 14.2121f, 9.3026f, 13.7879f, 9.3329f)
                curveTo(10.7879f, 9.8171f, 8.3637f, 11.2092f, 6.5152f, 13.6f)
                curveTo(4.9697f, 15.5973f, 4.1818f, 17.8671f, 4.1818f, 20.3789f)
                curveTo(4.1818f, 24.071f, 4.1818f, 27.7631f, 4.1818f, 31.4552f)
                curveTo(4.1818f, 31.7881f, 4.1212f, 31.7579f, 4.4849f, 31.7579f)
                curveTo(10.9697f, 31.7579f, 17.4243f, 31.7579f, 23.8788f, 31.7579f)
                curveTo(30.1212f, 31.7579f, 36.394f, 31.7579f, 42.6061f, 31.7579f)
                curveTo(44.4849f, 31.7579f, 46.303f, 31.3039f, 47.9697f, 30.4263f)
                curveTo(51.9697f, 28.1868f, 54.4546f, 23.7684f, 53.7273f, 18.8052f)
                close()
            }
            path(fill = SolidColor(Color(0xFFEF5CA0)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.697f, 25.3118f)
                curveTo(13.2424f, 25.3723f, 12.9697f, 25.1605f, 12.8485f, 24.7368f)
                curveTo(12.6364f, 24.0407f, 12.6061f, 23.3144f, 12.5455f, 22.5881f)
                curveTo(12.4849f, 21.9526f, 12.4849f, 21.3473f, 12.4849f, 20.7118f)
                curveTo(12.4849f, 18.9868f, 12.5455f, 17.2921f, 12.8485f, 15.5973f)
                curveTo(12.8788f, 15.446f, 12.9091f, 15.2947f, 12.9697f, 15.1434f)
                curveTo(13.1212f, 14.75f, 13.4546f, 14.5986f, 13.8788f, 14.7802f)
                curveTo(14.0909f, 14.871f, 14.1515f, 15.0828f, 14.1515f, 15.2644f)
                curveTo(14.1515f, 15.6276f, 14.0606f, 16.021f, 14.0303f, 16.3539f)
                curveTo(13.7576f, 18.6539f, 13.7576f, 20.9236f, 14.0f, 23.2236f)
                curveTo(14.0606f, 23.7381f, 14.0909f, 24.2828f, 14.1515f, 24.7671f)
                curveTo(14.1818f, 25.1302f, 14.0303f, 25.2815f, 13.697f, 25.3118f)
                close()
            }
            path(fill = SolidColor(Color(0xFFA6CF59)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.8182f, 20.5605f)
                curveTo(10.8182f, 22.0132f, 10.8182f, 23.4658f, 10.7576f, 24.9184f)
                curveTo(10.7576f, 24.979f, 10.7273f, 25.0698f, 10.697f, 25.1303f)
                curveTo(10.5757f, 25.3119f, 10.1515f, 25.3724f, 9.8788f, 25.3119f)
                curveTo(9.6666f, 25.2513f, 9.5757f, 25.1f, 9.5757f, 24.7974f)
                curveTo(9.5757f, 24.1619f, 9.5757f, 23.5566f, 9.5757f, 22.679f)
                curveTo(9.5454f, 22.0132f, 9.5151f, 21.075f, 9.5151f, 20.1369f)
                curveTo(9.5151f, 19.8342f, 9.6666f, 19.6526f, 9.9697f, 19.5619f)
                curveTo(10.303f, 19.5013f, 10.606f, 19.5921f, 10.7273f, 19.8342f)
                curveTo(10.8182f, 20.0763f, 10.8485f, 20.2882f, 10.8182f, 20.5605f)
                close()
            }
            path(fill = SolidColor(Color(0xFFA6CF59)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 18.3513f)
                curveTo(9.3636f, 18.3211f, 8.9394f, 17.8974f, 8.9394f, 17.3526f)
                curveTo(8.9697f, 16.7474f, 9.4545f, 16.2026f, 10.0f, 16.2026f)
                curveTo(10.6061f, 16.2026f, 11.0606f, 16.6868f, 11.0606f, 17.2618f)
                curveTo(11.0303f, 17.8974f, 10.6061f, 18.3513f, 10.0f, 18.3513f)
                close()
            }
            path(fill = SolidColor(Color(0xFF9575B4)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.9697f, 21.0448f)
                curveTo(17.0f, 22.104f, 17.0606f, 23.1632f, 17.1818f, 24.1921f)
                curveTo(17.1818f, 24.404f, 17.2425f, 24.6158f, 17.2425f, 24.8277f)
                curveTo(17.2425f, 25.0698f, 17.0909f, 25.2211f, 16.8485f, 25.2816f)
                curveTo(16.3031f, 25.3724f, 16.0606f, 25.2211f, 15.9394f, 24.6461f)
                curveTo(15.7879f, 23.95f, 15.7273f, 23.254f, 15.697f, 22.5579f)
                curveTo(15.6364f, 21.8921f, 15.6364f, 21.2264f, 15.6667f, 20.2579f)
                curveTo(15.6667f, 19.1079f, 15.697f, 17.6553f, 15.9091f, 16.2027f)
                curveTo(15.9697f, 15.8698f, 15.9697f, 15.5671f, 16.0909f, 15.2645f)
                curveTo(16.2121f, 14.7803f, 16.5758f, 14.629f, 17.0303f, 14.75f)
                curveTo(17.2425f, 14.8106f, 17.3637f, 14.9619f, 17.3334f, 15.204f)
                curveTo(17.2728f, 15.9f, 17.1515f, 16.5658f, 17.1212f, 17.2619f)
                curveTo(16.9697f, 18.5329f, 16.9091f, 19.804f, 16.9697f, 21.0448f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFAA71C)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.1818f, 24.7066f)
                curveTo(20.2424f, 25.1f, 20.0909f, 25.3421f, 19.7273f, 25.3421f)
                curveTo(19.2727f, 25.3724f, 18.9091f, 25.1f, 18.9091f, 24.7066f)
                curveTo(18.8788f, 23.375f, 18.9091f, 22.0737f, 18.9697f, 20.7421f)
                curveTo(19.0f, 20.5f, 19.0303f, 20.1974f, 19.1212f, 19.9553f)
                curveTo(19.303f, 19.4711f, 19.8788f, 19.35f, 20.1818f, 19.7434f)
                curveTo(20.2727f, 19.804f, 20.2727f, 19.925f, 20.2727f, 20.0461f)
                curveTo(20.2121f, 20.8027f, 20.1818f, 21.4987f, 20.1212f, 22.225f)
                curveTo(20.0909f, 23.0724f, 20.1515f, 23.8895f, 20.1818f, 24.7066f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFAA71C)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.7879f, 18.3513f)
                curveTo(19.2121f, 18.3513f, 18.7576f, 17.8671f, 18.7576f, 17.2618f)
                curveTo(18.7273f, 16.6868f, 19.2424f, 16.2026f, 19.8182f, 16.2026f)
                curveTo(20.3333f, 16.2026f, 20.8485f, 16.7474f, 20.8485f, 17.3526f)
                curveTo(20.8485f, 17.9579f, 20.4545f, 18.3513f, 19.7879f, 18.3513f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(27.7273f, 23.8593f)
                curveTo(27.4243f, 24.5251f, 26.9091f, 24.9487f, 26.2424f, 25.1908f)
                curveTo(25.7576f, 25.3724f, 25.303f, 25.4027f, 25.0303f, 25.4027f)
                curveTo(23.394f, 25.4027f, 22.303f, 24.6461f, 21.9697f, 23.3751f)
                curveTo(21.5758f, 22.0132f, 22.1515f, 20.6514f, 23.4243f, 19.9553f)
                curveTo(24.6667f, 19.1987f, 26.1212f, 19.3803f, 27.1515f, 20.4093f)
                curveTo(27.2424f, 20.5001f, 27.3636f, 20.6211f, 27.4243f, 20.7422f)
                curveTo(27.6667f, 21.1053f, 27.5758f, 21.4382f, 27.1818f, 21.5895f)
                curveTo(27.0303f, 21.6501f, 26.9091f, 21.5895f, 26.7879f, 21.4987f)
                curveTo(26.6061f, 21.3474f, 26.4243f, 21.1658f, 26.2727f, 21.0145f)
                curveTo(25.5758f, 20.4395f, 24.5152f, 20.4698f, 23.7273f, 21.0751f)
                curveTo(23.0303f, 21.6198f, 22.8182f, 22.558f, 23.1818f, 23.4053f)
                curveTo(23.4546f, 24.0106f, 23.9394f, 24.283f, 24.5758f, 24.3737f)
                curveTo(24.9091f, 24.4343f, 25.2121f, 24.4343f, 25.5152f, 24.3737f)
                curveTo(26.0303f, 24.3132f, 26.4546f, 24.0408f, 26.7273f, 23.6172f)
                curveTo(26.7576f, 23.5566f, 26.7879f, 23.4658f, 26.8485f, 23.4053f)
                curveTo(27.0606f, 23.1027f, 27.2424f, 23.0422f, 27.5152f, 23.1935f)
                curveTo(27.7879f, 23.3145f, 27.8788f, 23.5566f, 27.7273f, 23.8593f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(34.3939f, 25.2816f)
                curveTo(34.2121f, 25.2816f, 34.1212f, 25.1908f, 34.0303f, 25.0697f)
                curveTo(33.9394f, 24.8882f, 33.8788f, 24.7066f, 33.7879f, 24.5553f)
                curveTo(33.303f, 24.9487f, 32.7273f, 25.2513f, 32.0606f, 25.3421f)
                curveTo(29.8485f, 25.7053f, 28.2121f, 23.7684f, 28.9091f, 21.65f)
                curveTo(29.3636f, 20.2579f, 30.5151f, 19.471f, 32.1212f, 19.5316f)
                curveTo(32.5757f, 19.5618f, 33.0303f, 19.6526f, 33.4242f, 19.8645f)
                curveTo(33.5757f, 19.9553f, 33.7576f, 19.9855f, 33.9091f, 19.8645f)
                curveTo(33.9697f, 19.8039f, 34.0606f, 19.8039f, 34.1515f, 19.8039f)
                curveTo(34.5454f, 19.7434f, 34.6666f, 19.8645f, 34.6666f, 20.2579f)
                curveTo(34.6666f, 20.7421f, 34.6666f, 21.1658f, 34.6666f, 21.6197f)
                curveTo(34.6363f, 22.6184f, 34.7879f, 23.6171f, 35.0f, 24.5855f)
                curveTo(35.0909f, 24.9789f, 34.8485f, 25.2816f, 34.3939f, 25.2816f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(41.2424f, 25.1908f)
                curveTo(40.8788f, 25.3118f, 40.7576f, 25.2513f, 40.6061f, 24.9184f)
                curveTo(40.5455f, 24.7671f, 40.5152f, 24.6158f, 40.4546f, 24.4645f)
                curveTo(40.303f, 24.5855f, 40.1212f, 24.7066f, 39.9697f, 24.8276f)
                curveTo(38.303f, 26.0079f, 36.1515f, 25.0395f, 35.9697f, 22.9816f)
                curveTo(35.9091f, 22.4368f, 35.9394f, 21.8921f, 36.1212f, 21.3474f)
                curveTo(36.4849f, 20.2276f, 37.303f, 19.6829f, 38.4243f, 19.5013f)
                curveTo(39.1212f, 19.4105f, 39.3333f, 19.4408f, 40.0f, 19.7132f)
                curveTo(40.0606f, 19.6526f, 40.0303f, 19.6224f, 40.0303f, 19.5618f)
                curveTo(39.9697f, 18.2303f, 40.0606f, 16.8987f, 40.1212f, 15.5671f)
                curveTo(40.1515f, 14.9618f, 40.394f, 14.7197f, 40.9394f, 14.7197f)
                curveTo(41.2121f, 14.6895f, 41.3333f, 14.7803f, 41.3333f, 15.0829f)
                curveTo(41.3333f, 15.3553f, 41.303f, 15.6579f, 41.2727f, 15.9303f)
                curveTo(41.0606f, 17.8974f, 41.0606f, 19.8342f, 41.1818f, 21.7711f)
                curveTo(41.2424f, 22.7395f, 41.394f, 23.6776f, 41.5758f, 24.5855f)
                curveTo(41.6061f, 24.9487f, 41.5455f, 25.1f, 41.2424f, 25.1908f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(45.3031f, 25.4026f)
                curveTo(43.697f, 25.4934f, 42.4243f, 23.9803f, 42.4546f, 22.7395f)
                curveTo(42.4849f, 20.7724f, 43.697f, 19.4408f, 45.5758f, 19.4408f)
                curveTo(47.2424f, 19.4408f, 48.394f, 20.7421f, 48.394f, 22.5882f)
                curveTo(48.4243f, 23.9197f, 47.1515f, 25.5237f, 45.3031f, 25.4026f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0D0E12)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(32.7222f, 20.7055f)
                curveTo(32.3889f, 20.6147f, 32.0252f, 20.5845f, 31.6616f, 20.6147f)
                curveTo(30.4192f, 20.7055f, 29.601f, 21.7345f, 29.7828f, 22.945f)
                curveTo(29.8737f, 23.7924f, 30.8737f, 24.5187f, 31.7828f, 24.3976f)
                curveTo(32.9949f, 24.2463f, 33.6313f, 23.6108f, 33.6313f, 22.5213f)
                curveTo(33.6313f, 22.1582f, 33.601f, 21.8858f, 33.5404f, 21.5832f)
                curveTo(33.4192f, 21.1292f, 33.1768f, 20.8266f, 32.7222f, 20.7055f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0D0E12)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(38.995f, 20.5845f)
                curveTo(38.6919f, 20.5542f, 38.3889f, 20.5542f, 38.0859f, 20.645f)
                curveTo(37.6313f, 20.7963f, 37.3283f, 21.0687f, 37.1162f, 21.4924f)
                curveTo(36.9344f, 21.8556f, 36.9041f, 22.249f, 36.9041f, 22.6727f)
                curveTo(36.9041f, 23.4595f, 37.4192f, 24.1253f, 38.1465f, 24.2463f)
                curveTo(38.995f, 24.3371f, 39.7828f, 23.8529f, 39.995f, 23.0661f)
                curveTo(40.0556f, 22.8542f, 40.0556f, 22.6424f, 40.0556f, 22.4306f)
                curveTo(40.0556f, 22.0371f, 40.0253f, 21.674f, 39.9041f, 21.3411f)
                curveTo(39.7525f, 20.9174f, 39.4495f, 20.645f, 38.995f, 20.5845f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0D0E12)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(46.1768f, 20.645f)
                curveTo(44.8131f, 20.1306f, 43.4192f, 21.0385f, 43.4192f, 22.5213f)
                curveTo(43.4192f, 23.5806f, 44.2071f, 24.3977f, 45.2374f, 24.3977f)
                curveTo(46.4798f, 24.3977f, 47.2677f, 23.6411f, 47.2677f, 22.4306f)
                curveTo(47.2374f, 22.37f, 47.2374f, 22.249f, 47.2374f, 22.1582f)
                curveTo(47.1465f, 21.4924f, 46.8737f, 20.9174f, 46.1768f, 20.645f)
                close()
            }
        }
        .build()
        return _illicado!!
    }

private var _illicado: ImageVector? = null
