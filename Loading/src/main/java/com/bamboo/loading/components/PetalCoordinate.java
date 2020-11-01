package com.bamboo.loading.components;

/**
 * 项目名称：LoadingDialog
 *
 * @Author bamboolife
 * 邮箱：core_it@163.com
 * 创建时间：2020/10/31 4:54 PM
 * 描述：
 */
public class PetalCoordinate {
    private int startX, startY, endX, endY;

    public PetalCoordinate(int startX, int startY, int endX, int endY) {
        this.startX = startX;
        this.startY = startY;
        this.endX = endX;
        this.endY = endY;
    }

    public int getStartX() {
        return startX;
    }

    public int getStartY() {
        return startY;
    }

    public int getEndX() {
        return endX;
    }

    public int getEndY() {
        return endY;
    }
}
