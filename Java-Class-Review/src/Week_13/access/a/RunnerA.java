package Week_13.access.a;

import Week_13.access.b.Windows;

public class RunnerA {

    public static void main(String[] args) {
        Windows windows = new Windows();
        windows.os = "Windows";
        windows.memory = 32;
        windows.brand = "Dell";
        windows.windowsVersion = "11";
        windows.gaming();
    }
}
