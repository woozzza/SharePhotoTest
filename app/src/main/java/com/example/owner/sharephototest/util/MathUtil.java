package com.example.owner.sharephototest.util;

public class MathUtil {
    static public int getRandomMath(int max, int offset) {
        return (int) (Math.random() * (max)) + offset;
    }
}