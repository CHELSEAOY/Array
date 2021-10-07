package com.bjpowernode.javase.array;

import java.util.Formatter;

public class LCS {
    private enum Path {TOP, LEFT, TOP_LEFT};
    private static int[][] commonLenth;
    private static Path[][] path;
    private static String stringA = "1AD2C3D4E56";
    private static String stringB = "B1D423A456A";

    /**
     * @param args
     */
    public static void main(String[] args) {
        lCS_Lenght(stringA, stringB);
        printlnArray();
        print_LCS(path, stringA, stringA.length(), stringB.length());

    }

    private static int lCS_Lenght(String a, String b) {
        int m = a.length();
        int n = b.length();

        commonLenth = new int[m + 1][n + 1];
        path = new Path[m + 1][n + 1];

        for(int i = 0; i <= m; i++) {
            commonLenth[i][0] = 0;
        }

        for (int j = 0; j<= n; j++) {
            commonLenth[0][j] = 0;
        }

        for(int i = 1; i <= m; i++) {
            for(int j = 1; j <= n; j++) {
                if (a.charAt(i - 1) == b.charAt(j - 1)) {
                    commonLenth[i][j] = commonLenth[i - 1][j - 1] + 1;
                    path[i][j] = Path.TOP_LEFT;
                } else {
                    if (commonLenth[i - 1][j] >= commonLenth[i][j - 1]) {
                        commonLenth[i][j] = commonLenth[i - 1][j];
                        path[i][j] = Path.TOP;
                    } else {
                        commonLenth[i][j] = commonLenth[i][j - 1];
                        path[i][j] = Path.LEFT;
                    }
                }
            }
        }

        System.out.println("LCS_length: " + commonLenth[m][n]);
        return commonLenth[m][n];
    }


    // 从 path[][] 最后一个输出。
    private static void print_LCS(Path[][] path, String a, int i, int j) {
        if (i == 0 || j == 0) {
            return;
        }

        if (path[i][j] == Path.TOP_LEFT) {
            print_LCS(path, a, i - 1, j - 1);
            System.out.print(a.charAt(i - 1));
        } else {
            if (path[i][j] == Path.TOP) {
                print_LCS(path, a, i - 1, j);
            } else {
                print_LCS(path, a, i, j - 1);
            }
        }
    }

    private static void printlnArray() {
        int m = stringA.length();
        int n = stringB.length();

        for (int i = 0; i <= m; i++) {
            for (int j = 0; j<= n; j++) {
                System.out.print(commonLenth[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("*****************");
        Formatter formatter = new Formatter(System.out);
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j<= n; j++) {
//				System.out.print(path[i][j] + " ");
                formatter.format("%-9s", path[i][j]);
            }
            System.out.println();
        }

    }

}
