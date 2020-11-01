package com.bamboo.loading;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.view.Display;
import android.view.WindowManager;

/**
 * 项目名称：LoadingDialog
 *
 * @Author bamboolife
 * 邮箱：core_it@163.com
 * 创建时间：2020/10/31 4:52 PM
 * 描述：
 */
public class LoadingBaseDialog extends Dialog {
    protected LoadingBaseDialog(Context context) {
        super(context, R.style.LoadingDialog);
        getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
    }

    protected LoadingBaseDialog(Context context, int theme) {
        super(context, theme);
        getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
    }

    protected int getMinimumSideOfScreen(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
        Display display = windowManager.getDefaultDisplay();
        if (Build.VERSION.SDK_INT >= 13) {
            Point size = new Point();
            display.getSize(size);
            return Math.min(size.x, size.y);
        } else {
            return Math.min(display.getWidth(), display.getHeight());
        }
    }
}
